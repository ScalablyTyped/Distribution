package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidateE911AddressRequest extends StObject {
  
  /**
    * The AWS account ID.
    */
  var AwsAccountId: NonEmptyString
  
  /**
    * The address city, such as Portland.
    */
  var City: SensitiveNonEmptyString
  
  /**
    * The address country, such as US. 
    */
  var Country: SensitiveNonEmptyString
  
  /**
    * The address postal code, such as 04352.
    */
  var PostalCode: SensitiveNonEmptyString
  
  /**
    * The address state, such as ME.
    */
  var State: SensitiveNonEmptyString
  
  /**
    * The address street information, such as 8th Avenue.
    */
  var StreetInfo: SensitiveNonEmptyString
  
  /**
    * The address street number, such as 200 or 2121.
    */
  var StreetNumber: SensitiveNonEmptyString
}
object ValidateE911AddressRequest {
  
  inline def apply(
    AwsAccountId: NonEmptyString,
    City: SensitiveNonEmptyString,
    Country: SensitiveNonEmptyString,
    PostalCode: SensitiveNonEmptyString,
    State: SensitiveNonEmptyString,
    StreetInfo: SensitiveNonEmptyString,
    StreetNumber: SensitiveNonEmptyString
  ): ValidateE911AddressRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], City = City.asInstanceOf[js.Any], Country = Country.asInstanceOf[js.Any], PostalCode = PostalCode.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], StreetInfo = StreetInfo.asInstanceOf[js.Any], StreetNumber = StreetNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateE911AddressRequest]
  }
  
  extension [Self <: ValidateE911AddressRequest](x: Self) {
    
    inline def setAwsAccountId(value: NonEmptyString): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setCity(value: SensitiveNonEmptyString): Self = StObject.set(x, "City", value.asInstanceOf[js.Any])
    
    inline def setCountry(value: SensitiveNonEmptyString): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
    
    inline def setPostalCode(value: SensitiveNonEmptyString): Self = StObject.set(x, "PostalCode", value.asInstanceOf[js.Any])
    
    inline def setState(value: SensitiveNonEmptyString): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStreetInfo(value: SensitiveNonEmptyString): Self = StObject.set(x, "StreetInfo", value.asInstanceOf[js.Any])
    
    inline def setStreetNumber(value: SensitiveNonEmptyString): Self = StObject.set(x, "StreetNumber", value.asInstanceOf[js.Any])
  }
}
