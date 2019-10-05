package typings.activexDashOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.DiagramNode")
@js.native
class DiagramNode protected () extends js.Object {
  val Application: js.Any = js.native
  @JSName("Children")
  val Children_Original: DiagramNodeChildren = js.native
  val Creator: Double = js.native
  val Diagram: IMsoDiagram = js.native
  var Layout: MsoOrgChartLayoutType = js.native
  var `Office.DiagramNode_typekey`: DiagramNode = js.native
  val Parent: js.Any = js.native
  val Root: DiagramNode = js.native
  val Shape: typings.activexDashOffice.Office.Shape = js.native
  val TextShape: typings.activexDashOffice.Office.Shape = js.native
  /**
    * @param Pos [Pos=2]
    * @param NodeType [NodeType=1]
    */
  def AddNode(): DiagramNode = js.native
  def AddNode(Pos: MsoRelativeNodePosition): DiagramNode = js.native
  def AddNode(Pos: MsoRelativeNodePosition, NodeType: MsoDiagramNodeType): DiagramNode = js.native
  def Children(Index: js.Any): DiagramNode = js.native
  /** @param Pos [Pos=2] */
  def CloneNode(CopyChildren: Boolean, TargetNode: DiagramNode): DiagramNode = js.native
  def CloneNode(CopyChildren: Boolean, TargetNode: DiagramNode, Pos: MsoRelativeNodePosition): DiagramNode = js.native
  def Delete(): Unit = js.native
  def MoveNode(TargetNode: DiagramNode, Pos: MsoRelativeNodePosition): Unit = js.native
  def NextNode(): DiagramNode = js.native
  def PrevNode(): DiagramNode = js.native
  def ReplaceNode(TargetNode: DiagramNode): Unit = js.native
  /** @param SwapChildren [SwapChildren=true] */
  def SwapNode(TargetNode: DiagramNode): Unit = js.native
  def SwapNode(TargetNode: DiagramNode, SwapChildren: Boolean): Unit = js.native
  def TransferChildren(ReceivingNode: DiagramNode): Unit = js.native
}

