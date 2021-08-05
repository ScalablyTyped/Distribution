package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelMembership extends StObject {
  
  /**
    * The ARN of the member's channel.
    */
  var ChannelArn: js.UndefOr[ChimeArn] = js.undefined
  
  /**
    * The time at which the channel membership was created. 
    */
  var CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The identifier of the member who invited another member. Taken from the message header.
    */
  var InvitedBy: js.UndefOr[Identity] = js.undefined
  
  /**
    * The time at which a channel membership was last updated.
    */
  var LastUpdatedTimestamp: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The data of the channel member.
    */
  var Member: js.UndefOr[Identity] = js.undefined
  
  /**
    * The membership type set for the channel member.
    */
  var Type: js.UndefOr[ChannelMembershipType] = js.undefined
}
object ChannelMembership {
  
  inline def apply(): ChannelMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelMembership]
  }
  
  extension [Self <: ChannelMembership](x: Self) {
    
    inline def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setChannelArnUndefined: Self = StObject.set(x, "ChannelArn", js.undefined)
    
    inline def setCreatedTimestamp(value: Timestamp): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setInvitedBy(value: Identity): Self = StObject.set(x, "InvitedBy", value.asInstanceOf[js.Any])
    
    inline def setInvitedByUndefined: Self = StObject.set(x, "InvitedBy", js.undefined)
    
    inline def setLastUpdatedTimestamp(value: Timestamp): Self = StObject.set(x, "LastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimestampUndefined: Self = StObject.set(x, "LastUpdatedTimestamp", js.undefined)
    
    inline def setMember(value: Identity): Self = StObject.set(x, "Member", value.asInstanceOf[js.Any])
    
    inline def setMemberUndefined: Self = StObject.set(x, "Member", js.undefined)
    
    inline def setType(value: ChannelMembershipType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
