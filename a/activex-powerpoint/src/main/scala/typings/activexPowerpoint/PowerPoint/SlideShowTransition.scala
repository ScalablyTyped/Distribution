package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlideShowTransition extends js.Object {
  var AdvanceOnClick: MsoTriState
  var AdvanceOnTime: MsoTriState
  var AdvanceTime: Double
  val Application: typings.activexPowerpoint.PowerPoint.Application
  var Duration: Double
  var EntryEffect: PpEntryEffect
  var Hidden: MsoTriState
  var LoopSoundUntilNext: MsoTriState
  val Parent: js.Any
  @JSName("PowerPoint.SlideShowTransition_typekey")
  var PowerPointDotSlideShowTransition_typekey: SlideShowTransition
  val SoundEffect: typings.activexPowerpoint.PowerPoint.SoundEffect
  var Speed: PpTransitionSpeed
}

object SlideShowTransition {
  @scala.inline
  def apply(
    AdvanceOnClick: MsoTriState,
    AdvanceOnTime: MsoTriState,
    AdvanceTime: Double,
    Application: Application,
    Duration: Double,
    EntryEffect: PpEntryEffect,
    Hidden: MsoTriState,
    LoopSoundUntilNext: MsoTriState,
    Parent: js.Any,
    PowerPointDotSlideShowTransition_typekey: SlideShowTransition,
    SoundEffect: SoundEffect,
    Speed: PpTransitionSpeed
  ): SlideShowTransition = {
    val __obj = js.Dynamic.literal(AdvanceOnClick = AdvanceOnClick.asInstanceOf[js.Any], AdvanceOnTime = AdvanceOnTime.asInstanceOf[js.Any], AdvanceTime = AdvanceTime.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Duration = Duration.asInstanceOf[js.Any], EntryEffect = EntryEffect.asInstanceOf[js.Any], Hidden = Hidden.asInstanceOf[js.Any], LoopSoundUntilNext = LoopSoundUntilNext.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SoundEffect = SoundEffect.asInstanceOf[js.Any], Speed = Speed.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.SlideShowTransition_typekey")(PowerPointDotSlideShowTransition_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideShowTransition]
  }
}

