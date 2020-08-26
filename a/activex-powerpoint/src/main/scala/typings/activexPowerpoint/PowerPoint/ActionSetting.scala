package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionSetting extends js.Object {
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
  @scala.inline
  implicit class ActionSettingOps[Self <: ActionSetting] (val x: Self) extends AnyVal {
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
    def setAction(value: PpActionType): Self = this.set("Action", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionVerb(value: String): Self = this.set("ActionVerb", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimateAction(value: MsoTriState): Self = this.set("AnimateAction", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setHyperlink(value: Hyperlink): Self = this.set("Hyperlink", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPowerPointDotActionSetting_typekey(value: ActionSetting): Self = this.set("PowerPoint.ActionSetting_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setRun(value: String): Self = this.set("Run", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowAndReturn(value: MsoTriState): Self = this.set("ShowAndReturn", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlideShowName(value: String): Self = this.set("SlideShowName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSoundEffect(value: SoundEffect): Self = this.set("SoundEffect", value.asInstanceOf[js.Any])
  }
  
}

