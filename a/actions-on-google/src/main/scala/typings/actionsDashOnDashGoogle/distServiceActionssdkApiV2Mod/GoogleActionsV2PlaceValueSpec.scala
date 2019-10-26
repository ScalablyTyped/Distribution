package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2PlaceValueSpec extends js.Object {
  /**
    * Speech configuration for askForPlace dialog. The extension should be used
    * to define the PlaceDialogSpec configuration.
    */
  var dialogSpec: js.UndefOr[GoogleActionsV2DialogSpec] = js.undefined
}

object GoogleActionsV2PlaceValueSpec {
  @scala.inline
  def apply(dialogSpec: GoogleActionsV2DialogSpec = null): GoogleActionsV2PlaceValueSpec = {
    val __obj = js.Dynamic.literal()
    if (dialogSpec != null) __obj.updateDynamic("dialogSpec")(dialogSpec)
    __obj.asInstanceOf[GoogleActionsV2PlaceValueSpec]
  }
}

