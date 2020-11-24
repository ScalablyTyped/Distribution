package typings.angularCompiler.anon

import typings.angularCompiler.outputAstMod.LiteralPiece
import typings.angularCompiler.outputAstMod.PlaceholderPiece
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageParts extends js.Object {
  
  var messageParts: js.Array[LiteralPiece] = js.native
  
  var placeHolders: js.Array[PlaceholderPiece] = js.native
}
object MessageParts {
  
  @scala.inline
  def apply(messageParts: js.Array[LiteralPiece], placeHolders: js.Array[PlaceholderPiece]): MessageParts = {
    val __obj = js.Dynamic.literal(messageParts = messageParts.asInstanceOf[js.Any], placeHolders = placeHolders.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageParts]
  }
  
  @scala.inline
  implicit class MessagePartsOps[Self <: MessageParts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMessagePartsVarargs(value: LiteralPiece*): Self = this.set("messageParts", js.Array(value :_*))
    
    @scala.inline
    def setMessageParts(value: js.Array[LiteralPiece]): Self = this.set("messageParts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceHoldersVarargs(value: PlaceholderPiece*): Self = this.set("placeHolders", js.Array(value :_*))
    
    @scala.inline
    def setPlaceHolders(value: js.Array[PlaceholderPiece]): Self = this.set("placeHolders", value.asInstanceOf[js.Any])
  }
}
