package typings.auth0Lock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Aud extends StObject {
    
    var aud: String
    
    var exp: Double
    
    var iat: Double
    
    var iss: String
    
    var sub: String
  }
  object Aud {
    
    @scala.inline
    def apply(aud: String, exp: Double, iat: Double, iss: String, sub: String): Aud = {
      val __obj = js.Dynamic.literal(aud = aud.asInstanceOf[js.Any], exp = exp.asInstanceOf[js.Any], iat = iat.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any])
      __obj.asInstanceOf[Aud]
    }
    
    @scala.inline
    implicit class AudMutableBuilder[Self <: Aud] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAud(value: String): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIat(value: Double): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
    }
  }
  
  trait Email extends StObject {
    
    var email: js.UndefOr[String] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
  }
  object Email {
    
    @scala.inline
    def apply(): Email = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Email]
    }
    
    @scala.inline
    implicit class EmailMutableBuilder[Self <: Email] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  trait Hint extends StObject {
    
    var hint: js.UndefOr[String] = js.undefined
    
    var valid: Boolean
  }
  object Hint {
    
    @scala.inline
    def apply(valid: Boolean): Hint = {
      val __obj = js.Dynamic.literal(valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hint]
    }
    
    @scala.inline
    implicit class HintMutableBuilder[Self <: Hint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
      
      @scala.inline
      def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
}
