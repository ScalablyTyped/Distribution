package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdDefaultTableBehavior extends js.Object

@JSGlobal("Word.WdDefaultTableBehavior")
@js.native
object WdDefaultTableBehavior extends js.Object {
  @js.native
  sealed trait wdWord8TableBehavior
    extends activexDashWordLib.WordNs.WdDefaultTableBehavior
  
  @js.native
  sealed trait wdWord9TableBehavior
    extends activexDashWordLib.WordNs.WdDefaultTableBehavior
  
  /* 0 */ val wdWord8TableBehavior: wdWord8TableBehavior with scala.Double = js.native
  /* 1 */ val wdWord9TableBehavior: wdWord9TableBehavior with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdDefaultTableBehavior with scala.Double] = js.native
}

