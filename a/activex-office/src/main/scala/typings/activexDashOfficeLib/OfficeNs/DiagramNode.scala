package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.DiagramNode")
@js.native
class DiagramNode protected () extends js.Object {
  val Application: js.Any = js.native
  @JSName("Children")
  val Children_Original: DiagramNodeChildren = js.native
  val Creator: scala.Double = js.native
  val Diagram: IMsoDiagram = js.native
  var Layout: MsoOrgChartLayoutType = js.native
  var `Office.DiagramNode_typekey`: DiagramNode = js.native
  val Parent: js.Any = js.native
  val Root: DiagramNode = js.native
  val Shape: Shape = js.native
  val TextShape: Shape = js.native
  /**
           * @param Pos [Pos=2]
           * @param NodeType [NodeType=1]
           */
  def AddNode(): DiagramNode = js.native
  /**
           * @param Pos [Pos=2]
           * @param NodeType [NodeType=1]
           */
  def AddNode(Pos: MsoRelativeNodePosition): DiagramNode = js.native
  /**
           * @param Pos [Pos=2]
           * @param NodeType [NodeType=1]
           */
  def AddNode(Pos: MsoRelativeNodePosition, NodeType: MsoDiagramNodeType): DiagramNode = js.native
  def Children(Index: js.Any): DiagramNode = js.native
  /** @param Pos [Pos=2] */
  def CloneNode(CopyChildren: scala.Boolean, TargetNode: DiagramNode): DiagramNode = js.native
  /** @param Pos [Pos=2] */
  def CloneNode(CopyChildren: scala.Boolean, TargetNode: DiagramNode, Pos: MsoRelativeNodePosition): DiagramNode = js.native
  def Delete(): scala.Unit = js.native
  def MoveNode(TargetNode: DiagramNode, Pos: MsoRelativeNodePosition): scala.Unit = js.native
  def NextNode(): DiagramNode = js.native
  def PrevNode(): DiagramNode = js.native
  def ReplaceNode(TargetNode: DiagramNode): scala.Unit = js.native
  /** @param SwapChildren [SwapChildren=true] */
  def SwapNode(TargetNode: DiagramNode): scala.Unit = js.native
  /** @param SwapChildren [SwapChildren=true] */
  def SwapNode(TargetNode: DiagramNode, SwapChildren: scala.Boolean): scala.Unit = js.native
  def TransferChildren(ReceivingNode: DiagramNode): scala.Unit = js.native
}

