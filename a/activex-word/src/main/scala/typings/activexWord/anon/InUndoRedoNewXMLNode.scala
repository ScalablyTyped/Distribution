package typings.activexWord.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InUndoRedoNewXMLNode extends StObject {
  
  val InUndoRedo: Boolean = js.native
  
  val NewXMLNode: typings.activexWord.Word.XMLNode = js.native
}
object InUndoRedoNewXMLNode {
  
  @scala.inline
  def apply(InUndoRedo: Boolean, NewXMLNode: typings.activexWord.Word.XMLNode): InUndoRedoNewXMLNode = {
    val __obj = js.Dynamic.literal(InUndoRedo = InUndoRedo.asInstanceOf[js.Any], NewXMLNode = NewXMLNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[InUndoRedoNewXMLNode]
  }
  
  @scala.inline
  implicit class InUndoRedoNewXMLNodeMutableBuilder[Self <: InUndoRedoNewXMLNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInUndoRedo(value: Boolean): Self = StObject.set(x, "InUndoRedo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewXMLNode(value: typings.activexWord.Word.XMLNode): Self = StObject.set(x, "NewXMLNode", value.asInstanceOf[js.Any])
  }
}
