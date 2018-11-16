package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.IMsoDiagram")
@js.native
class IMsoDiagram protected () extends js.Object {
  val Application: js.Any = js.native
  var AutoFormat: MsoTriState = js.native
  var AutoLayout: MsoTriState = js.native
  val Creator: scala.Double = js.native
  @JSName("Nodes")
  val Nodes_Original: DiagramNodes = js.native
  var `Office.IMsoDiagram_typekey`: IMsoDiagram = js.native
  val Parent: js.Any = js.native
  var Reverse: MsoTriState = js.native
  val Type: MsoDiagramType = js.native
  def Convert(Type: MsoDiagramType): scala.Unit = js.native
  def FitText(): scala.Unit = js.native
  def Nodes(Index: js.Any): DiagramNode = js.native
}

