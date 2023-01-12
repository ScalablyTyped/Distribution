package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssetRelationshipsResponse extends StObject {
  
  /**
    * A list that summarizes each asset relationship.
    */
  var assetRelationshipSummaries: AssetRelationshipSummaries
  
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListAssetRelationshipsResponse {
  
  inline def apply(assetRelationshipSummaries: AssetRelationshipSummaries): ListAssetRelationshipsResponse = {
    val __obj = js.Dynamic.literal(assetRelationshipSummaries = assetRelationshipSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssetRelationshipsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAssetRelationshipsResponse] (val x: Self) extends AnyVal {
    
    inline def setAssetRelationshipSummaries(value: AssetRelationshipSummaries): Self = StObject.set(x, "assetRelationshipSummaries", value.asInstanceOf[js.Any])
    
    inline def setAssetRelationshipSummariesVarargs(value: AssetRelationshipSummary*): Self = StObject.set(x, "assetRelationshipSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
