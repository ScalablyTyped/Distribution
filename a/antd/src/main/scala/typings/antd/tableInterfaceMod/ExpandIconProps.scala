package typings.antd.tableInterfaceMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpandIconProps[T] extends js.Object {
  var expandable: Boolean = js.native
  var expanded: Boolean = js.native
  var needIndentSpaced: Boolean = js.native
  var prefixCls: String = js.native
  var record: T = js.native
  def onExpand(record: T): Unit = js.native
  def onExpand(record: T, event: MouseEvent[Element, NativeMouseEvent]): Unit = js.native
}

