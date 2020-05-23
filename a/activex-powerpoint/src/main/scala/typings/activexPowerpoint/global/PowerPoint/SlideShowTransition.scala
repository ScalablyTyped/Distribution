package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoTriState
import typings.activexPowerpoint.PowerPoint.PpEntryEffect
import typings.activexPowerpoint.PowerPoint.PpTransitionSpeed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.SlideShowTransition")
@js.native
class SlideShowTransition protected ()
  extends typings.activexPowerpoint.PowerPoint.SlideShowTransition {
  /* CompleteClass */
  override var AdvanceOnClick: MsoTriState = js.native
  /* CompleteClass */
  override var AdvanceOnTime: MsoTriState = js.native
  /* CompleteClass */
  override var AdvanceTime: Double = js.native
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override var Duration: Double = js.native
  /* CompleteClass */
  override var EntryEffect: PpEntryEffect = js.native
  /* CompleteClass */
  override var Hidden: MsoTriState = js.native
  /* CompleteClass */
  override var LoopSoundUntilNext: MsoTriState = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.SlideShowTransition_typekey")
  override var PowerPointDotSlideShowTransition_typekey: typings.activexPowerpoint.PowerPoint.SlideShowTransition = js.native
  /* CompleteClass */
  override val SoundEffect: typings.activexPowerpoint.PowerPoint.SoundEffect = js.native
  /* CompleteClass */
  override var Speed: PpTransitionSpeed = js.native
}

