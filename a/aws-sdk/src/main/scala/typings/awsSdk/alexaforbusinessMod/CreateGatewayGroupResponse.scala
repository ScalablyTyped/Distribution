package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateGatewayGroupResponse extends js.Object {
  
  /**
    * The ARN of the created gateway group.
    */
  var GatewayGroupArn: js.UndefOr[Arn] = js.native
}
object CreateGatewayGroupResponse {
  
  @scala.inline
  def apply(): CreateGatewayGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGatewayGroupResponse]
  }
  
  @scala.inline
  implicit class CreateGatewayGroupResponseOps[Self <: CreateGatewayGroupResponse] (val x: Self) extends AnyVal {
    
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
    def setGatewayGroupArn(value: Arn): Self = this.set("GatewayGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayGroupArn: Self = this.set("GatewayGroupArn", js.undefined)
  }
}
