package typings.awsSdk.clientsApplicationcostprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReportDefinitionsRequest extends StObject {
  
  /**
    * The maximum number of results to return.
    */
  var maxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * The token value from a previous call to access the next page of results.
    */
  var nextToken: js.UndefOr[Token] = js.undefined
}
object ListReportDefinitionsRequest {
  
  inline def apply(): ListReportDefinitionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReportDefinitionsRequest]
  }
  
  extension [Self <: ListReportDefinitionsRequest](x: Self) {
    
    inline def setMaxResults(value: Integer): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
