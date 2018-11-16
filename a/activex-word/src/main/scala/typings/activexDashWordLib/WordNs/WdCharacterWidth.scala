package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdCharacterWidth extends js.Object

@JSGlobal("Word.WdCharacterWidth")
@js.native
object WdCharacterWidth extends js.Object {
  @js.native
  sealed trait wdWidthFullWidth
    extends activexDashWordLib.WordNs.WdCharacterWidth
  
  @js.native
  sealed trait wdWidthHalfWidth
    extends activexDashWordLib.WordNs.WdCharacterWidth
  
  /* 7 */ val wdWidthFullWidth: wdWidthFullWidth with scala.Double = js.native
  /* 6 */ val wdWidthHalfWidth: wdWidthHalfWidth with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdCharacterWidth with scala.Double] = js.native
}

