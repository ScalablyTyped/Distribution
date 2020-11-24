package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsOrdersV3VerticalsCommonVehicle extends js.Object {
  
  /**
    * Vehicle color name, eg. black
    * Optional.
    */
  var colorName: js.UndefOr[String] = js.native
  
  /**
    * URL to a photo of the vehicle.
    * The photo will be displayed at approximately 256x256px.
    * Must be a jpg or png.
    * Optional.
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.native
  
  /**
    * Vehicle license plate number (e.g. \"1ABC234\").
    * Required.
    */
  var licensePlate: js.UndefOr[String] = js.native
  
  /**
    * Vehicle make (e.g. \"Honda\").
    * This is displayed to the user and must be localized.
    * Required.
    */
  var make: js.UndefOr[String] = js.native
  
  /**
    * Vehicle model (e.g. \"Grom\").
    * This is displayed to the user and must be localized.
    * Required.
    */
  var model: js.UndefOr[String] = js.native
}
object GoogleActionsOrdersV3VerticalsCommonVehicle {
  
  @scala.inline
  def apply(): GoogleActionsOrdersV3VerticalsCommonVehicle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsCommonVehicle]
  }
  
  @scala.inline
  implicit class GoogleActionsOrdersV3VerticalsCommonVehicleOps[Self <: GoogleActionsOrdersV3VerticalsCommonVehicle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColorName(value: String): Self = this.set("colorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorName: Self = this.set("colorName", js.undefined)
    
    @scala.inline
    def setImage(value: GoogleActionsV2UiElementsImage): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setLicensePlate(value: String): Self = this.set("licensePlate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicensePlate: Self = this.set("licensePlate", js.undefined)
    
    @scala.inline
    def setMake(value: String): Self = this.set("make", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMake: Self = this.set("make", js.undefined)
    
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
  }
}
