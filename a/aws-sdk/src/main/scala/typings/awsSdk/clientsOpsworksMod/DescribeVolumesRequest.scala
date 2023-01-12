package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVolumesRequest extends StObject {
  
  /**
    * The instance ID. If you use this parameter, DescribeVolumes returns descriptions of the volumes associated with the specified instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  
  /**
    * The RAID array ID. If you use this parameter, DescribeVolumes returns descriptions of the volumes associated with the specified RAID array.
    */
  var RaidArrayId: js.UndefOr[String] = js.undefined
  
  /**
    * A stack ID. The action describes the stack's registered Amazon EBS volumes.
    */
  var StackId: js.UndefOr[String] = js.undefined
  
  /**
    * Am array of volume IDs. If you use this parameter, DescribeVolumes returns descriptions of the specified volumes. Otherwise, it returns a description of every volume.
    */
  var VolumeIds: js.UndefOr[Strings] = js.undefined
}
object DescribeVolumesRequest {
  
  inline def apply(): DescribeVolumesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVolumesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeVolumesRequest] (val x: Self) extends AnyVal {
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setRaidArrayId(value: String): Self = StObject.set(x, "RaidArrayId", value.asInstanceOf[js.Any])
    
    inline def setRaidArrayIdUndefined: Self = StObject.set(x, "RaidArrayId", js.undefined)
    
    inline def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    inline def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
    
    inline def setVolumeIds(value: Strings): Self = StObject.set(x, "VolumeIds", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdsUndefined: Self = StObject.set(x, "VolumeIds", js.undefined)
    
    inline def setVolumeIdsVarargs(value: String*): Self = StObject.set(x, "VolumeIds", js.Array(value*))
  }
}
