package typings.awsLambda.anon

import typings.awsLambda.commonMod.StringMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationData extends StObject {
  
  var clientMetadata: js.UndefOr[StringMap] = js.undefined
  
  var userAttributes: StringMap
  
  var validationData: js.UndefOr[StringMap] = js.undefined
}
object ValidationData {
  
  inline def apply(userAttributes: StringMap): ValidationData = {
    val __obj = js.Dynamic.literal(userAttributes = userAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationData]
  }
  
  extension [Self <: ValidationData](x: Self) {
    
    inline def setClientMetadata(value: StringMap): Self = StObject.set(x, "clientMetadata", value.asInstanceOf[js.Any])
    
    inline def setClientMetadataUndefined: Self = StObject.set(x, "clientMetadata", js.undefined)
    
    inline def setUserAttributes(value: StringMap): Self = StObject.set(x, "userAttributes", value.asInstanceOf[js.Any])
    
    inline def setValidationData(value: StringMap): Self = StObject.set(x, "validationData", value.asInstanceOf[js.Any])
    
    inline def setValidationDataUndefined: Self = StObject.set(x, "validationData", js.undefined)
  }
}
