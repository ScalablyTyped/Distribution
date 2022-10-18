package typings.atom.srcOtherTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextInsertionOptions
  extends StObject
     with TextEditOptions {
  
  /**
    *  If true, decreases indent level appropriately (for example, when a closing
    *  bracket is inserted).
    */
  var autoDecreaseIndent: js.UndefOr[Boolean] = js.undefined
  
  /** If true, indents all inserted text appropriately. */
  var autoIndent: js.UndefOr[Boolean] = js.undefined
  
  /** If true, indent newline appropriately. */
  var autoIndentNewline: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  By default, when pasting multiple lines, Atom attempts to preserve the relative
    *  indent level between the first line and trailing lines, even if the indent
    *  level of the first line has changed from the copied text. If this option is
    *  true, this behavior is suppressed.
    */
  var preserveTrailingLineIndentation: js.UndefOr[Boolean] = js.undefined
  
  /** If true, selects the newly added text. */
  var select: js.UndefOr[Boolean] = js.undefined
}
object TextInsertionOptions {
  
  inline def apply(): TextInsertionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextInsertionOptions]
  }
  
  extension [Self <: TextInsertionOptions](x: Self) {
    
    inline def setAutoDecreaseIndent(value: Boolean): Self = StObject.set(x, "autoDecreaseIndent", value.asInstanceOf[js.Any])
    
    inline def setAutoDecreaseIndentUndefined: Self = StObject.set(x, "autoDecreaseIndent", js.undefined)
    
    inline def setAutoIndent(value: Boolean): Self = StObject.set(x, "autoIndent", value.asInstanceOf[js.Any])
    
    inline def setAutoIndentNewline(value: Boolean): Self = StObject.set(x, "autoIndentNewline", value.asInstanceOf[js.Any])
    
    inline def setAutoIndentNewlineUndefined: Self = StObject.set(x, "autoIndentNewline", js.undefined)
    
    inline def setAutoIndentUndefined: Self = StObject.set(x, "autoIndent", js.undefined)
    
    inline def setPreserveTrailingLineIndentation(value: Boolean): Self = StObject.set(x, "preserveTrailingLineIndentation", value.asInstanceOf[js.Any])
    
    inline def setPreserveTrailingLineIndentationUndefined: Self = StObject.set(x, "preserveTrailingLineIndentation", js.undefined)
    
    inline def setSelect(value: Boolean): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
  }
}
