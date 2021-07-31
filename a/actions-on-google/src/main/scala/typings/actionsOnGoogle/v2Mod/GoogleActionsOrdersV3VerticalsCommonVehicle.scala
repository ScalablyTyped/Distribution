package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsOrdersV3VerticalsCommonVehicle extends StObject {
  
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
  def apply(): GoogleActionsOrdersV3VerticalsCommonVehicle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsCommonVehicle]
  }
  
  @scala.inline
  implicit class GoogleActionsOrdersV3VerticalsCommonVehicleMutableBuilder[Self <: GoogleActionsOrdersV3VerticalsCommonVehicle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorName(value: String): Self = StObject.set(x, "colorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorNameUndefined: Self = StObject.set(x, "colorName", js.undefined)
    
    @scala.inline
    def setImage(value: GoogleActionsV2UiElementsImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setLicensePlate(value: String): Self = StObject.set(x, "licensePlate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicensePlateUndefined: Self = StObject.set(x, "licensePlate", js.undefined)
    
    @scala.inline
    def setMake(value: String): Self = StObject.set(x, "make", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMakeUndefined: Self = StObject.set(x, "make", js.undefined)
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
