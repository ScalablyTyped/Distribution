package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoTriState
import typings.activexPowerpoint.PowerPoint.PpActionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.ActionSetting")
@js.native
class ActionSetting protected ()
  extends typings.activexPowerpoint.PowerPoint.ActionSetting {
  /* CompleteClass */
  override var Action: PpActionType = js.native
  /* CompleteClass */
  override var ActionVerb: String = js.native
  /* CompleteClass */
  override var AnimateAction: MsoTriState = js.native
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override val Hyperlink: typings.activexPowerpoint.PowerPoint.Hyperlink = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.ActionSetting_typekey")
  override var PowerPointDotActionSetting_typekey: typings.activexPowerpoint.PowerPoint.ActionSetting = js.native
  /* CompleteClass */
  override var Run: String = js.native
  /* CompleteClass */
  override var ShowAndReturn: MsoTriState = js.native
  /* CompleteClass */
  override var SlideShowName: String = js.native
  /* CompleteClass */
  override val SoundEffect: typings.activexPowerpoint.PowerPoint.SoundEffect = js.native
}

