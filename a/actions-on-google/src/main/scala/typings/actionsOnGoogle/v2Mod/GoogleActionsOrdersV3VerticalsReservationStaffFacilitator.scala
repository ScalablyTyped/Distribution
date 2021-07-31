package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsOrdersV3VerticalsReservationStaffFacilitator extends StObject {
  
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
  def apply(): GoogleActionsOrdersV3VerticalsReservationStaffFacilitator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsReservationStaffFacilitator]
  }
  
  @scala.inline
  implicit class GoogleActionsOrdersV3VerticalsReservationStaffFacilitatorMutableBuilder[Self <: GoogleActionsOrdersV3VerticalsReservationStaffFacilitator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImage(value: GoogleActionsV2UiElementsImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
