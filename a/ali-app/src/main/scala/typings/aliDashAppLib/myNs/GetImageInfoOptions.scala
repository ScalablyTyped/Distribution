package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetImageInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 图片路径，目前支持：
  		 * - 网络图片路径
  		 * - apFilePath路径
  		 * - 相对路径
  		 */
  var src: java.lang.String
  @JSName("success")
  var success_GetImageInfoOptions: js.UndefOr[js.Function1[/* res */ aliDashAppLib.Anon_Height, scala.Unit]] = js.undefined
}

