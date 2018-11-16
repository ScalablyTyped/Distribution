package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdArabicNumeral extends js.Object

@JSGlobal("Word.WdArabicNumeral")
@js.native
object WdArabicNumeral extends js.Object {
  @js.native
  sealed trait wdNumeralArabic
    extends activexDashWordLib.WordNs.WdArabicNumeral
  
  @js.native
  sealed trait wdNumeralContext
    extends activexDashWordLib.WordNs.WdArabicNumeral
  
  @js.native
  sealed trait wdNumeralHindi
    extends activexDashWordLib.WordNs.WdArabicNumeral
  
  @js.native
  sealed trait wdNumeralSystem
    extends activexDashWordLib.WordNs.WdArabicNumeral
  
  /* 0 */ val wdNumeralArabic: wdNumeralArabic with scala.Double = js.native
  /* 2 */ val wdNumeralContext: wdNumeralContext with scala.Double = js.native
  /* 1 */ val wdNumeralHindi: wdNumeralHindi with scala.Double = js.native
  /* 3 */ val wdNumeralSystem: wdNumeralSystem with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdArabicNumeral with scala.Double] = js.native
}

