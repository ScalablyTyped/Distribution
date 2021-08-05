package typings.activexWord.anon

import typings.activexWord.Word.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletedRange extends StObject {
  
  val DeletedRange: Range
  
  val InUndoRedo: Boolean
  
  val OldXMLNode: typings.activexWord.Word.XMLNode
}
object DeletedRange {
  
  inline def apply(DeletedRange: Range, InUndoRedo: Boolean, OldXMLNode: typings.activexWord.Word.XMLNode): DeletedRange = {
    val __obj = js.Dynamic.literal(DeletedRange = DeletedRange.asInstanceOf[js.Any], InUndoRedo = InUndoRedo.asInstanceOf[js.Any], OldXMLNode = OldXMLNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletedRange]
  }
  
  extension [Self <: DeletedRange](x: Self) {
    
    inline def setDeletedRange(value: Range): Self = StObject.set(x, "DeletedRange", value.asInstanceOf[js.Any])
    
    inline def setInUndoRedo(value: Boolean): Self = StObject.set(x, "InUndoRedo", value.asInstanceOf[js.Any])
    
    inline def setOldXMLNode(value: typings.activexWord.Word.XMLNode): Self = StObject.set(x, "OldXMLNode", value.asInstanceOf[js.Any])
  }
}
