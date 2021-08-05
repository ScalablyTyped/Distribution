package typings.activexWord.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InUndoRedoNewXMLNode extends StObject {
  
  val InUndoRedo: Boolean
  
  val NewXMLNode: typings.activexWord.Word.XMLNode
}
object InUndoRedoNewXMLNode {
  
  inline def apply(InUndoRedo: Boolean, NewXMLNode: typings.activexWord.Word.XMLNode): InUndoRedoNewXMLNode = {
    val __obj = js.Dynamic.literal(InUndoRedo = InUndoRedo.asInstanceOf[js.Any], NewXMLNode = NewXMLNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[InUndoRedoNewXMLNode]
  }
  
  extension [Self <: InUndoRedoNewXMLNode](x: Self) {
    
    inline def setInUndoRedo(value: Boolean): Self = StObject.set(x, "InUndoRedo", value.asInstanceOf[js.Any])
    
    inline def setNewXMLNode(value: typings.activexWord.Word.XMLNode): Self = StObject.set(x, "NewXMLNode", value.asInstanceOf[js.Any])
  }
}
