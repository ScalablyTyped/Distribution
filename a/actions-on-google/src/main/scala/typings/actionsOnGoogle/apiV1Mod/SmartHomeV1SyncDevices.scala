package typings.actionsOnGoogle.apiV1Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartHomeV1SyncDevices extends StObject {
  
  var attributes: js.UndefOr[ApiClientObjectMap[_]] = js.native
  
  var customData: js.UndefOr[ApiClientObjectMap[_]] = js.native
  
  var deviceInfo: js.UndefOr[SmartHomeV1SyncDeviceInfo] = js.native
  
  var id: String = js.native
  
  var name: SmartHomeV1SyncName = js.native
  
  var otherDeviceIds: js.UndefOr[js.Array[SmartHomeV1SyncOtherDeviceIds]] = js.native
  
  var roomHint: js.UndefOr[String] = js.native
  
  var traits: js.Array[String] = js.native
  
  var `type`: String = js.native
  
  var willReportState: Boolean = js.native
}
object SmartHomeV1SyncDevices {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class SmartHomeV1SyncDevicesMutableBuilder[Self <: SmartHomeV1SyncDevices] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: ApiClientObjectMap[_]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setCustomData(value: ApiClientObjectMap[_]): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
    
    @scala.inline
    def setDeviceInfo(value: SmartHomeV1SyncDeviceInfo): Self = StObject.set(x, "deviceInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceInfoUndefined: Self = StObject.set(x, "deviceInfo", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: SmartHomeV1SyncName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherDeviceIds(value: js.Array[SmartHomeV1SyncOtherDeviceIds]): Self = StObject.set(x, "otherDeviceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherDeviceIdsUndefined: Self = StObject.set(x, "otherDeviceIds", js.undefined)
    
    @scala.inline
    def setOtherDeviceIdsVarargs(value: SmartHomeV1SyncOtherDeviceIds*): Self = StObject.set(x, "otherDeviceIds", js.Array(value :_*))
    
    @scala.inline
    def setRoomHint(value: String): Self = StObject.set(x, "roomHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoomHintUndefined: Self = StObject.set(x, "roomHint", js.undefined)
    
    @scala.inline
    def setTraits(value: js.Array[String]): Self = StObject.set(x, "traits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraitsVarargs(value: String*): Self = StObject.set(x, "traits", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWillReportState(value: Boolean): Self = StObject.set(x, "willReportState", value.asInstanceOf[js.Any])
  }
}
