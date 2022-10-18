package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PoolInformation extends StObject {
  
  /**
    * The time when the pool was created, in UNIX epoch time format.
    */
  var CreatedTimestamp: js.Date
  
  /**
    * When set to true the pool can't be deleted.
    */
  var DeletionProtectionEnabled: PrimitiveBoolean
  
  /**
    * The type of message. Valid values are TRANSACTIONAL for messages that are critical or time-sensitive and PROMOTIONAL for messages that aren't critical or time-sensitive.
    */
  var MessageType: typings.awsSdk.clientsPinpointsmsvoicev2Mod.MessageType
  
  /**
    * The name of the OptOutList associated with the pool.
    */
  var OptOutListName: typings.awsSdk.clientsPinpointsmsvoicev2Mod.OptOutListName
  
  /**
    * The Amazon Resource Name (ARN) for the pool.
    */
  var PoolArn: String
  
  /**
    * The unique identifier for the pool.
    */
  var PoolId: String
  
  /**
    * When set to false, an end recipient sends a message that begins with HELP or STOP to one of your dedicated numbers, Amazon Pinpoint automatically replies with a customizable message and adds the end recipient to the OptOutList. When set to true you're responsible for responding to HELP and STOP requests. You're also responsible for tracking and honoring opt-out requests. For more information see Self-managed opt-outs 
    */
  var SelfManagedOptOutsEnabled: PrimitiveBoolean
  
  /**
    * Allows you to enable shared routes on your pool. By default, this is set to False. If you set this value to True, your messages are sent using phone numbers or sender IDs (depending on the country) that are shared with other Amazon Pinpoint users. In some countries, such as the United States, senders aren't allowed to use shared routes and must use a dedicated phone number or short code.
    */
  var SharedRoutesEnabled: PrimitiveBoolean
  
  /**
    * The current status of the pool.
    */
  var Status: PoolStatus
  
  /**
    * The Amazon Resource Name (ARN) of the two way channel.
    */
  var TwoWayChannelArn: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.TwoWayChannelArn] = js.undefined
  
  /**
    * When set to true you can receive incoming text messages from your end recipients using the TwoWayChannelArn.
    */
  var TwoWayEnabled: PrimitiveBoolean
}
object PoolInformation {
  
  inline def apply(
    CreatedTimestamp: js.Date,
    DeletionProtectionEnabled: PrimitiveBoolean,
    MessageType: MessageType,
    OptOutListName: OptOutListName,
    PoolArn: String,
    PoolId: String,
    SelfManagedOptOutsEnabled: PrimitiveBoolean,
    SharedRoutesEnabled: PrimitiveBoolean,
    Status: PoolStatus,
    TwoWayEnabled: PrimitiveBoolean
  ): PoolInformation = {
    val __obj = js.Dynamic.literal(CreatedTimestamp = CreatedTimestamp.asInstanceOf[js.Any], DeletionProtectionEnabled = DeletionProtectionEnabled.asInstanceOf[js.Any], MessageType = MessageType.asInstanceOf[js.Any], OptOutListName = OptOutListName.asInstanceOf[js.Any], PoolArn = PoolArn.asInstanceOf[js.Any], PoolId = PoolId.asInstanceOf[js.Any], SelfManagedOptOutsEnabled = SelfManagedOptOutsEnabled.asInstanceOf[js.Any], SharedRoutesEnabled = SharedRoutesEnabled.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], TwoWayEnabled = TwoWayEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PoolInformation]
  }
  
  extension [Self <: PoolInformation](x: Self) {
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setDeletionProtectionEnabled(value: PrimitiveBoolean): Self = StObject.set(x, "DeletionProtectionEnabled", value.asInstanceOf[js.Any])
    
    inline def setMessageType(value: MessageType): Self = StObject.set(x, "MessageType", value.asInstanceOf[js.Any])
    
    inline def setOptOutListName(value: OptOutListName): Self = StObject.set(x, "OptOutListName", value.asInstanceOf[js.Any])
    
    inline def setPoolArn(value: String): Self = StObject.set(x, "PoolArn", value.asInstanceOf[js.Any])
    
    inline def setPoolId(value: String): Self = StObject.set(x, "PoolId", value.asInstanceOf[js.Any])
    
    inline def setSelfManagedOptOutsEnabled(value: PrimitiveBoolean): Self = StObject.set(x, "SelfManagedOptOutsEnabled", value.asInstanceOf[js.Any])
    
    inline def setSharedRoutesEnabled(value: PrimitiveBoolean): Self = StObject.set(x, "SharedRoutesEnabled", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: PoolStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setTwoWayChannelArn(value: TwoWayChannelArn): Self = StObject.set(x, "TwoWayChannelArn", value.asInstanceOf[js.Any])
    
    inline def setTwoWayChannelArnUndefined: Self = StObject.set(x, "TwoWayChannelArn", js.undefined)
    
    inline def setTwoWayEnabled(value: PrimitiveBoolean): Self = StObject.set(x, "TwoWayEnabled", value.asInstanceOf[js.Any])
  }
}
