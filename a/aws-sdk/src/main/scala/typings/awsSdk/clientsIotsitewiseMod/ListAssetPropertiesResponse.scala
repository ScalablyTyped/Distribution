package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssetPropertiesResponse extends StObject {
  
  /**
    * A list that summarizes the properties associated with the specified asset.
    */
  var assetPropertySummaries: AssetPropertySummaries
  
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListAssetPropertiesResponse {
  
  inline def apply(assetPropertySummaries: AssetPropertySummaries): ListAssetPropertiesResponse = {
    val __obj = js.Dynamic.literal(assetPropertySummaries = assetPropertySummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssetPropertiesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAssetPropertiesResponse] (val x: Self) extends AnyVal {
    
    inline def setAssetPropertySummaries(value: AssetPropertySummaries): Self = StObject.set(x, "assetPropertySummaries", value.asInstanceOf[js.Any])
    
    inline def setAssetPropertySummariesVarargs(value: AssetPropertySummary*): Self = StObject.set(x, "assetPropertySummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
