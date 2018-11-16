package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdHebSpellStart extends js.Object

@JSGlobal("Word.WdHebSpellStart")
@js.native
object WdHebSpellStart extends js.Object {
  @js.native
  sealed trait wdFullScript
    extends activexDashWordLib.WordNs.WdHebSpellStart
  
  @js.native
  sealed trait wdMixedAuthorizedScript
    extends activexDashWordLib.WordNs.WdHebSpellStart
  
  @js.native
  sealed trait wdMixedScript
    extends activexDashWordLib.WordNs.WdHebSpellStart
  
  @js.native
  sealed trait wdPartialScript
    extends activexDashWordLib.WordNs.WdHebSpellStart
  
  /* 0 */ val wdFullScript: wdFullScript with scala.Double = js.native
  /* 3 */ val wdMixedAuthorizedScript: wdMixedAuthorizedScript with scala.Double = js.native
  /* 2 */ val wdMixedScript: wdMixedScript with scala.Double = js.native
  /* 1 */ val wdPartialScript: wdPartialScript with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdHebSpellStart with scala.Double] = js.native
}

