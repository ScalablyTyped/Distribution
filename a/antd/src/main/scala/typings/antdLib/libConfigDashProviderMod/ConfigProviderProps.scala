package typings
package antdLib.libConfigDashProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigProviderProps extends js.Object {
  var autoInsertSpaceInButton: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var csp: js.UndefOr[CSPConfig] = js.undefined
  var getPopupContainer: js.UndefOr[
    js.Function1[/* triggerNode */ js.UndefOr[reactLib.HTMLElement], reactLib.HTMLElement]
  ] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var renderEmpty: js.UndefOr[antdLib.libConfigDashProviderRenderEmptyMod.RenderEmptyHandler] = js.undefined
}

object ConfigProviderProps {
  @scala.inline
  def apply(
    autoInsertSpaceInButton: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    csp: CSPConfig = null,
    getPopupContainer: js.Function1[/* triggerNode */ js.UndefOr[reactLib.HTMLElement], reactLib.HTMLElement] = null,
    prefixCls: java.lang.String = null,
    renderEmpty: antdLib.libConfigDashProviderRenderEmptyMod.RenderEmptyHandler = null
  ): ConfigProviderProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoInsertSpaceInButton)) __obj.updateDynamic("autoInsertSpaceInButton")(autoInsertSpaceInButton)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (csp != null) __obj.updateDynamic("csp")(csp)
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(getPopupContainer)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (renderEmpty != null) __obj.updateDynamic("renderEmpty")(renderEmpty)
    __obj.asInstanceOf[ConfigProviderProps]
  }
}

