package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SsmParameterStoreParameter extends StObject {
  
  /**
    * Source server replication type.
    */
  var parameterName: SsmParameterStoreParameterName
  
  /**
    * Source server replication type.
    */
  var parameterType: SsmParameterStoreParameterType
}
object SsmParameterStoreParameter {
  
  inline def apply(parameterName: SsmParameterStoreParameterName, parameterType: SsmParameterStoreParameterType): SsmParameterStoreParameter = {
    val __obj = js.Dynamic.literal(parameterName = parameterName.asInstanceOf[js.Any], parameterType = parameterType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SsmParameterStoreParameter]
  }
  
  extension [Self <: SsmParameterStoreParameter](x: Self) {
    
    inline def setParameterName(value: SsmParameterStoreParameterName): Self = StObject.set(x, "parameterName", value.asInstanceOf[js.Any])
    
    inline def setParameterType(value: SsmParameterStoreParameterType): Self = StObject.set(x, "parameterType", value.asInstanceOf[js.Any])
  }
}
