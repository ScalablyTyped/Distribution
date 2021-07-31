package typings.awsLambda.anon

import typings.awsLambda.commonMod.StringMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Password extends StObject {
  
  var clientMetadata: js.UndefOr[StringMap] = js.undefined
  
  var password: String
  
  var validationData: js.UndefOr[StringMap] = js.undefined
}
object Password {
  
  @scala.inline
  def apply(password: String): Password = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[Password]
  }
  
  @scala.inline
  implicit class PasswordMutableBuilder[Self <: Password] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientMetadata(value: StringMap): Self = StObject.set(x, "clientMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientMetadataUndefined: Self = StObject.set(x, "clientMetadata", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationData(value: StringMap): Self = StObject.set(x, "validationData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationDataUndefined: Self = StObject.set(x, "validationData", js.undefined)
  }
}
