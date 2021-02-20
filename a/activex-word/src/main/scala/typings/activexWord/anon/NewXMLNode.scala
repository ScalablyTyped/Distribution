package typings.activexWord.anon

import typings.activexWord.Word.Selection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewXMLNode extends StObject {
  
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
  implicit class NewXMLNodeMutableBuilder[Self <: NewXMLNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewXMLNode(value: typings.activexWord.Word.XMLNode): Self = StObject.set(x, "NewXMLNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldXMLNode(value: typings.activexWord.Word.XMLNode): Self = StObject.set(x, "OldXMLNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: Double): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSel(value: Selection): Self = StObject.set(x, "Sel", value.asInstanceOf[js.Any])
  }
}
