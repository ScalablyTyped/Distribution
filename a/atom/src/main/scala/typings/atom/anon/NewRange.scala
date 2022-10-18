package typings.atom.anon

import typings.atom.dependenciesTextBufferSrcTextBufferMod.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewRange extends StObject {
  
  /** The Range of the inserted text in the current contents of the buffer. */
  var newRange: Range
  
  /**
    *  The Range of the deleted text in the contents of the buffer as it existed
    *  before the batch of changes reported by this event.
    */
  var oldRange: Range
}
object NewRange {
  
  inline def apply(newRange: Range, oldRange: Range): NewRange = {
    val __obj = js.Dynamic.literal(newRange = newRange.asInstanceOf[js.Any], oldRange = oldRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewRange]
  }
  
  extension [Self <: NewRange](x: Self) {
    
    inline def setNewRange(value: Range): Self = StObject.set(x, "newRange", value.asInstanceOf[js.Any])
    
    inline def setOldRange(value: Range): Self = StObject.set(x, "oldRange", value.asInstanceOf[js.Any])
  }
}
