package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidateE911AddressResponse extends StObject {
  
  /**
    * The validated address.
    */
  var Address: js.UndefOr[typings.awsSdk.clientsChimeMod.Address] = js.undefined
  
  /**
    * The ID that represents the address.
    */
  var AddressExternalId: js.UndefOr[String] = js.undefined
  
  /**
    * The list of address suggestions.
    */
  var CandidateAddressList: js.UndefOr[typings.awsSdk.clientsChimeMod.CandidateAddressList] = js.undefined
  
  /**
    * Number indicating the result of address validation. 0 means the address was perfect as is and successfully validated. 1 means the address was corrected. 2 means the address sent was not close enough and was not validated.
    */
  var ValidationResult: js.UndefOr[typings.awsSdk.clientsChimeMod.ValidationResult] = js.undefined
}
object ValidateE911AddressResponse {
  
  inline def apply(): ValidateE911AddressResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateE911AddressResponse]
  }
  
  extension [Self <: ValidateE911AddressResponse](x: Self) {
    
    inline def setAddress(value: Address): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    inline def setAddressExternalId(value: String): Self = StObject.set(x, "AddressExternalId", value.asInstanceOf[js.Any])
    
    inline def setAddressExternalIdUndefined: Self = StObject.set(x, "AddressExternalId", js.undefined)
    
    inline def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
    
    inline def setCandidateAddressList(value: CandidateAddressList): Self = StObject.set(x, "CandidateAddressList", value.asInstanceOf[js.Any])
    
    inline def setCandidateAddressListUndefined: Self = StObject.set(x, "CandidateAddressList", js.undefined)
    
    inline def setCandidateAddressListVarargs(value: CandidateAddress*): Self = StObject.set(x, "CandidateAddressList", js.Array(value*))
    
    inline def setValidationResult(value: ValidationResult): Self = StObject.set(x, "ValidationResult", value.asInstanceOf[js.Any])
    
    inline def setValidationResultUndefined: Self = StObject.set(x, "ValidationResult", js.undefined)
  }
}
