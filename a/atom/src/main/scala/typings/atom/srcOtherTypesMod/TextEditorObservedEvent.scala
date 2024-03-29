package typings.atom.srcOtherTypesMod

import typings.atom.mod.TextEditor
import typings.atom.srcPaneMod.Pane
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextEditorObservedEvent extends StObject {
  
  var index: Double
  
  var pane: Pane
  
  var textEditor: TextEditor
}
object TextEditorObservedEvent {
  
  inline def apply(index: Double, pane: Pane, textEditor: TextEditor): TextEditorObservedEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], pane = pane.asInstanceOf[js.Any], textEditor = textEditor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEditorObservedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextEditorObservedEvent] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setPane(value: Pane): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    inline def setTextEditor(value: TextEditor): Self = StObject.set(x, "textEditor", value.asInstanceOf[js.Any])
  }
}
