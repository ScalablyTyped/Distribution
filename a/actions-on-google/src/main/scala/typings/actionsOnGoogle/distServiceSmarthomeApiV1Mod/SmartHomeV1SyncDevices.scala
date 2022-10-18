package typings.actionsOnGoogle.distServiceSmarthomeApiV1Mod

import typings.actionsOnGoogle.distCommonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartHomeV1SyncDevices extends StObject {
  
  var attributes: js.UndefOr[ApiClientObjectMap[Any]] = js.undefined
  
  var customData: js.UndefOr[ApiClientObjectMap[Any]] = js.undefined
  
  var deviceInfo: js.UndefOr[SmartHomeV1SyncDeviceInfo] = js.undefined
  
  var id: String
  
  var name: SmartHomeV1SyncName
  
  var otherDeviceIds: js.UndefOr[js.Array[SmartHomeV1SyncOtherDeviceIds]] = js.undefined
  
  var roomHint: js.UndefOr[String] = js.undefined
  
  var traits: js.Array[String]
  
  var `type`: String
  
  var willReportState: Boolean
}
object SmartHomeV1SyncDevices {
  
  inline def apply(
    id: String,
    name: SmartHomeV1SyncName,
    traits: js.Array[String],
    `type`: String,
    willReportState: Boolean
  ): SmartHomeV1SyncDevices = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], traits = traits.asInstanceOf[js.Any], willReportState = willReportState.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1SyncDevices]
  }
  
  extension [Self <: SmartHomeV1SyncDevices](x: Self) {
    
    inline def setAttributes(value: ApiClientObjectMap[Any]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setCustomData(value: ApiClientObjectMap[Any]): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
    
    inline def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
    
    inline def setDeviceInfo(value: SmartHomeV1SyncDeviceInfo): Self = StObject.set(x, "deviceInfo", value.asInstanceOf[js.Any])
    
    inline def setDeviceInfoUndefined: Self = StObject.set(x, "deviceInfo", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: SmartHomeV1SyncName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOtherDeviceIds(value: js.Array[SmartHomeV1SyncOtherDeviceIds]): Self = StObject.set(x, "otherDeviceIds", value.asInstanceOf[js.Any])
    
    inline def setOtherDeviceIdsUndefined: Self = StObject.set(x, "otherDeviceIds", js.undefined)
    
    inline def setOtherDeviceIdsVarargs(value: SmartHomeV1SyncOtherDeviceIds*): Self = StObject.set(x, "otherDeviceIds", js.Array(value*))
    
    inline def setRoomHint(value: String): Self = StObject.set(x, "roomHint", value.asInstanceOf[js.Any])
    
    inline def setRoomHintUndefined: Self = StObject.set(x, "roomHint", js.undefined)
    
    inline def setTraits(value: js.Array[String]): Self = StObject.set(x, "traits", value.asInstanceOf[js.Any])
    
    inline def setTraitsVarargs(value: String*): Self = StObject.set(x, "traits", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWillReportState(value: Boolean): Self = StObject.set(x, "willReportState", value.asInstanceOf[js.Any])
  }
}
