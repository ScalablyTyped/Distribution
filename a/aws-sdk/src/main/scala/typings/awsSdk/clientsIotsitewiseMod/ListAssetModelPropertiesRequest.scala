package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssetModelPropertiesRequest extends StObject {
  
  /**
    * The ID of the asset model.
    */
  var assetModelId: ID
  
  /**
    *  Filters the requested list of asset model properties. You can choose one of the following options:    ALL – The list includes all asset model properties for a given asset model ID.     BASE – The list includes only base asset model properties for a given asset model ID.    Default: BASE 
    */
  var filter: js.UndefOr[ListAssetModelPropertiesFilter] = js.undefined
  
  /**
    * The maximum number of results to return for each paginated request. If not specified, the default value is 50.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The token to be used for the next set of paginated results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListAssetModelPropertiesRequest {
  
  inline def apply(assetModelId: ID): ListAssetModelPropertiesRequest = {
    val __obj = js.Dynamic.literal(assetModelId = assetModelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssetModelPropertiesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAssetModelPropertiesRequest] (val x: Self) extends AnyVal {
    
    inline def setAssetModelId(value: ID): Self = StObject.set(x, "assetModelId", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: ListAssetModelPropertiesFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
