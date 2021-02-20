package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelMembership extends StObject {
  
  /**
    * The ARN of the member's channel.
    */
  var ChannelArn: js.UndefOr[ChimeArn] = js.native
  
  /**
    * The time at which the channel membership was created. 
    */
  var CreatedTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * The identifier of the member who invited another member. Taken from the message header.
    */
  var InvitedBy: js.UndefOr[Identity] = js.native
  
  /**
    * The time at which a channel membership was last updated.
    */
  var LastUpdatedTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * The data of the channel member.
    */
  var Member: js.UndefOr[Identity] = js.native
  
  /**
    * The membership type set for the channel member.
    */
  var Type: js.UndefOr[ChannelMembershipType] = js.native
}
object ChannelMembership {
  
  @scala.inline
  def apply(): ChannelMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelMembership]
  }
  
  @scala.inline
  implicit class ChannelMembershipMutableBuilder[Self <: ChannelMembership] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelArnUndefined: Self = StObject.set(x, "ChannelArn", js.undefined)
    
    @scala.inline
    def setCreatedTimestamp(value: Timestamp): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    @scala.inline
    def setInvitedBy(value: Identity): Self = StObject.set(x, "InvitedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitedByUndefined: Self = StObject.set(x, "InvitedBy", js.undefined)
    
    @scala.inline
    def setLastUpdatedTimestamp(value: Timestamp): Self = StObject.set(x, "LastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimestampUndefined: Self = StObject.set(x, "LastUpdatedTimestamp", js.undefined)
    
    @scala.inline
    def setMember(value: Identity): Self = StObject.set(x, "Member", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberUndefined: Self = StObject.set(x, "Member", js.undefined)
    
    @scala.inline
    def setType(value: ChannelMembershipType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
