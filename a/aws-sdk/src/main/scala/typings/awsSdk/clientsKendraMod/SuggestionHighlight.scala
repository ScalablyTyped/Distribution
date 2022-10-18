package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuggestionHighlight extends StObject {
  
  /**
    * The zero-based location in the response string where the highlight starts.
    */
  var BeginOffset: js.UndefOr[Integer] = js.undefined
  
  /**
    * The zero-based location in the response string where the highlight ends.
    */
  var EndOffset: js.UndefOr[Integer] = js.undefined
}
object SuggestionHighlight {
  
  inline def apply(): SuggestionHighlight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestionHighlight]
  }
  
  extension [Self <: SuggestionHighlight](x: Self) {
    
    inline def setBeginOffset(value: Integer): Self = StObject.set(x, "BeginOffset", value.asInstanceOf[js.Any])
    
    inline def setBeginOffsetUndefined: Self = StObject.set(x, "BeginOffset", js.undefined)
    
    inline def setEndOffset(value: Integer): Self = StObject.set(x, "EndOffset", value.asInstanceOf[js.Any])
    
    inline def setEndOffsetUndefined: Self = StObject.set(x, "EndOffset", js.undefined)
  }
}
