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

object GetImageInfoOptions {
  @scala.inline
  def apply(
    src: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[/* res */ aliDashAppLib.Anon_Height, scala.Unit] = null
  ): GetImageInfoOptions = {
    val __obj = js.Dynamic.literal(src = src)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[GetImageInfoOptions]
  }
}

