package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.antd.esConfigDashProviderMod.CSPConfig
import typings.antd.esConfigDashProviderMod.ConfigProviderProps
import typings.antd.esLocaleDashProviderMod.Locale
import typings.react.reactMod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ConfigProvider
  extends ExternalComponentWithAttributesWithRefType[tag.type, typings.antd.esMod.ConfigProvider] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esMod.ConfigProvider].asInstanceOf[String | js.Object]
  def apply(
    autoInsertSpaceInButton: js.UndefOr[Boolean] = js.undefined,
    csp: CSPConfig = null,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    locale: Locale = null,
    prefixCls: String = null,
    renderEmpty: /* componentName */ js.UndefOr[String] => ReactNode = null
  ): BuildingComponent[tag.type, typings.antd.esMod.ConfigProvider] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoInsertSpaceInButton)) __obj.updateDynamic("autoInsertSpaceInButton")(autoInsertSpaceInButton)
    if (csp != null) __obj.updateDynamic("csp")(csp)
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (renderEmpty != null) __obj.updateDynamic("renderEmpty")(js.Any.fromFunction1(renderEmpty))
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ConfigProviderProps
}

