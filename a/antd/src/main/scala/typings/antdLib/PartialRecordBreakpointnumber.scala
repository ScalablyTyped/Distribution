package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Record<antd.antd/lib/_util/responsiveObserve.Breakpoint, number>> */
trait PartialRecordBreakpointnumber extends js.Object {
  var lg: js.UndefOr[scala.Double] = js.undefined
  var md: js.UndefOr[scala.Double] = js.undefined
  var sm: js.UndefOr[scala.Double] = js.undefined
  var xl: js.UndefOr[scala.Double] = js.undefined
  var xs: js.UndefOr[scala.Double] = js.undefined
  var xxl: js.UndefOr[scala.Double] = js.undefined
}

object PartialRecordBreakpointnumber {
  @scala.inline
  def apply(
    lg: scala.Int | scala.Double = null,
    md: scala.Int | scala.Double = null,
    sm: scala.Int | scala.Double = null,
    xl: scala.Int | scala.Double = null,
    xs: scala.Int | scala.Double = null,
    xxl: scala.Int | scala.Double = null
  ): PartialRecordBreakpointnumber = {
    val __obj = js.Dynamic.literal()
    if (lg != null) __obj.updateDynamic("lg")(lg.asInstanceOf[js.Any])
    if (md != null) __obj.updateDynamic("md")(md.asInstanceOf[js.Any])
    if (sm != null) __obj.updateDynamic("sm")(sm.asInstanceOf[js.Any])
    if (xl != null) __obj.updateDynamic("xl")(xl.asInstanceOf[js.Any])
    if (xs != null) __obj.updateDynamic("xs")(xs.asInstanceOf[js.Any])
    if (xxl != null) __obj.updateDynamic("xxl")(xxl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialRecordBreakpointnumber]
  }
}

