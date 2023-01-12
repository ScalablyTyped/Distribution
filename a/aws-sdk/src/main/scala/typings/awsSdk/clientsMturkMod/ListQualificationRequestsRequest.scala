package typings.awsSdk.clientsMturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListQualificationRequestsRequest extends StObject {
  
  /**
    *  The maximum number of results to return in a single call. 
    */
  var MaxResults: js.UndefOr[ResultSize] = js.undefined
  
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The ID of the QualificationType.
    */
  var QualificationTypeId: js.UndefOr[EntityId] = js.undefined
}
object ListQualificationRequestsRequest {
  
  inline def apply(): ListQualificationRequestsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQualificationRequestsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListQualificationRequestsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: ResultSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setQualificationTypeId(value: EntityId): Self = StObject.set(x, "QualificationTypeId", value.asInstanceOf[js.Any])
    
    inline def setQualificationTypeIdUndefined: Self = StObject.set(x, "QualificationTypeId", js.undefined)
  }
}
