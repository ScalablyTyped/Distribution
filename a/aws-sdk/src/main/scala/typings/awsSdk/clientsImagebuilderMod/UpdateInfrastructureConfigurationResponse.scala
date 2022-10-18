package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateInfrastructureConfigurationResponse extends StObject {
  
  /**
    * The idempotency token used to make this request idempotent.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the infrastructure configuration that was updated by this request.
    */
  var infrastructureConfigurationArn: js.UndefOr[InfrastructureConfigurationArn] = js.undefined
  
  /**
    * The request ID that uniquely identifies this request.
    */
  var requestId: js.UndefOr[NonEmptyString] = js.undefined
}
object UpdateInfrastructureConfigurationResponse {
  
  inline def apply(): UpdateInfrastructureConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateInfrastructureConfigurationResponse]
  }
  
  extension [Self <: UpdateInfrastructureConfigurationResponse](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setInfrastructureConfigurationArn(value: InfrastructureConfigurationArn): Self = StObject.set(x, "infrastructureConfigurationArn", value.asInstanceOf[js.Any])
    
    inline def setInfrastructureConfigurationArnUndefined: Self = StObject.set(x, "infrastructureConfigurationArn", js.undefined)
    
    inline def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
