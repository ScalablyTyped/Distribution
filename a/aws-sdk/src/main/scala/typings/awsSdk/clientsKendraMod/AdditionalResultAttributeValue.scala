package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalResultAttributeValue extends StObject {
  
  /**
    * The text associated with the attribute and information about the highlight to apply to the text.
    */
  var TextWithHighlightsValue: js.UndefOr[TextWithHighlights] = js.undefined
}
object AdditionalResultAttributeValue {
  
  inline def apply(): AdditionalResultAttributeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalResultAttributeValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdditionalResultAttributeValue] (val x: Self) extends AnyVal {
    
    inline def setTextWithHighlightsValue(value: TextWithHighlights): Self = StObject.set(x, "TextWithHighlightsValue", value.asInstanceOf[js.Any])
    
    inline def setTextWithHighlightsValueUndefined: Self = StObject.set(x, "TextWithHighlightsValue", js.undefined)
  }
}
