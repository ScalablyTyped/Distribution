package typings.antd.esTableInterfaceMod

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandIconProps[T] extends js.Object {
  var expandable: Boolean
  var expanded: Boolean
  var needIndentSpaced: Boolean
  var prefixCls: String
  var record: T
  def onExpand(record: T, event: MouseEvent): Unit
}

object ExpandIconProps {
  @scala.inline
  def apply[T](
    expandable: Boolean,
    expanded: Boolean,
    needIndentSpaced: Boolean,
    onExpand: (T, MouseEvent) => Unit,
    prefixCls: String,
    record: T
  ): ExpandIconProps[T] = {
    val __obj = js.Dynamic.literal(expandable = expandable, expanded = expanded, needIndentSpaced = needIndentSpaced, onExpand = js.Any.fromFunction2(onExpand), prefixCls = prefixCls, record = record.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExpandIconProps[T]]
  }
}

