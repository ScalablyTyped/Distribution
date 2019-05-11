package typings
package antdLib.esTableInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandIconProps[T] extends js.Object {
  var expandable: scala.Boolean
  var expanded: scala.Boolean
  var needIndentSpaced: scala.Boolean
  var prefixCls: java.lang.String
  var record: T
  def onExpand(record: T, event: stdLib.MouseEvent): scala.Unit
}

object ExpandIconProps {
  @scala.inline
  def apply[T](
    expandable: scala.Boolean,
    expanded: scala.Boolean,
    needIndentSpaced: scala.Boolean,
    onExpand: (T, stdLib.MouseEvent) => scala.Unit,
    prefixCls: java.lang.String,
    record: T
  ): ExpandIconProps[T] = {
    val __obj = js.Dynamic.literal(expandable = expandable, expanded = expanded, needIndentSpaced = needIndentSpaced, onExpand = js.Any.fromFunction2(onExpand), prefixCls = prefixCls, record = record.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExpandIconProps[T]]
  }
}

