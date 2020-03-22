package typings.antd.expandIconMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultExpandIconProps[RecordType] extends js.Object {
  var expandable: Boolean
  var expanded: Boolean
  var prefixCls: String
  var record: RecordType
  def onExpand(record: RecordType, e: MouseEvent[HTMLElement, NativeMouseEvent]): Unit
}

object DefaultExpandIconProps {
  @scala.inline
  def apply[RecordType](
    expandable: Boolean,
    expanded: Boolean,
    onExpand: (RecordType, MouseEvent[HTMLElement, NativeMouseEvent]) => Unit,
    prefixCls: String,
    record: RecordType
  ): DefaultExpandIconProps[RecordType] = {
    val __obj = js.Dynamic.literal(expandable = expandable.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], onExpand = js.Any.fromFunction2(onExpand), prefixCls = prefixCls.asInstanceOf[js.Any], record = record.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DefaultExpandIconProps[RecordType]]
  }
}

