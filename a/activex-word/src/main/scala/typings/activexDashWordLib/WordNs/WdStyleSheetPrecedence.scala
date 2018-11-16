package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdStyleSheetPrecedence extends js.Object

@JSGlobal("Word.WdStyleSheetPrecedence")
@js.native
object WdStyleSheetPrecedence extends js.Object {
  @js.native
  sealed trait wdStyleSheetPrecedenceHigher
    extends activexDashWordLib.WordNs.WdStyleSheetPrecedence
  
  @js.native
  sealed trait wdStyleSheetPrecedenceHighest
    extends activexDashWordLib.WordNs.WdStyleSheetPrecedence
  
  @js.native
  sealed trait wdStyleSheetPrecedenceLower
    extends activexDashWordLib.WordNs.WdStyleSheetPrecedence
  
  @js.native
  sealed trait wdStyleSheetPrecedenceLowest
    extends activexDashWordLib.WordNs.WdStyleSheetPrecedence
  
  /* -1 */ val wdStyleSheetPrecedenceHigher: wdStyleSheetPrecedenceHigher with scala.Double = js.native
  /* 1 */ val wdStyleSheetPrecedenceHighest: wdStyleSheetPrecedenceHighest with scala.Double = js.native
  /* -2 */ val wdStyleSheetPrecedenceLower: wdStyleSheetPrecedenceLower with scala.Double = js.native
  /* 0 */ val wdStyleSheetPrecedenceLowest: wdStyleSheetPrecedenceLowest with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdStyleSheetPrecedence with scala.Double] = js.native
}

