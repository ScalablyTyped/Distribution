package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTimeSeriesRequest extends StObject {
  
  /**
    * The alias prefix of the time series.
    */
  var aliasPrefix: js.UndefOr[PropertyAlias] = js.undefined
  
  /**
    * The ID of the asset in which the asset property was created.
    */
  var assetId: js.UndefOr[ID] = js.undefined
  
  /**
    * The maximum number of results to return for each paginated request.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The token to be used for the next set of paginated results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The type of the time series. The time series type can be one of the following values:    ASSOCIATED – The time series is associated with an asset property.    DISASSOCIATED – The time series isn't associated with any asset property.  
    */
  var timeSeriesType: js.UndefOr[ListTimeSeriesType] = js.undefined
}
object ListTimeSeriesRequest {
  
  inline def apply(): ListTimeSeriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTimeSeriesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTimeSeriesRequest] (val x: Self) extends AnyVal {
    
    inline def setAliasPrefix(value: PropertyAlias): Self = StObject.set(x, "aliasPrefix", value.asInstanceOf[js.Any])
    
    inline def setAliasPrefixUndefined: Self = StObject.set(x, "aliasPrefix", js.undefined)
    
    inline def setAssetId(value: ID): Self = StObject.set(x, "assetId", value.asInstanceOf[js.Any])
    
    inline def setAssetIdUndefined: Self = StObject.set(x, "assetId", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTimeSeriesType(value: ListTimeSeriesType): Self = StObject.set(x, "timeSeriesType", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesTypeUndefined: Self = StObject.set(x, "timeSeriesType", js.undefined)
  }
}
