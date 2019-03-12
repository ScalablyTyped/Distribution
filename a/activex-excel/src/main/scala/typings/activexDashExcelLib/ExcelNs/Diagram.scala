package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Diagram")
@js.native
class Diagram protected () extends js.Object {
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  var AutoFormat: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  var AutoLayout: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val Creator: XlCreator = js.native
  var `Excel.Diagram_typekey`: Diagram = js.native
  @JSName("Nodes")
  val Nodes_Original: DiagramNodes = js.native
  val Parent: js.Any = js.native
  var Reverse: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  val Type: activexDashOfficeLib.OfficeNs.MsoDiagramType = js.native
  def Convert(Type: activexDashOfficeLib.OfficeNs.MsoDiagramType): scala.Unit = js.native
  def FitText(): scala.Unit = js.native
  def Nodes(Index: js.Any): DiagramNode = js.native
}

