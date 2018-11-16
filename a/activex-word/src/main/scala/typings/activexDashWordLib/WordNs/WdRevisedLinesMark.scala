package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdRevisedLinesMark extends js.Object

@JSGlobal("Word.WdRevisedLinesMark")
@js.native
object WdRevisedLinesMark extends js.Object {
  @js.native
  sealed trait wdRevisedLinesMarkLeftBorder
    extends activexDashWordLib.WordNs.WdRevisedLinesMark
  
  @js.native
  sealed trait wdRevisedLinesMarkNone
    extends activexDashWordLib.WordNs.WdRevisedLinesMark
  
  @js.native
  sealed trait wdRevisedLinesMarkOutsideBorder
    extends activexDashWordLib.WordNs.WdRevisedLinesMark
  
  @js.native
  sealed trait wdRevisedLinesMarkRightBorder
    extends activexDashWordLib.WordNs.WdRevisedLinesMark
  
  /* 1 */ val wdRevisedLinesMarkLeftBorder: wdRevisedLinesMarkLeftBorder with scala.Double = js.native
  /* 0 */ val wdRevisedLinesMarkNone: wdRevisedLinesMarkNone with scala.Double = js.native
  /* 3 */ val wdRevisedLinesMarkOutsideBorder: wdRevisedLinesMarkOutsideBorder with scala.Double = js.native
  /* 2 */ val wdRevisedLinesMarkRightBorder: wdRevisedLinesMarkRightBorder with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdRevisedLinesMark with scala.Double] = js.native
}

