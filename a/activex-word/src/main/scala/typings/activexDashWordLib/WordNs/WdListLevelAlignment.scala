package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdListLevelAlignment extends js.Object

@JSGlobal("Word.WdListLevelAlignment")
@js.native
object WdListLevelAlignment extends js.Object {
  @js.native
  sealed trait wdListLevelAlignCenter
    extends activexDashWordLib.WordNs.WdListLevelAlignment
  
  @js.native
  sealed trait wdListLevelAlignLeft
    extends activexDashWordLib.WordNs.WdListLevelAlignment
  
  @js.native
  sealed trait wdListLevelAlignRight
    extends activexDashWordLib.WordNs.WdListLevelAlignment
  
  /* 1 */ val wdListLevelAlignCenter: wdListLevelAlignCenter with scala.Double = js.native
  /* 0 */ val wdListLevelAlignLeft: wdListLevelAlignLeft with scala.Double = js.native
  /* 2 */ val wdListLevelAlignRight: wdListLevelAlignRight with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdListLevelAlignment with scala.Double] = js.native
}

