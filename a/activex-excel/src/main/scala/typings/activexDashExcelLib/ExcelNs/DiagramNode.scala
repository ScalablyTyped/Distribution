package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.DiagramNode")
@js.native
class DiagramNode protected () extends js.Object {
  val Application: js.Any = js.native
  @JSName("Children")
  val Children_Original: DiagramNodeChildren = js.native
  val Creator: scala.Double = js.native
  val Diagram: activexDashOfficeLib.OfficeNs.IMsoDiagram = js.native
  var `Excel.DiagramNode_typekey`: DiagramNode = js.native
  var Layout: activexDashOfficeLib.OfficeNs.MsoOrgChartLayoutType = js.native
  val Parent: js.Any = js.native
  val Root: DiagramNode = js.native
  val Shape: activexDashExcelLib.ExcelNs.Shape = js.native
  val TextShape: Shape = js.native
  /**
    * @param pos [pos=2]
    * @param nodeType [nodeType=1]
    */
  def AddNode(): DiagramNode = js.native
  def AddNode(pos: activexDashOfficeLib.OfficeNs.MsoRelativeNodePosition): DiagramNode = js.native
  def AddNode(
    pos: activexDashOfficeLib.OfficeNs.MsoRelativeNodePosition,
    nodeType: activexDashOfficeLib.OfficeNs.MsoDiagramNodeType
  ): DiagramNode = js.native
  def Children(Index: js.Any): DiagramNode = js.native
  /** @param pos [pos=2] */
  def CloneNode(copyChildren: scala.Boolean, pTargetNode: DiagramNode): DiagramNode = js.native
  def CloneNode(
    copyChildren: scala.Boolean,
    pTargetNode: DiagramNode,
    pos: activexDashOfficeLib.OfficeNs.MsoRelativeNodePosition
  ): DiagramNode = js.native
  def Delete(): scala.Unit = js.native
  def MoveNode(pTargetNode: DiagramNode, pos: activexDashOfficeLib.OfficeNs.MsoRelativeNodePosition): scala.Unit = js.native
  def NextNode(): DiagramNode = js.native
  def PrevNode(): DiagramNode = js.native
  def ReplaceNode(pTargetNode: DiagramNode): scala.Unit = js.native
  /** @param swapChildren [swapChildren=true] */
  def SwapNode(pTargetNode: DiagramNode): scala.Unit = js.native
  def SwapNode(pTargetNode: DiagramNode, swapChildren: scala.Boolean): scala.Unit = js.native
  def TransferChildren(pReceivingNode: DiagramNode): scala.Unit = js.native
}

