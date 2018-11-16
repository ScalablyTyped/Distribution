package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.CalloutFormat")
@js.native
class CalloutFormat protected () extends js.Object {
  var Accent: MsoTriState = js.native
  var Angle: MsoCalloutAngleType = js.native
  val Application: js.Any = js.native
  var AutoAttach: MsoTriState = js.native
  val AutoLength: MsoTriState = js.native
  var Border: MsoTriState = js.native
  val Creator: scala.Double = js.native
  val Drop: scala.Double = js.native
  val DropType: MsoCalloutDropType = js.native
  var Gap: scala.Double = js.native
  val Length: scala.Double = js.native
  var `Office.CalloutFormat_typekey`: CalloutFormat = js.native
  val Parent: js.Any = js.native
  var Type: MsoCalloutType = js.native
  def AutomaticLength(): scala.Unit = js.native
  def CustomDrop(Drop: scala.Double): scala.Unit = js.native
  def CustomLength(Length: scala.Double): scala.Unit = js.native
  def PresetDrop(DropType: MsoCalloutDropType): scala.Unit = js.native
}

