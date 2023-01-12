package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RaidArray extends StObject {
  
  /**
    * The array's Availability Zone. For more information, see Regions and Endpoints.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * When the RAID array was created.
    */
  var CreatedAt: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The array's Linux device. For example /dev/mdadm0.
    */
  var Device: js.UndefOr[String] = js.undefined
  
  /**
    * The instance ID.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  
  /**
    * For PIOPS volumes, the IOPS per disk.
    */
  var Iops: js.UndefOr[Integer] = js.undefined
  
  /**
    * The array's mount point.
    */
  var MountPoint: js.UndefOr[String] = js.undefined
  
  /**
    * The array name.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The number of disks in the array.
    */
  var NumberOfDisks: js.UndefOr[Integer] = js.undefined
  
  /**
    * The array ID.
    */
  var RaidArrayId: js.UndefOr[String] = js.undefined
  
  /**
    * The RAID level.
    */
  var RaidLevel: js.UndefOr[Integer] = js.undefined
  
  /**
    * The array's size.
    */
  var Size: js.UndefOr[Integer] = js.undefined
  
  /**
    * The stack ID.
    */
  var StackId: js.UndefOr[String] = js.undefined
  
  /**
    * The volume type, standard or PIOPS.
    */
  var VolumeType: js.UndefOr[String] = js.undefined
}
object RaidArray {
  
  inline def apply(): RaidArray = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RaidArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RaidArray] (val x: Self) extends AnyVal {
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setCreatedAt(value: DateTime): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDevice(value: String): Self = StObject.set(x, "Device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "Device", js.undefined)
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setIops(value: Integer): Self = StObject.set(x, "Iops", value.asInstanceOf[js.Any])
    
    inline def setIopsUndefined: Self = StObject.set(x, "Iops", js.undefined)
    
    inline def setMountPoint(value: String): Self = StObject.set(x, "MountPoint", value.asInstanceOf[js.Any])
    
    inline def setMountPointUndefined: Self = StObject.set(x, "MountPoint", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNumberOfDisks(value: Integer): Self = StObject.set(x, "NumberOfDisks", value.asInstanceOf[js.Any])
    
    inline def setNumberOfDisksUndefined: Self = StObject.set(x, "NumberOfDisks", js.undefined)
    
    inline def setRaidArrayId(value: String): Self = StObject.set(x, "RaidArrayId", value.asInstanceOf[js.Any])
    
    inline def setRaidArrayIdUndefined: Self = StObject.set(x, "RaidArrayId", js.undefined)
    
    inline def setRaidLevel(value: Integer): Self = StObject.set(x, "RaidLevel", value.asInstanceOf[js.Any])
    
    inline def setRaidLevelUndefined: Self = StObject.set(x, "RaidLevel", js.undefined)
    
    inline def setSize(value: Integer): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "Size", js.undefined)
    
    inline def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    inline def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
    
    inline def setVolumeType(value: String): Self = StObject.set(x, "VolumeType", value.asInstanceOf[js.Any])
    
    inline def setVolumeTypeUndefined: Self = StObject.set(x, "VolumeType", js.undefined)
  }
}
