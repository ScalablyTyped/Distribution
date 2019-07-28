package typings.aliDashApp.myNs

import typings.aliDashApp.Anon_Height
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
  var src: String
  @JSName("success")
  var success_GetImageInfoOptions: js.UndefOr[js.Function1[/* res */ Anon_Height, Unit]] = js.undefined
}

object GetImageInfoOptions {
  @scala.inline
  def apply(
    src: String,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: /* res */ Anon_Height => Unit = null
  ): GetImageInfoOptions = {
    val __obj = js.Dynamic.literal(src = src)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetImageInfoOptions]
  }
}

