package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdTableFieldSeparator extends js.Object

@JSGlobal("Word.WdTableFieldSeparator")
@js.native
object WdTableFieldSeparator extends js.Object {
  @js.native
  sealed trait wdSeparateByCommas
    extends activexDashWordLib.WordNs.WdTableFieldSeparator
  
  @js.native
  sealed trait wdSeparateByDefaultListSeparator
    extends activexDashWordLib.WordNs.WdTableFieldSeparator
  
  @js.native
  sealed trait wdSeparateByParagraphs
    extends activexDashWordLib.WordNs.WdTableFieldSeparator
  
  @js.native
  sealed trait wdSeparateByTabs
    extends activexDashWordLib.WordNs.WdTableFieldSeparator
  
  /* 2 */ val wdSeparateByCommas: wdSeparateByCommas with scala.Double = js.native
  /* 3 */ val wdSeparateByDefaultListSeparator: wdSeparateByDefaultListSeparator with scala.Double = js.native
  /* 0 */ val wdSeparateByParagraphs: wdSeparateByParagraphs with scala.Double = js.native
  /* 1 */ val wdSeparateByTabs: wdSeparateByTabs with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdTableFieldSeparator with scala.Double] = js.native
}

