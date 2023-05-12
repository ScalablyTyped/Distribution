package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateParticipantRoleConfigRequest extends StObject {
  
  /**
    * The Amazon Connect channel you want to configure.
    */
  var ChannelConfiguration: UpdateParticipantRoleConfigChannelInfo
  
  /**
    * The identifier of the contact in this instance of Amazon Connect. 
    */
  var ContactId: typings.awsSdk.clientsConnectMod.ContactId
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instance ID in the Amazon Resource Name (ARN) of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
}
object UpdateParticipantRoleConfigRequest {
  
  inline def apply(
    ChannelConfiguration: UpdateParticipantRoleConfigChannelInfo,
    ContactId: ContactId,
    InstanceId: InstanceId
  ): UpdateParticipantRoleConfigRequest = {
    val __obj = js.Dynamic.literal(ChannelConfiguration = ChannelConfiguration.asInstanceOf[js.Any], ContactId = ContactId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateParticipantRoleConfigRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateParticipantRoleConfigRequest] (val x: Self) extends AnyVal {
    
    inline def setChannelConfiguration(value: UpdateParticipantRoleConfigChannelInfo): Self = StObject.set(x, "ChannelConfiguration", value.asInstanceOf[js.Any])
    
    inline def setContactId(value: ContactId): Self = StObject.set(x, "ContactId", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
