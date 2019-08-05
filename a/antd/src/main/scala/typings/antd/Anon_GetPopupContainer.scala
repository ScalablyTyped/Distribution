package typings.antd

import typings.antd.esTableInterfaceMod.TableLocale
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetPopupContainer extends js.Object {
  var getPopupContainer: js.Function1[/* triggerNode */ HTMLElement, HTMLElement]
  var locale: TableLocale
  var prefixCls: String
}

object Anon_GetPopupContainer {
  @scala.inline
  def apply(
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement,
    locale: TableLocale,
    prefixCls: String
  ): Anon_GetPopupContainer = {
    val __obj = js.Dynamic.literal(getPopupContainer = js.Any.fromFunction1(getPopupContainer), locale = locale, prefixCls = prefixCls)
  
    __obj.asInstanceOf[Anon_GetPopupContainer]
  }
}

