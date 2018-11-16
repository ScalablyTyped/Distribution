package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdSortSeparator extends js.Object

@JSGlobal("Word.WdSortSeparator")
@js.native
object WdSortSeparator extends js.Object {
  @js.native
  sealed trait wdSortSeparateByCommas
    extends activexDashWordLib.WordNs.WdSortSeparator
  
  @js.native
  sealed trait wdSortSeparateByDefaultTableSeparator
    extends activexDashWordLib.WordNs.WdSortSeparator
  
  @js.native
  sealed trait wdSortSeparateByTabs
    extends activexDashWordLib.WordNs.WdSortSeparator
  
  /* 1 */ val wdSortSeparateByCommas: wdSortSeparateByCommas with scala.Double = js.native
  /* 2 */ val wdSortSeparateByDefaultTableSeparator: wdSortSeparateByDefaultTableSeparator with scala.Double = js.native
  /* 0 */ val wdSortSeparateByTabs: wdSortSeparateByTabs with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdSortSeparator with scala.Double] = js.native
}

