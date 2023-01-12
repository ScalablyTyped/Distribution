package typings.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextRuleCondition extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  val ConditionType: OlRuleConditionType
  
  var Enabled: Boolean
  
  /* private */ @JSName("Outlook.TextRuleCondition_typekey")
  var OutlookDotTextRuleCondition_typekey: TextRuleCondition
  
  val Parent: Any
  
  val Session: NameSpace
  
  var Text: Any
}
object TextRuleCondition {
  
  inline def apply(
    Application: Application,
    Class: OlObjectClass,
    ConditionType: OlRuleConditionType,
    Enabled: Boolean,
    OutlookDotTextRuleCondition_typekey: TextRuleCondition,
    Parent: Any,
    Session: NameSpace,
    Text: Any
  ): TextRuleCondition = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ConditionType = ConditionType.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.TextRuleCondition_typekey")(OutlookDotTextRuleCondition_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextRuleCondition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextRuleCondition] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setConditionType(value: OlRuleConditionType): Self = StObject.set(x, "ConditionType", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotTextRuleCondition_typekey(value: TextRuleCondition): Self = StObject.set(x, "Outlook.TextRuleCondition_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setText(value: Any): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
