package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdSectionStart extends js.Object

@JSGlobal("Word.WdSectionStart")
@js.native
object WdSectionStart extends js.Object {
  @js.native
  sealed trait wdSectionContinuous
    extends activexDashWordLib.WordNs.WdSectionStart
  
  @js.native
  sealed trait wdSectionEvenPage
    extends activexDashWordLib.WordNs.WdSectionStart
  
  @js.native
  sealed trait wdSectionNewColumn
    extends activexDashWordLib.WordNs.WdSectionStart
  
  @js.native
  sealed trait wdSectionNewPage
    extends activexDashWordLib.WordNs.WdSectionStart
  
  @js.native
  sealed trait wdSectionOddPage
    extends activexDashWordLib.WordNs.WdSectionStart
  
  /* 0 */ val wdSectionContinuous: wdSectionContinuous with scala.Double = js.native
  /* 3 */ val wdSectionEvenPage: wdSectionEvenPage with scala.Double = js.native
  /* 1 */ val wdSectionNewColumn: wdSectionNewColumn with scala.Double = js.native
  /* 2 */ val wdSectionNewPage: wdSectionNewPage with scala.Double = js.native
  /* 4 */ val wdSectionOddPage: wdSectionOddPage with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdSectionStart with scala.Double] = js.native
}

