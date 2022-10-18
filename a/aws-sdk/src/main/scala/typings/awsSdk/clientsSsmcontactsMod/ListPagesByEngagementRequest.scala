package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPagesByEngagementRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the engagement.
    */
  var EngagementId: SsmContactsArn
  
  /**
    * The maximum number of engagements to contact channels to list per page of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsSsmcontactsMod.MaxResults] = js.undefined
  
  /**
    * The pagination token to continue to the next page of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListPagesByEngagementRequest {
  
  inline def apply(EngagementId: SsmContactsArn): ListPagesByEngagementRequest = {
    val __obj = js.Dynamic.literal(EngagementId = EngagementId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPagesByEngagementRequest]
  }
  
  extension [Self <: ListPagesByEngagementRequest](x: Self) {
    
    inline def setEngagementId(value: SsmContactsArn): Self = StObject.set(x, "EngagementId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
