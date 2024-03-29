package typings.actionsOnGoogle.distServiceSmarthomeApiV1Mod

import typings.actionsOnGoogle.distCommonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartHomeV1QueryRequestDevices extends StObject {
  
  var customData: js.UndefOr[ApiClientObjectMap[Any]] = js.undefined
  
  var id: String
}
object SmartHomeV1QueryRequestDevices {
  
  inline def apply(id: String): SmartHomeV1QueryRequestDevices = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1QueryRequestDevices]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SmartHomeV1QueryRequestDevices] (val x: Self) extends AnyVal {
    
    inline def setCustomData(value: ApiClientObjectMap[Any]): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
    
    inline def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
