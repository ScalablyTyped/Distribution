package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoTriState
import typings.activexPowerpoint.PowerPoint.PpAdvanceMode
import typings.activexPowerpoint.PowerPoint.PpAfterEffect
import typings.activexPowerpoint.PowerPoint.PpChartUnitEffect
import typings.activexPowerpoint.PowerPoint.PpEntryEffect
import typings.activexPowerpoint.PowerPoint.PpTextLevelEffect
import typings.activexPowerpoint.PowerPoint.PpTextUnitEffect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.AnimationSettings")
@js.native
class AnimationSettings protected ()
  extends typings.activexPowerpoint.PowerPoint.AnimationSettings {
  /* CompleteClass */
  override var AdvanceMode: PpAdvanceMode = js.native
  /* CompleteClass */
  override var AdvanceTime: Double = js.native
  /* CompleteClass */
  override var AfterEffect: PpAfterEffect = js.native
  /* CompleteClass */
  override var Animate: MsoTriState = js.native
  /* CompleteClass */
  override var AnimateBackground: MsoTriState = js.native
  /* CompleteClass */
  override var AnimateTextInReverse: MsoTriState = js.native
  /* CompleteClass */
  override var AnimationOrder: Double = js.native
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override var ChartUnitEffect: PpChartUnitEffect = js.native
  /* CompleteClass */
  override val DimColor: typings.activexPowerpoint.PowerPoint.ColorFormat = js.native
  /* CompleteClass */
  override var EntryEffect: PpEntryEffect = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val PlaySettings: typings.activexPowerpoint.PowerPoint.PlaySettings = js.native
  /* CompleteClass */
  @JSName("PowerPoint.AnimationSettings_typekey")
  override var PowerPointDotAnimationSettings_typekey: typings.activexPowerpoint.PowerPoint.AnimationSettings = js.native
  /* CompleteClass */
  override val SoundEffect: typings.activexPowerpoint.PowerPoint.SoundEffect = js.native
  /* CompleteClass */
  override var TextLevelEffect: PpTextLevelEffect = js.native
  /* CompleteClass */
  override var TextUnitEffect: PpTextUnitEffect = js.native
}

