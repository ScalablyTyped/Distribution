package typings.activexWord.global.Word

import typings.activexOffice.Office.MsoDiagramType
import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Diagram")
@js.native
class Diagram protected ()
  extends typings.activexWord.Word.Diagram {
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  /* CompleteClass */
  override var AutoFormat: MsoTriState = js.native
  /* CompleteClass */
  override var AutoLayout: MsoTriState = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val Nodes: typings.activexWord.Word.DiagramNodes = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var Reverse: MsoTriState = js.native
  /* CompleteClass */
  override val Type: MsoDiagramType = js.native
  /* CompleteClass */
  @JSName("Word.Diagram_typekey")
  override var WordDotDiagram_typekey: typings.activexWord.Word.Diagram = js.native
  /* CompleteClass */
  override def Convert(Type: MsoDiagramType): Unit = js.native
  /* CompleteClass */
  override def FitText(): Unit = js.native
}

