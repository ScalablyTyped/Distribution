package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdSeparatorType extends js.Object

@JSGlobal("Word.WdSeparatorType")
@js.native
object WdSeparatorType extends js.Object {
  @js.native
  sealed trait wdSeparatorColon
    extends activexDashWordLib.WordNs.WdSeparatorType
  
  @js.native
  sealed trait wdSeparatorEmDash
    extends activexDashWordLib.WordNs.WdSeparatorType
  
  @js.native
  sealed trait wdSeparatorEnDash
    extends activexDashWordLib.WordNs.WdSeparatorType
  
  @js.native
  sealed trait wdSeparatorHyphen
    extends activexDashWordLib.WordNs.WdSeparatorType
  
  @js.native
  sealed trait wdSeparatorPeriod
    extends activexDashWordLib.WordNs.WdSeparatorType
  
  /* 2 */ val wdSeparatorColon: wdSeparatorColon with scala.Double = js.native
  /* 3 */ val wdSeparatorEmDash: wdSeparatorEmDash with scala.Double = js.native
  /* 4 */ val wdSeparatorEnDash: wdSeparatorEnDash with scala.Double = js.native
  /* 0 */ val wdSeparatorHyphen: wdSeparatorHyphen with scala.Double = js.native
  /* 1 */ val wdSeparatorPeriod: wdSeparatorPeriod with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdSeparatorType with scala.Double] = js.native
}

