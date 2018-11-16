package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdCalendarTypeBi extends js.Object

@JSGlobal("Word.WdCalendarTypeBi")
@js.native
object WdCalendarTypeBi extends js.Object {
  @js.native
  sealed trait wdCalendarTypeBidi
    extends activexDashWordLib.WordNs.WdCalendarTypeBi
  
  @js.native
  sealed trait wdCalendarTypeGregorian
    extends activexDashWordLib.WordNs.WdCalendarTypeBi
  
  /* 99 */ val wdCalendarTypeBidi: wdCalendarTypeBidi with scala.Double = js.native
  /* 100 */ val wdCalendarTypeGregorian: wdCalendarTypeGregorian with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdCalendarTypeBi with scala.Double] = js.native
}

