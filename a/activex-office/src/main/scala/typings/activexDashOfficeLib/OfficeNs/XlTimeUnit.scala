package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlTimeUnit extends js.Object

@JSGlobal("Office.XlTimeUnit")
@js.native
object XlTimeUnit extends js.Object {
  @js.native
  sealed trait xlDays
    extends activexDashOfficeLib.OfficeNs.XlTimeUnit
  
  @js.native
  sealed trait xlMonths
    extends activexDashOfficeLib.OfficeNs.XlTimeUnit
  
  @js.native
  sealed trait xlYears
    extends activexDashOfficeLib.OfficeNs.XlTimeUnit
  
  /* 0 */ val xlDays: xlDays with scala.Double = js.native
  /* 1 */ val xlMonths: xlMonths with scala.Double = js.native
  /* 2 */ val xlYears: xlYears with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.XlTimeUnit with scala.Double] = js.native
}

