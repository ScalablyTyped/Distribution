package typings.antd

import typings.antd.libTableInterfaceMod.TableLocale
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetPopupContainerLocale extends js.Object {
  var getPopupContainer: js.Function1[/* triggerNode */ HTMLElement, HTMLElement]
  var locale: TableLocale
  var prefixCls: String
}

object Anon_GetPopupContainerLocale {
  @scala.inline
  def apply(
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement,
    locale: TableLocale,
    prefixCls: String
  ): Anon_GetPopupContainerLocale = {
    val __obj = js.Dynamic.literal(getPopupContainer = js.Any.fromFunction1(getPopupContainer), locale = locale, prefixCls = prefixCls)
  
    __obj.asInstanceOf[Anon_GetPopupContainerLocale]
  }
}

