package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdMultipleWordConversionsMode extends js.Object

@JSGlobal("Word.WdMultipleWordConversionsMode")
@js.native
object WdMultipleWordConversionsMode extends js.Object {
  @js.native
  sealed trait wdHangulToHanja
    extends activexDashWordLib.WordNs.WdMultipleWordConversionsMode
  
  @js.native
  sealed trait wdHanjaToHangul
    extends activexDashWordLib.WordNs.WdMultipleWordConversionsMode
  
  /* 0 */ val wdHangulToHanja: wdHangulToHanja with scala.Double = js.native
  /* 1 */ val wdHanjaToHangul: wdHanjaToHangul with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdMultipleWordConversionsMode with scala.Double] = js.native
}

