package typings.antd

import typings.antd.esTableInterfaceMod.ColumnProps
import typings.antd.esTableInterfaceMod.TableLocale
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Columns[T] extends js.Object {
  var columns: js.Array[ColumnProps[T]]
  var dropdownPrefixCls: String
  var getPopupContainer: js.Function1[/* triggerNode */ HTMLElement, HTMLElement]
  var locale: TableLocale
  var prefixCls: String
}

object Anon_Columns {
  @scala.inline
  def apply[T](
    columns: js.Array[ColumnProps[T]],
    dropdownPrefixCls: String,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement,
    locale: TableLocale,
    prefixCls: String
  ): Anon_Columns[T] = {
    val __obj = js.Dynamic.literal(columns = columns, dropdownPrefixCls = dropdownPrefixCls, getPopupContainer = js.Any.fromFunction1(getPopupContainer), locale = locale, prefixCls = prefixCls)
  
    __obj.asInstanceOf[Anon_Columns[T]]
  }
}

