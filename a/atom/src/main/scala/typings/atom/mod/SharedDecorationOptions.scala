package typings.atom.mod

import typings.atom.atomStrings.after
import typings.atom.atomStrings.before
import typings.atom.atomStrings.head
import typings.atom.atomStrings.tail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedDecorationOptions extends js.Object {
  
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
  implicit class SharedDecorationOptionsOps[Self <: SharedDecorationOptions] (val x: Self) extends AnyVal {
    
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
    def setAvoidOverflow(value: Boolean): Self = this.set("avoidOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvoidOverflow: Self = this.set("avoidOverflow", js.undefined)
    
    @scala.inline
    def setClass(value: String): Self = this.set("class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
    
    @scala.inline
    def setItem(value: js.Object): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    
    @scala.inline
    def setOmitEmptyLastRow(value: Boolean): Self = this.set("omitEmptyLastRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOmitEmptyLastRow: Self = this.set("omitEmptyLastRow", js.undefined)
    
    @scala.inline
    def setOnlyEmpty(value: Boolean): Self = this.set("onlyEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyEmpty: Self = this.set("onlyEmpty", js.undefined)
    
    @scala.inline
    def setOnlyHead(value: Boolean): Self = this.set("onlyHead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyHead: Self = this.set("onlyHead", js.undefined)
    
    @scala.inline
    def setOnlyNonEmpty(value: Boolean): Self = this.set("onlyNonEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyNonEmpty: Self = this.set("onlyNonEmpty", js.undefined)
    
    @scala.inline
    def setOrder(value: Double): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setPosition(value: head | tail | before | after): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
