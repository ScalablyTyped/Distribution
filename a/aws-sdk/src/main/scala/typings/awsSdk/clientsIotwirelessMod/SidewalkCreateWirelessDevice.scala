package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SidewalkCreateWirelessDevice extends StObject {
  
  /**
    * The ID of the Sidewalk device profile.
    */
  var DeviceProfileId: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.DeviceProfileId] = js.undefined
}
object SidewalkCreateWirelessDevice {
  
  inline def apply(): SidewalkCreateWirelessDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SidewalkCreateWirelessDevice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SidewalkCreateWirelessDevice] (val x: Self) extends AnyVal {
    
    inline def setDeviceProfileId(value: DeviceProfileId): Self = StObject.set(x, "DeviceProfileId", value.asInstanceOf[js.Any])
    
    inline def setDeviceProfileIdUndefined: Self = StObject.set(x, "DeviceProfileId", js.undefined)
  }
}
