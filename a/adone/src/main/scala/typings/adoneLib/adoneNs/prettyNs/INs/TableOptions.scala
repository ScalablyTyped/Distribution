package typings
package adoneLib.adoneNs.prettyNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableOptions extends js.Object {
  var borderless: js.UndefOr[scala.Boolean] = js.undefined
  var countAnsiEscapeCodes: js.UndefOr[scala.Boolean] = js.undefined
  var model: TableModel
  var noHeader: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[TableStyle] = js.undefined
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object TableOptions {
  @scala.inline
  def apply(
    model: TableModel,
    borderless: js.UndefOr[scala.Boolean] = js.undefined,
    countAnsiEscapeCodes: js.UndefOr[scala.Boolean] = js.undefined,
    noHeader: js.UndefOr[scala.Boolean] = js.undefined,
    style: TableStyle = null,
    width: scala.Double | java.lang.String = null
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

