package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlMeasurementUnits extends js.Object

@JSGlobal("Excel.XlMeasurementUnits")
@js.native
object XlMeasurementUnits extends js.Object {
  @js.native
  sealed trait xlCentimeters
    extends activexDashExcelLib.ExcelNs.XlMeasurementUnits
  
  @js.native
  sealed trait xlInches
    extends activexDashExcelLib.ExcelNs.XlMeasurementUnits
  
  @js.native
  sealed trait xlMillimeters
    extends activexDashExcelLib.ExcelNs.XlMeasurementUnits
  
  /* 1 */ val xlCentimeters: xlCentimeters with scala.Double = js.native
  /* 0 */ val xlInches: xlInches with scala.Double = js.native
  /* 2 */ val xlMillimeters: xlMillimeters with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlMeasurementUnits with scala.Double] = js.native
}

