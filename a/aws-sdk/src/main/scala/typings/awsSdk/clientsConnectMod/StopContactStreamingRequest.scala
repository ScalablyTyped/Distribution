package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopContactStreamingRequest extends StObject {
  
  /**
    * The identifier of the contact. This is the identifier of the contact that is associated with the first interaction with the contact center.
    */
  var ContactId: typings.awsSdk.clientsConnectMod.ContactId
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The identifier of the streaming configuration enabled. 
    */
  var StreamingId: typings.awsSdk.clientsConnectMod.StreamingId
}
object StopContactStreamingRequest {
  
  inline def apply(ContactId: ContactId, InstanceId: InstanceId, StreamingId: StreamingId): StopContactStreamingRequest = {
    val __obj = js.Dynamic.literal(ContactId = ContactId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], StreamingId = StreamingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopContactStreamingRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopContactStreamingRequest] (val x: Self) extends AnyVal {
    
    inline def setContactId(value: ContactId): Self = StObject.set(x, "ContactId", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setStreamingId(value: StreamingId): Self = StObject.set(x, "StreamingId", value.asInstanceOf[js.Any])
  }
}
