package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.SlideShowTransition")
@js.native
class SlideShowTransition protected () extends js.Object {
  var AdvanceOnClick: MsoTriState = js.native
  var AdvanceOnTime: MsoTriState = js.native
  var AdvanceTime: Double = js.native
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  var Duration: Double = js.native
  var EntryEffect: PpEntryEffect = js.native
  var Hidden: MsoTriState = js.native
  var LoopSoundUntilNext: MsoTriState = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.SlideShowTransition_typekey")
  var PowerPointDotSlideShowTransition_typekey: SlideShowTransition = js.native
  val SoundEffect: typings.activexPowerpoint.PowerPoint.SoundEffect = js.native
  var Speed: PpTransitionSpeed = js.native
}

