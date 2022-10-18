package typings.auth0

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcAuthIdTokenMod {
  
  @JSImport("auth0/src/auth/idToken", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(token: String): DecodedToken = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(token.asInstanceOf[js.Any]).asInstanceOf[DecodedToken]
  
  inline def validate(token: String): DecodedToken = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(token.asInstanceOf[js.Any]).asInstanceOf[DecodedToken]
  inline def validate(token: String, options: ValidateOptions): DecodedToken = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(token.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DecodedToken]
  
  trait DecodedToken extends StObject {
    
    var _raw: String
    
    var header: Any
    
    var payload: Any
    
    var signature: String
  }
  object DecodedToken {
    
    inline def apply(_raw: String, header: Any, payload: Any, signature: String): DecodedToken = {
      val __obj = js.Dynamic.literal(_raw = _raw.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecodedToken]
    }
    
    extension [Self <: DecodedToken](x: Self) {
      
      inline def setHeader(value: Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      inline def set_raw(value: String): Self = StObject.set(x, "_raw", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValidateOptions extends StObject {
    
    var audience: String | js.Array[String]
    
    var issuer: String
    
    var leeway: js.UndefOr[Double] = js.undefined
    
    var maxAge: js.UndefOr[Double] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
  }
  object ValidateOptions {
    
    inline def apply(audience: String | js.Array[String], issuer: String): ValidateOptions = {
      val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidateOptions]
    }
    
    extension [Self <: ValidateOptions](x: Self) {
      
      inline def setAudience(value: String | js.Array[String]): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      inline def setAudienceVarargs(value: String*): Self = StObject.set(x, "audience", js.Array(value*))
      
      inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setLeeway(value: Double): Self = StObject.set(x, "leeway", value.asInstanceOf[js.Any])
      
      inline def setLeewayUndefined: Self = StObject.set(x, "leeway", js.undefined)
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    }
  }
}
