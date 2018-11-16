package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlPivotFieldOrientation extends js.Object

@JSGlobal("Excel.XlPivotFieldOrientation")
@js.native
object XlPivotFieldOrientation extends js.Object {
  @js.native
  sealed trait xlColumnField
    extends activexDashExcelLib.ExcelNs.XlPivotFieldOrientation
  
  @js.native
  sealed trait xlDataField
    extends activexDashExcelLib.ExcelNs.XlPivotFieldOrientation
  
  @js.native
  sealed trait xlHidden
    extends activexDashExcelLib.ExcelNs.XlPivotFieldOrientation
  
  @js.native
  sealed trait xlPageField
    extends activexDashExcelLib.ExcelNs.XlPivotFieldOrientation
  
  @js.native
  sealed trait xlRowField
    extends activexDashExcelLib.ExcelNs.XlPivotFieldOrientation
  
  /* 2 */ val xlColumnField: xlColumnField with scala.Double = js.native
  /* 4 */ val xlDataField: xlDataField with scala.Double = js.native
  /* 0 */ val xlHidden: xlHidden with scala.Double = js.native
  /* 3 */ val xlPageField: xlPageField with scala.Double = js.native
  /* 1 */ val xlRowField: xlRowField with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlPivotFieldOrientation with scala.Double] = js.native
}

