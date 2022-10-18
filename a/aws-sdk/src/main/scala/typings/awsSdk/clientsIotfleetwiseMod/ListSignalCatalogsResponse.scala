package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSignalCatalogsResponse extends StObject {
  
  /**
    *  The token to retrieve the next set of results, or null if there are no more results. 
    */
  var nextToken: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.nextToken] = js.undefined
  
  /**
    *  A list of information about each signal catalog. 
    */
  var summaries: js.UndefOr[signalCatalogSummaries] = js.undefined
}
object ListSignalCatalogsResponse {
  
  inline def apply(): ListSignalCatalogsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSignalCatalogsResponse]
  }
  
  extension [Self <: ListSignalCatalogsResponse](x: Self) {
    
    inline def setNextToken(value: nextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSummaries(value: signalCatalogSummaries): Self = StObject.set(x, "summaries", value.asInstanceOf[js.Any])
    
    inline def setSummariesUndefined: Self = StObject.set(x, "summaries", js.undefined)
    
    inline def setSummariesVarargs(value: SignalCatalogSummary*): Self = StObject.set(x, "summaries", js.Array(value*))
  }
}
