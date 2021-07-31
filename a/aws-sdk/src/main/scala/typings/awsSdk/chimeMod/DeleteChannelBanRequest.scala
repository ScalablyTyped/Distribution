package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteChannelBanRequest extends StObject {
  
  /**
    * The ARN of the channel from which the app instance user was banned.
    */
  var ChannelArn: ChimeArn
  
  /**
    * The ARN of the app instance user that you want to reinstate.
    */
  var MemberArn: ChimeArn
}
object DeleteChannelBanRequest {
  
  @scala.inline
  def apply(ChannelArn: ChimeArn, MemberArn: ChimeArn): DeleteChannelBanRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any], MemberArn = MemberArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteChannelBanRequest]
  }
  
  @scala.inline
  implicit class DeleteChannelBanRequestMutableBuilder[Self <: DeleteChannelBanRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberArn(value: ChimeArn): Self = StObject.set(x, "MemberArn", value.asInstanceOf[js.Any])
  }
}
