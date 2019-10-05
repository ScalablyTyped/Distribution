package typings.aliDashApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveStorageOptions
  extends BaseOptions[js.Any, js.Any] {
  var key: String
}

object RemoveStorageOptions {
  @scala.inline
  def apply(
    key: String,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: js.Any => Unit = null
  ): RemoveStorageOptions = {
    val __obj = js.Dynamic.literal(key = key)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[RemoveStorageOptions]
  }
}

