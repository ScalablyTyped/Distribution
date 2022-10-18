package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuspendContactRecordingRequest extends StObject {
  
  /**
    * The identifier of the contact.
    */
  var ContactId: typings.awsSdk.clientsConnectMod.ContactId
  
  /**
    * The identifier of the contact. This is the identifier of the contact associated with the first interaction with the contact center.
    */
  var InitialContactId: ContactId
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
}
object SuspendContactRecordingRequest {
  
  inline def apply(ContactId: ContactId, InitialContactId: ContactId, InstanceId: InstanceId): SuspendContactRecordingRequest = {
    val __obj = js.Dynamic.literal(ContactId = ContactId.asInstanceOf[js.Any], InitialContactId = InitialContactId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspendContactRecordingRequest]
  }
  
  extension [Self <: SuspendContactRecordingRequest](x: Self) {
    
    inline def setContactId(value: ContactId): Self = StObject.set(x, "ContactId", value.asInstanceOf[js.Any])
    
    inline def setInitialContactId(value: ContactId): Self = StObject.set(x, "InitialContactId", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
