package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Diagram")
@js.native
class Diagram protected () extends js.Object {
  val Application: js.Any = js.native
  var AutoFormat: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  var AutoLayout: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val Creator: scala.Double = js.native
  val Nodes: DiagramNodes = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.Diagram_typekey`: Diagram = js.native
  var Reverse: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val Type: activexDashOfficeLib.OfficeNs.MsoDiagramType = js.native
  def Convert(Type: activexDashOfficeLib.OfficeNs.MsoDiagramType): scala.Unit = js.native
  def FitText(): scala.Unit = js.native
}

