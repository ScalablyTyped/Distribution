package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaConnectorProvisioningConfig extends StObject {
  
  /**
    * Lambda ARN of the connector being registered.
    */
  var lambdaArn: ARN
}
object LambdaConnectorProvisioningConfig {
  
  inline def apply(lambdaArn: ARN): LambdaConnectorProvisioningConfig = {
    val __obj = js.Dynamic.literal(lambdaArn = lambdaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaConnectorProvisioningConfig]
  }
  
  extension [Self <: LambdaConnectorProvisioningConfig](x: Self) {
    
    inline def setLambdaArn(value: ARN): Self = StObject.set(x, "lambdaArn", value.asInstanceOf[js.Any])
  }
}
