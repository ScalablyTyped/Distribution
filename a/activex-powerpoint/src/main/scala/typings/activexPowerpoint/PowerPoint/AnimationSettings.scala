package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationSettings extends js.Object {
  var AdvanceMode: PpAdvanceMode = js.native
  var AdvanceTime: Double = js.native
  var AfterEffect: PpAfterEffect = js.native
  var Animate: MsoTriState = js.native
  var AnimateBackground: MsoTriState = js.native
  var AnimateTextInReverse: MsoTriState = js.native
  var AnimationOrder: Double = js.native
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  var ChartUnitEffect: PpChartUnitEffect = js.native
  val DimColor: ColorFormat = js.native
  var EntryEffect: PpEntryEffect = js.native
  val Parent: js.Any = js.native
  val PlaySettings: typings.activexPowerpoint.PowerPoint.PlaySettings = js.native
  @JSName("PowerPoint.AnimationSettings_typekey")
  var PowerPointDotAnimationSettings_typekey: AnimationSettings = js.native
  val SoundEffect: typings.activexPowerpoint.PowerPoint.SoundEffect = js.native
  var TextLevelEffect: PpTextLevelEffect = js.native
  var TextUnitEffect: PpTextUnitEffect = js.native
}

object AnimationSettings {
  @scala.inline
  def apply(
    AdvanceMode: PpAdvanceMode,
    AdvanceTime: Double,
    AfterEffect: PpAfterEffect,
    Animate: MsoTriState,
    AnimateBackground: MsoTriState,
    AnimateTextInReverse: MsoTriState,
    AnimationOrder: Double,
    Application: Application,
    ChartUnitEffect: PpChartUnitEffect,
    DimColor: ColorFormat,
    EntryEffect: PpEntryEffect,
    Parent: js.Any,
    PlaySettings: PlaySettings,
    PowerPointDotAnimationSettings_typekey: AnimationSettings,
    SoundEffect: SoundEffect,
    TextLevelEffect: PpTextLevelEffect,
    TextUnitEffect: PpTextUnitEffect
  ): AnimationSettings = {
    val __obj = js.Dynamic.literal(AdvanceMode = AdvanceMode.asInstanceOf[js.Any], AdvanceTime = AdvanceTime.asInstanceOf[js.Any], AfterEffect = AfterEffect.asInstanceOf[js.Any], Animate = Animate.asInstanceOf[js.Any], AnimateBackground = AnimateBackground.asInstanceOf[js.Any], AnimateTextInReverse = AnimateTextInReverse.asInstanceOf[js.Any], AnimationOrder = AnimationOrder.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], ChartUnitEffect = ChartUnitEffect.asInstanceOf[js.Any], DimColor = DimColor.asInstanceOf[js.Any], EntryEffect = EntryEffect.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PlaySettings = PlaySettings.asInstanceOf[js.Any], SoundEffect = SoundEffect.asInstanceOf[js.Any], TextLevelEffect = TextLevelEffect.asInstanceOf[js.Any], TextUnitEffect = TextUnitEffect.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.AnimationSettings_typekey")(PowerPointDotAnimationSettings_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationSettings]
  }
  @scala.inline
  implicit class AnimationSettingsOps[Self <: AnimationSettings] (val x: Self) extends AnyVal {
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
    def setAdvanceMode(value: PpAdvanceMode): Self = this.set("AdvanceMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdvanceTime(value: Double): Self = this.set("AdvanceTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setAfterEffect(value: PpAfterEffect): Self = this.set("AfterEffect", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimate(value: MsoTriState): Self = this.set("Animate", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimateBackground(value: MsoTriState): Self = this.set("AnimateBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimateTextInReverse(value: MsoTriState): Self = this.set("AnimateTextInReverse", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimationOrder(value: Double): Self = this.set("AnimationOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setChartUnitEffect(value: PpChartUnitEffect): Self = this.set("ChartUnitEffect", value.asInstanceOf[js.Any])
    @scala.inline
    def setDimColor(value: ColorFormat): Self = this.set("DimColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntryEffect(value: PpEntryEffect): Self = this.set("EntryEffect", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlaySettings(value: PlaySettings): Self = this.set("PlaySettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setPowerPointDotAnimationSettings_typekey(value: AnimationSettings): Self = this.set("PowerPoint.AnimationSettings_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setSoundEffect(value: SoundEffect): Self = this.set("SoundEffect", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextLevelEffect(value: PpTextLevelEffect): Self = this.set("TextLevelEffect", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextUnitEffect(value: PpTextUnitEffect): Self = this.set("TextUnitEffect", value.asInstanceOf[js.Any])
  }
  
}

