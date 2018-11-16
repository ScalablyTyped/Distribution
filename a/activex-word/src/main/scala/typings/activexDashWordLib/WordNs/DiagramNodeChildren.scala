package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.DiagramNodeChildren")
@js.native
class DiagramNodeChildren protected () extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val FirstChild: DiagramNode = js.native
  val LastChild: DiagramNode = js.native
  val Parent: js.Any = js.native
  var `Word.DiagramNodeChildren_typekey`: DiagramNodeChildren = js.native
  /**
           * @param any [Index=-1]
           * @param Office.MsoDiagramNodeType [NodeType=1]
           */
  def AddNode(): DiagramNode = js.native
  /**
           * @param any [Index=-1]
           * @param Office.MsoDiagramNodeType [NodeType=1]
           */
  def AddNode(Index: js.Any): DiagramNode = js.native
  /**
           * @param any [Index=-1]
           * @param Office.MsoDiagramNodeType [NodeType=1]
           */
  def AddNode(Index: js.Any, NodeType: activexDashOfficeLib.OfficeNs.MsoDiagramNodeType): DiagramNode = js.native
  def Item(Index: js.Any): DiagramNode = js.native
  def SelectAll(): scala.Unit = js.native
}

