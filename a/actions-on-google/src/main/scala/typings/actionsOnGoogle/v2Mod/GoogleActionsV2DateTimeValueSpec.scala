package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2DateTimeValueSpec extends js.Object {
  /**
    * Control datetime prompts.
    */
  var dialogSpec: js.UndefOr[GoogleActionsV2DateTimeValueSpecDateTimeDialogSpec] = js.undefined
}

object GoogleActionsV2DateTimeValueSpec {
  @scala.inline
  def apply(dialogSpec: GoogleActionsV2DateTimeValueSpecDateTimeDialogSpec = null): GoogleActionsV2DateTimeValueSpec = {
    val __obj = js.Dynamic.literal()
    if (dialogSpec != null) __obj.updateDynamic("dialogSpec")(dialogSpec.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2DateTimeValueSpec]
  }
}

