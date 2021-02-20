package typings.atom.mod

import typings.atom.atomStrings.after
import typings.atom.atomStrings.before
import typings.atom.atomStrings.head
import typings.atom.atomStrings.tail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedDecorationOptions extends StObject {
  
  /**
    *  Only applicable to decorations of type overlay. Determines whether the decoration
    *  adjusts its horizontal or vertical position to remain fully visible when it would
    *  otherwise overflow the editor. Defaults to true.
    */
  var avoidOverflow: js.UndefOr[Boolean] = js.native
  
  /**
    *  This CSS class will be applied to the decorated line number, line, highlight,
    *  or overlay.
    */
  var `class`: js.UndefOr[String] = js.native
  
  /**
    *  An HTMLElement or a model Object with a corresponding view registered. Only
    *  applicable to the gutter, overlay and block types.
    */
  var item: js.UndefOr[js.Object] = js.native
  
  /**
    *  If false, the decoration will be applied to the last row of a non-empty
    *  range, even if it ends at column 0. Defaults to true. Only applicable
    *  to the gutter, line, and line-number decoration types.
    */
  var omitEmptyLastRow: js.UndefOr[Boolean] = js.native
  
  /**
    *  If true, the decoration will only be applied if the associated DisplayMarker
    *  is empty. Only applicable to the gutter, line, and line-number types.
    */
  var onlyEmpty: js.UndefOr[Boolean] = js.native
  
  /**
    *  If true, the decoration will only be applied to the head of the DisplayMarker.
    *  Only applicable to the line and line-number types.
    */
  var onlyHead: js.UndefOr[Boolean] = js.native
  
  /**
    *  If true, the decoration will only be applied if the associated DisplayMarker
    *  is non-empty. Only applicable to the gutter, line, and line-number types.
    */
  var onlyNonEmpty: js.UndefOr[Boolean] = js.native
  
  /**
    *  Only applicable to decorations of type block. Controls where the view is
    *  positioned relative to other block decorations at the same screen row.
    *  If unspecified, block decorations render oldest to newest.
    */
  var order: js.UndefOr[Double] = js.native
  
  /**
    *  Only applicable to decorations of type overlay and block. Controls where the
    *  view is positioned relative to the TextEditorMarker. Values can be
    *  'head' (the default) or 'tail' for overlay decorations, and 'before' (the default)
    *  or 'after' for block decorations.
    */
  var position: js.UndefOr[head | tail | before | after] = js.native
  
  /**
    *  An Object containing CSS style properties to apply to the relevant DOM
    *  node. Currently this only works with a type of cursor or text.
    */
  var style: js.UndefOr[js.Object] = js.native
}
object SharedDecorationOptions {
  
  @scala.inline
  def apply(): SharedDecorationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedDecorationOptions]
  }
  
  @scala.inline
  implicit class SharedDecorationOptionsMutableBuilder[Self <: SharedDecorationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvoidOverflow(value: Boolean): Self = StObject.set(x, "avoidOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvoidOverflowUndefined: Self = StObject.set(x, "avoidOverflow", js.undefined)
    
    @scala.inline
    def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    @scala.inline
    def setItem(value: js.Object): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setOmitEmptyLastRow(value: Boolean): Self = StObject.set(x, "omitEmptyLastRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOmitEmptyLastRowUndefined: Self = StObject.set(x, "omitEmptyLastRow", js.undefined)
    
    @scala.inline
    def setOnlyEmpty(value: Boolean): Self = StObject.set(x, "onlyEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyEmptyUndefined: Self = StObject.set(x, "onlyEmpty", js.undefined)
    
    @scala.inline
    def setOnlyHead(value: Boolean): Self = StObject.set(x, "onlyHead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyHeadUndefined: Self = StObject.set(x, "onlyHead", js.undefined)
    
    @scala.inline
    def setOnlyNonEmpty(value: Boolean): Self = StObject.set(x, "onlyNonEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyNonEmptyUndefined: Self = StObject.set(x, "onlyNonEmpty", js.undefined)
    
    @scala.inline
    def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setPosition(value: head | tail | before | after): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
