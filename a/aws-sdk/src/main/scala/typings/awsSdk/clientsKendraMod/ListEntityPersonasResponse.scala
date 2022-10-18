package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEntityPersonasResponse extends StObject {
  
  /**
    * If the response is truncated, Amazon Kendra returns this token, which you can use in a later request to retrieve the next set of users or groups.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsKendraMod.NextToken] = js.undefined
  
  /**
    * An array of summary information for one or more users or groups.
    */
  var SummaryItems: js.UndefOr[PersonasSummaryList] = js.undefined
}
object ListEntityPersonasResponse {
  
  inline def apply(): ListEntityPersonasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEntityPersonasResponse]
  }
  
  extension [Self <: ListEntityPersonasResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSummaryItems(value: PersonasSummaryList): Self = StObject.set(x, "SummaryItems", value.asInstanceOf[js.Any])
    
    inline def setSummaryItemsUndefined: Self = StObject.set(x, "SummaryItems", js.undefined)
    
    inline def setSummaryItemsVarargs(value: PersonasSummary*): Self = StObject.set(x, "SummaryItems", js.Array(value*))
  }
}
