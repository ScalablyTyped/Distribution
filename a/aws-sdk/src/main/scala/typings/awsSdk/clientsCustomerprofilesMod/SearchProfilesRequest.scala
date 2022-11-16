package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchProfilesRequest extends StObject {
  
  /**
    * A list of AdditionalSearchKey objects that are each searchable identifiers of a profile. Each AdditionalSearchKey object contains a KeyName and a list of Values associated with that specific key (i.e., a key-value(s) pair). These additional search keys will be used in conjunction with the LogicalOperator and the required KeyName and Values parameters to search for profiles that satisfy the search criteria. 
    */
  var AdditionalSearchKeys: js.UndefOr[additionalSearchKeysList] = js.undefined
  
  /**
    * The unique name of the domain.
    */
  var DomainName: name
  
  /**
    * A searchable identifier of a customer profile. The predefined keys you can use to search include: _account, _profileId, _assetId, _caseId, _orderId, _fullName, _phone, _email, _ctrContactId, _marketoLeadId, _salesforceAccountId, _salesforceContactId, _salesforceAssetId, _zendeskUserId, _zendeskExternalId, _zendeskTicketId, _serviceNowSystemId, _serviceNowIncidentId, _segmentUserId, _shopifyCustomerId, _shopifyOrderId.
    */
  var KeyName: name
  
  /**
    * Relationship between all specified search keys that will be used to search for profiles. This includes the required KeyName and Values parameters as well as any key-value(s) pairs specified in the AdditionalSearchKeys list. This parameter influences which profiles will be returned in the response in the following manner:    AND - The response only includes profiles that match all of the search keys.    OR - The response includes profiles that match at least one of the search keys.   The OR relationship is the default behavior if this parameter is not included in the request.
    */
  var LogicalOperator: js.UndefOr[logicalOperator] = js.undefined
  
  /**
    * The maximum number of objects returned per page. The default is 20 if this parameter is not included in the request.
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
    
    inline def setAdditionalSearchKeys(value: additionalSearchKeysList): Self = StObject.set(x, "AdditionalSearchKeys", value.asInstanceOf[js.Any])
    
    inline def setAdditionalSearchKeysUndefined: Self = StObject.set(x, "AdditionalSearchKeys", js.undefined)
    
    inline def setAdditionalSearchKeysVarargs(value: AdditionalSearchKey*): Self = StObject.set(x, "AdditionalSearchKeys", js.Array(value*))
    
    inline def setDomainName(value: name): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setKeyName(value: name): Self = StObject.set(x, "KeyName", value.asInstanceOf[js.Any])
    
    inline def setLogicalOperator(value: logicalOperator): Self = StObject.set(x, "LogicalOperator", value.asInstanceOf[js.Any])
    
    inline def setLogicalOperatorUndefined: Self = StObject.set(x, "LogicalOperator", js.undefined)
    
    inline def setMaxResults(value: maxSize100): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setValues(value: requestValueList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: string1To255*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
