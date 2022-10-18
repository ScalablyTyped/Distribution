package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameter extends StObject {
  
  /**
    * The key associated with the parameter. If you don't specify a key and value for a particular parameter, CloudFormation uses the default value that's specified in your template.
    */
  var ParameterKey: js.UndefOr[typings.awsSdk.clientsCloudformationMod.ParameterKey] = js.undefined
  
  /**
    * The input value associated with the parameter.
    */
  var ParameterValue: js.UndefOr[typings.awsSdk.clientsCloudformationMod.ParameterValue] = js.undefined
  
  /**
    * Read-only. The value that corresponds to a SSM parameter key. This field is returned only for  SSM  parameter types in the template.
    */
  var ResolvedValue: js.UndefOr[ParameterValue] = js.undefined
  
  /**
    * During a stack update, use the existing parameter value that the stack is using for a given parameter key. If you specify true, do not specify a parameter value.
    */
  var UsePreviousValue: js.UndefOr[typings.awsSdk.clientsCloudformationMod.UsePreviousValue] = js.undefined
}
object Parameter {
  
  inline def apply(): Parameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Parameter]
  }
  
  extension [Self <: Parameter](x: Self) {
    
    inline def setParameterKey(value: ParameterKey): Self = StObject.set(x, "ParameterKey", value.asInstanceOf[js.Any])
    
    inline def setParameterKeyUndefined: Self = StObject.set(x, "ParameterKey", js.undefined)
    
    inline def setParameterValue(value: ParameterValue): Self = StObject.set(x, "ParameterValue", value.asInstanceOf[js.Any])
    
    inline def setParameterValueUndefined: Self = StObject.set(x, "ParameterValue", js.undefined)
    
    inline def setResolvedValue(value: ParameterValue): Self = StObject.set(x, "ResolvedValue", value.asInstanceOf[js.Any])
    
    inline def setResolvedValueUndefined: Self = StObject.set(x, "ResolvedValue", js.undefined)
    
    inline def setUsePreviousValue(value: UsePreviousValue): Self = StObject.set(x, "UsePreviousValue", value.asInstanceOf[js.Any])
    
    inline def setUsePreviousValueUndefined: Self = StObject.set(x, "UsePreviousValue", js.undefined)
  }
}
