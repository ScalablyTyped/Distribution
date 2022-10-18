package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSipRulesRequest extends StObject {
  
  /**
    * The maximum number of results to return in a single call. Defaults to 100.
    */
  var MaxResults: js.UndefOr[ResultMax] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[NextTokenString] = js.undefined
  
  /**
    * The SIP media application ID.
    */
  var SipMediaApplicationId: js.UndefOr[NonEmptyString] = js.undefined
}
object ListSipRulesRequest {
  
  inline def apply(): ListSipRulesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSipRulesRequest]
  }
  
  extension [Self <: ListSipRulesRequest](x: Self) {
    
    inline def setMaxResults(value: ResultMax): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextTokenString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSipMediaApplicationId(value: NonEmptyString): Self = StObject.set(x, "SipMediaApplicationId", value.asInstanceOf[js.Any])
    
    inline def setSipMediaApplicationIdUndefined: Self = StObject.set(x, "SipMediaApplicationId", js.undefined)
  }
}
