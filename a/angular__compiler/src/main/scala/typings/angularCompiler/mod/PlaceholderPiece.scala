package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaceholderPiece extends StObject {
  
  var associatedMessage: js.UndefOr[Message] = js.undefined
  
  var sourceSpan: ParseSourceSpan
  
  var text: String
}
object PlaceholderPiece {
  
  inline def apply(sourceSpan: ParseSourceSpan, text: String): PlaceholderPiece = {
    val __obj = js.Dynamic.literal(sourceSpan = sourceSpan.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceholderPiece]
  }
  
  extension [Self <: PlaceholderPiece](x: Self) {
    
    inline def setAssociatedMessage(value: Message): Self = StObject.set(x, "associatedMessage", value.asInstanceOf[js.Any])
    
    inline def setAssociatedMessageUndefined: Self = StObject.set(x, "associatedMessage", js.undefined)
    
    inline def setSourceSpan(value: ParseSourceSpan): Self = StObject.set(x, "sourceSpan", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
