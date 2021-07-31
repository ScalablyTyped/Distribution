package typings.angularCompiler.anon

import typings.angularCompiler.outputAstMod.LiteralPiece
import typings.angularCompiler.outputAstMod.PlaceholderPiece
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageParts extends StObject {
  
  var messageParts: js.Array[LiteralPiece]
  
  var placeHolders: js.Array[PlaceholderPiece]
}
object MessageParts {
  
  @scala.inline
  def apply(messageParts: js.Array[LiteralPiece], placeHolders: js.Array[PlaceholderPiece]): MessageParts = {
    val __obj = js.Dynamic.literal(messageParts = messageParts.asInstanceOf[js.Any], placeHolders = placeHolders.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageParts]
  }
  
  @scala.inline
  implicit class MessagePartsMutableBuilder[Self <: MessageParts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageParts(value: js.Array[LiteralPiece]): Self = StObject.set(x, "messageParts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagePartsVarargs(value: LiteralPiece*): Self = StObject.set(x, "messageParts", js.Array(value :_*))
    
    @scala.inline
    def setPlaceHolders(value: js.Array[PlaceholderPiece]): Self = StObject.set(x, "placeHolders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceHoldersVarargs(value: PlaceholderPiece*): Self = StObject.set(x, "placeHolders", js.Array(value :_*))
  }
}
