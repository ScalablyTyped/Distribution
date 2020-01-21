package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.ActionSetting")
@js.native
class ActionSetting protected () extends js.Object {
  var Action: PpActionType = js.native
  var ActionVerb: String = js.native
  var AnimateAction: MsoTriState = js.native
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  val Hyperlink: typings.activexPowerpoint.PowerPoint.Hyperlink = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.ActionSetting_typekey")
  var PowerPointDotActionSetting_typekey: ActionSetting = js.native
  var Run: String = js.native
  var ShowAndReturn: MsoTriState = js.native
  var SlideShowName: String = js.native
  val SoundEffect: typings.activexPowerpoint.PowerPoint.SoundEffect = js.native
}

