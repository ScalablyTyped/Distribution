package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2NetworkInterfaceViolation extends StObject {
  
  /**
    * List of security groups that violate the rules specified in the primary security group of the Firewall Manager policy.
    */
  var ViolatingSecurityGroups: js.UndefOr[ResourceIdList] = js.undefined
  
  /**
    * The resource ID of the network interface.
    */
  var ViolationTarget: js.UndefOr[typings.awsSdk.clientsFmsMod.ViolationTarget] = js.undefined
}
object AwsEc2NetworkInterfaceViolation {
  
  inline def apply(): AwsEc2NetworkInterfaceViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2NetworkInterfaceViolation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2NetworkInterfaceViolation] (val x: Self) extends AnyVal {
    
    inline def setViolatingSecurityGroups(value: ResourceIdList): Self = StObject.set(x, "ViolatingSecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setViolatingSecurityGroupsUndefined: Self = StObject.set(x, "ViolatingSecurityGroups", js.undefined)
    
    inline def setViolatingSecurityGroupsVarargs(value: ResourceId*): Self = StObject.set(x, "ViolatingSecurityGroups", js.Array(value*))
    
    inline def setViolationTarget(value: ViolationTarget): Self = StObject.set(x, "ViolationTarget", value.asInstanceOf[js.Any])
    
    inline def setViolationTargetUndefined: Self = StObject.set(x, "ViolationTarget", js.undefined)
  }
}
