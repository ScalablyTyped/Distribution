package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeChannelModeratedByAppInstanceUserRequest extends js.Object {
  
  /**
    * The ARN of the app instance user in the moderated channel.
    */
  var AppInstanceUserArn: ChimeArn = js.native
  
  /**
    * The ARN of the moderated channel.
    */
  var ChannelArn: ChimeArn = js.native
}
object DescribeChannelModeratedByAppInstanceUserRequest {
  
  @scala.inline
  def apply(AppInstanceUserArn: ChimeArn, ChannelArn: ChimeArn): DescribeChannelModeratedByAppInstanceUserRequest = {
    val __obj = js.Dynamic.literal(AppInstanceUserArn = AppInstanceUserArn.asInstanceOf[js.Any], ChannelArn = ChannelArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeChannelModeratedByAppInstanceUserRequest]
  }
  
  @scala.inline
  implicit class DescribeChannelModeratedByAppInstanceUserRequestOps[Self <: DescribeChannelModeratedByAppInstanceUserRequest] (val x: Self) extends AnyVal {
    
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
    def setAppInstanceUserArn(value: ChimeArn): Self = this.set("AppInstanceUserArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelArn(value: ChimeArn): Self = this.set("ChannelArn", value.asInstanceOf[js.Any])
  }
}
