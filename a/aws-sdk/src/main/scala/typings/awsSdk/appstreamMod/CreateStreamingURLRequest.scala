package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateStreamingURLRequest extends js.Object {
  
  /**
    * The name of the application to launch after the session starts. This is the name that you specified as Name in the Image Assistant.
    */
  var ApplicationId: js.UndefOr[String] = js.native
  
  /**
    * The name of the fleet.
    */
  var FleetName: String = js.native
  
  /**
    * The session context. For more information, see Session Context in the Amazon AppStream 2.0 Administration Guide.
    */
  var SessionContext: js.UndefOr[String] = js.native
  
  /**
    * The name of the stack.
    */
  var StackName: String = js.native
  
  /**
    * The identifier of the user.
    */
  var UserId: StreamingUrlUserId = js.native
  
  /**
    * The time that the streaming URL will be valid, in seconds. Specify a value between 1 and 604800 seconds. The default is 60 seconds.
    */
  var Validity: js.UndefOr[Long] = js.native
}
object CreateStreamingURLRequest {
  
  @scala.inline
  def apply(FleetName: String, StackName: String, UserId: StreamingUrlUserId): CreateStreamingURLRequest = {
    val __obj = js.Dynamic.literal(FleetName = FleetName.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStreamingURLRequest]
  }
  
  @scala.inline
  implicit class CreateStreamingURLRequestOps[Self <: CreateStreamingURLRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFleetName(value: String): Self = this.set("FleetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackName(value: String): Self = this.set("StackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: StreamingUrlUserId): Self = this.set("UserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationId(value: String): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationId: Self = this.set("ApplicationId", js.undefined)
    
    @scala.inline
    def setSessionContext(value: String): Self = this.set("SessionContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionContext: Self = this.set("SessionContext", js.undefined)
    
    @scala.inline
    def setValidity(value: Long): Self = this.set("Validity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidity: Self = this.set("Validity", js.undefined)
  }
}
