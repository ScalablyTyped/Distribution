package typings.activexDashPowerpoint.PowerPoint

import typings.activexDashOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.PlaySettings")
@js.native
class PlaySettings protected () extends js.Object {
  var ActionVerb: String = js.native
  val Application: typings.activexDashPowerpoint.PowerPoint.Application = js.native
  var HideWhileNotPlaying: MsoTriState = js.native
  var LoopUntilStopped: MsoTriState = js.native
  val Parent: js.Any = js.native
  var PauseAnimation: MsoTriState = js.native
  var PlayOnEntry: MsoTriState = js.native
  @JSName("PowerPoint.PlaySettings_typekey")
  var PowerPointDotPlaySettings_typekey: PlaySettings = js.native
  var RewindMovie: MsoTriState = js.native
  var StopAfterSlides: Double = js.native
}

