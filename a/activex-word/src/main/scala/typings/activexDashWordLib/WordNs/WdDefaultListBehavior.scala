package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdDefaultListBehavior extends js.Object

@JSGlobal("Word.WdDefaultListBehavior")
@js.native
object WdDefaultListBehavior extends js.Object {
  @js.native
  sealed trait wdWord10ListBehavior
    extends activexDashWordLib.WordNs.WdDefaultListBehavior
  
  @js.native
  sealed trait wdWord8ListBehavior
    extends activexDashWordLib.WordNs.WdDefaultListBehavior
  
  @js.native
  sealed trait wdWord9ListBehavior
    extends activexDashWordLib.WordNs.WdDefaultListBehavior
  
  /* 2 */ val wdWord10ListBehavior: wdWord10ListBehavior with scala.Double = js.native
  /* 0 */ val wdWord8ListBehavior: wdWord8ListBehavior with scala.Double = js.native
  /* 1 */ val wdWord9ListBehavior: wdWord9ListBehavior with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdDefaultListBehavior with scala.Double] = js.native
}

