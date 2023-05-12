package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachDiskRequest extends StObject {
  
  /**
    * A Boolean value used to determine the automatic mounting of a storage volume to a virtual computer. The default value is False.  This value only applies to Lightsail for Research resources. 
    */
  var autoMounting: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The unique Lightsail disk name (e.g., my-disk).
    */
  var diskName: ResourceName
  
  /**
    * The disk path to expose to the instance (e.g., /dev/xvdf).
    */
  var diskPath: NonEmptyString
  
  /**
    * The name of the Lightsail instance where you want to utilize the storage disk.
    */
  var instanceName: ResourceName
}
object AttachDiskRequest {
  
  inline def apply(diskName: ResourceName, diskPath: NonEmptyString, instanceName: ResourceName): AttachDiskRequest = {
    val __obj = js.Dynamic.literal(diskName = diskName.asInstanceOf[js.Any], diskPath = diskPath.asInstanceOf[js.Any], instanceName = instanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachDiskRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttachDiskRequest] (val x: Self) extends AnyVal {
    
    inline def setAutoMounting(value: Boolean): Self = StObject.set(x, "autoMounting", value.asInstanceOf[js.Any])
    
    inline def setAutoMountingUndefined: Self = StObject.set(x, "autoMounting", js.undefined)
    
    inline def setDiskName(value: ResourceName): Self = StObject.set(x, "diskName", value.asInstanceOf[js.Any])
    
    inline def setDiskPath(value: NonEmptyString): Self = StObject.set(x, "diskPath", value.asInstanceOf[js.Any])
    
    inline def setInstanceName(value: ResourceName): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
  }
}
