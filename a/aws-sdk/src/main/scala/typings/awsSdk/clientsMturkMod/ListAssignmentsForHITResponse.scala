package typings.awsSdk.clientsMturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssignmentsForHITResponse extends StObject {
  
  /**
    *  The collection of Assignment data structures returned by this call.
    */
  var Assignments: js.UndefOr[AssignmentList] = js.undefined
  
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    *  The number of assignments on the page in the filtered results list, equivalent to the number of assignments returned by this call.
    */
  var NumResults: js.UndefOr[Integer] = js.undefined
}
object ListAssignmentsForHITResponse {
  
  inline def apply(): ListAssignmentsForHITResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssignmentsForHITResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAssignmentsForHITResponse] (val x: Self) extends AnyVal {
    
    inline def setAssignments(value: AssignmentList): Self = StObject.set(x, "Assignments", value.asInstanceOf[js.Any])
    
    inline def setAssignmentsUndefined: Self = StObject.set(x, "Assignments", js.undefined)
    
    inline def setAssignmentsVarargs(value: Assignment*): Self = StObject.set(x, "Assignments", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setNumResults(value: Integer): Self = StObject.set(x, "NumResults", value.asInstanceOf[js.Any])
    
    inline def setNumResultsUndefined: Self = StObject.set(x, "NumResults", js.undefined)
  }
}
