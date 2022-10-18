package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStreamingURLRequest extends StObject {
  
  /**
    * The name of the application to launch after the session starts. This is the name that you specified as Name in the Image Assistant. If your fleet is enabled for the Desktop stream view, you can also choose to launch directly to the operating system desktop. To do so, specify Desktop.
    */
  var ApplicationId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the fleet.
    */
  var FleetName: String
  
  /**
    * The session context. For more information, see Session Context in the Amazon AppStream 2.0 Administration Guide.
    */
  var SessionContext: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the stack.
    */
  var StackName: String
  
  /**
    * The identifier of the user.
    */
  var UserId: StreamingUrlUserId
  
  /**
    * The time that the streaming URL will be valid, in seconds. Specify a value between 1 and 604800 seconds. The default is 60 seconds.
    */
  var Validity: js.UndefOr[Long] = js.undefined
}
object CreateStreamingURLRequest {
  
  inline def apply(FleetName: String, StackName: String, UserId: StreamingUrlUserId): CreateStreamingURLRequest = {
    val __obj = js.Dynamic.literal(FleetName = FleetName.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStreamingURLRequest]
  }
  
  extension [Self <: CreateStreamingURLRequest](x: Self) {
    
    inline def setApplicationId(value: String): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
    
    inline def setFleetName(value: String): Self = StObject.set(x, "FleetName", value.asInstanceOf[js.Any])
    
    inline def setSessionContext(value: String): Self = StObject.set(x, "SessionContext", value.asInstanceOf[js.Any])
    
    inline def setSessionContextUndefined: Self = StObject.set(x, "SessionContext", js.undefined)
    
    inline def setStackName(value: String): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: StreamingUrlUserId): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    inline def setValidity(value: Long): Self = StObject.set(x, "Validity", value.asInstanceOf[js.Any])
    
    inline def setValidityUndefined: Self = StObject.set(x, "Validity", js.undefined)
  }
}
