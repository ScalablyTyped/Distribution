package typings.awsSdk.clientsSupportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCommunicationsRequest extends StObject {
  
  /**
    * The start date for a filtered date search on support case communications. Case communications are available for 12 months after creation.
    */
  var afterTime: js.UndefOr[AfterTime] = js.undefined
  
  /**
    * The end date for a filtered date search on support case communications. Case communications are available for 12 months after creation.
    */
  var beforeTime: js.UndefOr[BeforeTime] = js.undefined
  
  /**
    * The support case ID requested or returned in the call. The case ID is an alphanumeric string formatted as shown in this example: case-12345678910-2013-c4c1d2bf33c5cf47 
    */
  var caseId: CaseId
  
  /**
    * The maximum number of results to return before paginating.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * A resumption point for pagination.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object DescribeCommunicationsRequest {
  
  inline def apply(caseId: CaseId): DescribeCommunicationsRequest = {
    val __obj = js.Dynamic.literal(caseId = caseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCommunicationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeCommunicationsRequest] (val x: Self) extends AnyVal {
    
    inline def setAfterTime(value: AfterTime): Self = StObject.set(x, "afterTime", value.asInstanceOf[js.Any])
    
    inline def setAfterTimeUndefined: Self = StObject.set(x, "afterTime", js.undefined)
    
    inline def setBeforeTime(value: BeforeTime): Self = StObject.set(x, "beforeTime", value.asInstanceOf[js.Any])
    
    inline def setBeforeTimeUndefined: Self = StObject.set(x, "beforeTime", js.undefined)
    
    inline def setCaseId(value: CaseId): Self = StObject.set(x, "caseId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
