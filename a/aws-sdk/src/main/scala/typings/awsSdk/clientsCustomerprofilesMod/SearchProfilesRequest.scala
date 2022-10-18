package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchProfilesRequest extends StObject {
  
  /**
    * The unique name of the domain.
    */
  var DomainName: name
  
  /**
    * A searchable identifier of a customer profile. The predefined keys you can use to search include: _account, _profileId, _assetId, _caseId, _orderId, _fullName, _phone, _email, _ctrContactId, _marketoLeadId, _salesforceAccountId, _salesforceContactId, _salesforceAssetId, _zendeskUserId, _zendeskExternalId, _zendeskTicketId, _serviceNowSystemId, _serviceNowIncidentId, _segmentUserId, _shopifyCustomerId, _shopifyOrderId.
    */
  var KeyName: name
  
  /**
    * The maximum number of objects returned per page.
    */
  var MaxResults: js.UndefOr[maxSize100] = js.undefined
  
  /**
    * The pagination token from the previous SearchProfiles API call.
    */
  var NextToken: js.UndefOr[token] = js.undefined
  
  /**
    * A list of key values.
    */
  var Values: requestValueList
}
object SearchProfilesRequest {
  
  inline def apply(DomainName: name, KeyName: name, Values: requestValueList): SearchProfilesRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], KeyName = KeyName.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchProfilesRequest]
  }
  
  extension [Self <: SearchProfilesRequest](x: Self) {
    
    inline def setDomainName(value: name): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setKeyName(value: name): Self = StObject.set(x, "KeyName", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: maxSize100): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setValues(value: requestValueList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: string1To255*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
