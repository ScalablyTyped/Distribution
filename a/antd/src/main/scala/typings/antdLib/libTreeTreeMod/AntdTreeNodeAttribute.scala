package typings
package antdLib.libTreeTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntdTreeNodeAttribute extends js.Object {
  var checked: scala.Boolean
  var children: reactLib.reactMod.ReactNs.ReactNode
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
  var title: reactLib.reactMod.ReactNs.ReactNode
}

object AntdTreeNodeAttribute {
  @scala.inline
  def apply(
    checked: scala.Boolean,
    children: reactLib.reactMod.ReactNs.ReactNode,
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
    title: reactLib.reactMod.ReactNs.ReactNode
  ): AntdTreeNodeAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("checked")(checked)
    __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.updateDynamic("className")(className)
    __obj.updateDynamic("disableCheckbox")(disableCheckbox)
    __obj.updateDynamic("disabled")(disabled)
    __obj.updateDynamic("dragOver")(dragOver)
    __obj.updateDynamic("dragOverGapBottom")(dragOverGapBottom)
    __obj.updateDynamic("dragOverGapTop")(dragOverGapTop)
    __obj.updateDynamic("eventKey")(eventKey)
    __obj.updateDynamic("expanded")(expanded)
    __obj.updateDynamic("halfChecked")(halfChecked)
    __obj.updateDynamic("isLeaf")(isLeaf)
    __obj.updateDynamic("pos")(pos)
    __obj.updateDynamic("prefixCls")(prefixCls)
    __obj.updateDynamic("selectable")(selectable)
    __obj.updateDynamic("selected")(selected)
    __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntdTreeNodeAttribute]
  }
}

