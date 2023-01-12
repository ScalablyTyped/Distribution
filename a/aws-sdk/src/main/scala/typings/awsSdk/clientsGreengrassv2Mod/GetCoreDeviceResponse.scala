package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCoreDeviceResponse extends StObject {
  
  /**
    * The computer architecture of the core device.
    */
  var architecture: js.UndefOr[CoreDeviceArchitectureString] = js.undefined
  
  /**
    * The name of the core device. This is also the name of the IoT thing.
    */
  var coreDeviceThingName: js.UndefOr[CoreDeviceThingName] = js.undefined
  
  /**
    * The version of the IoT Greengrass Core software that the core device runs. This version is equivalent to the version of the Greengrass nucleus component that runs on the core device. For more information, see the Greengrass nucleus component in the IoT Greengrass V2 Developer Guide.
    */
  var coreVersion: js.UndefOr[GGCVersion] = js.undefined
  
  /**
    * The time at which the core device's status last updated, expressed in ISO 8601 format.
    */
  var lastStatusUpdateTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The operating system platform that the core device runs.
    */
  var platform: js.UndefOr[CoreDevicePlatformString] = js.undefined
  
  /**
    * The status of the core device. The core device status can be:    HEALTHY – The IoT Greengrass Core software and all components run on the core device without issue.    UNHEALTHY – The IoT Greengrass Core software or a component is in a failed state on the core device.  
    */
  var status: js.UndefOr[CoreDeviceStatus] = js.undefined
  
  /**
    * A list of key-value pairs that contain metadata for the resource. For more information, see Tag your resources in the IoT Greengrass V2 Developer Guide.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object GetCoreDeviceResponse {
  
  inline def apply(): GetCoreDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCoreDeviceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCoreDeviceResponse] (val x: Self) extends AnyVal {
    
    inline def setArchitecture(value: CoreDeviceArchitectureString): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    inline def setArchitectureUndefined: Self = StObject.set(x, "architecture", js.undefined)
    
    inline def setCoreDeviceThingName(value: CoreDeviceThingName): Self = StObject.set(x, "coreDeviceThingName", value.asInstanceOf[js.Any])
    
    inline def setCoreDeviceThingNameUndefined: Self = StObject.set(x, "coreDeviceThingName", js.undefined)
    
    inline def setCoreVersion(value: GGCVersion): Self = StObject.set(x, "coreVersion", value.asInstanceOf[js.Any])
    
    inline def setCoreVersionUndefined: Self = StObject.set(x, "coreVersion", js.undefined)
    
    inline def setLastStatusUpdateTimestamp(value: js.Date): Self = StObject.set(x, "lastStatusUpdateTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastStatusUpdateTimestampUndefined: Self = StObject.set(x, "lastStatusUpdateTimestamp", js.undefined)
    
    inline def setPlatform(value: CoreDevicePlatformString): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setStatus(value: CoreDeviceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
