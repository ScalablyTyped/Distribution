package typings.awsSdk.chimesdkmessagingMod

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
  
  /**
    * The ID of the SubChannel in the response.
    */
  var SubChannelId: js.UndefOr[typings.awsSdk.chimesdkmessagingMod.SubChannelId] = js.undefined
}
object CreateChannelMembershipResponse {
  
  inline def apply(): CreateChannelMembershipResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateChannelMembershipResponse]
  }
  
  extension [Self <: CreateChannelMembershipResponse](x: Self) {
    
    inline def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setChannelArnUndefined: Self = StObject.set(x, "ChannelArn", js.undefined)
    
    inline def setMember(value: Identity): Self = StObject.set(x, "Member", value.asInstanceOf[js.Any])
    
    inline def setMemberUndefined: Self = StObject.set(x, "Member", js.undefined)
    
    inline def setSubChannelId(value: SubChannelId): Self = StObject.set(x, "SubChannelId", value.asInstanceOf[js.Any])
    
    inline def setSubChannelIdUndefined: Self = StObject.set(x, "SubChannelId", js.undefined)
  }
}
