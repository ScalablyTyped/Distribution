package typings.atom.mod

import typings.atom.atomStrings.skip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextEditOptions extends StObject {
  
  /** If true, all line endings will be normalized to match the editor's current mode. */
  var normalizeLineEndings: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If skip, skips the undo stack for this operation.
    * @deprecated Call groupLastChanges() on the TextBuffer afterward instead.
    */
  var undo: js.UndefOr[skip] = js.undefined
}
object TextEditOptions {
  
  @scala.inline
  def apply(): TextEditOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextEditOptions]
  }
  
  @scala.inline
  implicit class TextEditOptionsMutableBuilder[Self <: TextEditOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNormalizeLineEndings(value: Boolean): Self = StObject.set(x, "normalizeLineEndings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizeLineEndingsUndefined: Self = StObject.set(x, "normalizeLineEndings", js.undefined)
    
    @scala.inline
    def setUndo(value: skip): Self = StObject.set(x, "undo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndoUndefined: Self = StObject.set(x, "undo", js.undefined)
  }
}
