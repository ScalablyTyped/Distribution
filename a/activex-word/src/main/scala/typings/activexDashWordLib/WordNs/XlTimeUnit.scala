package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlTimeUnit extends js.Object

@JSGlobal("Word.XlTimeUnit")
@js.native
object XlTimeUnit extends js.Object {
  @js.native
  sealed trait xlDays
    extends activexDashWordLib.WordNs.XlTimeUnit
  
  @js.native
  sealed trait xlMonths
    extends activexDashWordLib.WordNs.XlTimeUnit
  
  @js.native
  sealed trait xlYears
    extends activexDashWordLib.WordNs.XlTimeUnit
  
  /* 0 */ val xlDays: xlDays with scala.Double = js.native
  /* 1 */ val xlMonths: xlMonths with scala.Double = js.native
  /* 2 */ val xlYears: xlYears with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.XlTimeUnit with scala.Double] = js.native
}

