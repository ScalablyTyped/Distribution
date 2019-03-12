package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.DiagramNode")
@js.native
class DiagramNode protected () extends js.Object {
  val Application: activexDashWordLib.WordNs.Application = js.native
  val Children: DiagramNodeChildren = js.native
  val Creator: scala.Double = js.native
  val Diagram: activexDashWordLib.WordNs.Diagram = js.native
  var Layout: activexDashOfficeLib.OfficeNs.MsoOrgChartLayoutType = js.native
  val Parent: js.Any = js.native
  val Root: DiagramNode = js.native
  val Shape: activexDashWordLib.WordNs.Shape = js.native
  val TextShape: Shape = js.native
  var `Word.DiagramNode_typekey`: DiagramNode = js.native
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
  /**
    * @param Word.DiagramNode [TargetNode=0]
    * @param Office.MsoRelativeNodePosition [Pos=2]
    */
  def CloneNode(copyChildren: scala.Boolean): DiagramNode = js.native
  def CloneNode(copyChildren: scala.Boolean, TargetNode: DiagramNode): DiagramNode = js.native
  def CloneNode(
    copyChildren: scala.Boolean,
    TargetNode: DiagramNode,
    Pos: activexDashOfficeLib.OfficeNs.MsoRelativeNodePosition
  ): DiagramNode = js.native
  def Delete(): scala.Unit = js.native
  def MoveNode(TargetNode: DiagramNode, Pos: activexDashOfficeLib.OfficeNs.MsoRelativeNodePosition): scala.Unit = js.native
  def NextNode(): DiagramNode = js.native
  def PrevNode(): DiagramNode = js.native
  def ReplaceNode(TargetNode: DiagramNode): scala.Unit = js.native
  /** @param Office.MsoRelativeNodePosition [Pos=-1] */
  def SwapNode(TargetNode: DiagramNode): scala.Unit = js.native
  def SwapNode(TargetNode: DiagramNode, Pos: activexDashOfficeLib.OfficeNs.MsoRelativeNodePosition): scala.Unit = js.native
  def TransferChildren(ReceivingNode: DiagramNode): scala.Unit = js.native
}

