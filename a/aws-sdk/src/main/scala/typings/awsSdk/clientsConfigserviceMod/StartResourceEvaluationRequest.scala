package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartResourceEvaluationRequest extends StObject {
  
  /**
    * A client token is a unique, case-sensitive string of up to 64 ASCII characters. To make an idempotent API request using one of these actions, specify a client token in the request.  Avoid reusing the same client token for other API requests. If you retry a request that completed successfully using the same client token and the same parameters, the retry succeeds without performing any further actions. If you retry a successful request using the same client token, but one or more of the parameters are different, other than the Region or Availability Zone, the retry fails with an IdempotentParameterMismatch error. 
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.ClientToken] = js.undefined
  
  /**
    * Returns an EvaluationContext object.
    */
  var EvaluationContext: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.EvaluationContext] = js.undefined
  
  /**
    * The mode of an evaluation. The valid values for this API are DETECTIVE and PROACTIVE.
    */
  var EvaluationMode: typings.awsSdk.clientsConfigserviceMod.EvaluationMode
  
  /**
    * The timeout for an evaluation. The default is 900 seconds. You cannot specify a number greater than 3600. If you specify 0, Config uses the default.
    */
  var EvaluationTimeout: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.EvaluationTimeout] = js.undefined
  
  /**
    * Returns a ResourceDetails object.
    */
  var ResourceDetails: typings.awsSdk.clientsConfigserviceMod.ResourceDetails
}
object StartResourceEvaluationRequest {
  
  inline def apply(EvaluationMode: EvaluationMode, ResourceDetails: ResourceDetails): StartResourceEvaluationRequest = {
    val __obj = js.Dynamic.literal(EvaluationMode = EvaluationMode.asInstanceOf[js.Any], ResourceDetails = ResourceDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartResourceEvaluationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartResourceEvaluationRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setEvaluationContext(value: EvaluationContext): Self = StObject.set(x, "EvaluationContext", value.asInstanceOf[js.Any])
    
    inline def setEvaluationContextUndefined: Self = StObject.set(x, "EvaluationContext", js.undefined)
    
    inline def setEvaluationMode(value: EvaluationMode): Self = StObject.set(x, "EvaluationMode", value.asInstanceOf[js.Any])
    
    inline def setEvaluationTimeout(value: EvaluationTimeout): Self = StObject.set(x, "EvaluationTimeout", value.asInstanceOf[js.Any])
    
    inline def setEvaluationTimeoutUndefined: Self = StObject.set(x, "EvaluationTimeout", js.undefined)
    
    inline def setResourceDetails(value: ResourceDetails): Self = StObject.set(x, "ResourceDetails", value.asInstanceOf[js.Any])
  }
}
