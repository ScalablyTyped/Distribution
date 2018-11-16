package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlCheckInVersionType extends js.Object

@JSGlobal("Excel.XlCheckInVersionType")
@js.native
object XlCheckInVersionType extends js.Object {
  @js.native
  sealed trait xlCheckInMajorVersion
    extends activexDashExcelLib.ExcelNs.XlCheckInVersionType
  
  @js.native
  sealed trait xlCheckInMinorVersion
    extends activexDashExcelLib.ExcelNs.XlCheckInVersionType
  
  @js.native
  sealed trait xlCheckInOverwriteVersion
    extends activexDashExcelLib.ExcelNs.XlCheckInVersionType
  
  /* 1 */ val xlCheckInMajorVersion: xlCheckInMajorVersion with scala.Double = js.native
  /* 0 */ val xlCheckInMinorVersion: xlCheckInMinorVersion with scala.Double = js.native
  /* 2 */ val xlCheckInOverwriteVersion: xlCheckInOverwriteVersion with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlCheckInVersionType with scala.Double] = js.native
}

