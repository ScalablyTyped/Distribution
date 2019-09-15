package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.antd.Anon_Href
import typings.antd.esAnchorAnchorMod.AnchorContainer
import typings.antd.esAnchorAnchorMod.AnchorProps
import typings.antd.esAnchorMod.default
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, className */
object Anchor
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esAnchorMod.default].asInstanceOf[String | js.Object]
  def apply(
    affix: js.UndefOr[Boolean] = js.undefined,
    bounds: Int | Double = null,
    getContainer: () => AnchorContainer = null,
    getCurrentAnchor: () => String = null,
    offsetTop: Int | Double = null,
    onClick: (/* e */ MouseEvent[HTMLElement, NativeMouseEvent], /* link */ Anon_Href) => Unit = null,
    prefixCls: String = null,
    showInkInFixed: js.UndefOr[Boolean] = js.undefined,
    targetOffset: Int | Double = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(affix)) __obj.updateDynamic("affix")(affix)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (getContainer != null) __obj.updateDynamic("getContainer")(js.Any.fromFunction0(getContainer))
    if (getCurrentAnchor != null) __obj.updateDynamic("getCurrentAnchor")(js.Any.fromFunction0(getCurrentAnchor))
    if (offsetTop != null) __obj.updateDynamic("offsetTop")(offsetTop.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (!js.isUndefined(showInkInFixed)) __obj.updateDynamic("showInkInFixed")(showInkInFixed)
    if (targetOffset != null) __obj.updateDynamic("targetOffset")(targetOffset.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = AnchorProps
}

