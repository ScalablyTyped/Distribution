package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FromRssFeedRuleCondition extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val ConditionType: OlRuleConditionType
  
  var Enabled: Boolean
  
  var FromRssFeed: js.Any
  
  @JSName("Outlook.FromRssFeedRuleCondition_typekey")
  var OutlookDotFromRssFeedRuleCondition_typekey: FromRssFeedRuleCondition
  
  val Parent: js.Any
  
  val Session: NameSpace
}
object FromRssFeedRuleCondition {
  
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    ConditionType: OlRuleConditionType,
    Enabled: Boolean,
    FromRssFeed: js.Any,
    OutlookDotFromRssFeedRuleCondition_typekey: FromRssFeedRuleCondition,
    Parent: js.Any,
    Session: NameSpace
  ): FromRssFeedRuleCondition = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ConditionType = ConditionType.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], FromRssFeed = FromRssFeed.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.FromRssFeedRuleCondition_typekey")(OutlookDotFromRssFeedRuleCondition_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromRssFeedRuleCondition]
  }
  
  @scala.inline
  implicit class FromRssFeedRuleConditionMutableBuilder[Self <: FromRssFeedRuleCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionType(value: OlRuleConditionType): Self = StObject.set(x, "ConditionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromRssFeed(value: js.Any): Self = StObject.set(x, "FromRssFeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotFromRssFeedRuleCondition_typekey(value: FromRssFeedRuleCondition): Self = StObject.set(x, "Outlook.FromRssFeedRuleCondition_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
