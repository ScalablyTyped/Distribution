package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Endpoint extends js.Object {
  
  val agentLogin: String = js.native
  
  val endpointARN: String = js.native
  
  val endpointId: String = js.native
  
  val name: String = js.native
  
  val phoneNumber: String = js.native
  
  val queue: String = js.native
  
  val `type`: EndpointType = js.native
}
object Endpoint {
  
  @scala.inline
  def apply(
    agentLogin: String,
    endpointARN: String,
    endpointId: String,
    name: String,
    phoneNumber: String,
    queue: String,
    `type`: EndpointType
  ): Endpoint = {
    val __obj = js.Dynamic.literal(agentLogin = agentLogin.asInstanceOf[js.Any], endpointARN = endpointARN.asInstanceOf[js.Any], endpointId = endpointId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endpoint]
  }
  
  @scala.inline
  implicit class EndpointOps[Self <: Endpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAgentLogin(value: String): Self = this.set("agentLogin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointARN(value: String): Self = this.set("endpointARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointId(value: String): Self = this.set("endpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueue(value: String): Self = this.set("queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: EndpointType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
