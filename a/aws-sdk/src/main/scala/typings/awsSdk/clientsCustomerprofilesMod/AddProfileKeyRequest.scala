package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddProfileKeyRequest extends StObject {
  
  /**
    * The unique name of the domain.
    */
  var DomainName: name
  
  /**
    * A searchable identifier of a customer profile. The predefined keys you can use include: _account, _profileId, _assetId, _caseId, _orderId, _fullName, _phone, _email, _ctrContactId, _marketoLeadId, _salesforceAccountId, _salesforceContactId, _salesforceAssetId, _zendeskUserId, _zendeskExternalId, _zendeskTicketId, _serviceNowSystemId, _serviceNowIncidentId, _segmentUserId, _shopifyCustomerId, _shopifyOrderId.
    */
  var KeyName: name
  
  /**
    * The unique identifier of a customer profile.
    */
  var ProfileId: uuid
  
  /**
    * A list of key values.
    */
  var Values: requestValueList
}
object AddProfileKeyRequest {
  
  inline def apply(DomainName: name, KeyName: name, ProfileId: uuid, Values: requestValueList): AddProfileKeyRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], KeyName = KeyName.asInstanceOf[js.Any], ProfileId = ProfileId.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddProfileKeyRequest]
  }
  
  extension [Self <: AddProfileKeyRequest](x: Self) {
    
    inline def setDomainName(value: name): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setKeyName(value: name): Self = StObject.set(x, "KeyName", value.asInstanceOf[js.Any])
    
    inline def setProfileId(value: uuid): Self = StObject.set(x, "ProfileId", value.asInstanceOf[js.Any])
    
    inline def setValues(value: requestValueList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: string1To255*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
