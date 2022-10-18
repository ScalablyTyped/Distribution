package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourceComplianceSummariesResult extends StObject {
  
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSsmMod.NextToken] = js.undefined
  
  /**
    * A summary count for specified or targeted managed nodes. Summary count includes information about compliant and non-compliant State Manager associations, patch status, or custom items according to the filter criteria that you specify. 
    */
  var ResourceComplianceSummaryItems: js.UndefOr[ResourceComplianceSummaryItemList] = js.undefined
}
object ListResourceComplianceSummariesResult {
  
  inline def apply(): ListResourceComplianceSummariesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourceComplianceSummariesResult]
  }
  
  extension [Self <: ListResourceComplianceSummariesResult](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceComplianceSummaryItems(value: ResourceComplianceSummaryItemList): Self = StObject.set(x, "ResourceComplianceSummaryItems", value.asInstanceOf[js.Any])
    
    inline def setResourceComplianceSummaryItemsUndefined: Self = StObject.set(x, "ResourceComplianceSummaryItems", js.undefined)
    
    inline def setResourceComplianceSummaryItemsVarargs(value: ResourceComplianceSummaryItem*): Self = StObject.set(x, "ResourceComplianceSummaryItems", js.Array(value*))
  }
}
