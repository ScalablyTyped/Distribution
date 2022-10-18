package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInputRoutingsRequest extends StObject {
  
  /**
    *  The identifer of the routed input. 
    */
  var inputIdentifier: InputIdentifier
  
  /**
    *  The maximum number of results to be returned per request. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    *  The token that you can use to return the next set of results. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListInputRoutingsRequest {
  
  inline def apply(inputIdentifier: InputIdentifier): ListInputRoutingsRequest = {
    val __obj = js.Dynamic.literal(inputIdentifier = inputIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInputRoutingsRequest]
  }
  
  extension [Self <: ListInputRoutingsRequest](x: Self) {
    
    inline def setInputIdentifier(value: InputIdentifier): Self = StObject.set(x, "inputIdentifier", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
