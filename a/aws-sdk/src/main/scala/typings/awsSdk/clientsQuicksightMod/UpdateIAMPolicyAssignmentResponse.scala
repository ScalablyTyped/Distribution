package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateIAMPolicyAssignmentResponse extends StObject {
  
  /**
    * The ID of the assignment.
    */
  var AssignmentId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the assignment or rule.
    */
  var AssignmentName: js.UndefOr[IAMPolicyAssignmentName] = js.undefined
  
  /**
    * The status of the assignment. Possible values are as follows:    ENABLED - Anything specified in this assignment is used when creating the data source.    DISABLED - This assignment isn't used when creating the data source.    DRAFT - This assignment is an unfinished draft and isn't used when creating the data source.  
    */
  var AssignmentStatus: js.UndefOr[typings.awsSdk.clientsQuicksightMod.AssignmentStatus] = js.undefined
  
  /**
    * The Amazon QuickSight users, groups, or both that the IAM policy is assigned to.
    */
  var Identities: js.UndefOr[IdentityMap] = js.undefined
  
  /**
    * The ARN for the IAM policy applied to the Amazon QuickSight users and groups specified in this assignment.
    */
  var PolicyArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The Amazon Web Services request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}
object UpdateIAMPolicyAssignmentResponse {
  
  inline def apply(): UpdateIAMPolicyAssignmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateIAMPolicyAssignmentResponse]
  }
  
  extension [Self <: UpdateIAMPolicyAssignmentResponse](x: Self) {
    
    inline def setAssignmentId(value: String): Self = StObject.set(x, "AssignmentId", value.asInstanceOf[js.Any])
    
    inline def setAssignmentIdUndefined: Self = StObject.set(x, "AssignmentId", js.undefined)
    
    inline def setAssignmentName(value: IAMPolicyAssignmentName): Self = StObject.set(x, "AssignmentName", value.asInstanceOf[js.Any])
    
    inline def setAssignmentNameUndefined: Self = StObject.set(x, "AssignmentName", js.undefined)
    
    inline def setAssignmentStatus(value: AssignmentStatus): Self = StObject.set(x, "AssignmentStatus", value.asInstanceOf[js.Any])
    
    inline def setAssignmentStatusUndefined: Self = StObject.set(x, "AssignmentStatus", js.undefined)
    
    inline def setIdentities(value: IdentityMap): Self = StObject.set(x, "Identities", value.asInstanceOf[js.Any])
    
    inline def setIdentitiesUndefined: Self = StObject.set(x, "Identities", js.undefined)
    
    inline def setPolicyArn(value: Arn): Self = StObject.set(x, "PolicyArn", value.asInstanceOf[js.Any])
    
    inline def setPolicyArnUndefined: Self = StObject.set(x, "PolicyArn", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
