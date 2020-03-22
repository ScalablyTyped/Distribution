package typings.antd.tooltipMod

import typings.antd.placementsMod.AdjustOverflow
import typings.rcTrigger.interfaceMod.BuildInPlacements
import typings.react.mod.CSSProperties
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RcTooltipProps * / any ]:? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RcTooltipProps * / any[P]} */ trait AbstractTooltipProps extends js.Object {
  var arrowPointAtCenter: js.UndefOr[Boolean] = js.undefined
  var autoAdjustOverflow: js.UndefOr[Boolean | AdjustOverflow] = js.undefined
  var builtinPlacements: js.UndefOr[BuildInPlacements] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.undefined
  var openClassName: js.UndefOr[String] = js.undefined
  var placement: js.UndefOr[TooltipPlacement] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object AbstractTooltipProps {
  @scala.inline
  def apply(
    arrowPointAtCenter: js.UndefOr[Boolean] = js.undefined,
    autoAdjustOverflow: Boolean | AdjustOverflow = null,
    builtinPlacements: BuildInPlacements = null,
    className: String = null,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    openClassName: String = null,
    placement: TooltipPlacement = null,
    style: CSSProperties = null
  ): AbstractTooltipProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arrowPointAtCenter)) __obj.updateDynamic("arrowPointAtCenter")(arrowPointAtCenter.asInstanceOf[js.Any])
    if (autoAdjustOverflow != null) __obj.updateDynamic("autoAdjustOverflow")(autoAdjustOverflow.asInstanceOf[js.Any])
    if (builtinPlacements != null) __obj.updateDynamic("builtinPlacements")(builtinPlacements.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (openClassName != null) __obj.updateDynamic("openClassName")(openClassName.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractTooltipProps]
  }
}

