package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectionChangedEvent extends StObject {
  
  var newBufferRange: Range = js.native
  
  var newScreenRange: Range = js.native
  
  var oldBufferRange: Range = js.native
  
  var oldScreenRange: Range = js.native
  
  var selection: Selection = js.native
}
object SelectionChangedEvent {
  
  @scala.inline
  def apply(
    newBufferRange: Range,
    newScreenRange: Range,
    oldBufferRange: Range,
    oldScreenRange: Range,
    selection: Selection
  ): SelectionChangedEvent = {
    val __obj = js.Dynamic.literal(newBufferRange = newBufferRange.asInstanceOf[js.Any], newScreenRange = newScreenRange.asInstanceOf[js.Any], oldBufferRange = oldBufferRange.asInstanceOf[js.Any], oldScreenRange = oldScreenRange.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionChangedEvent]
  }
  
  @scala.inline
  implicit class SelectionChangedEventMutableBuilder[Self <: SelectionChangedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewBufferRange(value: Range): Self = StObject.set(x, "newBufferRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewScreenRange(value: Range): Self = StObject.set(x, "newScreenRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldBufferRange(value: Range): Self = StObject.set(x, "oldBufferRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldScreenRange(value: Range): Self = StObject.set(x, "oldScreenRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelection(value: Selection): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
  }
}
