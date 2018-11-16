package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BaseOptions[R, E] extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[js.Function1[/* res */ js.Any, scala.Unit]] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[js.Function1[/* res */ E, scala.Unit]] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[js.Function1[/* res */ R, scala.Unit]] = js.undefined
}

