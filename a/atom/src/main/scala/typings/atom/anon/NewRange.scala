package typings.atom.anon

import typings.atom.mod.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewRange extends StObject {
  
  /** The Range of the inserted text in the current contents of the buffer. */
  var newRange: Range = js.native
  
  /**
    *  The Range of the deleted text in the contents of the buffer as it existed
    *  before the batch of changes reported by this event.
    */
  var oldRange: Range = js.native
}
object NewRange {
  
  @scala.inline
  def apply(newRange: Range, oldRange: Range): NewRange = {
    val __obj = js.Dynamic.literal(newRange = newRange.asInstanceOf[js.Any], oldRange = oldRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewRange]
  }
  
  @scala.inline
  implicit class NewRangeMutableBuilder[Self <: NewRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewRange(value: Range): Self = StObject.set(x, "newRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldRange(value: Range): Self = StObject.set(x, "oldRange", value.asInstanceOf[js.Any])
  }
}
