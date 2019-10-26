package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsOrdersV3VerticalsCommonVehicle extends js.Object {
  /**
    * Vehicle color name, eg. black
    * Optional.
    */
  var colorName: js.UndefOr[String] = js.undefined
  /**
    * URL to a photo of the vehicle.
    * The photo will be displayed at approximately 256x256px.
    * Must be a jpg or png.
    * Optional.
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.undefined
  /**
    * Vehicle license plate number (e.g. \"1ABC234\").
    * Required.
    */
  var licensePlate: js.UndefOr[String] = js.undefined
  /**
    * Vehicle make (e.g. \"Honda\").
    * This is displayed to the user and must be localized.
    * Required.
    */
  var make: js.UndefOr[String] = js.undefined
  /**
    * Vehicle model (e.g. \"Grom\").
    * This is displayed to the user and must be localized.
    * Required.
    */
  var model: js.UndefOr[String] = js.undefined
}

object GoogleActionsOrdersV3VerticalsCommonVehicle {
  @scala.inline
  def apply(
    colorName: String = null,
    image: GoogleActionsV2UiElementsImage = null,
    licensePlate: String = null,
    make: String = null,
    model: String = null
  ): GoogleActionsOrdersV3VerticalsCommonVehicle = {
    val __obj = js.Dynamic.literal()
    if (colorName != null) __obj.updateDynamic("colorName")(colorName)
    if (image != null) __obj.updateDynamic("image")(image)
    if (licensePlate != null) __obj.updateDynamic("licensePlate")(licensePlate)
    if (make != null) __obj.updateDynamic("make")(make)
    if (model != null) __obj.updateDynamic("model")(model)
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsCommonVehicle]
  }
}

