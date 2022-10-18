package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateContactRequest extends StObject {
  
  /**
    * The identifier of the contact. This is the identifier of the contact associated with the first interaction with your contact center.
    */
  var ContactId: typings.awsSdk.clientsConnectMod.ContactId
  
  /**
    * The description of the contact.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsConnectMod.Description] = js.undefined
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The name of the contact.
    */
  var Name: js.UndefOr[typings.awsSdk.clientsConnectMod.Name] = js.undefined
  
  /**
    * Well-formed data on contact, shown to agents on Contact Control Panel (CCP).
    */
  var References: js.UndefOr[ContactReferences] = js.undefined
}
object UpdateContactRequest {
  
  inline def apply(ContactId: ContactId, InstanceId: InstanceId): UpdateContactRequest = {
    val __obj = js.Dynamic.literal(ContactId = ContactId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateContactRequest]
  }
  
  extension [Self <: UpdateContactRequest](x: Self) {
    
    inline def setContactId(value: ContactId): Self = StObject.set(x, "ContactId", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setReferences(value: ContactReferences): Self = StObject.set(x, "References", value.asInstanceOf[js.Any])
    
    inline def setReferencesUndefined: Self = StObject.set(x, "References", js.undefined)
  }
}
