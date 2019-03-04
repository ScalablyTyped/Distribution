package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetClipboardOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 剪贴板数据 */
  var text: java.lang.String
}

object SetClipboardOptions {
  @scala.inline
  def apply(
    text: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[js.Any, scala.Unit] = null
  ): SetClipboardOptions = {
    val __obj = js.Dynamic.literal(text = text)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[SetClipboardOptions]
  }
}

