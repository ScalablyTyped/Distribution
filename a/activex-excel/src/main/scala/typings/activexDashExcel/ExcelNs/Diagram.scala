package typings.activexDashExcel.ExcelNs

import typings.activexDashOffice.OfficeNs.MsoDiagramType
import typings.activexDashOffice.OfficeNs.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.Diagram")
@js.native
class Diagram protected () extends js.Object {
  val Application: typings.activexDashExcel.ExcelNs.Application = js.native
  var AutoFormat: MsoTriState = js.native
  var AutoLayout: MsoTriState = js.native
  val Creator: XlCreator = js.native
  var `Excel.Diagram_typekey`: Diagram = js.native
  @JSName("Nodes")
  val Nodes_Original: DiagramNodes = js.native
  val Parent: js.Any = js.native
  var Reverse: MsoTriState = js.native
  val Type: MsoDiagramType = js.native
  def Convert(Type: MsoDiagramType): Unit = js.native
  def FitText(): Unit = js.native
  def Nodes(Index: js.Any): DiagramNode = js.native
}

