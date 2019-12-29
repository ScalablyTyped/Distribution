package typings.activexDashExcel.Excel

import typings.activexDashOffice.Office.IMsoDiagram
import typings.activexDashOffice.Office.MsoDiagramNodeType
import typings.activexDashOffice.Office.MsoOrgChartLayoutType
import typings.activexDashOffice.Office.MsoRelativeNodePosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.DiagramNode")
@js.native
class DiagramNode protected () extends js.Object {
  val Application: js.Any = js.native
  @JSName("Children")
  val Children_Original: DiagramNodeChildren = js.native
  val Creator: Double = js.native
  val Diagram: IMsoDiagram = js.native
  @JSName("Excel.DiagramNode_typekey")
  var ExcelDotDiagramNode_typekey: DiagramNode = js.native
  var Layout: MsoOrgChartLayoutType = js.native
  val Parent: js.Any = js.native
  val Root: DiagramNode = js.native
  val Shape: typings.activexDashExcel.Excel.Shape = js.native
  val TextShape: typings.activexDashExcel.Excel.Shape = js.native
  /**
    * @param pos [pos=2]
    * @param nodeType [nodeType=1]
    */
  def AddNode(): DiagramNode = js.native
  def AddNode(pos: MsoRelativeNodePosition): DiagramNode = js.native
  def AddNode(pos: MsoRelativeNodePosition, nodeType: MsoDiagramNodeType): DiagramNode = js.native
  def Children(Index: js.Any): DiagramNode = js.native
  /** @param pos [pos=2] */
  def CloneNode(copyChildren: Boolean, pTargetNode: DiagramNode): DiagramNode = js.native
  def CloneNode(copyChildren: Boolean, pTargetNode: DiagramNode, pos: MsoRelativeNodePosition): DiagramNode = js.native
  def Delete(): Unit = js.native
  def MoveNode(pTargetNode: DiagramNode, pos: MsoRelativeNodePosition): Unit = js.native
  def NextNode(): DiagramNode = js.native
  def PrevNode(): DiagramNode = js.native
  def ReplaceNode(pTargetNode: DiagramNode): Unit = js.native
  /** @param swapChildren [swapChildren=true] */
  def SwapNode(pTargetNode: DiagramNode): Unit = js.native
  def SwapNode(pTargetNode: DiagramNode, swapChildren: Boolean): Unit = js.native
  def TransferChildren(pReceivingNode: DiagramNode): Unit = js.native
}

