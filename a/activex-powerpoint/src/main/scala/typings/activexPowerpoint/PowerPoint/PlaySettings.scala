package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaySettings extends js.Object {
  var ActionVerb: String
  val Application: typings.activexPowerpoint.PowerPoint.Application
  var HideWhileNotPlaying: MsoTriState
  var LoopUntilStopped: MsoTriState
  val Parent: js.Any
  var PauseAnimation: MsoTriState
  var PlayOnEntry: MsoTriState
  @JSName("PowerPoint.PlaySettings_typekey")
  var PowerPointDotPlaySettings_typekey: PlaySettings
  var RewindMovie: MsoTriState
  var StopAfterSlides: Double
}

object PlaySettings {
  @scala.inline
  def apply(
    ActionVerb: String,
    Application: Application,
    HideWhileNotPlaying: MsoTriState,
    LoopUntilStopped: MsoTriState,
    Parent: js.Any,
    PauseAnimation: MsoTriState,
    PlayOnEntry: MsoTriState,
    PowerPointDotPlaySettings_typekey: PlaySettings,
    RewindMovie: MsoTriState,
    StopAfterSlides: Double
  ): PlaySettings = {
    val __obj = js.Dynamic.literal(ActionVerb = ActionVerb.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], HideWhileNotPlaying = HideWhileNotPlaying.asInstanceOf[js.Any], LoopUntilStopped = LoopUntilStopped.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PauseAnimation = PauseAnimation.asInstanceOf[js.Any], PlayOnEntry = PlayOnEntry.asInstanceOf[js.Any], RewindMovie = RewindMovie.asInstanceOf[js.Any], StopAfterSlides = StopAfterSlides.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.PlaySettings_typekey")(PowerPointDotPlaySettings_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaySettings]
  }
}

