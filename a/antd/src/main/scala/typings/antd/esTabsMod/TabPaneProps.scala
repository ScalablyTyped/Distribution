package typings.antd.esTabsMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabPaneProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var closable: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var forceRender: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  /** 选项卡头显示文字 */
  var tab: js.UndefOr[ReactNode | String] = js.undefined
}

object TabPaneProps {
  @scala.inline
  def apply(
    className: String = null,
    closable: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    forceRender: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    style: CSSProperties = null,
    tab: ReactNode | String = null
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

