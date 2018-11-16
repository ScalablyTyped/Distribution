package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlPieSliceLocation extends js.Object

@JSGlobal("Office.XlPieSliceLocation")
@js.native
object XlPieSliceLocation extends js.Object {
  @js.native
  sealed trait xlHorizontalCoordinate
    extends activexDashOfficeLib.OfficeNs.XlPieSliceLocation
  
  @js.native
  sealed trait xlVerticalCoordinate
    extends activexDashOfficeLib.OfficeNs.XlPieSliceLocation
  
  /* 1 */ val xlHorizontalCoordinate: xlHorizontalCoordinate with scala.Double = js.native
  /* 2 */ val xlVerticalCoordinate: xlVerticalCoordinate with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.XlPieSliceLocation with scala.Double] = js.native
}

