package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.PlaySettings")
@js.native
class PlaySettings protected () extends js.Object {
  var ActionVerb: String = js.native
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
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

