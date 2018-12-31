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

