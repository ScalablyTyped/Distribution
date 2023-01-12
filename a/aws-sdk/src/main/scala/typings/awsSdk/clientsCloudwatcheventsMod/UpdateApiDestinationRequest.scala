package typings.awsSdk.clientsCloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApiDestinationRequest extends StObject {
  
  /**
    * The ARN of the connection to use for the API destination.
    */
  var ConnectionArn: js.UndefOr[typings.awsSdk.clientsCloudwatcheventsMod.ConnectionArn] = js.undefined
  
  /**
    * The name of the API destination to update.
    */
  var Description: js.UndefOr[ApiDestinationDescription] = js.undefined
  
  /**
    * The method to use for the API destination.
    */
  var HttpMethod: js.UndefOr[ApiDestinationHttpMethod] = js.undefined
  
  /**
    * The URL to the endpoint to use for the API destination.
    */
  var InvocationEndpoint: js.UndefOr[HttpsEndpoint] = js.undefined
  
  /**
    * The maximum number of invocations per second to send to the API destination.
    */
  var InvocationRateLimitPerSecond: js.UndefOr[ApiDestinationInvocationRateLimitPerSecond] = js.undefined
  
  /**
    * The name of the API destination to update.
    */
  var Name: ApiDestinationName
}
object UpdateApiDestinationRequest {
  
  inline def apply(Name: ApiDestinationName): UpdateApiDestinationRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApiDestinationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateApiDestinationRequest] (val x: Self) extends AnyVal {
    
    inline def setConnectionArn(value: ConnectionArn): Self = StObject.set(x, "ConnectionArn", value.asInstanceOf[js.Any])
    
    inline def setConnectionArnUndefined: Self = StObject.set(x, "ConnectionArn", js.undefined)
    
    inline def setDescription(value: ApiDestinationDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setHttpMethod(value: ApiDestinationHttpMethod): Self = StObject.set(x, "HttpMethod", value.asInstanceOf[js.Any])
    
    inline def setHttpMethodUndefined: Self = StObject.set(x, "HttpMethod", js.undefined)
    
    inline def setInvocationEndpoint(value: HttpsEndpoint): Self = StObject.set(x, "InvocationEndpoint", value.asInstanceOf[js.Any])
    
    inline def setInvocationEndpointUndefined: Self = StObject.set(x, "InvocationEndpoint", js.undefined)
    
    inline def setInvocationRateLimitPerSecond(value: ApiDestinationInvocationRateLimitPerSecond): Self = StObject.set(x, "InvocationRateLimitPerSecond", value.asInstanceOf[js.Any])
    
    inline def setInvocationRateLimitPerSecondUndefined: Self = StObject.set(x, "InvocationRateLimitPerSecond", js.undefined)
    
    inline def setName(value: ApiDestinationName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
