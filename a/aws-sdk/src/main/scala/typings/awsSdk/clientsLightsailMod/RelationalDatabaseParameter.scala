package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelationalDatabaseParameter extends StObject {
  
  /**
    * Specifies the valid range of values for the parameter.
    */
  var allowedValues: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates when parameter updates are applied. Can be immediate or pending-reboot.
    */
  var applyMethod: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the engine-specific parameter type.
    */
  var applyType: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the valid data type for the parameter.
    */
  var dataType: js.UndefOr[String] = js.undefined
  
  /**
    * Provides a description of the parameter.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * A Boolean value indicating whether the parameter can be modified.
    */
  var isModifiable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the name of the parameter.
    */
  var parameterName: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the value of the parameter.
    */
  var parameterValue: js.UndefOr[String] = js.undefined
}
object RelationalDatabaseParameter {
  
  inline def apply(): RelationalDatabaseParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationalDatabaseParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelationalDatabaseParameter] (val x: Self) extends AnyVal {
    
    inline def setAllowedValues(value: String): Self = StObject.set(x, "allowedValues", value.asInstanceOf[js.Any])
    
    inline def setAllowedValuesUndefined: Self = StObject.set(x, "allowedValues", js.undefined)
    
    inline def setApplyMethod(value: String): Self = StObject.set(x, "applyMethod", value.asInstanceOf[js.Any])
    
    inline def setApplyMethodUndefined: Self = StObject.set(x, "applyMethod", js.undefined)
    
    inline def setApplyType(value: String): Self = StObject.set(x, "applyType", value.asInstanceOf[js.Any])
    
    inline def setApplyTypeUndefined: Self = StObject.set(x, "applyType", js.undefined)
    
    inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIsModifiable(value: Boolean): Self = StObject.set(x, "isModifiable", value.asInstanceOf[js.Any])
    
    inline def setIsModifiableUndefined: Self = StObject.set(x, "isModifiable", js.undefined)
    
    inline def setParameterName(value: String): Self = StObject.set(x, "parameterName", value.asInstanceOf[js.Any])
    
    inline def setParameterNameUndefined: Self = StObject.set(x, "parameterName", js.undefined)
    
    inline def setParameterValue(value: String): Self = StObject.set(x, "parameterValue", value.asInstanceOf[js.Any])
    
    inline def setParameterValueUndefined: Self = StObject.set(x, "parameterValue", js.undefined)
  }
}
