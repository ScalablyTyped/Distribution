package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Device extends StObject {
  
  /**
    * The device's maker.
    */
  var Brand: js.UndefOr[DeviceBrand] = js.undefined
  
  /**
    * When the device was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A device's current software.
    */
  var CurrentSoftware: js.UndefOr[typings.awsSdk.clientsPanoramaMod.CurrentSoftware] = js.undefined
  
  /**
    * A description for the device.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsPanoramaMod.Description] = js.undefined
  
  /**
    * A device's aggregated status. Including the device's connection status, provisioning status, and lease status.
    */
  var DeviceAggregatedStatus: js.UndefOr[typings.awsSdk.clientsPanoramaMod.DeviceAggregatedStatus] = js.undefined
  
  /**
    * The device's ID.
    */
  var DeviceId: js.UndefOr[typings.awsSdk.clientsPanoramaMod.DeviceId] = js.undefined
  
  /**
    * When the device was updated.
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A device's latest job. Includes the target image version, and the update job status.
    */
  var LatestDeviceJob: js.UndefOr[typings.awsSdk.clientsPanoramaMod.LatestDeviceJob] = js.undefined
  
  /**
    * The device's lease expiration time.
    */
  var LeaseExpirationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The device's name.
    */
  var Name: js.UndefOr[DeviceName] = js.undefined
  
  /**
    * The device's provisioning status.
    */
  var ProvisioningStatus: js.UndefOr[DeviceStatus] = js.undefined
  
  /**
    * The device's tags.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The device's type.
    */
  var Type: js.UndefOr[DeviceType] = js.undefined
}
object Device {
  
  inline def apply(): Device = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Device]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Device] (val x: Self) extends AnyVal {
    
    inline def setBrand(value: DeviceBrand): Self = StObject.set(x, "Brand", value.asInstanceOf[js.Any])
    
    inline def setBrandUndefined: Self = StObject.set(x, "Brand", js.undefined)
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setCurrentSoftware(value: CurrentSoftware): Self = StObject.set(x, "CurrentSoftware", value.asInstanceOf[js.Any])
    
    inline def setCurrentSoftwareUndefined: Self = StObject.set(x, "CurrentSoftware", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDeviceAggregatedStatus(value: DeviceAggregatedStatus): Self = StObject.set(x, "DeviceAggregatedStatus", value.asInstanceOf[js.Any])
    
    inline def setDeviceAggregatedStatusUndefined: Self = StObject.set(x, "DeviceAggregatedStatus", js.undefined)
    
    inline def setDeviceId(value: DeviceId): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "DeviceId", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setLatestDeviceJob(value: LatestDeviceJob): Self = StObject.set(x, "LatestDeviceJob", value.asInstanceOf[js.Any])
    
    inline def setLatestDeviceJobUndefined: Self = StObject.set(x, "LatestDeviceJob", js.undefined)
    
    inline def setLeaseExpirationTime(value: js.Date): Self = StObject.set(x, "LeaseExpirationTime", value.asInstanceOf[js.Any])
    
    inline def setLeaseExpirationTimeUndefined: Self = StObject.set(x, "LeaseExpirationTime", js.undefined)
    
    inline def setName(value: DeviceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setProvisioningStatus(value: DeviceStatus): Self = StObject.set(x, "ProvisioningStatus", value.asInstanceOf[js.Any])
    
    inline def setProvisioningStatusUndefined: Self = StObject.set(x, "ProvisioningStatus", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setType(value: DeviceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
