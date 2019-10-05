package typings.antd.esConfigDashProviderMod

import typings.antd.esConfigDashProviderRenderEmptyMod.RenderEmptyHandler
import typings.antd.esLocaleDashProviderMod.Locale
import typings.react.reactMod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigProviderProps extends js.Object {
  var autoInsertSpaceInButton: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var csp: js.UndefOr[CSPConfig] = js.undefined
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.undefined
  var locale: js.UndefOr[Locale] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var renderEmpty: js.UndefOr[RenderEmptyHandler] = js.undefined
}

object ConfigProviderProps {
  @scala.inline
  def apply(
    autoInsertSpaceInButton: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    csp: CSPConfig = null,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    locale: Locale = null,
    prefixCls: String = null,
    renderEmpty: /* componentName */ js.UndefOr[String] => ReactNode = null
  ): ConfigProviderProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoInsertSpaceInButton)) __obj.updateDynamic("autoInsertSpaceInButton")(autoInsertSpaceInButton)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (csp != null) __obj.updateDynamic("csp")(csp)
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (renderEmpty != null) __obj.updateDynamic("renderEmpty")(js.Any.fromFunction1(renderEmpty))
    __obj.asInstanceOf[ConfigProviderProps]
  }
}

