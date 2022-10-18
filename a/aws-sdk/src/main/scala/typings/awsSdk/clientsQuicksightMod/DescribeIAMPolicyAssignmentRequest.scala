package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeIAMPolicyAssignmentRequest extends StObject {
  
  /**
    * The name of the assignment, also called a rule.
    */
  var AssignmentName: IAMPolicyAssignmentName
  
  /**
    * The ID of the Amazon Web Services account that contains the assignment that you want to describe.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * The namespace that contains the assignment.
    */
  var Namespace: typings.awsSdk.clientsQuicksightMod.Namespace
}
object DescribeIAMPolicyAssignmentRequest {
  
  inline def apply(AssignmentName: IAMPolicyAssignmentName, AwsAccountId: AwsAccountId, Namespace: Namespace): DescribeIAMPolicyAssignmentRequest = {
    val __obj = js.Dynamic.literal(AssignmentName = AssignmentName.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeIAMPolicyAssignmentRequest]
  }
  
  extension [Self <: DescribeIAMPolicyAssignmentRequest](x: Self) {
    
    inline def setAssignmentName(value: IAMPolicyAssignmentName): Self = StObject.set(x, "AssignmentName", value.asInstanceOf[js.Any])
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
  }
}
