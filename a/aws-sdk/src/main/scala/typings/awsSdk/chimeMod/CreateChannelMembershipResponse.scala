package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateChannelMembershipResponse extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: js.UndefOr[ChimeArn] = js.undefined
  
  /**
    * The ARN and metadata of the member being added.
    */
  var Member: js.UndefOr[Identity] = js.undefined
}
object CreateChannelMembershipResponse {
  
  @scala.inline
  def apply(): CreateChannelMembershipResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateChannelMembershipResponse]
  }
  
  @scala.inline
  implicit class CreateChannelMembershipResponseMutableBuilder[Self <: CreateChannelMembershipResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelArnUndefined: Self = StObject.set(x, "ChannelArn", js.undefined)
    
    @scala.inline
    def setMember(value: Identity): Self = StObject.set(x, "Member", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberUndefined: Self = StObject.set(x, "Member", js.undefined)
  }
}
