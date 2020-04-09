package typings.antd.popoverMod

import typings.antd.getRenderPropValueMod.RenderFunction
import typings.antd.placementsMod.AdjustOverflow
import typings.antd.tooltipMod.AbstractTooltipProps
import typings.antd.tooltipMod.TooltipPlacement
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverProps extends AbstractTooltipProps {
  var content: js.UndefOr[ReactNode | RenderFunction] = js.undefined
  var title: js.UndefOr[ReactNode | RenderFunction] = js.undefined
}

object PopoverProps {
  @scala.inline
  def apply(
    arrowPointAtCenter: js.UndefOr[Boolean] = js.undefined,
    autoAdjustOverflow: Boolean | AdjustOverflow = null,
    builtinPlacements: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BuildInPlacements */ js.Any = null,
    className: String = null,
    content: ReactNode | RenderFunction = null,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    openClassName: String = null,
    placement: TooltipPlacement = null,
    style: CSSProperties = null,
    title: ReactNode | RenderFunction = null
  ): PopoverProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arrowPointAtCenter)) __obj.updateDynamic("arrowPointAtCenter")(arrowPointAtCenter.asInstanceOf[js.Any])
    if (autoAdjustOverflow != null) __obj.updateDynamic("autoAdjustOverflow")(autoAdjustOverflow.asInstanceOf[js.Any])
    if (builtinPlacements != null) __obj.updateDynamic("builtinPlacements")(builtinPlacements.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (openClassName != null) __obj.updateDynamic("openClassName")(openClassName.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverProps]
  }
}

