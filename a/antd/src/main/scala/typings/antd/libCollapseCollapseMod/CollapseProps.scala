package typings.antd.libCollapseCollapseMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapseProps extends js.Object {
  /** 手风琴效果 */
  var accordion: js.UndefOr[Boolean] = js.undefined
  var activeKey: js.UndefOr[(js.Array[String | Double]) | String | Double] = js.undefined
  var bordered: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var defaultActiveKey: js.UndefOr[(js.Array[String | Double]) | String | Double] = js.undefined
  var destroyInactivePanel: js.UndefOr[Boolean] = js.undefined
  var expandIcon: js.UndefOr[js.Function1[/* panelProps */ PanelProps, ReactNode]] = js.undefined
  var expandIconPosition: js.UndefOr[ExpandIconPosition] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* key */ String | js.Array[String], Unit]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object CollapseProps {
  @scala.inline
  def apply(
    accordion: js.UndefOr[Boolean] = js.undefined,
    activeKey: (js.Array[String | Double]) | String | Double = null,
    bordered: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    defaultActiveKey: (js.Array[String | Double]) | String | Double = null,
    destroyInactivePanel: js.UndefOr[Boolean] = js.undefined,
    expandIcon: /* panelProps */ PanelProps => ReactNode = null,
    expandIconPosition: ExpandIconPosition = null,
    onChange: /* key */ String | js.Array[String] => Unit = null,
    prefixCls: String = null,
    style: CSSProperties = null
  ): CollapseProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accordion)) __obj.updateDynamic("accordion")(accordion.asInstanceOf[js.Any])
    if (activeKey != null) __obj.updateDynamic("activeKey")(activeKey.asInstanceOf[js.Any])
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultActiveKey != null) __obj.updateDynamic("defaultActiveKey")(defaultActiveKey.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyInactivePanel)) __obj.updateDynamic("destroyInactivePanel")(destroyInactivePanel.asInstanceOf[js.Any])
    if (expandIcon != null) __obj.updateDynamic("expandIcon")(js.Any.fromFunction1(expandIcon))
    if (expandIconPosition != null) __obj.updateDynamic("expandIconPosition")(expandIconPosition.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollapseProps]
  }
}

