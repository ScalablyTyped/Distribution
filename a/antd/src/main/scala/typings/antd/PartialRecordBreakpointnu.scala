package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Record<antd.antd/lib/_util/responsiveObserve.Breakpoint, number>> */
trait PartialRecordBreakpointnu extends js.Object {
  var lg: js.UndefOr[Double] = js.undefined
  var md: js.UndefOr[Double] = js.undefined
  var sm: js.UndefOr[Double] = js.undefined
  var xl: js.UndefOr[Double] = js.undefined
  var xs: js.UndefOr[Double] = js.undefined
  var xxl: js.UndefOr[Double] = js.undefined
}

object PartialRecordBreakpointnu {
  @scala.inline
  def apply(
    lg: Int | Double = null,
    md: Int | Double = null,
    sm: Int | Double = null,
    xl: Int | Double = null,
    xs: Int | Double = null,
    xxl: Int | Double = null
  ): PartialRecordBreakpointnu = {
    val __obj = js.Dynamic.literal()
    if (lg != null) __obj.updateDynamic("lg")(lg.asInstanceOf[js.Any])
    if (md != null) __obj.updateDynamic("md")(md.asInstanceOf[js.Any])
    if (sm != null) __obj.updateDynamic("sm")(sm.asInstanceOf[js.Any])
    if (xl != null) __obj.updateDynamic("xl")(xl.asInstanceOf[js.Any])
    if (xs != null) __obj.updateDynamic("xs")(xs.asInstanceOf[js.Any])
    if (xxl != null) __obj.updateDynamic("xxl")(xxl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialRecordBreakpointnu]
  }
}

