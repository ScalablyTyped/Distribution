package typings
package antdLib.libTableInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandIconProps[T] extends js.Object {
  var expandable: scala.Boolean
  var expanded: scala.Boolean
  var needIndentSpaced: scala.Boolean
  var prefixCls: java.lang.String
  var record: T
  def onExpand(record: T, event: reactLib.MouseEvent): scala.Unit
}

object ExpandIconProps {
  @scala.inline
  def apply[T](
    expandable: scala.Boolean,
    expanded: scala.Boolean,
    needIndentSpaced: scala.Boolean,
    onExpand: js.Function2[T, reactLib.MouseEvent, scala.Unit],
    prefixCls: java.lang.String,
    record: T
  ): ExpandIconProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("expandable")(expandable)
    __obj.updateDynamic("expanded")(expanded)
    __obj.updateDynamic("needIndentSpaced")(needIndentSpaced)
    __obj.updateDynamic("onExpand")(onExpand)
    __obj.updateDynamic("prefixCls")(prefixCls)
    __obj.updateDynamic("record")(record.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandIconProps[T]]
  }
}

