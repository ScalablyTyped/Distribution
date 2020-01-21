package typings.antDesignPro.ellipsisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped antd.antd/lib/tooltip.TooltipPropsWithTitle | antd.antd/lib/tooltip.TooltipPropsWithOverlay */ trait EllipsisTooltipProps extends js.Object {
  var overlayStyle: js.UndefOr[scala.Nothing] = js.undefined
  var title: js.UndefOr[scala.Nothing] = js.undefined
}

object EllipsisTooltipProps {
  @scala.inline
  def apply(
    overlayStyle: js.UndefOr[scala.Nothing] = js.undefined,
    title: js.UndefOr[scala.Nothing] = js.undefined
  ): EllipsisTooltipProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(overlayStyle)) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(title)) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[EllipsisTooltipProps]
  }
}

