package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SsmParameterStoreParameter extends StObject {
  
  /**
    * AWS Systems Manager Parameter Store parameter name.
    */
  var parameterName: SsmParameterStoreParameterName
  
  /**
    * AWS Systems Manager Parameter Store parameter type.
    */
  var parameterType: SsmParameterStoreParameterType
}
object SsmParameterStoreParameter {
  
  inline def apply(parameterName: SsmParameterStoreParameterName, parameterType: SsmParameterStoreParameterType): SsmParameterStoreParameter = {
    val __obj = js.Dynamic.literal(parameterName = parameterName.asInstanceOf[js.Any], parameterType = parameterType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SsmParameterStoreParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SsmParameterStoreParameter] (val x: Self) extends AnyVal {
    
    inline def setParameterName(value: SsmParameterStoreParameterName): Self = StObject.set(x, "parameterName", value.asInstanceOf[js.Any])
    
    inline def setParameterType(value: SsmParameterStoreParameterType): Self = StObject.set(x, "parameterType", value.asInstanceOf[js.Any])
  }
}
