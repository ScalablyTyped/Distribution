package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlToolbarProtection extends js.Object

@JSGlobal("Excel.XlToolbarProtection")
@js.native
object XlToolbarProtection extends js.Object {
  @js.native
  sealed trait xlNoButtonChanges
    extends activexDashExcelLib.ExcelNs.XlToolbarProtection
  
  @js.native
  sealed trait xlNoChanges
    extends activexDashExcelLib.ExcelNs.XlToolbarProtection
  
  @js.native
  sealed trait xlNoDockingChanges
    extends activexDashExcelLib.ExcelNs.XlToolbarProtection
  
  @js.native
  sealed trait xlNoShapeChanges
    extends activexDashExcelLib.ExcelNs.XlToolbarProtection
  
  @js.native
  sealed trait xlToolbarProtectionNone
    extends activexDashExcelLib.ExcelNs.XlToolbarProtection
  
  /* 1 */ val xlNoButtonChanges: xlNoButtonChanges with scala.Double = js.native
  /* 4 */ val xlNoChanges: xlNoChanges with scala.Double = js.native
  /* 3 */ val xlNoDockingChanges: xlNoDockingChanges with scala.Double = js.native
  /* 2 */ val xlNoShapeChanges: xlNoShapeChanges with scala.Double = js.native
  /* -4143 */ val xlToolbarProtectionNone: xlToolbarProtectionNone with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlToolbarProtection with scala.Double] = js.native
}

