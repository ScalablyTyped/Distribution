package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2RichResponse extends StObject {
  
  /**
    * A list of UI elements which compose the response
    * The items must meet the following requirements:
    * 1. The first item must be a
    * SimpleResponse
    * 2. At most two SimpleResponse
    * 3. At most one rich response item (e.g.
    * BasicCard,
    *  StructuredResponse,
    *  MediaResponse, or
    *  HtmlResponse)
    * 4. You cannot use a rich response item if you're using an
    * actions.intent.OPTION intent
    *  ie ListSelect or
    *     CarouselSelect
    */
  var items: js.UndefOr[js.Array[GoogleActionsV2RichResponseItem]] = js.undefined
  
  /**
    * An additional suggestion chip that can link out to the associated app
    * or site.
    */
  var linkOutSuggestion: js.UndefOr[GoogleActionsV2UiElementsLinkOutSuggestion] = js.undefined
  
  /**
    * A list of suggested replies. These will always appear at the end of the
    * response. If used in a FinalResponse,
    * they will be ignored.
    */
  var suggestions: js.UndefOr[js.Array[GoogleActionsV2UiElementsSuggestion]] = js.undefined
}
object GoogleActionsV2RichResponse {
  
  inline def apply(): GoogleActionsV2RichResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2RichResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleActionsV2RichResponse] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[GoogleActionsV2RichResponseItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: GoogleActionsV2RichResponseItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setLinkOutSuggestion(value: GoogleActionsV2UiElementsLinkOutSuggestion): Self = StObject.set(x, "linkOutSuggestion", value.asInstanceOf[js.Any])
    
    inline def setLinkOutSuggestionUndefined: Self = StObject.set(x, "linkOutSuggestion", js.undefined)
    
    inline def setSuggestions(value: js.Array[GoogleActionsV2UiElementsSuggestion]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
    
    inline def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
    
    inline def setSuggestionsVarargs(value: GoogleActionsV2UiElementsSuggestion*): Self = StObject.set(x, "suggestions", js.Array(value*))
  }
}
