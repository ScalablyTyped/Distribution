package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaySoundRuleAction extends StObject {
  
  val ActionType: OlRuleActionType = js.native
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  var Enabled: Boolean = js.native
  
  var FilePath: String = js.native
  
  @JSName("Outlook.PlaySoundRuleAction_typekey")
  var OutlookDotPlaySoundRuleAction_typekey: PlaySoundRuleAction = js.native
  
  val Parent: js.Any = js.native
  
  val Session: NameSpace = js.native
}
object PlaySoundRuleAction {
  
  @scala.inline
  def apply(
    ActionType: OlRuleActionType,
    Application: Application,
    Class: OlObjectClass,
    Enabled: Boolean,
    FilePath: String,
    OutlookDotPlaySoundRuleAction_typekey: PlaySoundRuleAction,
    Parent: js.Any,
    Session: NameSpace
  ): PlaySoundRuleAction = {
    val __obj = js.Dynamic.literal(ActionType = ActionType.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], FilePath = FilePath.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.PlaySoundRuleAction_typekey")(OutlookDotPlaySoundRuleAction_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaySoundRuleAction]
  }
  
  @scala.inline
  implicit class PlaySoundRuleActionMutableBuilder[Self <: PlaySoundRuleAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionType(value: OlRuleActionType): Self = StObject.set(x, "ActionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "FilePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotPlaySoundRuleAction_typekey(value: PlaySoundRuleAction): Self = StObject.set(x, "Outlook.PlaySoundRuleAction_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
