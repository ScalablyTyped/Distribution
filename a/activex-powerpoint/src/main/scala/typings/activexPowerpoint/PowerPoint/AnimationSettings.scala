package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.AnimationSettings")
@js.native
class AnimationSettings protected () extends js.Object {
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

