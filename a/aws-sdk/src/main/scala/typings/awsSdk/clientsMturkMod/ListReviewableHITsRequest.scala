package typings.awsSdk.clientsMturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReviewableHITsRequest extends StObject {
  
  /**
    *  The ID of the HIT type of the HITs to consider for the query. If not specified, all HITs for the Reviewer are considered 
    */
  var HITTypeId: js.UndefOr[EntityId] = js.undefined
  
  /**
    *  Limit the number of results returned. 
    */
  var MaxResults: js.UndefOr[ResultSize] = js.undefined
  
  /**
    * Pagination Token
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    *  Can be either Reviewable or Reviewing. Reviewable is the default value. 
    */
  var Status: js.UndefOr[ReviewableHITStatus] = js.undefined
}
object ListReviewableHITsRequest {
  
  inline def apply(): ListReviewableHITsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReviewableHITsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListReviewableHITsRequest] (val x: Self) extends AnyVal {
    
    inline def setHITTypeId(value: EntityId): Self = StObject.set(x, "HITTypeId", value.asInstanceOf[js.Any])
    
    inline def setHITTypeIdUndefined: Self = StObject.set(x, "HITTypeId", js.undefined)
    
    inline def setMaxResults(value: ResultSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStatus(value: ReviewableHITStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
