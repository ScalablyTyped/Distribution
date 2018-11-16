package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdGutterStyleOld extends js.Object

@JSGlobal("Word.WdGutterStyleOld")
@js.native
object WdGutterStyleOld extends js.Object {
  @js.native
  sealed trait wdGutterStyleBidi
    extends activexDashWordLib.WordNs.WdGutterStyleOld
  
  @js.native
  sealed trait wdGutterStyleLatin
    extends activexDashWordLib.WordNs.WdGutterStyleOld
  
  /* 2 */ val wdGutterStyleBidi: wdGutterStyleBidi with scala.Double = js.native
  /* -10 */ val wdGutterStyleLatin: wdGutterStyleLatin with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdGutterStyleOld with scala.Double] = js.native
}

