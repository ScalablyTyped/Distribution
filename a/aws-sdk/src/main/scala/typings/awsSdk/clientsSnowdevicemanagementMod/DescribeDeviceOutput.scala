package typings.awsSdk.clientsSnowdevicemanagementMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDeviceOutput extends StObject {
  
  /**
    * The ID of the job used when ordering the device.
    */
  var associatedWithJob: js.UndefOr[String] = js.undefined
  
  /**
    * The hardware specifications of the device. 
    */
  var deviceCapacities: js.UndefOr[CapacityList] = js.undefined
  
  /**
    * The current state of the device.
    */
  var deviceState: js.UndefOr[UnlockState] = js.undefined
  
  /**
    * The type of Amazon Web Services Snow Family device.
    */
  var deviceType: js.UndefOr[String] = js.undefined
  
  /**
    * When the device last contacted the Amazon Web Services Cloud. Indicates that the device is online.
    */
  var lastReachedOutAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * When the device last pushed an update to the Amazon Web Services Cloud. Indicates when the device cache was refreshed.
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the device.
    */
  var managedDeviceArn: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the device that you checked the information for.
    */
  var managedDeviceId: js.UndefOr[ManagedDeviceId] = js.undefined
  
  /**
    * The network interfaces available on the device.
    */
  var physicalNetworkInterfaces: js.UndefOr[PhysicalNetworkInterfaceList] = js.undefined
  
  /**
    * The software installed on the device.
    */
  var software: js.UndefOr[SoftwareInformation] = js.undefined
  
  /**
    * Optional metadata that you assign to a resource. You can use tags to categorize a resource in different ways, such as by purpose, owner, or environment. 
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object DescribeDeviceOutput {
  
  inline def apply(): DescribeDeviceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDeviceOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDeviceOutput] (val x: Self) extends AnyVal {
    
    inline def setAssociatedWithJob(value: String): Self = StObject.set(x, "associatedWithJob", value.asInstanceOf[js.Any])
    
    inline def setAssociatedWithJobUndefined: Self = StObject.set(x, "associatedWithJob", js.undefined)
    
    inline def setDeviceCapacities(value: CapacityList): Self = StObject.set(x, "deviceCapacities", value.asInstanceOf[js.Any])
    
    inline def setDeviceCapacitiesUndefined: Self = StObject.set(x, "deviceCapacities", js.undefined)
    
    inline def setDeviceCapacitiesVarargs(value: Capacity*): Self = StObject.set(x, "deviceCapacities", js.Array(value*))
    
    inline def setDeviceState(value: UnlockState): Self = StObject.set(x, "deviceState", value.asInstanceOf[js.Any])
    
    inline def setDeviceStateUndefined: Self = StObject.set(x, "deviceState", js.undefined)
    
    inline def setDeviceType(value: String): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeUndefined: Self = StObject.set(x, "deviceType", js.undefined)
    
    inline def setLastReachedOutAt(value: js.Date): Self = StObject.set(x, "lastReachedOutAt", value.asInstanceOf[js.Any])
    
    inline def setLastReachedOutAtUndefined: Self = StObject.set(x, "lastReachedOutAt", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    inline def setManagedDeviceArn(value: String): Self = StObject.set(x, "managedDeviceArn", value.asInstanceOf[js.Any])
    
    inline def setManagedDeviceArnUndefined: Self = StObject.set(x, "managedDeviceArn", js.undefined)
    
    inline def setManagedDeviceId(value: ManagedDeviceId): Self = StObject.set(x, "managedDeviceId", value.asInstanceOf[js.Any])
    
    inline def setManagedDeviceIdUndefined: Self = StObject.set(x, "managedDeviceId", js.undefined)
    
    inline def setPhysicalNetworkInterfaces(value: PhysicalNetworkInterfaceList): Self = StObject.set(x, "physicalNetworkInterfaces", value.asInstanceOf[js.Any])
    
    inline def setPhysicalNetworkInterfacesUndefined: Self = StObject.set(x, "physicalNetworkInterfaces", js.undefined)
    
    inline def setPhysicalNetworkInterfacesVarargs(value: PhysicalNetworkInterface*): Self = StObject.set(x, "physicalNetworkInterfaces", js.Array(value*))
    
    inline def setSoftware(value: SoftwareInformation): Self = StObject.set(x, "software", value.asInstanceOf[js.Any])
    
    inline def setSoftwareUndefined: Self = StObject.set(x, "software", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
