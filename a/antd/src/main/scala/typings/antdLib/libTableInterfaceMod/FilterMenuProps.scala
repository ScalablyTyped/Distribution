package typings
package antdLib.libTableInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterMenuProps[T] extends js.Object {
  var column: ColumnProps[T] = js.native
  var dropdownPrefixCls: java.lang.String = js.native
  var locale: TableLocale = js.native
  var prefixCls: java.lang.String = js.native
  var selectedKeys: js.Array[java.lang.String] = js.native
  def confirmFilter(column: ColumnProps[T], selectedKeys: js.Array[java.lang.String]): js.Any = js.native
  def getPopupContainer(): reactLib.HTMLElement = js.native
  def getPopupContainer(triggerNode: reactLib.Element): reactLib.HTMLElement = js.native
}

