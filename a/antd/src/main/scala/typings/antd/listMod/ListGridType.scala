package typings.antd.listMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGridType extends js.Object {
  var column: js.UndefOr[ColumnCount] = js.undefined
  var gutter: js.UndefOr[Double] = js.undefined
  var lg: js.UndefOr[ColumnCount] = js.undefined
  var md: js.UndefOr[ColumnCount] = js.undefined
  var sm: js.UndefOr[ColumnCount] = js.undefined
  var xl: js.UndefOr[ColumnCount] = js.undefined
  var xs: js.UndefOr[ColumnCount] = js.undefined
  var xxl: js.UndefOr[ColumnCount] = js.undefined
}

object ListGridType {
  @scala.inline
  def apply(
    column: js.UndefOr[ColumnCount] = js.undefined,
    gutter: js.UndefOr[Double] = js.undefined,
    lg: js.UndefOr[ColumnCount] = js.undefined,
    md: js.UndefOr[ColumnCount] = js.undefined,
    sm: js.UndefOr[ColumnCount] = js.undefined,
    xl: js.UndefOr[ColumnCount] = js.undefined,
    xs: js.UndefOr[ColumnCount] = js.undefined,
    xxl: js.UndefOr[ColumnCount] = js.undefined
  ): ListGridType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(column)) __obj.updateDynamic("column")(column.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gutter)) __obj.updateDynamic("gutter")(gutter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lg)) __obj.updateDynamic("lg")(lg.get.asInstanceOf[js.Any])
    if (!js.isUndefined(md)) __obj.updateDynamic("md")(md.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sm)) __obj.updateDynamic("sm")(sm.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xl)) __obj.updateDynamic("xl")(xl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xs)) __obj.updateDynamic("xs")(xs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xxl)) __obj.updateDynamic("xxl")(xxl.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGridType]
  }
}

