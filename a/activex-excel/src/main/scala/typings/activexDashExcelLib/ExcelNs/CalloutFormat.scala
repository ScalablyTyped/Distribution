package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.CalloutFormat")
@js.native
class CalloutFormat protected () extends js.Object {
  var Accent: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  var Angle: activexDashOfficeLib.OfficeNs.MsoCalloutAngleType = js.native
  val Application: js.Any = js.native
  var AutoAttach: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val AutoLength: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  var Border: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val Creator: scala.Double = js.native
  val Drop: scala.Double = js.native
  val DropType: activexDashOfficeLib.OfficeNs.MsoCalloutDropType = js.native
  var `Excel.CalloutFormat_typekey`: CalloutFormat = js.native
  var Gap: scala.Double = js.native
  val Length: scala.Double = js.native
  val Parent: js.Any = js.native
  var Type: activexDashOfficeLib.OfficeNs.MsoCalloutType = js.native
  def AutomaticLength(): scala.Unit = js.native
  def CustomDrop(Drop: scala.Double): scala.Unit = js.native
  def CustomLength(Length: scala.Double): scala.Unit = js.native
  def PresetDrop(DropType: activexDashOfficeLib.OfficeNs.MsoCalloutDropType): scala.Unit = js.native
}

