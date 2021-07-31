package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextChange extends StObject {
  
  var newExtent: Point
  
  var newRange: Range
  
  var newText: String
  
  var oldExtent: Point
  
  var oldRange: Range
  
  var oldText: String
  
  var start: Point
}
object TextChange {
  
  @scala.inline
  def apply(
    newExtent: Point,
    newRange: Range,
    newText: String,
    oldExtent: Point,
    oldRange: Range,
    oldText: String,
    start: Point
  ): TextChange = {
    val __obj = js.Dynamic.literal(newExtent = newExtent.asInstanceOf[js.Any], newRange = newRange.asInstanceOf[js.Any], newText = newText.asInstanceOf[js.Any], oldExtent = oldExtent.asInstanceOf[js.Any], oldRange = oldRange.asInstanceOf[js.Any], oldText = oldText.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextChange]
  }
  
  @scala.inline
  implicit class TextChangeMutableBuilder[Self <: TextChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewExtent(value: Point): Self = StObject.set(x, "newExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewRange(value: Range): Self = StObject.set(x, "newRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewText(value: String): Self = StObject.set(x, "newText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldExtent(value: Point): Self = StObject.set(x, "oldExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldRange(value: Range): Self = StObject.set(x, "oldRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldText(value: String): Self = StObject.set(x, "oldText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Point): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
