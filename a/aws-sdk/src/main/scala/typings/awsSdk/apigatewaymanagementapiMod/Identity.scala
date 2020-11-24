package typings.awsSdk.apigatewaymanagementapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Identity extends js.Object {
  
  /**
    * The source IP address of the TCP connection making the request to API Gateway.
    */
  var SourceIp: string = js.native
  
  /**
    * The User Agent of the API caller.
    */
  var UserAgent: string = js.native
}
object Identity {
  
  @scala.inline
  def apply(SourceIp: string, UserAgent: string): Identity = {
    val __obj = js.Dynamic.literal(SourceIp = SourceIp.asInstanceOf[js.Any], UserAgent = UserAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identity]
  }
  
  @scala.inline
  implicit class IdentityOps[Self <: Identity] (val x: Self) extends AnyVal {
    
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
    def setSourceIp(value: string): Self = this.set("SourceIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAgent(value: string): Self = this.set("UserAgent", value.asInstanceOf[js.Any])
  }
}
