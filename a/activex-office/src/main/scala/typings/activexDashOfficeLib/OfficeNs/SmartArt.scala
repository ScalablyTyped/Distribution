package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.SmartArt")
@js.native
class SmartArt protected () extends js.Object {
  @JSName("AllNodes")
  val AllNodes_Original: SmartArtNodes = js.native
  val Application: js.Any = js.native
  var Color: SmartArtColor = js.native
  val Creator: scala.Double = js.native
  var Layout: SmartArtLayout = js.native
  @JSName("Nodes")
  val Nodes_Original: SmartArtNodes = js.native
  var `Office.SmartArt_typekey`: SmartArt = js.native
  val Parent: js.Any = js.native
  var QuickStyle: SmartArtQuickStyle = js.native
  var Reverse: MsoTriState = js.native
  def AllNodes(Index: java.lang.String): SmartArtNode = js.native
  def AllNodes(Index: scala.Double): SmartArtNode = js.native
  def Nodes(Index: java.lang.String): SmartArtNode = js.native
  def Nodes(Index: scala.Double): SmartArtNode = js.native
  def Reset(): scala.Unit = js.native
}

