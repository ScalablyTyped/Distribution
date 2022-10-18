package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchAvailablePhoneNumbersRequest extends StObject {
  
  /**
    * The maximum number of results to return per page.
    */
  var MaxResults: js.UndefOr[MaxResult10] = js.undefined
  
  /**
    * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[LargeNextToken] = js.undefined
  
  /**
    * The ISO country code.
    */
  var PhoneNumberCountryCode: typings.awsSdk.clientsConnectMod.PhoneNumberCountryCode
  
  /**
    * The prefix of the phone number. If provided, it must contain + as part of the country code.
    */
  var PhoneNumberPrefix: js.UndefOr[typings.awsSdk.clientsConnectMod.PhoneNumberPrefix] = js.undefined
  
  /**
    * The type of phone number.
    */
  var PhoneNumberType: typings.awsSdk.clientsConnectMod.PhoneNumberType
  
  /**
    * The Amazon Resource Name (ARN) for Amazon Connect instances that phone numbers are claimed to.
    */
  var TargetArn: ARN
}
object SearchAvailablePhoneNumbersRequest {
  
  inline def apply(PhoneNumberCountryCode: PhoneNumberCountryCode, PhoneNumberType: PhoneNumberType, TargetArn: ARN): SearchAvailablePhoneNumbersRequest = {
    val __obj = js.Dynamic.literal(PhoneNumberCountryCode = PhoneNumberCountryCode.asInstanceOf[js.Any], PhoneNumberType = PhoneNumberType.asInstanceOf[js.Any], TargetArn = TargetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchAvailablePhoneNumbersRequest]
  }
  
  extension [Self <: SearchAvailablePhoneNumbersRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResult10): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: LargeNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPhoneNumberCountryCode(value: PhoneNumberCountryCode): Self = StObject.set(x, "PhoneNumberCountryCode", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberPrefix(value: PhoneNumberPrefix): Self = StObject.set(x, "PhoneNumberPrefix", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberPrefixUndefined: Self = StObject.set(x, "PhoneNumberPrefix", js.undefined)
    
    inline def setPhoneNumberType(value: PhoneNumberType): Self = StObject.set(x, "PhoneNumberType", value.asInstanceOf[js.Any])
    
    inline def setTargetArn(value: ARN): Self = StObject.set(x, "TargetArn", value.asInstanceOf[js.Any])
  }
}
