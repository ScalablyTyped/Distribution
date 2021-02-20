package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionSetting extends StObject {
  
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
  implicit class ActionSettingMutableBuilder[Self <: ActionSetting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: PpActionType): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionVerb(value: String): Self = StObject.set(x, "ActionVerb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateAction(value: MsoTriState): Self = StObject.set(x, "AnimateAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperlink(value: Hyperlink): Self = StObject.set(x, "Hyperlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotActionSetting_typekey(value: ActionSetting): Self = StObject.set(x, "PowerPoint.ActionSetting_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRun(value: String): Self = StObject.set(x, "Run", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAndReturn(value: MsoTriState): Self = StObject.set(x, "ShowAndReturn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideShowName(value: String): Self = StObject.set(x, "SlideShowName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoundEffect(value: SoundEffect): Self = StObject.set(x, "SoundEffect", value.asInstanceOf[js.Any])
  }
}
