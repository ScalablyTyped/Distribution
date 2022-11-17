package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiteralPiece extends StObject {
  
  var sourceSpan: ParseSourceSpan
  
  var text: String
}
object LiteralPiece {
  
  inline def apply(sourceSpan: ParseSourceSpan, text: String): LiteralPiece = {
    val __obj = js.Dynamic.literal(sourceSpan = sourceSpan.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiteralPiece]
  }
  
  extension [Self <: LiteralPiece](x: Self) {
    
    inline def setSourceSpan(value: ParseSourceSpan): Self = StObject.set(x, "sourceSpan", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
