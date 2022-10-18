package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteExternalModelRequest extends StObject {
  
  /**
    * The endpoint of the Amazon Sagemaker model to delete.
    */
  var modelEndpoint: sageMakerEndpointIdentifier
}
object DeleteExternalModelRequest {
  
  inline def apply(modelEndpoint: sageMakerEndpointIdentifier): DeleteExternalModelRequest = {
    val __obj = js.Dynamic.literal(modelEndpoint = modelEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteExternalModelRequest]
  }
  
  extension [Self <: DeleteExternalModelRequest](x: Self) {
    
    inline def setModelEndpoint(value: sageMakerEndpointIdentifier): Self = StObject.set(x, "modelEndpoint", value.asInstanceOf[js.Any])
  }
}
