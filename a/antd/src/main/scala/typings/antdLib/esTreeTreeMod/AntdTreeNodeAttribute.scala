package typings
package antdLib.esTreeTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntdTreeNodeAttribute extends js.Object {
  var checked: scala.Boolean
  var children: reactLib.reactMod.ReactNode
  var className: java.lang.String
  var disableCheckbox: scala.Boolean
  var disabled: scala.Boolean
  var dragOver: scala.Boolean
  var dragOverGapBottom: scala.Boolean
  var dragOverGapTop: scala.Boolean
  var eventKey: java.lang.String
  var expanded: scala.Boolean
  var halfChecked: scala.Boolean
  var isLeaf: scala.Boolean
  var pos: java.lang.String
  var prefixCls: java.lang.String
  var selectable: scala.Boolean
  var selected: scala.Boolean
  var title: reactLib.reactMod.ReactNode
}

object AntdTreeNodeAttribute {
  @scala.inline
  def apply(
    checked: scala.Boolean,
    children: reactLib.reactMod.ReactNode,
    className: java.lang.String,
    disableCheckbox: scala.Boolean,
    disabled: scala.Boolean,
    dragOver: scala.Boolean,
    dragOverGapBottom: scala.Boolean,
    dragOverGapTop: scala.Boolean,
    eventKey: java.lang.String,
    expanded: scala.Boolean,
    halfChecked: scala.Boolean,
    isLeaf: scala.Boolean,
    pos: java.lang.String,
    prefixCls: java.lang.String,
    selectable: scala.Boolean,
    selected: scala.Boolean,
    title: reactLib.reactMod.ReactNode
  ): AntdTreeNodeAttribute = {
    val __obj = js.Dynamic.literal(checked = checked, children = children.asInstanceOf[js.Any], className = className, disableCheckbox = disableCheckbox, disabled = disabled, dragOver = dragOver, dragOverGapBottom = dragOverGapBottom, dragOverGapTop = dragOverGapTop, eventKey = eventKey, expanded = expanded, halfChecked = halfChecked, isLeaf = isLeaf, pos = pos, prefixCls = prefixCls, selectable = selectable, selected = selected, title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AntdTreeNodeAttribute]
  }
}

