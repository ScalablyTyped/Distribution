package typings
package antdLib.libTableInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterMenuProps[T] extends js.Object {
  var column: ColumnProps[T]
  var dropdownPrefixCls: java.lang.String
  var getPopupContainer: js.UndefOr[GetPopupContainer] = js.undefined
  var locale: TableLocale
  var prefixCls: java.lang.String
  var selectedKeys: js.Array[java.lang.String]
  def confirmFilter(column: ColumnProps[T], selectedKeys: js.Array[java.lang.String]): js.Any
}

