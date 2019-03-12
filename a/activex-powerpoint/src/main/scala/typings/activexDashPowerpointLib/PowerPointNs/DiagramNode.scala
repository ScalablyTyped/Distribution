package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.DiagramNode")
@js.native
class DiagramNode protected () extends js.Object {
  val Application: js.Any = js.native
  val Children: DiagramNodeChildren = js.native
  val Creator: scala.Double = js.native
  val Diagram: activexDashPowerpointLib.PowerPointNs.Diagram = js.native
  var Layout: activexDashOfficeLib.OfficeNs.MsoOrgChartLayoutType = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.DiagramNode_typekey`: DiagramNode = js.native
  val Root: DiagramNode = js.native
  val Shape: activexDashPowerpointLib.PowerPointNs.Shape = js.native
  val TextShape: Shape = js.native
  /**
    * @param Office.MsoRelativeNodePosition [Pos=2]
    * @param Office.MsoDiagramNodeType [NodeType=1]
    */
  def AddNode(): DiagramNode = js.native
  def AddNode(Pos: activexDashOfficeLib.OfficeNs.MsoRelativeNodePosition): DiagramNode = js.native
  def AddNode(
    Pos: activexDashOfficeLib.OfficeNs.MsoRelativeNodePosition,
    NodeType: activexDashOfficeLib.OfficeNs.MsoDiagramNodeType
  ): DiagramNode = js.native
  /** @param Office.MsoRelativeNodePosition [Pos=2] */
  def CloneNode(CopyChildren: scala.Boolean, TargetNode: DiagramNode): DiagramNode = js.native
  def CloneNode(
    CopyChildren: scala.Boolean,
    TargetNode: DiagramNode,
    Pos: activexDashOfficeLib.OfficeNs.MsoRelativeNodePosition
  ): DiagramNode = js.native
  def Delete(): scala.Unit = js.native
  def MoveNode(TargetNode: DiagramNode, Pos: activexDashOfficeLib.OfficeNs.MsoRelativeNodePosition): scala.Unit = js.native
  def NextNode(): DiagramNode = js.native
  def PrevNode(): DiagramNode = js.native
  def ReplaceNode(TargetNode: DiagramNode): scala.Unit = js.native
  /** @param boolean [SwapChildren=true] */
  def SwapNode(TargetNode: DiagramNode): scala.Unit = js.native
  def SwapNode(TargetNode: DiagramNode, SwapChildren: scala.Boolean): scala.Unit = js.native
  def TransferChildren(ReceivingNode: DiagramNode): scala.Unit = js.native
}

