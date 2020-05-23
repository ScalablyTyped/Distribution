package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoDiagramType
import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Diagram")
@js.native
class Diagram protected ()
  extends typings.activexPowerpoint.PowerPoint.Diagram {
  /* CompleteClass */
  override val Application: js.Any = js.native
  /* CompleteClass */
  override var AutoFormat: MsoTriState = js.native
  /* CompleteClass */
  override var AutoLayout: MsoTriState = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val Nodes: typings.activexPowerpoint.PowerPoint.DiagramNodes = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.Diagram_typekey")
  override var PowerPointDotDiagram_typekey: typings.activexPowerpoint.PowerPoint.Diagram = js.native
  /* CompleteClass */
  override var Reverse: MsoTriState = js.native
  /* CompleteClass */
  override val Type: MsoDiagramType = js.native
  /* CompleteClass */
  override def Convert(Type: MsoDiagramType): Unit = js.native
  /* CompleteClass */
  override def FitText(): Unit = js.native
}

