package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectorProvisioningConfig extends StObject {
  
  /**
    * Contains information about the configuration of the lambda which is being registered as the connector.
    */
  var lambda: js.UndefOr[LambdaConnectorProvisioningConfig] = js.undefined
}
object ConnectorProvisioningConfig {
  
  inline def apply(): ConnectorProvisioningConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorProvisioningConfig]
  }
  
  extension [Self <: ConnectorProvisioningConfig](x: Self) {
    
    inline def setLambda(value: LambdaConnectorProvisioningConfig): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
    
    inline def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
  }
}
