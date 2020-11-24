package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextInsertionOptions extends TextEditOptions {
  
  /**
    *  If true, decreases indent level appropriately (for example, when a closing
    *  bracket is inserted).
    */
  var autoDecreaseIndent: js.UndefOr[Boolean] = js.native
  
  /** If true, indents all inserted text appropriately. */
  var autoIndent: js.UndefOr[Boolean] = js.native
  
  /** If true, indent newline appropriately. */
  var autoIndentNewline: js.UndefOr[Boolean] = js.native
  
  /**
    *  By default, when pasting multiple lines, Atom attempts to preserve the relative
    *  indent level between the first line and trailing lines, even if the indent
    *  level of the first line has changed from the copied text. If this option is
    *  true, this behavior is suppressed.
    */
  var preserveTrailingLineIndentation: js.UndefOr[Boolean] = js.native
  
  /** If true, selects the newly added text. */
  var select: js.UndefOr[Boolean] = js.native
}
object TextInsertionOptions {
  
  @scala.inline
  def apply(): TextInsertionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextInsertionOptions]
  }
  
  @scala.inline
  implicit class TextInsertionOptionsOps[Self <: TextInsertionOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoDecreaseIndent(value: Boolean): Self = this.set("autoDecreaseIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoDecreaseIndent: Self = this.set("autoDecreaseIndent", js.undefined)
    
    @scala.inline
    def setAutoIndent(value: Boolean): Self = this.set("autoIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoIndent: Self = this.set("autoIndent", js.undefined)
    
    @scala.inline
    def setAutoIndentNewline(value: Boolean): Self = this.set("autoIndentNewline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoIndentNewline: Self = this.set("autoIndentNewline", js.undefined)
    
    @scala.inline
    def setPreserveTrailingLineIndentation(value: Boolean): Self = this.set("preserveTrailingLineIndentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveTrailingLineIndentation: Self = this.set("preserveTrailingLineIndentation", js.undefined)
    
    @scala.inline
    def setSelect(value: Boolean): Self = this.set("select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
  }
}
