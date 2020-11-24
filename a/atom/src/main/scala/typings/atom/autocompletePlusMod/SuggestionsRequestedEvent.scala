package typings.atom.autocompletePlusMod

import typings.atom.mod.Point
import typings.atom.mod.ScopeDescriptor
import typings.atom.mod.TextEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuggestionsRequestedEvent extends js.Object {
  
  /** Whether the autocomplete request was initiated by the user. */
  var activatedManually: Boolean = js.native
  
  /** The position of the cursor. */
  var bufferPosition: Point = js.native
  
  /** The current TextEditor. */
  var editor: TextEditor = js.native
  
  /** The prefix for the word immediately preceding the current cursor position. */
  var prefix: String = js.native
  
  /** The scope descriptor for the current cursor position. */
  var scopeDescriptor: ScopeDescriptor = js.native
}
object SuggestionsRequestedEvent {
  
  @scala.inline
  def apply(
    activatedManually: Boolean,
    bufferPosition: Point,
    editor: TextEditor,
    prefix: String,
    scopeDescriptor: ScopeDescriptor
  ): SuggestionsRequestedEvent = {
    val __obj = js.Dynamic.literal(activatedManually = activatedManually.asInstanceOf[js.Any], bufferPosition = bufferPosition.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestionsRequestedEvent]
  }
  
  @scala.inline
  implicit class SuggestionsRequestedEventOps[Self <: SuggestionsRequestedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActivatedManually(value: Boolean): Self = this.set("activatedManually", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferPosition(value: Point): Self = this.set("bufferPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditor(value: TextEditor): Self = this.set("editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeDescriptor(value: ScopeDescriptor): Self = this.set("scopeDescriptor", value.asInstanceOf[js.Any])
  }
}
