package typings.actionsOnGoogle.apiV1Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartHomeV1QueryRequestDevices extends StObject {
  
  var customData: js.UndefOr[ApiClientObjectMap[js.Any]] = js.undefined
  
  var id: String
}
object SmartHomeV1QueryRequestDevices {
  
  @scala.inline
  def apply(id: String): SmartHomeV1QueryRequestDevices = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1QueryRequestDevices]
  }
  
  @scala.inline
  implicit class SmartHomeV1QueryRequestDevicesMutableBuilder[Self <: SmartHomeV1QueryRequestDevices] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomData(value: ApiClientObjectMap[js.Any]): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
