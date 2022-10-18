package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSlotTypesResponse extends StObject {
  
  /**
    * The identifier of the bot that contains the slot types.
    */
  var botId: js.UndefOr[Id] = js.undefined
  
  /**
    * The version of the bot that contains the slot types.
    */
  var botVersion: js.UndefOr[BotVersion] = js.undefined
  
  /**
    * The language and local of the slot types in the list.
    */
  var localeId: js.UndefOr[LocaleId] = js.undefined
  
  /**
    * A token that indicates whether there are more results to return in a response to the ListSlotTypes operation. If the nextToken field is present, you send the contents as the nextToken parameter of a ListSlotTypes operation request to get the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * Summary information for the slot types that meet the filter criteria specified in the request. The length of the list is specified in the maxResults parameter of the request. If there are more slot types available, the nextToken field contains a token to get the next page of results.
    */
  var slotTypeSummaries: js.UndefOr[SlotTypeSummaryList] = js.undefined
}
object ListSlotTypesResponse {
  
  inline def apply(): ListSlotTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSlotTypesResponse]
  }
  
  extension [Self <: ListSlotTypesResponse](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotIdUndefined: Self = StObject.set(x, "botId", js.undefined)
    
    inline def setBotVersion(value: BotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setBotVersionUndefined: Self = StObject.set(x, "botVersion", js.undefined)
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setLocaleIdUndefined: Self = StObject.set(x, "localeId", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSlotTypeSummaries(value: SlotTypeSummaryList): Self = StObject.set(x, "slotTypeSummaries", value.asInstanceOf[js.Any])
    
    inline def setSlotTypeSummariesUndefined: Self = StObject.set(x, "slotTypeSummaries", js.undefined)
    
    inline def setSlotTypeSummariesVarargs(value: SlotTypeSummary*): Self = StObject.set(x, "slotTypeSummaries", js.Array(value*))
  }
}
