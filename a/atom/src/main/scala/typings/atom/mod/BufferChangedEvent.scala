package typings.atom.mod

import typings.atom.anon.NewRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferChangedEvent extends StObject {
  
  /**
    *  An array of objects summarizing the aggregated changes that occurred
    *  during the transaction.
    */
  var changes: js.Array[NewRange]
  
  /** Range of the new text. */
  var newRange: Range
  
  /** String containing the text that was inserted. */
  var newText: String
  
  /** Range of the old text. */
  var oldRange: Range
  
  /** String containing the text that was replaced. */
  var oldText: String
}
object BufferChangedEvent {
  
  inline def apply(changes: js.Array[NewRange], newRange: Range, newText: String, oldRange: Range, oldText: String): BufferChangedEvent = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], newRange = newRange.asInstanceOf[js.Any], newText = newText.asInstanceOf[js.Any], oldRange = oldRange.asInstanceOf[js.Any], oldText = oldText.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferChangedEvent]
  }
  
  extension [Self <: BufferChangedEvent](x: Self) {
    
    inline def setChanges(value: js.Array[NewRange]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setChangesVarargs(value: NewRange*): Self = StObject.set(x, "changes", js.Array(value :_*))
    
    inline def setNewRange(value: Range): Self = StObject.set(x, "newRange", value.asInstanceOf[js.Any])
    
    inline def setNewText(value: String): Self = StObject.set(x, "newText", value.asInstanceOf[js.Any])
    
    inline def setOldRange(value: Range): Self = StObject.set(x, "oldRange", value.asInstanceOf[js.Any])
    
    inline def setOldText(value: String): Self = StObject.set(x, "oldText", value.asInstanceOf[js.Any])
  }
}
