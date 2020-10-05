package typings.antd.treeTreeMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AntdTreeNodeAttribute extends js.Object {
  var checked: Boolean = js.native
  var children: ReactNode = js.native
  var className: String = js.native
  var disableCheckbox: Boolean = js.native
  var disabled: Boolean = js.native
  var dragOver: Boolean = js.native
  var dragOverGapBottom: Boolean = js.native
  var dragOverGapTop: Boolean = js.native
  var eventKey: String = js.native
  var expanded: Boolean = js.native
  var halfChecked: Boolean = js.native
  var isLeaf: Boolean = js.native
  var pos: String = js.native
  var prefixCls: String = js.native
  var selectable: Boolean = js.native
  var selected: Boolean = js.native
  var title: ReactNode = js.native
}

object AntdTreeNodeAttribute {
  @scala.inline
  def apply(
    checked: Boolean,
    className: String,
    disableCheckbox: Boolean,
    disabled: Boolean,
    dragOver: Boolean,
    dragOverGapBottom: Boolean,
    dragOverGapTop: Boolean,
    eventKey: String,
    expanded: Boolean,
    halfChecked: Boolean,
    isLeaf: Boolean,
    pos: String,
    prefixCls: String,
    selectable: Boolean,
    selected: Boolean
  ): AntdTreeNodeAttribute = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], disableCheckbox = disableCheckbox.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], dragOver = dragOver.asInstanceOf[js.Any], dragOverGapBottom = dragOverGapBottom.asInstanceOf[js.Any], dragOverGapTop = dragOverGapTop.asInstanceOf[js.Any], eventKey = eventKey.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], halfChecked = halfChecked.asInstanceOf[js.Any], isLeaf = isLeaf.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], selectable = selectable.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntdTreeNodeAttribute]
  }
  @scala.inline
  implicit class AntdTreeNodeAttributeOps[Self <: AntdTreeNodeAttribute] (val x: Self) extends AnyVal {
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
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableCheckbox(value: Boolean): Self = this.set("disableCheckbox", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragOver(value: Boolean): Self = this.set("dragOver", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragOverGapBottom(value: Boolean): Self = this.set("dragOverGapBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragOverGapTop(value: Boolean): Self = this.set("dragOverGapTop", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventKey(value: String): Self = this.set("eventKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def setHalfChecked(value: Boolean): Self = this.set("halfChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsLeaf(value: Boolean): Self = this.set("isLeaf", value.asInstanceOf[js.Any])
    @scala.inline
    def setPos(value: String): Self = this.set("pos", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setTitle(value: ReactNode): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

