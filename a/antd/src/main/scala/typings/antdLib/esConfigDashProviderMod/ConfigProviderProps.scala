package typings
package antdLib.esConfigDashProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigProviderProps extends js.Object {
  var autoInsertSpaceInButton: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var csp: js.UndefOr[CSPConfig] = js.undefined
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ stdLib.HTMLElement, stdLib.HTMLElement]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var renderEmpty: js.UndefOr[antdLib.esConfigDashProviderRenderEmptyMod.RenderEmptyHandler] = js.undefined
}

object ConfigProviderProps {
  @scala.inline
  def apply(
    autoInsertSpaceInButton: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNode = null,
    csp: CSPConfig = null,
    getPopupContainer: /* triggerNode */ stdLib.HTMLElement => stdLib.HTMLElement = null,
    prefixCls: java.lang.String = null,
    renderEmpty: antdLib.esConfigDashProviderRenderEmptyMod.RenderEmptyHandler = null
  ): ConfigProviderProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoInsertSpaceInButton)) __obj.updateDynamic("autoInsertSpaceInButton")(autoInsertSpaceInButton)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (csp != null) __obj.updateDynamic("csp")(csp)
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (renderEmpty != null) __obj.updateDynamic("renderEmpty")(renderEmpty)
    __obj.asInstanceOf[ConfigProviderProps]
  }
}

