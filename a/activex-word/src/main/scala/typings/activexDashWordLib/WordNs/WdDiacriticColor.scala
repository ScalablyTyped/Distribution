package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdDiacriticColor extends js.Object

@JSGlobal("Word.WdDiacriticColor")
@js.native
object WdDiacriticColor extends js.Object {
  @js.native
  sealed trait wdDiacriticColorBidi
    extends activexDashWordLib.WordNs.WdDiacriticColor
  
  @js.native
  sealed trait wdDiacriticColorLatin
    extends activexDashWordLib.WordNs.WdDiacriticColor
  
  /* 0 */ val wdDiacriticColorBidi: wdDiacriticColorBidi with scala.Double = js.native
  /* 1 */ val wdDiacriticColorLatin: wdDiacriticColorLatin with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdDiacriticColor with scala.Double] = js.native
}

