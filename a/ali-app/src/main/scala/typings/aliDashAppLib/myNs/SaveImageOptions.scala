package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveImageOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_SaveImageOptions: js.UndefOr[js.Function1[/* res */ aliDashAppLib.Anon_ErrMsg, scala.Unit]] = js.undefined
  /**
  		 * 要保存的图片链接
  		 */
  var url: java.lang.String
}

