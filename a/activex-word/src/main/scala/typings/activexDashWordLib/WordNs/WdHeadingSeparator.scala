package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdHeadingSeparator extends js.Object

@JSGlobal("Word.WdHeadingSeparator")
@js.native
object WdHeadingSeparator extends js.Object {
  @js.native
  sealed trait wdHeadingSeparatorBlankLine
    extends activexDashWordLib.WordNs.WdHeadingSeparator
  
  @js.native
  sealed trait wdHeadingSeparatorLetter
    extends activexDashWordLib.WordNs.WdHeadingSeparator
  
  @js.native
  sealed trait wdHeadingSeparatorLetterFull
    extends activexDashWordLib.WordNs.WdHeadingSeparator
  
  @js.native
  sealed trait wdHeadingSeparatorLetterLow
    extends activexDashWordLib.WordNs.WdHeadingSeparator
  
  @js.native
  sealed trait wdHeadingSeparatorNone
    extends activexDashWordLib.WordNs.WdHeadingSeparator
  
  /* 1 */ val wdHeadingSeparatorBlankLine: wdHeadingSeparatorBlankLine with scala.Double = js.native
  /* 2 */ val wdHeadingSeparatorLetter: wdHeadingSeparatorLetter with scala.Double = js.native
  /* 4 */ val wdHeadingSeparatorLetterFull: wdHeadingSeparatorLetterFull with scala.Double = js.native
  /* 3 */ val wdHeadingSeparatorLetterLow: wdHeadingSeparatorLetterLow with scala.Double = js.native
  /* 0 */ val wdHeadingSeparatorNone: wdHeadingSeparatorNone with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdHeadingSeparator with scala.Double] = js.native
}

