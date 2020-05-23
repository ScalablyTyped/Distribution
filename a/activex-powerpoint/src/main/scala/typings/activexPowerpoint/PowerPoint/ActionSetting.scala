package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionSetting extends js.Object {
  var Action: PpActionType
  var ActionVerb: String
  var AnimateAction: MsoTriState
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val Hyperlink: typings.activexPowerpoint.PowerPoint.Hyperlink
  val Parent: js.Any
  @JSName("PowerPoint.ActionSetting_typekey")
  var PowerPointDotActionSetting_typekey: ActionSetting
  var Run: String
  var ShowAndReturn: MsoTriState
  var SlideShowName: String
  val SoundEffect: typings.activexPowerpoint.PowerPoint.SoundEffect
}

object ActionSetting {
  @scala.inline
  def apply(
    Action: PpActionType,
    ActionVerb: String,
    AnimateAction: MsoTriState,
    Application: Application,
    Hyperlink: Hyperlink,
    Parent: js.Any,
    PowerPointDotActionSetting_typekey: ActionSetting,
    Run: String,
    ShowAndReturn: MsoTriState,
    SlideShowName: String,
    SoundEffect: SoundEffect
  ): ActionSetting = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], ActionVerb = ActionVerb.asInstanceOf[js.Any], AnimateAction = AnimateAction.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Hyperlink = Hyperlink.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Run = Run.asInstanceOf[js.Any], ShowAndReturn = ShowAndReturn.asInstanceOf[js.Any], SlideShowName = SlideShowName.asInstanceOf[js.Any], SoundEffect = SoundEffect.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ActionSetting_typekey")(PowerPointDotActionSetting_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionSetting]
  }
}

