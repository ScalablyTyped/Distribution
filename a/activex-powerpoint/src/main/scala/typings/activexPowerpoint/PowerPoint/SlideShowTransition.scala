package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlideShowTransition extends js.Object {
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
  @scala.inline
  implicit class SlideShowTransitionOps[Self <: SlideShowTransition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdvanceOnClick(value: MsoTriState): Self = this.set("AdvanceOnClick", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdvanceOnTime(value: MsoTriState): Self = this.set("AdvanceOnTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdvanceTime(value: Double): Self = this.set("AdvanceTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("Duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntryEffect(value: PpEntryEffect): Self = this.set("EntryEffect", value.asInstanceOf[js.Any])
    @scala.inline
    def setHidden(value: MsoTriState): Self = this.set("Hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoopSoundUntilNext(value: MsoTriState): Self = this.set("LoopSoundUntilNext", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPowerPointDotSlideShowTransition_typekey(value: SlideShowTransition): Self = this.set("PowerPoint.SlideShowTransition_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setSoundEffect(value: SoundEffect): Self = this.set("SoundEffect", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpeed(value: PpTransitionSpeed): Self = this.set("Speed", value.asInstanceOf[js.Any])
  }
  
}

