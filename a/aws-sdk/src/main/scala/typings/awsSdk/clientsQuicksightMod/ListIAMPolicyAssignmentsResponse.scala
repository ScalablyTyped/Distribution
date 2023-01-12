package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIAMPolicyAssignmentsResponse extends StObject {
  
  /**
    * Information describing the IAM policy assignments.
    */
  var IAMPolicyAssignments: js.UndefOr[IAMPolicyAssignmentSummaryList] = js.undefined
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Web Services request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}
object ListIAMPolicyAssignmentsResponse {
  
  inline def apply(): ListIAMPolicyAssignmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIAMPolicyAssignmentsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListIAMPolicyAssignmentsResponse] (val x: Self) extends AnyVal {
    
    inline def setIAMPolicyAssignments(value: IAMPolicyAssignmentSummaryList): Self = StObject.set(x, "IAMPolicyAssignments", value.asInstanceOf[js.Any])
    
    inline def setIAMPolicyAssignmentsUndefined: Self = StObject.set(x, "IAMPolicyAssignments", js.undefined)
    
    inline def setIAMPolicyAssignmentsVarargs(value: IAMPolicyAssignmentSummary*): Self = StObject.set(x, "IAMPolicyAssignments", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
