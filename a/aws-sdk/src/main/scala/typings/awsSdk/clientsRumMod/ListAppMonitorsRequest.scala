package typings.awsSdk.clientsRumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAppMonitorsRequest extends StObject {
  
  /**
    * The maximum number of results to return in one operation. 
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * Use the token returned by the previous operation to request the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListAppMonitorsRequest {
  
  inline def apply(): ListAppMonitorsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAppMonitorsRequest]
  }
  
  extension [Self <: ListAppMonitorsRequest](x: Self) {
    
    inline def setMaxResults(value: Integer): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
