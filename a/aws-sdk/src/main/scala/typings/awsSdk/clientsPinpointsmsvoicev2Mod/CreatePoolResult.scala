package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePoolResult extends StObject {
  
  /**
    * The time when the pool was created, in UNIX epoch time format.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * When set to true deletion protection is enabled. By default this is set to false. 
    */
  var DeletionProtectionEnabled: js.UndefOr[PrimitiveBoolean] = js.undefined
  
  /**
    * The type of message for the pool to use.
    */
  var MessageType: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.MessageType] = js.undefined
  
  /**
    * The name of the OptOutList associated with the pool.
    */
  var OptOutListName: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.OptOutListName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the pool.
    */
  var PoolArn: js.UndefOr[String] = js.undefined
  
  /**
    * The unique identifier for the pool.
    */
  var PoolId: js.UndefOr[String] = js.undefined
  
  /**
    * By default this is set to false. When an end recipient sends a message that begins with HELP or STOP to one of your dedicated numbers, Amazon Pinpoint automatically replies with a customizable message and adds the end recipient to the OptOutList. When set to true you're responsible for responding to HELP and STOP requests. You're also responsible for tracking and honoring opt-out requests.
    */
  var SelfManagedOptOutsEnabled: js.UndefOr[PrimitiveBoolean] = js.undefined
  
  /**
    * Indicates whether shared routes are enabled for the pool.
    */
  var SharedRoutesEnabled: js.UndefOr[PrimitiveBoolean] = js.undefined
  
  /**
    * The current status of the pool.   CREATING: The pool is currently being created and isn't yet available for use.   ACTIVE: The pool is active and available for use.   DELETING: The pool is being deleted.  
    */
  var Status: js.UndefOr[PoolStatus] = js.undefined
  
  /**
    * An array of tags (key and value pairs) associated with the pool.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the two way channel.
    */
  var TwoWayChannelArn: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.TwoWayChannelArn] = js.undefined
  
  /**
    * By default this is set to false. When set to true you can receive incoming text messages from your end recipients.
    */
  var TwoWayEnabled: js.UndefOr[PrimitiveBoolean] = js.undefined
}
object CreatePoolResult {
  
  inline def apply(): CreatePoolResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePoolResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreatePoolResult] (val x: Self) extends AnyVal {
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setDeletionProtectionEnabled(value: PrimitiveBoolean): Self = StObject.set(x, "DeletionProtectionEnabled", value.asInstanceOf[js.Any])
    
    inline def setDeletionProtectionEnabledUndefined: Self = StObject.set(x, "DeletionProtectionEnabled", js.undefined)
    
    inline def setMessageType(value: MessageType): Self = StObject.set(x, "MessageType", value.asInstanceOf[js.Any])
    
    inline def setMessageTypeUndefined: Self = StObject.set(x, "MessageType", js.undefined)
    
    inline def setOptOutListName(value: OptOutListName): Self = StObject.set(x, "OptOutListName", value.asInstanceOf[js.Any])
    
    inline def setOptOutListNameUndefined: Self = StObject.set(x, "OptOutListName", js.undefined)
    
    inline def setPoolArn(value: String): Self = StObject.set(x, "PoolArn", value.asInstanceOf[js.Any])
    
    inline def setPoolArnUndefined: Self = StObject.set(x, "PoolArn", js.undefined)
    
    inline def setPoolId(value: String): Self = StObject.set(x, "PoolId", value.asInstanceOf[js.Any])
    
    inline def setPoolIdUndefined: Self = StObject.set(x, "PoolId", js.undefined)
    
    inline def setSelfManagedOptOutsEnabled(value: PrimitiveBoolean): Self = StObject.set(x, "SelfManagedOptOutsEnabled", value.asInstanceOf[js.Any])
    
    inline def setSelfManagedOptOutsEnabledUndefined: Self = StObject.set(x, "SelfManagedOptOutsEnabled", js.undefined)
    
    inline def setSharedRoutesEnabled(value: PrimitiveBoolean): Self = StObject.set(x, "SharedRoutesEnabled", value.asInstanceOf[js.Any])
    
    inline def setSharedRoutesEnabledUndefined: Self = StObject.set(x, "SharedRoutesEnabled", js.undefined)
    
    inline def setStatus(value: PoolStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTwoWayChannelArn(value: TwoWayChannelArn): Self = StObject.set(x, "TwoWayChannelArn", value.asInstanceOf[js.Any])
    
    inline def setTwoWayChannelArnUndefined: Self = StObject.set(x, "TwoWayChannelArn", js.undefined)
    
    inline def setTwoWayEnabled(value: PrimitiveBoolean): Self = StObject.set(x, "TwoWayEnabled", value.asInstanceOf[js.Any])
    
    inline def setTwoWayEnabledUndefined: Self = StObject.set(x, "TwoWayEnabled", js.undefined)
  }
}
