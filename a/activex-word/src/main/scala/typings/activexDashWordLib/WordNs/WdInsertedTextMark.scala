package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdInsertedTextMark extends js.Object

@JSGlobal("Word.WdInsertedTextMark")
@js.native
object WdInsertedTextMark extends js.Object {
  @js.native
  sealed trait wdInsertedTextMarkBold
    extends activexDashWordLib.WordNs.WdInsertedTextMark
  
  @js.native
  sealed trait wdInsertedTextMarkColorOnly
    extends activexDashWordLib.WordNs.WdInsertedTextMark
  
  @js.native
  sealed trait wdInsertedTextMarkDoubleStrikeThrough
    extends activexDashWordLib.WordNs.WdInsertedTextMark
  
  @js.native
  sealed trait wdInsertedTextMarkDoubleUnderline
    extends activexDashWordLib.WordNs.WdInsertedTextMark
  
  @js.native
  sealed trait wdInsertedTextMarkItalic
    extends activexDashWordLib.WordNs.WdInsertedTextMark
  
  @js.native
  sealed trait wdInsertedTextMarkNone
    extends activexDashWordLib.WordNs.WdInsertedTextMark
  
  @js.native
  sealed trait wdInsertedTextMarkStrikeThrough
    extends activexDashWordLib.WordNs.WdInsertedTextMark
  
  @js.native
  sealed trait wdInsertedTextMarkUnderline
    extends activexDashWordLib.WordNs.WdInsertedTextMark
  
  /* 1 */ val wdInsertedTextMarkBold: wdInsertedTextMarkBold with scala.Double = js.native
  /* 5 */ val wdInsertedTextMarkColorOnly: wdInsertedTextMarkColorOnly with scala.Double = js.native
  /* 7 */ val wdInsertedTextMarkDoubleStrikeThrough: wdInsertedTextMarkDoubleStrikeThrough with scala.Double = js.native
  /* 4 */ val wdInsertedTextMarkDoubleUnderline: wdInsertedTextMarkDoubleUnderline with scala.Double = js.native
  /* 2 */ val wdInsertedTextMarkItalic: wdInsertedTextMarkItalic with scala.Double = js.native
  /* 0 */ val wdInsertedTextMarkNone: wdInsertedTextMarkNone with scala.Double = js.native
  /* 6 */ val wdInsertedTextMarkStrikeThrough: wdInsertedTextMarkStrikeThrough with scala.Double = js.native
  /* 3 */ val wdInsertedTextMarkUnderline: wdInsertedTextMarkUnderline with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdInsertedTextMark with scala.Double] = js.native
}

