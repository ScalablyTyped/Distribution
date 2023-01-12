package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApiDestinationRequest extends StObject {
  
  /**
    * The ARN of the connection to use for the API destination. The destination endpoint must support the authorization type specified for the connection.
    */
  var ConnectionArn: typings.awsSdk.clientsEventbridgeMod.ConnectionArn
  
  /**
    * A description for the API destination to create.
    */
  var Description: js.UndefOr[ApiDestinationDescription] = js.undefined
  
  /**
    * The method to use for the request to the HTTP invocation endpoint.
    */
  var HttpMethod: ApiDestinationHttpMethod
  
  /**
    * The URL to the HTTP invocation endpoint for the API destination.
    */
  var InvocationEndpoint: HttpsEndpoint
  
  /**
    * The maximum number of requests per second to send to the HTTP invocation endpoint.
    */
  var InvocationRateLimitPerSecond: js.UndefOr[ApiDestinationInvocationRateLimitPerSecond] = js.undefined
  
  /**
    * The name for the API destination to create.
    */
  var Name: ApiDestinationName
}
object CreateApiDestinationRequest {
  
  inline def apply(
    ConnectionArn: ConnectionArn,
    HttpMethod: ApiDestinationHttpMethod,
    InvocationEndpoint: HttpsEndpoint,
    Name: ApiDestinationName
  ): CreateApiDestinationRequest = {
    val __obj = js.Dynamic.literal(ConnectionArn = ConnectionArn.asInstanceOf[js.Any], HttpMethod = HttpMethod.asInstanceOf[js.Any], InvocationEndpoint = InvocationEndpoint.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApiDestinationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateApiDestinationRequest] (val x: Self) extends AnyVal {
    
    inline def setConnectionArn(value: ConnectionArn): Self = StObject.set(x, "ConnectionArn", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: ApiDestinationDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setHttpMethod(value: ApiDestinationHttpMethod): Self = StObject.set(x, "HttpMethod", value.asInstanceOf[js.Any])
    
    inline def setInvocationEndpoint(value: HttpsEndpoint): Self = StObject.set(x, "InvocationEndpoint", value.asInstanceOf[js.Any])
    
    inline def setInvocationRateLimitPerSecond(value: ApiDestinationInvocationRateLimitPerSecond): Self = StObject.set(x, "InvocationRateLimitPerSecond", value.asInstanceOf[js.Any])
    
    inline def setInvocationRateLimitPerSecondUndefined: Self = StObject.set(x, "InvocationRateLimitPerSecond", js.undefined)
    
    inline def setName(value: ApiDestinationName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
