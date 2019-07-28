package typings.adone.adoneNs.prettyNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableOptions extends js.Object {
  var borderless: js.UndefOr[Boolean] = js.undefined
  var countAnsiEscapeCodes: js.UndefOr[Boolean] = js.undefined
  var model: TableModel
  var noHeader: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[TableStyle] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object TableOptions {
  @scala.inline
  def apply(
    model: TableModel,
    borderless: js.UndefOr[Boolean] = js.undefined,
    countAnsiEscapeCodes: js.UndefOr[Boolean] = js.undefined,
    noHeader: js.UndefOr[Boolean] = js.undefined,
    style: TableStyle = null,
    width: Double | String = null
  ): TableOptions = {
    val __obj = js.Dynamic.literal(model = model)
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless)
    if (!js.isUndefined(countAnsiEscapeCodes)) __obj.updateDynamic("countAnsiEscapeCodes")(countAnsiEscapeCodes)
    if (!js.isUndefined(noHeader)) __obj.updateDynamic("noHeader")(noHeader)
    if (style != null) __obj.updateDynamic("style")(style)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableOptions]
  }
}

