package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteIAMPolicyAssignmentRequest extends StObject {
  
  /**
    * The name of the assignment. 
    */
  var AssignmentName: IAMPolicyAssignmentName
  
  /**
    * The Amazon Web Services account ID where you want to delete the IAM policy assignment.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * The namespace that contains the assignment.
    */
  var Namespace: typings.awsSdk.clientsQuicksightMod.Namespace
}
object DeleteIAMPolicyAssignmentRequest {
  
  inline def apply(AssignmentName: IAMPolicyAssignmentName, AwsAccountId: AwsAccountId, Namespace: Namespace): DeleteIAMPolicyAssignmentRequest = {
    val __obj = js.Dynamic.literal(AssignmentName = AssignmentName.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIAMPolicyAssignmentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteIAMPolicyAssignmentRequest] (val x: Self) extends AnyVal {
    
    inline def setAssignmentName(value: IAMPolicyAssignmentName): Self = StObject.set(x, "AssignmentName", value.asInstanceOf[js.Any])
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
  }
}
