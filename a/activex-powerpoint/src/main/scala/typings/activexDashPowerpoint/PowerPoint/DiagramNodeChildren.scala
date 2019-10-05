package typings.activexDashPowerpoint.PowerPoint

import typings.activexDashOffice.Office.MsoDiagramNodeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.DiagramNodeChildren")
@js.native
class DiagramNodeChildren protected () extends js.Object {
  val Application: js.Any = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val FirstChild: DiagramNode = js.native
  val LastChild: DiagramNode = js.native
  val Parent: js.Any = js.native
  var `PowerPoint.DiagramNodeChildren_typekey`: DiagramNodeChildren = js.native
  /**
    * @param any [Index=-1]
    * @param Office.MsoDiagramNodeType [NodeType=1]
    */
  def AddNode(): DiagramNode = js.native
  def AddNode(Index: js.Any): DiagramNode = js.native
  def AddNode(Index: js.Any, NodeType: MsoDiagramNodeType): DiagramNode = js.native
  def Item(Index: js.Any): DiagramNode = js.native
  def SelectAll(): Unit = js.native
}

