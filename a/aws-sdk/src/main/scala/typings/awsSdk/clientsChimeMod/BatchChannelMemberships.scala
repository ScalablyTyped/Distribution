package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchChannelMemberships extends StObject {
  
  /**
    * The ARN of the channel to which you're adding users.
    */
  var ChannelArn: js.UndefOr[ChimeArn] = js.undefined
  
  /**
    * The identifier of the member who invited another member.
    */
  var InvitedBy: js.UndefOr[Identity] = js.undefined
  
  /**
    * The users successfully added to the request.
    */
  var Members: js.UndefOr[typings.awsSdk.clientsChimeMod.Members] = js.undefined
  
  /**
    * The membership types set for the channel users.
    */
  var Type: js.UndefOr[ChannelMembershipType] = js.undefined
}
object BatchChannelMemberships {
  
  inline def apply(): BatchChannelMemberships = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchChannelMemberships]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchChannelMemberships] (val x: Self) extends AnyVal {
    
    inline def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setChannelArnUndefined: Self = StObject.set(x, "ChannelArn", js.undefined)
    
    inline def setInvitedBy(value: Identity): Self = StObject.set(x, "InvitedBy", value.asInstanceOf[js.Any])
    
    inline def setInvitedByUndefined: Self = StObject.set(x, "InvitedBy", js.undefined)
    
    inline def setMembers(value: Members): Self = StObject.set(x, "Members", value.asInstanceOf[js.Any])
    
    inline def setMembersUndefined: Self = StObject.set(x, "Members", js.undefined)
    
    inline def setMembersVarargs(value: Identity*): Self = StObject.set(x, "Members", js.Array(value*))
    
    inline def setType(value: ChannelMembershipType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
