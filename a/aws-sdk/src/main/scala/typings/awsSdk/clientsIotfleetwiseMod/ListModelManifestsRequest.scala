package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListModelManifestsRequest extends StObject {
  
  /**
    *  The maximum number of items to return, between 1 and 100, inclusive. 
    */
  var maxResults: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.maxResults] = js.undefined
  
  /**
    * A pagination token for the next set of results. If the results of a search are large, only a portion of the results are returned, and a nextToken pagination token is returned in the response. To retrieve the next set of results, reissue the search request and include the returned token. When all results have been returned, the response does not contain a pagination token value. 
    */
  var nextToken: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.nextToken] = js.undefined
  
  /**
    *  The ARN of a signal catalog. If you specify a signal catalog, only the vehicle models associated with it are returned.
    */
  var signalCatalogArn: js.UndefOr[arn] = js.undefined
}
object ListModelManifestsRequest {
  
  inline def apply(): ListModelManifestsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListModelManifestsRequest]
  }
  
  extension [Self <: ListModelManifestsRequest](x: Self) {
    
    inline def setMaxResults(value: maxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: nextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSignalCatalogArn(value: arn): Self = StObject.set(x, "signalCatalogArn", value.asInstanceOf[js.Any])
    
    inline def setSignalCatalogArnUndefined: Self = StObject.set(x, "signalCatalogArn", js.undefined)
  }
}
