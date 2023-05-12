package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomActionSetParametersOperation extends StObject {
  
  /**
    * The parameter that determines the value configuration.
    */
  var ParameterValueConfigurations: SetParameterValueConfigurationList
}
object CustomActionSetParametersOperation {
  
  inline def apply(ParameterValueConfigurations: SetParameterValueConfigurationList): CustomActionSetParametersOperation = {
    val __obj = js.Dynamic.literal(ParameterValueConfigurations = ParameterValueConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomActionSetParametersOperation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomActionSetParametersOperation] (val x: Self) extends AnyVal {
    
    inline def setParameterValueConfigurations(value: SetParameterValueConfigurationList): Self = StObject.set(x, "ParameterValueConfigurations", value.asInstanceOf[js.Any])
    
    inline def setParameterValueConfigurationsVarargs(value: SetParameterValueConfiguration*): Self = StObject.set(x, "ParameterValueConfigurations", js.Array(value*))
  }
}
