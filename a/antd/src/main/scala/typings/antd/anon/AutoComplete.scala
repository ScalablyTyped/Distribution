package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoComplete extends js.Object {
  var autoComplete: js.UndefOr[String] = js.undefined
}

object AutoComplete {
  @scala.inline
  def apply(autoComplete: String = null): AutoComplete = {
    val __obj = js.Dynamic.literal()
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoComplete]
  }
}

