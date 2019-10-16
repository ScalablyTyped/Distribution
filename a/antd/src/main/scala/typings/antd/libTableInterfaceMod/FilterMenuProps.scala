package typings.antd.libTableInterfaceMod

import typings.react.reactMod.Key
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterMenuProps[T] extends js.Object {
  var column: ColumnProps[T]
  var dropdownPrefixCls: String
  var getPopupContainer: js.UndefOr[GetPopupContainer] = js.undefined
  var locale: TableLocale
  var prefixCls: String
  var selectedKeys: js.Array[String]
  def confirmFilter(column: ColumnProps[T], selectedKeys: js.Array[Key]): js.Any
}

object FilterMenuProps {
  @scala.inline
  def apply[T](
    column: ColumnProps[T],
    confirmFilter: (ColumnProps[T], js.Array[Key]) => js.Any,
    dropdownPrefixCls: String,
    locale: TableLocale,
    prefixCls: String,
    selectedKeys: js.Array[String],
    getPopupContainer: /* triggerNode */ js.UndefOr[HTMLElement] => HTMLElement = null
  ): FilterMenuProps[T] = {
    val __obj = js.Dynamic.literal(column = column, confirmFilter = js.Any.fromFunction2(confirmFilter), dropdownPrefixCls = dropdownPrefixCls, locale = locale, prefixCls = prefixCls, selectedKeys = selectedKeys)
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    __obj.asInstanceOf[FilterMenuProps[T]]
  }
}

