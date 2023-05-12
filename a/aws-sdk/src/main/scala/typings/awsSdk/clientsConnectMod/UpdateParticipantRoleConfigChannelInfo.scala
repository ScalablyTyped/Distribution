package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateParticipantRoleConfigChannelInfo extends StObject {
  
  /**
    * Configuration information for the chat participant role.
    */
  var Chat: js.UndefOr[ChatParticipantRoleConfig] = js.undefined
}
object UpdateParticipantRoleConfigChannelInfo {
  
  inline def apply(): UpdateParticipantRoleConfigChannelInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateParticipantRoleConfigChannelInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateParticipantRoleConfigChannelInfo] (val x: Self) extends AnyVal {
    
    inline def setChat(value: ChatParticipantRoleConfig): Self = StObject.set(x, "Chat", value.asInstanceOf[js.Any])
    
    inline def setChatUndefined: Self = StObject.set(x, "Chat", js.undefined)
  }
}
