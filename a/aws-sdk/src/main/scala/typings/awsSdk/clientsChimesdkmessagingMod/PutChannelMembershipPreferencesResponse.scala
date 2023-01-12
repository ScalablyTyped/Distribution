package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutChannelMembershipPreferencesResponse extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: js.UndefOr[ChimeArn] = js.undefined
  
  /**
    * The details of a user.
    */
  var Member: js.UndefOr[Identity] = js.undefined
  
  /**
    * The ARN and metadata of the member being added.
    */
  var Preferences: js.UndefOr[ChannelMembershipPreferences] = js.undefined
}
object PutChannelMembershipPreferencesResponse {
  
  inline def apply(): PutChannelMembershipPreferencesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutChannelMembershipPreferencesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutChannelMembershipPreferencesResponse] (val x: Self) extends AnyVal {
    
    inline def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setChannelArnUndefined: Self = StObject.set(x, "ChannelArn", js.undefined)
    
    inline def setMember(value: Identity): Self = StObject.set(x, "Member", value.asInstanceOf[js.Any])
    
    inline def setMemberUndefined: Self = StObject.set(x, "Member", js.undefined)
    
    inline def setPreferences(value: ChannelMembershipPreferences): Self = StObject.set(x, "Preferences", value.asInstanceOf[js.Any])
    
    inline def setPreferencesUndefined: Self = StObject.set(x, "Preferences", js.undefined)
  }
}
