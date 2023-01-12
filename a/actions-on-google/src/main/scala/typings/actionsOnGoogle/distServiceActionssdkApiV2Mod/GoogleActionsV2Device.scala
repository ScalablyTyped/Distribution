package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2Device extends StObject {
  
  /**
    * Represents actual device location such as latitude, longitude, and
    * formatted address. Requires the
    * DEVICE_COARSE_LOCATION
    * or
    * DEVICE_PRECISE_LOCATION
    * permission.
    */
  var location: js.UndefOr[GoogleActionsV2Location] = js.undefined
}
object GoogleActionsV2Device {
  
  inline def apply(): GoogleActionsV2Device = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2Device]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleActionsV2Device] (val x: Self) extends AnyVal {
    
    inline def setLocation(value: GoogleActionsV2Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
  }
}
