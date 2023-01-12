package typings.awsSdk.clientsImportexportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetShippingLabelInput extends StObject {
  
  var APIVersion: js.UndefOr[APIVersion_] = js.undefined
  
  var city: js.UndefOr[typings.awsSdk.clientsImportexportMod.city] = js.undefined
  
  var company: js.UndefOr[typings.awsSdk.clientsImportexportMod.company] = js.undefined
  
  var country: js.UndefOr[typings.awsSdk.clientsImportexportMod.country] = js.undefined
  
  var jobIds: JobIdList
  
  var name: js.UndefOr[typings.awsSdk.clientsImportexportMod.name] = js.undefined
  
  var phoneNumber: js.UndefOr[typings.awsSdk.clientsImportexportMod.phoneNumber] = js.undefined
  
  var postalCode: js.UndefOr[typings.awsSdk.clientsImportexportMod.postalCode] = js.undefined
  
  var stateOrProvince: js.UndefOr[typings.awsSdk.clientsImportexportMod.stateOrProvince] = js.undefined
  
  var street1: js.UndefOr[typings.awsSdk.clientsImportexportMod.street1] = js.undefined
  
  var street2: js.UndefOr[typings.awsSdk.clientsImportexportMod.street2] = js.undefined
  
  var street3: js.UndefOr[typings.awsSdk.clientsImportexportMod.street3] = js.undefined
}
object GetShippingLabelInput {
  
  inline def apply(jobIds: JobIdList): GetShippingLabelInput = {
    val __obj = js.Dynamic.literal(jobIds = jobIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetShippingLabelInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetShippingLabelInput] (val x: Self) extends AnyVal {
    
    inline def setAPIVersion(value: APIVersion_): Self = StObject.set(x, "APIVersion", value.asInstanceOf[js.Any])
    
    inline def setAPIVersionUndefined: Self = StObject.set(x, "APIVersion", js.undefined)
    
    inline def setCity(value: city): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    inline def setCompany(value: company): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
    
    inline def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
    
    inline def setCountry(value: country): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setJobIds(value: JobIdList): Self = StObject.set(x, "jobIds", value.asInstanceOf[js.Any])
    
    inline def setJobIdsVarargs(value: GenericString*): Self = StObject.set(x, "jobIds", js.Array(value*))
    
    inline def setName(value: name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPhoneNumber(value: phoneNumber): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setPostalCode(value: postalCode): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    inline def setStateOrProvince(value: stateOrProvince): Self = StObject.set(x, "stateOrProvince", value.asInstanceOf[js.Any])
    
    inline def setStateOrProvinceUndefined: Self = StObject.set(x, "stateOrProvince", js.undefined)
    
    inline def setStreet1(value: street1): Self = StObject.set(x, "street1", value.asInstanceOf[js.Any])
    
    inline def setStreet1Undefined: Self = StObject.set(x, "street1", js.undefined)
    
    inline def setStreet2(value: street2): Self = StObject.set(x, "street2", value.asInstanceOf[js.Any])
    
    inline def setStreet2Undefined: Self = StObject.set(x, "street2", js.undefined)
    
    inline def setStreet3(value: street3): Self = StObject.set(x, "street3", value.asInstanceOf[js.Any])
    
    inline def setStreet3Undefined: Self = StObject.set(x, "street3", js.undefined)
  }
}
