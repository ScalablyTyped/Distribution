package typings.antd.esListMod

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
    column: ColumnCount = null,
    gutter: Int | Double = null,
    lg: ColumnCount = null,
    md: ColumnCount = null,
    sm: ColumnCount = null,
    xl: ColumnCount = null,
    xs: ColumnCount = null,
    xxl: ColumnCount = null
  ): ListGridType = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (gutter != null) __obj.updateDynamic("gutter")(gutter.asInstanceOf[js.Any])
    if (lg != null) __obj.updateDynamic("lg")(lg.asInstanceOf[js.Any])
    if (md != null) __obj.updateDynamic("md")(md.asInstanceOf[js.Any])
    if (sm != null) __obj.updateDynamic("sm")(sm.asInstanceOf[js.Any])
    if (xl != null) __obj.updateDynamic("xl")(xl.asInstanceOf[js.Any])
    if (xs != null) __obj.updateDynamic("xs")(xs.asInstanceOf[js.Any])
    if (xxl != null) __obj.updateDynamic("xxl")(xxl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGridType]
  }
}

