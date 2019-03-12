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

object FilterMenuProps {
  @scala.inline
  def apply[T](
    column: ColumnProps[T],
    confirmFilter: (ColumnProps[T], js.Array[java.lang.String]) => js.Any,
    dropdownPrefixCls: java.lang.String,
    locale: TableLocale,
    prefixCls: java.lang.String,
    selectedKeys: js.Array[java.lang.String],
    getPopupContainer: GetPopupContainer = null
  ): FilterMenuProps[T] = {
    val __obj = js.Dynamic.literal(column = column, confirmFilter = js.Any.fromFunction2(confirmFilter), dropdownPrefixCls = dropdownPrefixCls, locale = locale, prefixCls = prefixCls, selectedKeys = selectedKeys)
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(getPopupContainer)
    __obj.asInstanceOf[FilterMenuProps[T]]
  }
}

