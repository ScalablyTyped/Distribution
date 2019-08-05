package typings.antd

import typings.antd.libTableInterfaceMod.ColumnProps
import typings.antd.libTableInterfaceMod.TableLocale
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnsDropdownPrefixCls[T] extends js.Object {
  var columns: js.Array[ColumnProps[T]]
  var dropdownPrefixCls: String
  var getPopupContainer: js.Function1[/* triggerNode */ HTMLElement, HTMLElement]
  var locale: TableLocale
  var prefixCls: String
}

object Anon_ColumnsDropdownPrefixCls {
  @scala.inline
  def apply[T](
    columns: js.Array[ColumnProps[T]],
    dropdownPrefixCls: String,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement,
    locale: TableLocale,
    prefixCls: String
  ): Anon_ColumnsDropdownPrefixCls[T] = {
    val __obj = js.Dynamic.literal(columns = columns, dropdownPrefixCls = dropdownPrefixCls, getPopupContainer = js.Any.fromFunction1(getPopupContainer), locale = locale, prefixCls = prefixCls)
  
    __obj.asInstanceOf[Anon_ColumnsDropdownPrefixCls[T]]
  }
}

