package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListContactReferencesRequest extends StObject {
  
  /**
    * The identifier of the initial contact.
    */
  var ContactId: typings.awsSdk.clientsConnectMod.ContactId
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results.  This is not expected to be set, because the value returned in the previous response is always null. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsConnectMod.NextToken] = js.undefined
  
  /**
    * The type of reference.
    */
  var ReferenceTypes: typings.awsSdk.clientsConnectMod.ReferenceTypes
}
object ListContactReferencesRequest {
  
  inline def apply(ContactId: ContactId, InstanceId: InstanceId, ReferenceTypes: ReferenceTypes): ListContactReferencesRequest = {
    val __obj = js.Dynamic.literal(ContactId = ContactId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], ReferenceTypes = ReferenceTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListContactReferencesRequest]
  }
  
  extension [Self <: ListContactReferencesRequest](x: Self) {
    
    inline def setContactId(value: ContactId): Self = StObject.set(x, "ContactId", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setReferenceTypes(value: ReferenceTypes): Self = StObject.set(x, "ReferenceTypes", value.asInstanceOf[js.Any])
    
    inline def setReferenceTypesVarargs(value: ReferenceType*): Self = StObject.set(x, "ReferenceTypes", js.Array(value*))
  }
}
