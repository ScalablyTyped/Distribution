package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimedPhoneNumberSummary extends StObject {
  
  /**
    * The phone number. Phone numbers are formatted [+] [country code] [subscriber number including area code].
    */
  var PhoneNumber: js.UndefOr[typings.awsSdk.clientsConnectMod.PhoneNumber] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the phone number.
    */
  var PhoneNumberArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The ISO country code.
    */
  var PhoneNumberCountryCode: js.UndefOr[typings.awsSdk.clientsConnectMod.PhoneNumberCountryCode] = js.undefined
  
  /**
    * The description of the phone number.
    */
  var PhoneNumberDescription: js.UndefOr[typings.awsSdk.clientsConnectMod.PhoneNumberDescription] = js.undefined
  
  /**
    * A unique identifier for the phone number.
    */
  var PhoneNumberId: js.UndefOr[typings.awsSdk.clientsConnectMod.PhoneNumberId] = js.undefined
  
  /**
    * The status of the phone number.    CLAIMED means the previous ClaimedPhoneNumber or UpdatePhoneNumber operation succeeded.    IN_PROGRESS means a ClaimedPhoneNumber or UpdatePhoneNumber operation is still in progress and has not yet completed. You can call DescribePhoneNumber at a later time to verify if the previous operation has completed.    FAILED indicates that the previous ClaimedPhoneNumber or UpdatePhoneNumber operation has failed. It will include a message indicating the failure reason. A common reason for a failure may be that the TargetArn value you are claiming or updating a phone number to has reached its limit of total claimed numbers. If you received a FAILED status from a ClaimPhoneNumber API call, you have one day to retry claiming the phone number before the number is released back to the inventory for other customers to claim.    You will not be billed for the phone number during the 1-day period if number claiming fails.  
    */
  var PhoneNumberStatus: js.UndefOr[typings.awsSdk.clientsConnectMod.PhoneNumberStatus] = js.undefined
  
  /**
    * The type of phone number.
    */
  var PhoneNumberType: js.UndefOr[typings.awsSdk.clientsConnectMod.PhoneNumberType] = js.undefined
  
  /**
    * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1", "key2":"value2"} }.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for Amazon Connect instances or traffic distribution groups that phone numbers are claimed to.
    */
  var TargetArn: js.UndefOr[ARN] = js.undefined
}
object ClaimedPhoneNumberSummary {
  
  inline def apply(): ClaimedPhoneNumberSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimedPhoneNumberSummary]
  }
  
  extension [Self <: ClaimedPhoneNumberSummary](x: Self) {
    
    inline def setPhoneNumber(value: PhoneNumber): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberArn(value: ARN): Self = StObject.set(x, "PhoneNumberArn", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberArnUndefined: Self = StObject.set(x, "PhoneNumberArn", js.undefined)
    
    inline def setPhoneNumberCountryCode(value: PhoneNumberCountryCode): Self = StObject.set(x, "PhoneNumberCountryCode", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberCountryCodeUndefined: Self = StObject.set(x, "PhoneNumberCountryCode", js.undefined)
    
    inline def setPhoneNumberDescription(value: PhoneNumberDescription): Self = StObject.set(x, "PhoneNumberDescription", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberDescriptionUndefined: Self = StObject.set(x, "PhoneNumberDescription", js.undefined)
    
    inline def setPhoneNumberId(value: PhoneNumberId): Self = StObject.set(x, "PhoneNumberId", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberIdUndefined: Self = StObject.set(x, "PhoneNumberId", js.undefined)
    
    inline def setPhoneNumberStatus(value: PhoneNumberStatus): Self = StObject.set(x, "PhoneNumberStatus", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberStatusUndefined: Self = StObject.set(x, "PhoneNumberStatus", js.undefined)
    
    inline def setPhoneNumberType(value: PhoneNumberType): Self = StObject.set(x, "PhoneNumberType", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberTypeUndefined: Self = StObject.set(x, "PhoneNumberType", js.undefined)
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "PhoneNumber", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTargetArn(value: ARN): Self = StObject.set(x, "TargetArn", value.asInstanceOf[js.Any])
    
    inline def setTargetArnUndefined: Self = StObject.set(x, "TargetArn", js.undefined)
  }
}
