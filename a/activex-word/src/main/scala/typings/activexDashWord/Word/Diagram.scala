package typings.activexDashWord.Word

import typings.activexDashOffice.Office.MsoDiagramType
import typings.activexDashOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Diagram")
@js.native
class Diagram protected () extends js.Object {
  val Application: typings.activexDashWord.Word.Application = js.native
  var AutoFormat: MsoTriState = js.native
  var AutoLayout: MsoTriState = js.native
  val Creator: Double = js.native
  val Nodes: DiagramNodes = js.native
  val Parent: js.Any = js.native
  var Reverse: MsoTriState = js.native
  val Type: MsoDiagramType = js.native
  @JSName("Word.Diagram_typekey")
  var WordDotDiagram_typekey: Diagram = js.native
  def Convert(Type: MsoDiagramType): Unit = js.native
  def FitText(): Unit = js.native
}

