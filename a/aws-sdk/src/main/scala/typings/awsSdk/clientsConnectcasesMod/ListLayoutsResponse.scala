package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLayoutsResponse extends StObject {
  
  /**
    * The layouts for the domain.
    */
  var layouts: LayoutSummaryList
  
  /**
    * The token for the next set of results. This is null if there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListLayoutsResponse {
  
  inline def apply(layouts: LayoutSummaryList): ListLayoutsResponse = {
    val __obj = js.Dynamic.literal(layouts = layouts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLayoutsResponse]
  }
  
  extension [Self <: ListLayoutsResponse](x: Self) {
    
    inline def setLayouts(value: LayoutSummaryList): Self = StObject.set(x, "layouts", value.asInstanceOf[js.Any])
    
    inline def setLayoutsVarargs(value: LayoutSummary*): Self = StObject.set(x, "layouts", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
