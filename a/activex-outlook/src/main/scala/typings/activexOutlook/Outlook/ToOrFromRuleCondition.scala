package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToOrFromRuleCondition extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  val ConditionType: OlRuleConditionType = js.native
  
  var Enabled: Boolean = js.native
  
  @JSName("Outlook.ToOrFromRuleCondition_typekey")
  var OutlookDotToOrFromRuleCondition_typekey: ToOrFromRuleCondition = js.native
  
  val Parent: js.Any = js.native
  
  val Recipients: typings.activexOutlook.Outlook.Recipients = js.native
  
  val Session: NameSpace = js.native
}
object ToOrFromRuleCondition {
  
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    ConditionType: OlRuleConditionType,
    Enabled: Boolean,
    OutlookDotToOrFromRuleCondition_typekey: ToOrFromRuleCondition,
    Parent: js.Any,
    Recipients: Recipients,
    Session: NameSpace
  ): ToOrFromRuleCondition = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ConditionType = ConditionType.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Recipients = Recipients.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.ToOrFromRuleCondition_typekey")(OutlookDotToOrFromRuleCondition_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToOrFromRuleCondition]
  }
  
  @scala.inline
  implicit class ToOrFromRuleConditionMutableBuilder[Self <: ToOrFromRuleCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionType(value: OlRuleConditionType): Self = StObject.set(x, "ConditionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotToOrFromRuleCondition_typekey(value: ToOrFromRuleCondition): Self = StObject.set(x, "Outlook.ToOrFromRuleCondition_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipients(value: Recipients): Self = StObject.set(x, "Recipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
