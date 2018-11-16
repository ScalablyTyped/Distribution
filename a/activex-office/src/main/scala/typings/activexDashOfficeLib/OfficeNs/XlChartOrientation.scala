package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlChartOrientation extends js.Object

@JSGlobal("Office.XlChartOrientation")
@js.native
object XlChartOrientation extends js.Object {
  @js.native
  sealed trait xlDownward
    extends activexDashOfficeLib.OfficeNs.XlChartOrientation
  
  @js.native
  sealed trait xlHorizontal
    extends activexDashOfficeLib.OfficeNs.XlChartOrientation
  
  @js.native
  sealed trait xlUpward
    extends activexDashOfficeLib.OfficeNs.XlChartOrientation
  
  @js.native
  sealed trait xlVertical
    extends activexDashOfficeLib.OfficeNs.XlChartOrientation
  
  /* -4170 */ val xlDownward: xlDownward with scala.Double = js.native
  /* -4128 */ val xlHorizontal: xlHorizontal with scala.Double = js.native
  /* -4171 */ val xlUpward: xlUpward with scala.Double = js.native
  /* -4166 */ val xlVertical: xlVertical with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.XlChartOrientation with scala.Double] = js.native
}

