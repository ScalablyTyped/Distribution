package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdContinue extends js.Object

@JSGlobal("Word.WdContinue")
@js.native
object WdContinue extends js.Object {
  @js.native
  sealed trait wdContinueDisabled
    extends activexDashWordLib.WordNs.WdContinue
  
  @js.native
  sealed trait wdContinueList
    extends activexDashWordLib.WordNs.WdContinue
  
  @js.native
  sealed trait wdResetList
    extends activexDashWordLib.WordNs.WdContinue
  
  /* 0 */ val wdContinueDisabled: wdContinueDisabled with scala.Double = js.native
  /* 2 */ val wdContinueList: wdContinueList with scala.Double = js.native
  /* 1 */ val wdResetList: wdResetList with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdContinue with scala.Double] = js.native
}

