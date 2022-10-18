package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleasePhoneNumberRequest extends StObject {
  
  /**
    * The PhoneNumberId or PhoneNumberArn of the phone number to release. You can use DescribePhoneNumbers to get the values for PhoneNumberId and PhoneNumberArn.
    */
  var PhoneNumberId: PhoneNumberIdOrArn
}
object ReleasePhoneNumberRequest {
  
  inline def apply(PhoneNumberId: PhoneNumberIdOrArn): ReleasePhoneNumberRequest = {
    val __obj = js.Dynamic.literal(PhoneNumberId = PhoneNumberId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleasePhoneNumberRequest]
  }
  
  extension [Self <: ReleasePhoneNumberRequest](x: Self) {
    
    inline def setPhoneNumberId(value: PhoneNumberIdOrArn): Self = StObject.set(x, "PhoneNumberId", value.asInstanceOf[js.Any])
  }
}
