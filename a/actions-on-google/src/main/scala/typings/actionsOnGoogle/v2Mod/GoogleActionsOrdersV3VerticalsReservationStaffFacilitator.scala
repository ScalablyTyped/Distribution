package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsOrdersV3VerticalsReservationStaffFacilitator extends js.Object {
  /**
    * Performer's images.
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.undefined
  /**
    * The staff facilitator's name. Ex. \"John Smith\"
    */
  var name: js.UndefOr[String] = js.undefined
}

object GoogleActionsOrdersV3VerticalsReservationStaffFacilitator {
  @scala.inline
  def apply(image: GoogleActionsV2UiElementsImage = null, name: String = null): GoogleActionsOrdersV3VerticalsReservationStaffFacilitator = {
    val __obj = js.Dynamic.literal()
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsReservationStaffFacilitator]
  }
}

