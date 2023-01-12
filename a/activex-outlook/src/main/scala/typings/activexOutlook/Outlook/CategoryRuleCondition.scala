package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CategoryRuleCondition extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application
  
  var Categories: Any
  
  val Class: OlObjectClass
  
  val ConditionType: OlRuleConditionType
  
  var Enabled: Boolean
  
  /* private */ @JSName("Outlook.CategoryRuleCondition_typekey")
  var OutlookDotCategoryRuleCondition_typekey: CategoryRuleCondition
  
  val Parent: Any
  
  val Session: NameSpace
}
object CategoryRuleCondition {
  
  inline def apply(
    Application: Application,
    Categories: Any,
    Class: OlObjectClass,
    ConditionType: OlRuleConditionType,
    Enabled: Boolean,
    OutlookDotCategoryRuleCondition_typekey: CategoryRuleCondition,
    Parent: Any,
    Session: NameSpace
  ): CategoryRuleCondition = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Categories = Categories.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ConditionType = ConditionType.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.CategoryRuleCondition_typekey")(OutlookDotCategoryRuleCondition_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryRuleCondition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CategoryRuleCondition] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCategories(value: Any): Self = StObject.set(x, "Categories", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setConditionType(value: OlRuleConditionType): Self = StObject.set(x, "ConditionType", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotCategoryRuleCondition_typekey(value: CategoryRuleCondition): Self = StObject.set(x, "Outlook.CategoryRuleCondition_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
  }
}
