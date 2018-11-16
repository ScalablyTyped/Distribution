package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlPieSliceLocation extends js.Object

@JSGlobal("PowerPoint.XlPieSliceLocation")
@js.native
object XlPieSliceLocation extends js.Object {
  @js.native
  sealed trait xlHorizontalCoordinate
    extends activexDashPowerpointLib.PowerPointNs.XlPieSliceLocation
  
  @js.native
  sealed trait xlVerticalCoordinate
    extends activexDashPowerpointLib.PowerPointNs.XlPieSliceLocation
  
  /* 1 */ val xlHorizontalCoordinate: xlHorizontalCoordinate with scala.Double = js.native
  /* 2 */ val xlVerticalCoordinate: xlVerticalCoordinate with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.XlPieSliceLocation with scala.Double] = js.native
}

