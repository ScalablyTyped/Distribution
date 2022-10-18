package typings.awsSdk.clientsCloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiDestination extends StObject {
  
  /**
    * The ARN of the API destination.
    */
  var ApiDestinationArn: js.UndefOr[typings.awsSdk.clientsCloudwatcheventsMod.ApiDestinationArn] = js.undefined
  
  /**
    * The state of the API destination.
    */
  var ApiDestinationState: js.UndefOr[typings.awsSdk.clientsCloudwatcheventsMod.ApiDestinationState] = js.undefined
  
  /**
    * The ARN of the connection specified for the API destination.
    */
  var ConnectionArn: js.UndefOr[typings.awsSdk.clientsCloudwatcheventsMod.ConnectionArn] = js.undefined
  
  /**
    * A time stamp for the time that the API destination was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The method to use to connect to the HTTP endpoint.
    */
  var HttpMethod: js.UndefOr[ApiDestinationHttpMethod] = js.undefined
  
  /**
    * The URL to the endpoint for the API destination.
    */
  var InvocationEndpoint: js.UndefOr[HttpsEndpoint] = js.undefined
  
  /**
    * The maximum number of invocations per second to send to the HTTP endpoint.
    */
  var InvocationRateLimitPerSecond: js.UndefOr[ApiDestinationInvocationRateLimitPerSecond] = js.undefined
  
  /**
    * A time stamp for the time that the API destination was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the API destination.
    */
  var Name: js.UndefOr[ApiDestinationName] = js.undefined
}
object ApiDestination {
  
  inline def apply(): ApiDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiDestination]
  }
  
  extension [Self <: ApiDestination](x: Self) {
    
    inline def setApiDestinationArn(value: ApiDestinationArn): Self = StObject.set(x, "ApiDestinationArn", value.asInstanceOf[js.Any])
    
    inline def setApiDestinationArnUndefined: Self = StObject.set(x, "ApiDestinationArn", js.undefined)
    
    inline def setApiDestinationState(value: ApiDestinationState): Self = StObject.set(x, "ApiDestinationState", value.asInstanceOf[js.Any])
    
    inline def setApiDestinationStateUndefined: Self = StObject.set(x, "ApiDestinationState", js.undefined)
    
    inline def setConnectionArn(value: ConnectionArn): Self = StObject.set(x, "ConnectionArn", value.asInstanceOf[js.Any])
    
    inline def setConnectionArnUndefined: Self = StObject.set(x, "ConnectionArn", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setHttpMethod(value: ApiDestinationHttpMethod): Self = StObject.set(x, "HttpMethod", value.asInstanceOf[js.Any])
    
    inline def setHttpMethodUndefined: Self = StObject.set(x, "HttpMethod", js.undefined)
    
    inline def setInvocationEndpoint(value: HttpsEndpoint): Self = StObject.set(x, "InvocationEndpoint", value.asInstanceOf[js.Any])
    
    inline def setInvocationEndpointUndefined: Self = StObject.set(x, "InvocationEndpoint", js.undefined)
    
    inline def setInvocationRateLimitPerSecond(value: ApiDestinationInvocationRateLimitPerSecond): Self = StObject.set(x, "InvocationRateLimitPerSecond", value.asInstanceOf[js.Any])
    
    inline def setInvocationRateLimitPerSecondUndefined: Self = StObject.set(x, "InvocationRateLimitPerSecond", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setName(value: ApiDestinationName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
