package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.Balloon")
@js.native
class Balloon protected () extends js.Object {
  var Animation: MsoAnimationType = js.native
  val Application: js.Any = js.native
  var BalloonType: MsoBalloonType = js.native
  var Button: MsoButtonSetType = js.native
  var Callback: java.lang.String = js.native
  @JSName("Checkboxes")
  val Checkboxes_Original: BalloonCheckboxes = js.native
  val Creator: scala.Double = js.native
  var Heading: java.lang.String = js.native
  var Icon: MsoIconType = js.native
  @JSName("Labels")
  val Labels_Original: BalloonLabels = js.native
  var Mode: MsoModeType = js.native
  val Name: java.lang.String = js.native
  var `Office.Balloon_typekey`: Balloon = js.native
  val Parent: js.Any = js.native
  var Private: scala.Double = js.native
  var Text: java.lang.String = js.native
  def Checkboxes(Index: scala.Double): BalloonCheckbox = js.native
  def Close(): scala.Unit = js.native
  def Labels(Index: scala.Double): BalloonLabel = js.native
  def SetAvoidRectangle(Left: scala.Double, Top: scala.Double, Right: scala.Double, Bottom: scala.Double): scala.Unit = js.native
  def Show(): MsoBalloonButtonType = js.native
}

