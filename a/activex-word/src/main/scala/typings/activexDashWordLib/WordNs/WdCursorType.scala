package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdCursorType extends js.Object

@JSGlobal("Word.WdCursorType")
@js.native
object WdCursorType extends js.Object {
  @js.native
  sealed trait wdCursorIBeam
    extends activexDashWordLib.WordNs.WdCursorType
  
  @js.native
  sealed trait wdCursorNormal
    extends activexDashWordLib.WordNs.WdCursorType
  
  @js.native
  sealed trait wdCursorNorthwestArrow
    extends activexDashWordLib.WordNs.WdCursorType
  
  @js.native
  sealed trait wdCursorWait
    extends activexDashWordLib.WordNs.WdCursorType
  
  /* 1 */ val wdCursorIBeam: wdCursorIBeam with scala.Double = js.native
  /* 2 */ val wdCursorNormal: wdCursorNormal with scala.Double = js.native
  /* 3 */ val wdCursorNorthwestArrow: wdCursorNorthwestArrow with scala.Double = js.native
  /* 0 */ val wdCursorWait: wdCursorWait with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdCursorType with scala.Double] = js.native
}

