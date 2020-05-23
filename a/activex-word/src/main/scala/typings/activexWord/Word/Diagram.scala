package typings.activexWord.Word

import typings.activexOffice.Office.MsoDiagramType
import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Diagram extends js.Object {
  val Application: typings.activexWord.Word.Application
  var AutoFormat: MsoTriState
  var AutoLayout: MsoTriState
  val Creator: Double
  val Nodes: DiagramNodes
  val Parent: js.Any
  var Reverse: MsoTriState
  val Type: MsoDiagramType
  @JSName("Word.Diagram_typekey")
  var WordDotDiagram_typekey: Diagram
  def Convert(Type: MsoDiagramType): Unit
  def FitText(): Unit
}

object Diagram {
  @scala.inline
  def apply(
    Application: Application,
    AutoFormat: MsoTriState,
    AutoLayout: MsoTriState,
    Convert: MsoDiagramType => Unit,
    Creator: Double,
    FitText: () => Unit,
    Nodes: DiagramNodes,
    Parent: js.Any,
    Reverse: MsoTriState,
    Type: MsoDiagramType,
    WordDotDiagram_typekey: Diagram
  ): Diagram = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoFormat = AutoFormat.asInstanceOf[js.Any], AutoLayout = AutoLayout.asInstanceOf[js.Any], Convert = js.Any.fromFunction1(Convert), Creator = Creator.asInstanceOf[js.Any], FitText = js.Any.fromFunction0(FitText), Nodes = Nodes.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Reverse = Reverse.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Diagram_typekey")(WordDotDiagram_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diagram]
  }
}

