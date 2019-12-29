package typings.activexDashPowerpoint.PowerPoint

import typings.activexDashOffice.Office.MsoDiagramNodeType
import typings.activexDashOffice.Office.MsoOrgChartLayoutType
import typings.activexDashOffice.Office.MsoRelativeNodePosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.DiagramNode")
@js.native
class DiagramNode protected () extends js.Object {
  val Application: js.Any = js.native
  val Children: DiagramNodeChildren = js.native
  val Creator: Double = js.native
  val Diagram: typings.activexDashPowerpoint.PowerPoint.Diagram = js.native
  var Layout: MsoOrgChartLayoutType = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.DiagramNode_typekey")
  var PowerPointDotDiagramNode_typekey: DiagramNode = js.native
  val Root: DiagramNode = js.native
  val Shape: typings.activexDashPowerpoint.PowerPoint.Shape = js.native
  val TextShape: typings.activexDashPowerpoint.PowerPoint.Shape = js.native
  /**
    * @param Office.MsoRelativeNodePosition [Pos=2]
    * @param Office.MsoDiagramNodeType [NodeType=1]
    */
  def AddNode(): DiagramNode = js.native
  def AddNode(Pos: MsoRelativeNodePosition): DiagramNode = js.native
  def AddNode(Pos: MsoRelativeNodePosition, NodeType: MsoDiagramNodeType): DiagramNode = js.native
  /** @param Office.MsoRelativeNodePosition [Pos=2] */
  def CloneNode(CopyChildren: Boolean, TargetNode: DiagramNode): DiagramNode = js.native
  def CloneNode(CopyChildren: Boolean, TargetNode: DiagramNode, Pos: MsoRelativeNodePosition): DiagramNode = js.native
  def Delete(): Unit = js.native
  def MoveNode(TargetNode: DiagramNode, Pos: MsoRelativeNodePosition): Unit = js.native
  def NextNode(): DiagramNode = js.native
  def PrevNode(): DiagramNode = js.native
  def ReplaceNode(TargetNode: DiagramNode): Unit = js.native
  /** @param boolean [SwapChildren=true] */
  def SwapNode(TargetNode: DiagramNode): Unit = js.native
  def SwapNode(TargetNode: DiagramNode, SwapChildren: Boolean): Unit = js.native
  def TransferChildren(ReceivingNode: DiagramNode): Unit = js.native
}

