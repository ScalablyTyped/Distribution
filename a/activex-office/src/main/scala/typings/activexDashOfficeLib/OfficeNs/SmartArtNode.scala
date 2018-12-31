package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.SmartArtNode")
@js.native
class SmartArtNode protected () extends js.Object {
  val Application: js.Any = js.native
  val Creator: scala.Double = js.native
  val Hidden: MsoTriState = js.native
  val Level: scala.Double = js.native
  @JSName("Nodes")
  val Nodes_Original: SmartArtNodes = js.native
  var `Office.SmartArtNode_typekey`: SmartArtNode = js.native
  var OrgChartLayout: MsoOrgChartLayoutType = js.native
  val Parent: js.Any = js.native
  val ParentNode: SmartArtNode = js.native
  @JSName("Shapes")
  val Shapes_Original: ShapeRange = js.native
  val TextFrame2: TextFrame2 = js.native
  val Type: MsoSmartArtNodeType = js.native
  /**
    * @param Position [Position=1]
    * @param Type [Type=1]
    */
  def AddNode(): SmartArtNode = js.native
  def AddNode(Position: MsoSmartArtNodePosition): SmartArtNode = js.native
  def AddNode(Position: MsoSmartArtNodePosition, Type: MsoSmartArtNodeType): SmartArtNode = js.native
  def Delete(): scala.Unit = js.native
  def Demote(): scala.Unit = js.native
  def Larger(): scala.Unit = js.native
  def Nodes(Index: java.lang.String): SmartArtNode = js.native
  def Nodes(Index: scala.Double): SmartArtNode = js.native
  def Promote(): scala.Unit = js.native
  def ReorderDown(): scala.Unit = js.native
  def ReorderUp(): scala.Unit = js.native
  def Shapes(Index: js.Any): Shape = js.native
  def Smaller(): scala.Unit = js.native
}

