package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Record<antd.antd/lib/_util/responsiveObserve.Breakpoint, boolean>> */
trait PartialRecordBreakpointbo extends js.Object {
  var lg: js.UndefOr[Boolean] = js.undefined
  var md: js.UndefOr[Boolean] = js.undefined
  var sm: js.UndefOr[Boolean] = js.undefined
  var xl: js.UndefOr[Boolean] = js.undefined
  var xs: js.UndefOr[Boolean] = js.undefined
  var xxl: js.UndefOr[Boolean] = js.undefined
}

object PartialRecordBreakpointbo {
  @scala.inline
  def apply(
    lg: js.UndefOr[Boolean] = js.undefined,
    md: js.UndefOr[Boolean] = js.undefined,
    sm: js.UndefOr[Boolean] = js.undefined,
    xl: js.UndefOr[Boolean] = js.undefined,
    xs: js.UndefOr[Boolean] = js.undefined,
    xxl: js.UndefOr[Boolean] = js.undefined
  ): PartialRecordBreakpointbo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(lg)) __obj.updateDynamic("lg")(lg.asInstanceOf[js.Any])
    if (!js.isUndefined(md)) __obj.updateDynamic("md")(md.asInstanceOf[js.Any])
    if (!js.isUndefined(sm)) __obj.updateDynamic("sm")(sm.asInstanceOf[js.Any])
    if (!js.isUndefined(xl)) __obj.updateDynamic("xl")(xl.asInstanceOf[js.Any])
    if (!js.isUndefined(xs)) __obj.updateDynamic("xs")(xs.asInstanceOf[js.Any])
    if (!js.isUndefined(xxl)) __obj.updateDynamic("xxl")(xxl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialRecordBreakpointbo]
  }
}

