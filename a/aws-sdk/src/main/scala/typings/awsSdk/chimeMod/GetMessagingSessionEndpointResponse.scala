package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMessagingSessionEndpointResponse extends js.Object {
  
  /**
    * The endpoint returned in the response.
    */
  var Endpoint: js.UndefOr[MessagingSessionEndpoint] = js.native
}
object GetMessagingSessionEndpointResponse {
  
  @scala.inline
  def apply(): GetMessagingSessionEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMessagingSessionEndpointResponse]
  }
  
  @scala.inline
  implicit class GetMessagingSessionEndpointResponseOps[Self <: GetMessagingSessionEndpointResponse] (val x: Self) extends AnyVal {
    
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
    def setEndpoint(value: MessagingSessionEndpoint): Self = this.set("Endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoint: Self = this.set("Endpoint", js.undefined)
  }
}
