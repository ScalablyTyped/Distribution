package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdBreakType extends js.Object

@JSGlobal("Word.WdBreakType")
@js.native
object WdBreakType extends js.Object {
  @js.native
  sealed trait wdColumnBreak
    extends activexDashWordLib.WordNs.WdBreakType
  
  @js.native
  sealed trait wdLineBreak
    extends activexDashWordLib.WordNs.WdBreakType
  
  @js.native
  sealed trait wdLineBreakClearLeft
    extends activexDashWordLib.WordNs.WdBreakType
  
  @js.native
  sealed trait wdLineBreakClearRight
    extends activexDashWordLib.WordNs.WdBreakType
  
  @js.native
  sealed trait wdPageBreak
    extends activexDashWordLib.WordNs.WdBreakType
  
  @js.native
  sealed trait wdSectionBreakContinuous
    extends activexDashWordLib.WordNs.WdBreakType
  
  @js.native
  sealed trait wdSectionBreakEvenPage
    extends activexDashWordLib.WordNs.WdBreakType
  
  @js.native
  sealed trait wdSectionBreakNextPage
    extends activexDashWordLib.WordNs.WdBreakType
  
  @js.native
  sealed trait wdSectionBreakOddPage
    extends activexDashWordLib.WordNs.WdBreakType
  
  @js.native
  sealed trait wdTextWrappingBreak
    extends activexDashWordLib.WordNs.WdBreakType
  
  /* 8 */ val wdColumnBreak: wdColumnBreak with scala.Double = js.native
  /* 6 */ val wdLineBreak: wdLineBreak with scala.Double = js.native
  /* 9 */ val wdLineBreakClearLeft: wdLineBreakClearLeft with scala.Double = js.native
  /* 10 */ val wdLineBreakClearRight: wdLineBreakClearRight with scala.Double = js.native
  /* 7 */ val wdPageBreak: wdPageBreak with scala.Double = js.native
  /* 3 */ val wdSectionBreakContinuous: wdSectionBreakContinuous with scala.Double = js.native
  /* 4 */ val wdSectionBreakEvenPage: wdSectionBreakEvenPage with scala.Double = js.native
  /* 2 */ val wdSectionBreakNextPage: wdSectionBreakNextPage with scala.Double = js.native
  /* 5 */ val wdSectionBreakOddPage: wdSectionBreakOddPage with scala.Double = js.native
  /* 11 */ val wdTextWrappingBreak: wdTextWrappingBreak with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdBreakType with scala.Double] = js.native
}

