package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdFindWrap extends js.Object

@JSGlobal("Word.WdFindWrap")
@js.native
object WdFindWrap extends js.Object {
  @js.native
  sealed trait wdFindAsk
    extends activexDashWordLib.WordNs.WdFindWrap
  
  @js.native
  sealed trait wdFindContinue
    extends activexDashWordLib.WordNs.WdFindWrap
  
  @js.native
  sealed trait wdFindStop
    extends activexDashWordLib.WordNs.WdFindWrap
  
  /* 2 */ val wdFindAsk: wdFindAsk with scala.Double = js.native
  /* 1 */ val wdFindContinue: wdFindContinue with scala.Double = js.native
  /* 0 */ val wdFindStop: wdFindStop with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdFindWrap with scala.Double] = js.native
}

