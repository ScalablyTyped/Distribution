package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoDiagramType
import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Diagram extends js.Object {
  val Application: js.Any
  var AutoFormat: MsoTriState
  var AutoLayout: MsoTriState
  val Creator: Double
  val Nodes: DiagramNodes
  val Parent: js.Any
  @JSName("PowerPoint.Diagram_typekey")
  var PowerPointDotDiagram_typekey: Diagram
  var Reverse: MsoTriState
  val Type: MsoDiagramType
  def Convert(Type: MsoDiagramType): Unit
  def FitText(): Unit
}

object Diagram {
  @scala.inline
  def apply(
    Application: js.Any,
    AutoFormat: MsoTriState,
    AutoLayout: MsoTriState,
    Convert: MsoDiagramType => Unit,
    Creator: Double,
    FitText: () => Unit,
    Nodes: DiagramNodes,
    Parent: js.Any,
    PowerPointDotDiagram_typekey: Diagram,
    Reverse: MsoTriState,
    Type: MsoDiagramType
  ): Diagram = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoFormat = AutoFormat.asInstanceOf[js.Any], AutoLayout = AutoLayout.asInstanceOf[js.Any], Convert = js.Any.fromFunction1(Convert), Creator = Creator.asInstanceOf[js.Any], FitText = js.Any.fromFunction0(FitText), Nodes = Nodes.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Reverse = Reverse.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Diagram_typekey")(PowerPointDotDiagram_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diagram]
  }
}

