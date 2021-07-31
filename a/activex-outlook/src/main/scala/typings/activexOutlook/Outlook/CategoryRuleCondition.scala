package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CategoryRuleCondition extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application
  
  var Categories: js.Any
  
  val Class: OlObjectClass
  
  val ConditionType: OlRuleConditionType
  
  var Enabled: Boolean
  
  @JSName("Outlook.CategoryRuleCondition_typekey")
  var OutlookDotCategoryRuleCondition_typekey: CategoryRuleCondition
  
  val Parent: js.Any
  
  val Session: NameSpace
}
object CategoryRuleCondition {
  
  @scala.inline
  def apply(
    Application: Application,
    Categories: js.Any,
    Class: OlObjectClass,
    ConditionType: OlRuleConditionType,
    Enabled: Boolean,
    OutlookDotCategoryRuleCondition_typekey: CategoryRuleCondition,
    Parent: js.Any,
    Session: NameSpace
  ): CategoryRuleCondition = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Categories = Categories.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ConditionType = ConditionType.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.CategoryRuleCondition_typekey")(OutlookDotCategoryRuleCondition_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryRuleCondition]
  }
  
  @scala.inline
  implicit class CategoryRuleConditionMutableBuilder[Self <: CategoryRuleCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategories(value: js.Any): Self = StObject.set(x, "Categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionType(value: OlRuleConditionType): Self = StObject.set(x, "ConditionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotCategoryRuleCondition_typekey(value: CategoryRuleCondition): Self = StObject.set(x, "Outlook.CategoryRuleCondition_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
