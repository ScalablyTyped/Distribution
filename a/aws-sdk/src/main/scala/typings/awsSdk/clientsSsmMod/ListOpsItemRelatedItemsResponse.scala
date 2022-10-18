package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOpsItemRelatedItemsResponse extends StObject {
  
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list of related-item resources for the specified OpsItem.
    */
  var Summaries: js.UndefOr[OpsItemRelatedItemSummaries] = js.undefined
}
object ListOpsItemRelatedItemsResponse {
  
  inline def apply(): ListOpsItemRelatedItemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOpsItemRelatedItemsResponse]
  }
  
  extension [Self <: ListOpsItemRelatedItemsResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSummaries(value: OpsItemRelatedItemSummaries): Self = StObject.set(x, "Summaries", value.asInstanceOf[js.Any])
    
    inline def setSummariesUndefined: Self = StObject.set(x, "Summaries", js.undefined)
    
    inline def setSummariesVarargs(value: OpsItemRelatedItemSummary*): Self = StObject.set(x, "Summaries", js.Array(value*))
  }
}
