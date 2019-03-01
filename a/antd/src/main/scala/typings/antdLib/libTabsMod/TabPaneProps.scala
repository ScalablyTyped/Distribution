package typings
package antdLib.libTabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabPaneProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var closable: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var forceRender: js.UndefOr[scala.Boolean] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /** 选项卡头显示文字 */
  var tab: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode | java.lang.String] = js.undefined
}

object TabPaneProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    closable: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    forceRender: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    tab: reactLib.reactMod.ReactNs.ReactNode | java.lang.String = null
  ): TabPaneProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(forceRender)) __obj.updateDynamic("forceRender")(forceRender)
    if (key != null) __obj.updateDynamic("key")(key)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tab != null) __obj.updateDynamic("tab")(tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabPaneProps]
  }
}

