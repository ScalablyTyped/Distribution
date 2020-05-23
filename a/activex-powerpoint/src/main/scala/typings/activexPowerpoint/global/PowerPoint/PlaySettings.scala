package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.PlaySettings")
@js.native
class PlaySettings protected ()
  extends typings.activexPowerpoint.PowerPoint.PlaySettings {
  /* CompleteClass */
  override var ActionVerb: String = js.native
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override var HideWhileNotPlaying: MsoTriState = js.native
  /* CompleteClass */
  override var LoopUntilStopped: MsoTriState = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var PauseAnimation: MsoTriState = js.native
  /* CompleteClass */
  override var PlayOnEntry: MsoTriState = js.native
  /* CompleteClass */
  @JSName("PowerPoint.PlaySettings_typekey")
  override var PowerPointDotPlaySettings_typekey: typings.activexPowerpoint.PowerPoint.PlaySettings = js.native
  /* CompleteClass */
  override var RewindMovie: MsoTriState = js.native
  /* CompleteClass */
  override var StopAfterSlides: Double = js.native
}

