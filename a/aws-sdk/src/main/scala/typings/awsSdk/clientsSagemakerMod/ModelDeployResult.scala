package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelDeployResult extends StObject {
  
  /**
    * The name of the endpoint to which the model has been deployed.  If model deployment fails, this field is omitted from the response. 
    */
  var EndpointName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.EndpointName] = js.undefined
}
object ModelDeployResult {
  
  inline def apply(): ModelDeployResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelDeployResult]
  }
  
  extension [Self <: ModelDeployResult](x: Self) {
    
    inline def setEndpointName(value: EndpointName): Self = StObject.set(x, "EndpointName", value.asInstanceOf[js.Any])
    
    inline def setEndpointNameUndefined: Self = StObject.set(x, "EndpointName", js.undefined)
  }
}
