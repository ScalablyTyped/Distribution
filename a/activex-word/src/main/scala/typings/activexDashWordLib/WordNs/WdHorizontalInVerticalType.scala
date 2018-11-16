package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdHorizontalInVerticalType extends js.Object

@JSGlobal("Word.WdHorizontalInVerticalType")
@js.native
object WdHorizontalInVerticalType extends js.Object {
  @js.native
  sealed trait wdHorizontalInVerticalFitInLine
    extends activexDashWordLib.WordNs.WdHorizontalInVerticalType
  
  @js.native
  sealed trait wdHorizontalInVerticalNone
    extends activexDashWordLib.WordNs.WdHorizontalInVerticalType
  
  @js.native
  sealed trait wdHorizontalInVerticalResizeLine
    extends activexDashWordLib.WordNs.WdHorizontalInVerticalType
  
  /* 1 */ val wdHorizontalInVerticalFitInLine: wdHorizontalInVerticalFitInLine with scala.Double = js.native
  /* 0 */ val wdHorizontalInVerticalNone: wdHorizontalInVerticalNone with scala.Double = js.native
  /* 2 */ val wdHorizontalInVerticalResizeLine: wdHorizontalInVerticalResizeLine with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdHorizontalInVerticalType with scala.Double] = js.native
}

