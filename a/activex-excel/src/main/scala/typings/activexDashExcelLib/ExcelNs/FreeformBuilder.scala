package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.FreeformBuilder")
@js.native
class FreeformBuilder protected () extends js.Object {
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  val Creator: XlCreator = js.native
  var `Excel.FreeformBuilder_typekey`: FreeformBuilder = js.native
  val Parent: js.Any = js.native
  @JSName("AddNodes")
  def AddNodes_0(
    SegmentType: activexDashOfficeLib.OfficeNs.MsoSegmentType,
    EditingType: activexDashExcelLib.activexDashExcelLibNumbers.`0`,
    X1: scala.Double,
    Y1: scala.Double
  ): scala.Unit = js.native
  @JSName("AddNodes")
  def AddNodes_1(
    SegmentType: activexDashExcelLib.activexDashExcelLibNumbers.`1`,
    EditingType: activexDashExcelLib.activexDashExcelLibNumbers.`1`,
    X1: scala.Double,
    Y1: scala.Double,
    X2: scala.Double,
    Y2: scala.Double,
    X3: scala.Double,
    Y3: scala.Double
  ): scala.Unit = js.native
  def ConvertToShape(): Shape = js.native
}

