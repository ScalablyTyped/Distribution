package typings.activexDashPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Selection")
@js.native
class Selection protected () extends js.Object {
  val Application: typings.activexDashPowerpoint.PowerPoint.Application = js.native
  val ChildShapeRange: typings.activexDashPowerpoint.PowerPoint.ShapeRange = js.native
  val HasChildShapeRange: Boolean = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.Selection_typekey`: Selection = js.native
  val ShapeRange: typings.activexDashPowerpoint.PowerPoint.ShapeRange = js.native
  val SlideRange: typings.activexDashPowerpoint.PowerPoint.SlideRange = js.native
  val TextRange: typings.activexDashPowerpoint.PowerPoint.TextRange = js.native
  val TextRange2: typings.activexDashOffice.Office.TextRange2 = js.native
  val Type: PpSelectionType = js.native
  def Copy(): Unit = js.native
  def Cut(): Unit = js.native
  def Delete(): Unit = js.native
  def Unselect(): Unit = js.native
}

