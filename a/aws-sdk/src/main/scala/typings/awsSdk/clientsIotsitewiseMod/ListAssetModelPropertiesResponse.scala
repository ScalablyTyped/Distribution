package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssetModelPropertiesResponse extends StObject {
  
  /**
    * A list that summarizes the properties associated with the specified asset model.
    */
  var assetModelPropertySummaries: AssetModelPropertySummaries
  
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListAssetModelPropertiesResponse {
  
  inline def apply(assetModelPropertySummaries: AssetModelPropertySummaries): ListAssetModelPropertiesResponse = {
    val __obj = js.Dynamic.literal(assetModelPropertySummaries = assetModelPropertySummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssetModelPropertiesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAssetModelPropertiesResponse] (val x: Self) extends AnyVal {
    
    inline def setAssetModelPropertySummaries(value: AssetModelPropertySummaries): Self = StObject.set(x, "assetModelPropertySummaries", value.asInstanceOf[js.Any])
    
    inline def setAssetModelPropertySummariesVarargs(value: AssetModelPropertySummary*): Self = StObject.set(x, "assetModelPropertySummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
