package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutChannelMembershipPreferencesRequest extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: ChimeArn
  
  /**
    * The AppInstanceUserARN of the user making the API call.
    */
  var ChimeBearer: ChimeArn
  
  /**
    * The AppInstanceUserArn of the member setting the preferences.
    */
  var MemberArn: ChimeArn
  
  /**
    * The channel membership preferences of an AppInstanceUser .
    */
  var Preferences: ChannelMembershipPreferences
}
object PutChannelMembershipPreferencesRequest {
  
  inline def apply(
    ChannelArn: ChimeArn,
    ChimeBearer: ChimeArn,
    MemberArn: ChimeArn,
    Preferences: ChannelMembershipPreferences
  ): PutChannelMembershipPreferencesRequest = {
    val __obj = js.Dynamic.literal(ChannelArn = ChannelArn.asInstanceOf[js.Any], ChimeBearer = ChimeBearer.asInstanceOf[js.Any], MemberArn = MemberArn.asInstanceOf[js.Any], Preferences = Preferences.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutChannelMembershipPreferencesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutChannelMembershipPreferencesRequest] (val x: Self) extends AnyVal {
    
    inline def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setChimeBearer(value: ChimeArn): Self = StObject.set(x, "ChimeBearer", value.asInstanceOf[js.Any])
    
    inline def setMemberArn(value: ChimeArn): Self = StObject.set(x, "MemberArn", value.asInstanceOf[js.Any])
    
    inline def setPreferences(value: ChannelMembershipPreferences): Self = StObject.set(x, "Preferences", value.asInstanceOf[js.Any])
  }
}
