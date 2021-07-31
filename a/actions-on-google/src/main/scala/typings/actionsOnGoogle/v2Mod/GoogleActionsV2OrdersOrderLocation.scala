package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2OrdersOrderLocation extends StObject {
  
  /**
    * Contains actual location info.
    */
  var location: js.UndefOr[GoogleActionsV2Location] = js.undefined
  
  /**
    * Address type. Determines icon and placement. Required.
    */
  var `type`: js.UndefOr[GoogleActionsV2OrdersOrderLocationType] = js.undefined
}
object GoogleActionsV2OrdersOrderLocation {
  
  @scala.inline
  def apply(): GoogleActionsV2OrdersOrderLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersOrderLocation]
  }
  
  @scala.inline
  implicit class GoogleActionsV2OrdersOrderLocationMutableBuilder[Self <: GoogleActionsV2OrdersOrderLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: GoogleActionsV2Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setType(value: GoogleActionsV2OrdersOrderLocationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
