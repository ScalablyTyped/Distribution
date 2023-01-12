package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBuiltInSlotTypesResponse extends StObject {
  
  /**
    * Summary information for the built-in slot types that meet the filter criteria specified in the request. The length of the list is specified in the maxResults parameter of the request. If there are more slot types available, the nextToken field contains a token to get the next page of results.
    */
  var builtInSlotTypeSummaries: js.UndefOr[BuiltInSlotTypeSummaryList] = js.undefined
  
  /**
    * The language and locale of the slot types in the list.
    */
  var localeId: js.UndefOr[LocaleId] = js.undefined
  
  /**
    * A token that indicates whether there are more results to return in a response to the ListBuiltInSlotTypes operation. If the nextToken field is present, you send the contents as the nextToken parameter of a LIstBuiltInSlotTypes operation request to get the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListBuiltInSlotTypesResponse {
  
  inline def apply(): ListBuiltInSlotTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBuiltInSlotTypesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListBuiltInSlotTypesResponse] (val x: Self) extends AnyVal {
    
    inline def setBuiltInSlotTypeSummaries(value: BuiltInSlotTypeSummaryList): Self = StObject.set(x, "builtInSlotTypeSummaries", value.asInstanceOf[js.Any])
    
    inline def setBuiltInSlotTypeSummariesUndefined: Self = StObject.set(x, "builtInSlotTypeSummaries", js.undefined)
    
    inline def setBuiltInSlotTypeSummariesVarargs(value: BuiltInSlotTypeSummary*): Self = StObject.set(x, "builtInSlotTypeSummaries", js.Array(value*))
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setLocaleIdUndefined: Self = StObject.set(x, "localeId", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
