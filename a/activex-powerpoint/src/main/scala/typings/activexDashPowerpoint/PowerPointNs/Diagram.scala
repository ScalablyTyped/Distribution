package typings.activexDashPowerpoint.PowerPointNs

import typings.activexDashOffice.OfficeNs.MsoDiagramType
import typings.activexDashOffice.OfficeNs.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Diagram")
@js.native
class Diagram protected () extends js.Object {
  val Application: js.Any = js.native
  var AutoFormat: MsoTriState = js.native
  var AutoLayout: MsoTriState = js.native
  val Creator: Double = js.native
  val Nodes: DiagramNodes = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.Diagram_typekey`: Diagram = js.native
  var Reverse: MsoTriState = js.native
  val Type: MsoDiagramType = js.native
  def Convert(Type: MsoDiagramType): Unit = js.native
  def FitText(): Unit = js.native
}

