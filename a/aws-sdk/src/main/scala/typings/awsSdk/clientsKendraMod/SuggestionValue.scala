package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuggestionValue extends StObject {
  
  /**
    * The SuggestionTextWithHighlights structure that contains the query suggestion text and highlights.
    */
  var Text: js.UndefOr[SuggestionTextWithHighlights] = js.undefined
}
object SuggestionValue {
  
  inline def apply(): SuggestionValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestionValue]
  }
  
  extension [Self <: SuggestionValue](x: Self) {
    
    inline def setText(value: SuggestionTextWithHighlights): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
  }
}
