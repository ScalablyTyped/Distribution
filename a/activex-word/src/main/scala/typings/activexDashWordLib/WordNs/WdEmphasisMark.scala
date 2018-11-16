package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdEmphasisMark extends js.Object

@JSGlobal("Word.WdEmphasisMark")
@js.native
object WdEmphasisMark extends js.Object {
  @js.native
  sealed trait wdEmphasisMarkNone
    extends activexDashWordLib.WordNs.WdEmphasisMark
  
  @js.native
  sealed trait wdEmphasisMarkOverComma
    extends activexDashWordLib.WordNs.WdEmphasisMark
  
  @js.native
  sealed trait wdEmphasisMarkOverSolidCircle
    extends activexDashWordLib.WordNs.WdEmphasisMark
  
  @js.native
  sealed trait wdEmphasisMarkOverWhiteCircle
    extends activexDashWordLib.WordNs.WdEmphasisMark
  
  @js.native
  sealed trait wdEmphasisMarkUnderSolidCircle
    extends activexDashWordLib.WordNs.WdEmphasisMark
  
  /* 0 */ val wdEmphasisMarkNone: wdEmphasisMarkNone with scala.Double = js.native
  /* 2 */ val wdEmphasisMarkOverComma: wdEmphasisMarkOverComma with scala.Double = js.native
  /* 1 */ val wdEmphasisMarkOverSolidCircle: wdEmphasisMarkOverSolidCircle with scala.Double = js.native
  /* 3 */ val wdEmphasisMarkOverWhiteCircle: wdEmphasisMarkOverWhiteCircle with scala.Double = js.native
  /* 4 */ val wdEmphasisMarkUnderSolidCircle: wdEmphasisMarkUnderSolidCircle with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdEmphasisMark with scala.Double] = js.native
}

