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

object SaveImageOptions {
  @scala.inline
  def apply(
    url: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[/* res */ aliDashAppLib.Anon_ErrMsg, scala.Unit] = null
  ): SaveImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[SaveImageOptions]
  }
}

