package typings.autolinker.distCommonjsAnchorDashTagDashBuilderMod

import typings.autolinker.distCommonjsAutolinkerMod.TruncateConfigObj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnchorTagBuilderCfg extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var newWindow: js.UndefOr[Boolean] = js.undefined
  var truncate: js.UndefOr[TruncateConfigObj] = js.undefined
}

object AnchorTagBuilderCfg {
  @scala.inline
  def apply(
    className: String = null,
    newWindow: js.UndefOr[Boolean] = js.undefined,
    truncate: TruncateConfigObj = null
  ): AnchorTagBuilderCfg = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(newWindow)) __obj.updateDynamic("newWindow")(newWindow)
    if (truncate != null) __obj.updateDynamic("truncate")(truncate)
    __obj.asInstanceOf[AnchorTagBuilderCfg]
  }
}

