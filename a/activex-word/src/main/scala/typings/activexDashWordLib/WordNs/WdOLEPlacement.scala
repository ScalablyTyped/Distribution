package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdOLEPlacement extends js.Object

@JSGlobal("Word.WdOLEPlacement")
@js.native
object WdOLEPlacement extends js.Object {
  @js.native
  sealed trait wdFloatOverText
    extends activexDashWordLib.WordNs.WdOLEPlacement
  
  @js.native
  sealed trait wdInLine
    extends activexDashWordLib.WordNs.WdOLEPlacement
  
  /* 1 */ val wdFloatOverText: wdFloatOverText with scala.Double = js.native
  /* 0 */ val wdInLine: wdInLine with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdOLEPlacement with scala.Double] = js.native
}

