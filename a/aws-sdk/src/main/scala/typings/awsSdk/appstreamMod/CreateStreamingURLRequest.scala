package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStreamingURLRequest extends StObject {
  
  /**
    * The name of the application to launch after the session starts. This is the name that you specified as Name in the Image Assistant.
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
  
  @scala.inline
  def apply(FleetName: String, StackName: String, UserId: StreamingUrlUserId): CreateStreamingURLRequest = {
    val __obj = js.Dynamic.literal(FleetName = FleetName.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStreamingURLRequest]
  }
  
  @scala.inline
  implicit class CreateStreamingURLRequestMutableBuilder[Self <: CreateStreamingURLRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: String): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
    
    @scala.inline
    def setFleetName(value: String): Self = StObject.set(x, "FleetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionContext(value: String): Self = StObject.set(x, "SessionContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionContextUndefined: Self = StObject.set(x, "SessionContext", js.undefined)
    
    @scala.inline
    def setStackName(value: String): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: StreamingUrlUserId): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidity(value: Long): Self = StObject.set(x, "Validity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidityUndefined: Self = StObject.set(x, "Validity", js.undefined)
  }
}
