package typings.actionsOnGoogle.apiV1Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartHomeV1QueryRequestDevices extends StObject {
  
  var customData: js.UndefOr[ApiClientObjectMap[_]] = js.native
  
  var id: String = js.native
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
    def setCustomData(value: ApiClientObjectMap[_]): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
