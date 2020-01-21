package typings.antd.responsiveObserveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Record<antd.antd/lib/_util/responsiveObserve.Breakpoint, string>> */
trait BreakpointMap extends js.Object {
  var lg: js.UndefOr[String] = js.undefined
  var md: js.UndefOr[String] = js.undefined
  var sm: js.UndefOr[String] = js.undefined
  var xl: js.UndefOr[String] = js.undefined
  var xs: js.UndefOr[String] = js.undefined
  var xxl: js.UndefOr[String] = js.undefined
}

object BreakpointMap {
  @scala.inline
  def apply(
    lg: String = null,
    md: String = null,
    sm: String = null,
    xl: String = null,
    xs: String = null,
    xxl: String = null
  ): BreakpointMap = {
    val __obj = js.Dynamic.literal()
    if (lg != null) __obj.updateDynamic("lg")(lg.asInstanceOf[js.Any])
    if (md != null) __obj.updateDynamic("md")(md.asInstanceOf[js.Any])
    if (sm != null) __obj.updateDynamic("sm")(sm.asInstanceOf[js.Any])
    if (xl != null) __obj.updateDynamic("xl")(xl.asInstanceOf[js.Any])
    if (xs != null) __obj.updateDynamic("xs")(xs.asInstanceOf[js.Any])
    if (xxl != null) __obj.updateDynamic("xxl")(xxl.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreakpointMap]
  }
}

