package typings.awsSdk.clientsCognitosyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIdentityPoolUsageRequest extends StObject {
  
  /**
    * The maximum number of results to be returned.
    */
  var MaxResults: js.UndefOr[IntegerString] = js.undefined
  
  /**
    * A pagination token for obtaining the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListIdentityPoolUsageRequest {
  
  inline def apply(): ListIdentityPoolUsageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIdentityPoolUsageRequest]
  }
  
  extension [Self <: ListIdentityPoolUsageRequest](x: Self) {
    
    inline def setMaxResults(value: IntegerString): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
