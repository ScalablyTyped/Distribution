package typings
package antdLib.libGridRowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Record<antd.antd/lib/grid/row.Breakpoint, string>> */
trait BreakpointMap extends js.Object {
  var lg: js.UndefOr[java.lang.String] = js.undefined
  var md: js.UndefOr[java.lang.String] = js.undefined
  var sm: js.UndefOr[java.lang.String] = js.undefined
  var xl: js.UndefOr[java.lang.String] = js.undefined
  var xs: js.UndefOr[java.lang.String] = js.undefined
  var xxl: js.UndefOr[java.lang.String] = js.undefined
}

object BreakpointMap {
  @scala.inline
  def apply(
    lg: java.lang.String = null,
    md: java.lang.String = null,
    sm: java.lang.String = null,
    xl: java.lang.String = null,
    xs: java.lang.String = null,
    xxl: java.lang.String = null
  ): BreakpointMap = {
    val __obj = js.Dynamic.literal()
    if (lg != null) __obj.updateDynamic("lg")(lg)
    if (md != null) __obj.updateDynamic("md")(md)
    if (sm != null) __obj.updateDynamic("sm")(sm)
    if (xl != null) __obj.updateDynamic("xl")(xl)
    if (xs != null) __obj.updateDynamic("xs")(xs)
    if (xxl != null) __obj.updateDynamic("xxl")(xxl)
    __obj.asInstanceOf[BreakpointMap]
  }
}

