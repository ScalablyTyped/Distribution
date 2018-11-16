package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdMonthNames extends js.Object

@JSGlobal("Word.WdMonthNames")
@js.native
object WdMonthNames extends js.Object {
  @js.native
  sealed trait wdMonthNamesArabic
    extends activexDashWordLib.WordNs.WdMonthNames
  
  @js.native
  sealed trait wdMonthNamesEnglish
    extends activexDashWordLib.WordNs.WdMonthNames
  
  @js.native
  sealed trait wdMonthNamesFrench
    extends activexDashWordLib.WordNs.WdMonthNames
  
  /* 0 */ val wdMonthNamesArabic: wdMonthNamesArabic with scala.Double = js.native
  /* 1 */ val wdMonthNamesEnglish: wdMonthNamesEnglish with scala.Double = js.native
  /* 2 */ val wdMonthNamesFrench: wdMonthNamesFrench with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdMonthNames with scala.Double] = js.native
}

