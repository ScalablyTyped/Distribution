package typings.activexWord.anon

import typings.activexWord.Word.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewXMLNode extends js.Object {
  
  val NewXMLNode: typings.activexWord.Word.XMLNode = js.native
  
  val OldXMLNode: typings.activexWord.Word.XMLNode = js.native
  
  val Reason: Double = js.native
  
  val Sel: Selection = js.native
}
object NewXMLNode {
  
  @scala.inline
  def apply(
    NewXMLNode: typings.activexWord.Word.XMLNode,
    OldXMLNode: typings.activexWord.Word.XMLNode,
    Reason: Double,
    Sel: Selection
  ): NewXMLNode = {
    val __obj = js.Dynamic.literal(NewXMLNode = NewXMLNode.asInstanceOf[js.Any], OldXMLNode = OldXMLNode.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any], Sel = Sel.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewXMLNode]
  }
  
  @scala.inline
  implicit class NewXMLNodeOps[Self <: NewXMLNode] (val x: Self) extends AnyVal {
    
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
    def setNewXMLNode(value: typings.activexWord.Word.XMLNode): Self = this.set("NewXMLNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldXMLNode(value: typings.activexWord.Word.XMLNode): Self = this.set("OldXMLNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: Double): Self = this.set("Reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSel(value: Selection): Self = this.set("Sel", value.asInstanceOf[js.Any])
  }
}
