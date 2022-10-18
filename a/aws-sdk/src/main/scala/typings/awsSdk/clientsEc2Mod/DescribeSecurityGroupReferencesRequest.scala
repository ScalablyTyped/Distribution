package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSecurityGroupReferencesRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The IDs of the security groups in your account.
    */
  var GroupId: GroupIds
}
object DescribeSecurityGroupReferencesRequest {
  
  inline def apply(GroupId: GroupIds): DescribeSecurityGroupReferencesRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSecurityGroupReferencesRequest]
  }
  
  extension [Self <: DescribeSecurityGroupReferencesRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setGroupId(value: GroupIds): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdVarargs(value: SecurityGroupId*): Self = StObject.set(x, "GroupId", js.Array(value*))
  }
}
