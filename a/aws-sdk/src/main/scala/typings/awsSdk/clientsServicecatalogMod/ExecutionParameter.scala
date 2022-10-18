package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionParameter extends StObject {
  
  /**
    * The default values for the execution parameter.
    */
  var DefaultValues: js.UndefOr[ExecutionParameterValueList] = js.undefined
  
  /**
    * The name of the execution parameter.
    */
  var Name: js.UndefOr[ExecutionParameterKey] = js.undefined
  
  /**
    * The execution parameter type.
    */
  var Type: js.UndefOr[ExecutionParameterType] = js.undefined
}
object ExecutionParameter {
  
  inline def apply(): ExecutionParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionParameter]
  }
  
  extension [Self <: ExecutionParameter](x: Self) {
    
    inline def setDefaultValues(value: ExecutionParameterValueList): Self = StObject.set(x, "DefaultValues", value.asInstanceOf[js.Any])
    
    inline def setDefaultValuesUndefined: Self = StObject.set(x, "DefaultValues", js.undefined)
    
    inline def setDefaultValuesVarargs(value: ExecutionParameterValue*): Self = StObject.set(x, "DefaultValues", js.Array(value*))
    
    inline def setName(value: ExecutionParameterKey): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setType(value: ExecutionParameterType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
