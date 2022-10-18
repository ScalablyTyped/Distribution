package typings.auth0.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Emailverified extends StObject {
  
  var email: js.UndefOr[String] = js.undefined
  
  var email_verified: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var phone_number: js.UndefOr[String] = js.undefined
  
  var phone_verified: js.UndefOr[Boolean] = js.undefined
  
  var request_language: js.UndefOr[String] = js.undefined
}
object Emailverified {
  
  inline def apply(): Emailverified = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Emailverified]
  }
  
  extension [Self <: Emailverified](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEmail_verified(value: Boolean): Self = StObject.set(x, "email_verified", value.asInstanceOf[js.Any])
    
    inline def setEmail_verifiedUndefined: Self = StObject.set(x, "email_verified", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
    
    inline def setPhone_numberUndefined: Self = StObject.set(x, "phone_number", js.undefined)
    
    inline def setPhone_verified(value: Boolean): Self = StObject.set(x, "phone_verified", value.asInstanceOf[js.Any])
    
    inline def setPhone_verifiedUndefined: Self = StObject.set(x, "phone_verified", js.undefined)
    
    inline def setRequest_language(value: String): Self = StObject.set(x, "request_language", value.asInstanceOf[js.Any])
    
    inline def setRequest_languageUndefined: Self = StObject.set(x, "request_language", js.undefined)
  }
}
