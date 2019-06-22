package typings
package antdLib.esCollapseCollapseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapseProps extends js.Object {
  /** 手风琴效果 */
  var accordion: js.UndefOr[scala.Boolean] = js.undefined
  var activeKey: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  var bordered: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var defaultActiveKey: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var destroyInactivePanel: js.UndefOr[scala.Boolean] = js.undefined
  var expandIcon: js.UndefOr[js.Function1[/* panelProps */ PanelProps, reactLib.reactMod.ReactNode]] = js.undefined
  var expandIconPosition: js.UndefOr[ExpandIconPosition] = js.undefined
  var onChange: js.UndefOr[
    js.Function1[/* key */ java.lang.String | js.Array[java.lang.String], scala.Unit]
  ] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object CollapseProps {
  @scala.inline
  def apply(
    accordion: js.UndefOr[scala.Boolean] = js.undefined,
    activeKey: js.Array[java.lang.String] | java.lang.String = null,
    bordered: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    defaultActiveKey: js.Array[java.lang.String] = null,
    destroyInactivePanel: js.UndefOr[scala.Boolean] = js.undefined,
    expandIcon: /* panelProps */ PanelProps => reactLib.reactMod.ReactNode = null,
    expandIconPosition: ExpandIconPosition = null,
    onChange: /* key */ java.lang.String | js.Array[java.lang.String] => scala.Unit = null,
    prefixCls: java.lang.String = null,
    style: reactLib.reactMod.CSSProperties = null
  ): CollapseProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accordion)) __obj.updateDynamic("accordion")(accordion)
    if (activeKey != null) __obj.updateDynamic("activeKey")(activeKey.asInstanceOf[js.Any])
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered)
    if (className != null) __obj.updateDynamic("className")(className)
    if (defaultActiveKey != null) __obj.updateDynamic("defaultActiveKey")(defaultActiveKey)
    if (!js.isUndefined(destroyInactivePanel)) __obj.updateDynamic("destroyInactivePanel")(destroyInactivePanel)
    if (expandIcon != null) __obj.updateDynamic("expandIcon")(js.Any.fromFunction1(expandIcon))
    if (expandIconPosition != null) __obj.updateDynamic("expandIconPosition")(expandIconPosition)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[CollapseProps]
  }
}

