package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformConfigParameter extends StObject {
  
  /**
    * Specifies whether the parameter is optional or not in the config file of the dynamic transform.
    */
  var IsOptional: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * Specifies the list type of the parameter in the config file of the dynamic transform.
    */
  var ListType: js.UndefOr[ParamType] = js.undefined
  
  /**
    * Specifies the name of the parameter in the config file of the dynamic transform.
    */
  var Name: EnclosedInStringProperty
  
  /**
    * Specifies the parameter type in the config file of the dynamic transform.
    */
  var Type: ParamType
  
  /**
    * Specifies the validation message in the config file of the dynamic transform.
    */
  var ValidationMessage: js.UndefOr[EnclosedInStringProperty] = js.undefined
  
  /**
    * Specifies the validation rule in the config file of the dynamic transform.
    */
  var ValidationRule: js.UndefOr[EnclosedInStringProperty] = js.undefined
  
  /**
    * Specifies the value of the parameter in the config file of the dynamic transform.
    */
  var Value: js.UndefOr[EnclosedInStringProperties] = js.undefined
}
object TransformConfigParameter {
  
  inline def apply(Name: EnclosedInStringProperty, Type: ParamType): TransformConfigParameter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformConfigParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransformConfigParameter] (val x: Self) extends AnyVal {
    
    inline def setIsOptional(value: BoxedBoolean): Self = StObject.set(x, "IsOptional", value.asInstanceOf[js.Any])
    
    inline def setIsOptionalUndefined: Self = StObject.set(x, "IsOptional", js.undefined)
    
    inline def setListType(value: ParamType): Self = StObject.set(x, "ListType", value.asInstanceOf[js.Any])
    
    inline def setListTypeUndefined: Self = StObject.set(x, "ListType", js.undefined)
    
    inline def setName(value: EnclosedInStringProperty): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setType(value: ParamType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setValidationMessage(value: EnclosedInStringProperty): Self = StObject.set(x, "ValidationMessage", value.asInstanceOf[js.Any])
    
    inline def setValidationMessageUndefined: Self = StObject.set(x, "ValidationMessage", js.undefined)
    
    inline def setValidationRule(value: EnclosedInStringProperty): Self = StObject.set(x, "ValidationRule", value.asInstanceOf[js.Any])
    
    inline def setValidationRuleUndefined: Self = StObject.set(x, "ValidationRule", js.undefined)
    
    inline def setValue(value: EnclosedInStringProperties): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
    
    inline def setValueVarargs(value: EnclosedInStringProperty*): Self = StObject.set(x, "Value", js.Array(value*))
  }
}
