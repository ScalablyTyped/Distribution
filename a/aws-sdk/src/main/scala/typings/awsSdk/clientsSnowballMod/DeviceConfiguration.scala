package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceConfiguration extends StObject {
  
  /**
    * Returns information about the device configuration for an Snowcone job.
    */
  var SnowconeDeviceConfiguration: js.UndefOr[typings.awsSdk.clientsSnowballMod.SnowconeDeviceConfiguration] = js.undefined
}
object DeviceConfiguration {
  
  inline def apply(): DeviceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceConfiguration] (val x: Self) extends AnyVal {
    
    inline def setSnowconeDeviceConfiguration(value: SnowconeDeviceConfiguration): Self = StObject.set(x, "SnowconeDeviceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSnowconeDeviceConfigurationUndefined: Self = StObject.set(x, "SnowconeDeviceConfiguration", js.undefined)
  }
}
