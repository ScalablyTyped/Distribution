package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationSettings extends js.Object {
  var AdvanceMode: PpAdvanceMode
  var AdvanceTime: Double
  var AfterEffect: PpAfterEffect
  var Animate: MsoTriState
  var AnimateBackground: MsoTriState
  var AnimateTextInReverse: MsoTriState
  var AnimationOrder: Double
  val Application: typings.activexPowerpoint.PowerPoint.Application
  var ChartUnitEffect: PpChartUnitEffect
  val DimColor: ColorFormat
  var EntryEffect: PpEntryEffect
  val Parent: js.Any
  val PlaySettings: typings.activexPowerpoint.PowerPoint.PlaySettings
  @JSName("PowerPoint.AnimationSettings_typekey")
  var PowerPointDotAnimationSettings_typekey: AnimationSettings
  val SoundEffect: typings.activexPowerpoint.PowerPoint.SoundEffect
  var TextLevelEffect: PpTextLevelEffect
  var TextUnitEffect: PpTextUnitEffect
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
}

