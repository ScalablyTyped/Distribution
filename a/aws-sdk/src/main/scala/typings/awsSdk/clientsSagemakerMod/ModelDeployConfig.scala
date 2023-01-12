package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelDeployConfig extends StObject {
  
  /**
    * Set to True to automatically generate an endpoint name for a one-click Autopilot model deployment; set to False otherwise. The default value is False.  If you set AutoGenerateEndpointName to True, do not specify the EndpointName; otherwise a 400 error is thrown. 
    */
  var AutoGenerateEndpointName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.AutoGenerateEndpointName] = js.undefined
  
  /**
    * Specifies the endpoint name to use for a one-click Autopilot model deployment if the endpoint name is not generated automatically.  Specify the EndpointName if and only if you set AutoGenerateEndpointName to False; otherwise a 400 error is thrown. 
    */
  var EndpointName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.EndpointName] = js.undefined
}
object ModelDeployConfig {
  
  inline def apply(): ModelDeployConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelDeployConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModelDeployConfig] (val x: Self) extends AnyVal {
    
    inline def setAutoGenerateEndpointName(value: AutoGenerateEndpointName): Self = StObject.set(x, "AutoGenerateEndpointName", value.asInstanceOf[js.Any])
    
    inline def setAutoGenerateEndpointNameUndefined: Self = StObject.set(x, "AutoGenerateEndpointName", js.undefined)
    
    inline def setEndpointName(value: EndpointName): Self = StObject.set(x, "EndpointName", value.asInstanceOf[js.Any])
    
    inline def setEndpointNameUndefined: Self = StObject.set(x, "EndpointName", js.undefined)
  }
}
