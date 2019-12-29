package typings.activexDashOffice.Office

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
  var Callback: String = js.native
  @JSName("Checkboxes")
  val Checkboxes_Original: BalloonCheckboxes = js.native
  val Creator: Double = js.native
  var Heading: String = js.native
  var Icon: MsoIconType = js.native
  @JSName("Labels")
  val Labels_Original: BalloonLabels = js.native
  var Mode: MsoModeType = js.native
  val Name: String = js.native
  @JSName("Office.Balloon_typekey")
  var OfficeDotBalloon_typekey: Balloon = js.native
  val Parent: js.Any = js.native
  var Private: Double = js.native
  var Text: String = js.native
  def Checkboxes(Index: Double): BalloonCheckbox = js.native
  def Close(): Unit = js.native
  def Labels(Index: Double): BalloonLabel = js.native
  def SetAvoidRectangle(Left: Double, Top: Double, Right: Double, Bottom: Double): Unit = js.native
  def Show(): MsoBalloonButtonType = js.native
}

