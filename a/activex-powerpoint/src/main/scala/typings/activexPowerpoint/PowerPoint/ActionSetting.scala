package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionSetting extends StObject {
  
  var Action: PpActionType
  
  var ActionVerb: String
  
  var AnimateAction: MsoTriState
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  val Hyperlink: typings.activexPowerpoint.PowerPoint.Hyperlink
  
  val Parent: Any
  
  /* private */ @JSName("PowerPoint.ActionSetting_typekey")
  var PowerPointDotActionSetting_typekey: ActionSetting
  
  var Run: String
  
  var ShowAndReturn: MsoTriState
  
  var SlideShowName: String
  
  val SoundEffect: typings.activexPowerpoint.PowerPoint.SoundEffect
}
object ActionSetting {
  
  inline def apply(
    Action: PpActionType,
    ActionVerb: String,
    AnimateAction: MsoTriState,
    Application: Application,
    Hyperlink: Hyperlink,
    Parent: Any,
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
  
  extension [Self <: ActionSetting](x: Self) {
    
    inline def setAction(value: PpActionType): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setActionVerb(value: String): Self = StObject.set(x, "ActionVerb", value.asInstanceOf[js.Any])
    
    inline def setAnimateAction(value: MsoTriState): Self = StObject.set(x, "AnimateAction", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setHyperlink(value: Hyperlink): Self = StObject.set(x, "Hyperlink", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPowerPointDotActionSetting_typekey(value: ActionSetting): Self = StObject.set(x, "PowerPoint.ActionSetting_typekey", value.asInstanceOf[js.Any])
    
    inline def setRun(value: String): Self = StObject.set(x, "Run", value.asInstanceOf[js.Any])
    
    inline def setShowAndReturn(value: MsoTriState): Self = StObject.set(x, "ShowAndReturn", value.asInstanceOf[js.Any])
    
    inline def setSlideShowName(value: String): Self = StObject.set(x, "SlideShowName", value.asInstanceOf[js.Any])
    
    inline def setSoundEffect(value: SoundEffect): Self = StObject.set(x, "SoundEffect", value.asInstanceOf[js.Any])
  }
}
