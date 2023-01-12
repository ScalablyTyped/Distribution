package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPhoneNumbersV2Request extends StObject {
  
  /**
    * The maximum number of results to return per page.
    */
  var MaxResults: js.UndefOr[MaxResult1000] = js.undefined
  
  /**
    * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[LargeNextToken] = js.undefined
  
  /**
    * The ISO country code.
    */
  var PhoneNumberCountryCodes: js.UndefOr[typings.awsSdk.clientsConnectMod.PhoneNumberCountryCodes] = js.undefined
  
  /**
    * The prefix of the phone number. If provided, it must contain + as part of the country code.
    */
  var PhoneNumberPrefix: js.UndefOr[typings.awsSdk.clientsConnectMod.PhoneNumberPrefix] = js.undefined
  
  /**
    * The type of phone number.
    */
  var PhoneNumberTypes: js.UndefOr[typings.awsSdk.clientsConnectMod.PhoneNumberTypes] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for Amazon Connect instances or traffic distribution groups that phone numbers are claimed to. If TargetArn input is not provided, this API lists numbers claimed to all the Amazon Connect instances belonging to your account in the same Amazon Web Services Region as the request.
    */
  var TargetArn: js.UndefOr[ARN] = js.undefined
}
object ListPhoneNumbersV2Request {
  
  inline def apply(): ListPhoneNumbersV2Request = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPhoneNumbersV2Request]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPhoneNumbersV2Request] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResult1000): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: LargeNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPhoneNumberCountryCodes(value: PhoneNumberCountryCodes): Self = StObject.set(x, "PhoneNumberCountryCodes", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberCountryCodesUndefined: Self = StObject.set(x, "PhoneNumberCountryCodes", js.undefined)
    
    inline def setPhoneNumberCountryCodesVarargs(value: PhoneNumberCountryCode*): Self = StObject.set(x, "PhoneNumberCountryCodes", js.Array(value*))
    
    inline def setPhoneNumberPrefix(value: PhoneNumberPrefix): Self = StObject.set(x, "PhoneNumberPrefix", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberPrefixUndefined: Self = StObject.set(x, "PhoneNumberPrefix", js.undefined)
    
    inline def setPhoneNumberTypes(value: PhoneNumberTypes): Self = StObject.set(x, "PhoneNumberTypes", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberTypesUndefined: Self = StObject.set(x, "PhoneNumberTypes", js.undefined)
    
    inline def setPhoneNumberTypesVarargs(value: PhoneNumberType*): Self = StObject.set(x, "PhoneNumberTypes", js.Array(value*))
    
    inline def setTargetArn(value: ARN): Self = StObject.set(x, "TargetArn", value.asInstanceOf[js.Any])
    
    inline def setTargetArnUndefined: Self = StObject.set(x, "TargetArn", js.undefined)
  }
}
