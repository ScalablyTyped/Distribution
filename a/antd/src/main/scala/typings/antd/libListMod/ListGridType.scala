package typings.antd.libListMod

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
    if (column != null) __obj.updateDynamic("column")(column)
    if (gutter != null) __obj.updateDynamic("gutter")(gutter.asInstanceOf[js.Any])
    if (lg != null) __obj.updateDynamic("lg")(lg)
    if (md != null) __obj.updateDynamic("md")(md)
    if (sm != null) __obj.updateDynamic("sm")(sm)
    if (xl != null) __obj.updateDynamic("xl")(xl)
    if (xs != null) __obj.updateDynamic("xs")(xs)
    if (xxl != null) __obj.updateDynamic("xxl")(xxl)
    __obj.asInstanceOf[ListGridType]
  }
}

