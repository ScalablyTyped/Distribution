package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopInstanceRequest extends StObject {
  
  /**
    * Specifies whether to force an instance to stop. If the instance's root device type is ebs, or EBS-backed, adding the Force parameter to the StopInstances API call disassociates the AWS OpsWorks Stacks instance from EC2, and forces deletion of only the OpsWorks Stacks instance. You must also delete the formerly-associated instance in EC2 after troubleshooting and replacing the AWS OpsWorks Stacks instance with a new one.
    */
  var Force: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The instance ID.
    */
  var InstanceId: String
}
object StopInstanceRequest {
  
  inline def apply(InstanceId: String): StopInstanceRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopInstanceRequest]
  }
  
  extension [Self <: StopInstanceRequest](x: Self) {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "Force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "Force", js.undefined)
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
