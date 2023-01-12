package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaContainerParams extends StObject {
  
  /**
    * The list of system devices that the container can access.
    */
  var devices: js.UndefOr[LambdaDeviceList] = js.undefined
  
  /**
    * The memory size of the container, expressed in kilobytes. Default: 16384 (16 MB)
    */
  var memorySizeInKB: js.UndefOr[OptionalInteger] = js.undefined
  
  /**
    * Whether or not the container can read information from the device's /sys folder. Default: false 
    */
  var mountROSysfs: js.UndefOr[OptionalBoolean] = js.undefined
  
  /**
    * The list of volumes that the container can access.
    */
  var volumes: js.UndefOr[LambdaVolumeList] = js.undefined
}
object LambdaContainerParams {
  
  inline def apply(): LambdaContainerParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LambdaContainerParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LambdaContainerParams] (val x: Self) extends AnyVal {
    
    inline def setDevices(value: LambdaDeviceList): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
    
    inline def setDevicesVarargs(value: LambdaDeviceMount*): Self = StObject.set(x, "devices", js.Array(value*))
    
    inline def setMemorySizeInKB(value: OptionalInteger): Self = StObject.set(x, "memorySizeInKB", value.asInstanceOf[js.Any])
    
    inline def setMemorySizeInKBUndefined: Self = StObject.set(x, "memorySizeInKB", js.undefined)
    
    inline def setMountROSysfs(value: OptionalBoolean): Self = StObject.set(x, "mountROSysfs", value.asInstanceOf[js.Any])
    
    inline def setMountROSysfsUndefined: Self = StObject.set(x, "mountROSysfs", js.undefined)
    
    inline def setVolumes(value: LambdaVolumeList): Self = StObject.set(x, "volumes", value.asInstanceOf[js.Any])
    
    inline def setVolumesUndefined: Self = StObject.set(x, "volumes", js.undefined)
    
    inline def setVolumesVarargs(value: LambdaVolumeMount*): Self = StObject.set(x, "volumes", js.Array(value*))
  }
}
