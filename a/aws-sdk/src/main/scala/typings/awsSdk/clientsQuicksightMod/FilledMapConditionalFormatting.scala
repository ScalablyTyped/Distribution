package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilledMapConditionalFormatting extends StObject {
  
  /**
    * Conditional formatting options of a FilledMapVisual.
    */
  var ConditionalFormattingOptions: FilledMapConditionalFormattingOptionList
}
object FilledMapConditionalFormatting {
  
  inline def apply(ConditionalFormattingOptions: FilledMapConditionalFormattingOptionList): FilledMapConditionalFormatting = {
    val __obj = js.Dynamic.literal(ConditionalFormattingOptions = ConditionalFormattingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilledMapConditionalFormatting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilledMapConditionalFormatting] (val x: Self) extends AnyVal {
    
    inline def setConditionalFormattingOptions(value: FilledMapConditionalFormattingOptionList): Self = StObject.set(x, "ConditionalFormattingOptions", value.asInstanceOf[js.Any])
    
    inline def setConditionalFormattingOptionsVarargs(value: FilledMapConditionalFormattingOption*): Self = StObject.set(x, "ConditionalFormattingOptions", js.Array(value*))
  }
}
