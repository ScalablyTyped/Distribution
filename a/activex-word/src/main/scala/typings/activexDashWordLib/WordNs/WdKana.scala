package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdKana extends js.Object

@JSGlobal("Word.WdKana")
@js.native
object WdKana extends js.Object {
  @js.native
  sealed trait wdKanaHiragana
    extends activexDashWordLib.WordNs.WdKana
  
  @js.native
  sealed trait wdKanaKatakana
    extends activexDashWordLib.WordNs.WdKana
  
  /* 9 */ val wdKanaHiragana: wdKanaHiragana with scala.Double = js.native
  /* 8 */ val wdKanaKatakana: wdKanaKatakana with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdKana with scala.Double] = js.native
}

