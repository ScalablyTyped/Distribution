package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlPieSliceLocation extends js.Object

@JSGlobal("Word.XlPieSliceLocation")
@js.native
object XlPieSliceLocation extends js.Object {
  @js.native
  sealed trait xlHorizontalCoordinate
    extends activexDashWordLib.WordNs.XlPieSliceLocation
  
  @js.native
  sealed trait xlVerticalCoordinate
    extends activexDashWordLib.WordNs.XlPieSliceLocation
  
  /* 1 */ val xlHorizontalCoordinate: xlHorizontalCoordinate with scala.Double = js.native
  /* 2 */ val xlVerticalCoordinate: xlVerticalCoordinate with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.XlPieSliceLocation with scala.Double] = js.native
}

