package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdSpanishSpeller extends js.Object

@JSGlobal("Word.WdSpanishSpeller")
@js.native
object WdSpanishSpeller extends js.Object {
  @js.native
  sealed trait wdSpanishTuteoAndVoseo
    extends activexDashWordLib.WordNs.WdSpanishSpeller
  
  @js.native
  sealed trait wdSpanishTuteoOnly
    extends activexDashWordLib.WordNs.WdSpanishSpeller
  
  @js.native
  sealed trait wdSpanishVoseoOnly
    extends activexDashWordLib.WordNs.WdSpanishSpeller
  
  /* 1 */ val wdSpanishTuteoAndVoseo: wdSpanishTuteoAndVoseo with scala.Double = js.native
  /* 0 */ val wdSpanishTuteoOnly: wdSpanishTuteoOnly with scala.Double = js.native
  /* 2 */ val wdSpanishVoseoOnly: wdSpanishVoseoOnly with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdSpanishSpeller with scala.Double] = js.native
}

