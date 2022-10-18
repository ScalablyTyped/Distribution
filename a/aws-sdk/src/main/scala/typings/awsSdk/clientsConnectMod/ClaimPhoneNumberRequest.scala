package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimPhoneNumberRequest extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsConnectMod.ClientToken] = js.undefined
  
  /**
    * The phone number you want to claim. Phone numbers are formatted [+] [country code] [subscriber number including area code].
    */
  var PhoneNumber: typings.awsSdk.clientsConnectMod.PhoneNumber
  
  /**
    * The description of the phone number.
    */
  var PhoneNumberDescription: js.UndefOr[typings.awsSdk.clientsConnectMod.PhoneNumberDescription] = js.undefined
  
  /**
    * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1", "key2":"value2"} }.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for Amazon Connect instances that phone numbers are claimed to.
    */
  var TargetArn: ARN
}
object ClaimPhoneNumberRequest {
  
  inline def apply(PhoneNumber: PhoneNumber, TargetArn: ARN): ClaimPhoneNumberRequest = {
    val __obj = js.Dynamic.literal(PhoneNumber = PhoneNumber.asInstanceOf[js.Any], TargetArn = TargetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimPhoneNumberRequest]
  }
  
  extension [Self <: ClaimPhoneNumberRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setPhoneNumber(value: PhoneNumber): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberDescription(value: PhoneNumberDescription): Self = StObject.set(x, "PhoneNumberDescription", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberDescriptionUndefined: Self = StObject.set(x, "PhoneNumberDescription", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTargetArn(value: ARN): Self = StObject.set(x, "TargetArn", value.asInstanceOf[js.Any])
  }
}
