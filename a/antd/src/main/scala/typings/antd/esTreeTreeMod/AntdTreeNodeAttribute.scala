package typings.antd.esTreeTreeMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntdTreeNodeAttribute extends js.Object {
  var checked: Boolean
  var children: ReactNode
  var className: String
  var disableCheckbox: Boolean
  var disabled: Boolean
  var dragOver: Boolean
  var dragOverGapBottom: Boolean
  var dragOverGapTop: Boolean
  var eventKey: String
  var expanded: Boolean
  var halfChecked: Boolean
  var isLeaf: Boolean
  var pos: String
  var prefixCls: String
  var selectable: Boolean
  var selected: Boolean
  var title: ReactNode
}

object AntdTreeNodeAttribute {
  @scala.inline
  def apply(
    checked: Boolean,
    children: ReactNode,
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
    selected: Boolean,
    title: ReactNode
  ): AntdTreeNodeAttribute = {
    val __obj = js.Dynamic.literal(checked = checked, children = children.asInstanceOf[js.Any], className = className, disableCheckbox = disableCheckbox, disabled = disabled, dragOver = dragOver, dragOverGapBottom = dragOverGapBottom, dragOverGapTop = dragOverGapTop, eventKey = eventKey, expanded = expanded, halfChecked = halfChecked, isLeaf = isLeaf, pos = pos, prefixCls = prefixCls, selectable = selectable, selected = selected, title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AntdTreeNodeAttribute]
  }
}

