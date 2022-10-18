package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteInstanceRequest extends StObject {
  
  /**
    * Whether to delete the instance Elastic IP address.
    */
  var DeleteElasticIp: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to delete the instance's Amazon EBS volumes.
    */
  var DeleteVolumes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The instance ID.
    */
  var InstanceId: String
}
object DeleteInstanceRequest {
  
  inline def apply(InstanceId: String): DeleteInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInstanceRequest]
  }
  
  extension [Self <: DeleteInstanceRequest](x: Self) {
    
    inline def setDeleteElasticIp(value: Boolean): Self = StObject.set(x, "DeleteElasticIp", value.asInstanceOf[js.Any])
    
    inline def setDeleteElasticIpUndefined: Self = StObject.set(x, "DeleteElasticIp", js.undefined)
    
    inline def setDeleteVolumes(value: Boolean): Self = StObject.set(x, "DeleteVolumes", value.asInstanceOf[js.Any])
    
    inline def setDeleteVolumesUndefined: Self = StObject.set(x, "DeleteVolumes", js.undefined)
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
