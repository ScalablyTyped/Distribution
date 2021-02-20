package typings.auth0

import typings.auth0.auth0Strings.HS256
import typings.auth0.auth0Strings.RS256
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Alg extends StObject {
    
    // The algorithm used to sign the JsonWebToken
    var alg: js.UndefOr[HS256 | RS256] = js.native
    
    // The amount of time (in seconds) that the token will be valid after being issued
    var lifetime_in_seconds: js.UndefOr[Double] = js.native
    
    var scopes: js.UndefOr[js.Object] = js.native
  }
  object Alg {
    
    @scala.inline
    def apply(): Alg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Alg]
    }
    
    @scala.inline
    implicit class AlgMutableBuilder[Self <: Alg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlg(value: HS256 | RS256): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlgUndefined: Self = StObject.set(x, "alg", js.undefined)
      
      @scala.inline
      def setLifetime_in_seconds(value: Double): Self = StObject.set(x, "lifetime_in_seconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLifetime_in_secondsUndefined: Self = StObject.set(x, "lifetime_in_seconds", js.undefined)
      
      @scala.inline
      def setScopes(value: js.Object): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
    }
  }
  
  @js.native
  trait Cert extends StObject {
    
    var cert: js.UndefOr[String] = js.native
    
    var pub: js.UndefOr[String] = js.native
    
    var subject: js.UndefOr[String] = js.native
  }
  object Cert {
    
    @scala.inline
    def apply(): Cert = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cert]
    }
    
    @scala.inline
    implicit class CertMutableBuilder[Self <: Cert] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      @scala.inline
      def setPub(value: String): Self = StObject.set(x, "pub", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPubUndefined: Self = StObject.set(x, "pub", js.undefined)
      
      @scala.inline
      def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    }
  }
  
  @js.native
  trait Description extends StObject {
    
    var description: String = js.native
    
    var value: String = js.native
  }
  object Description {
    
    @scala.inline
    def apply(description: String, value: String): Description = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Description]
    }
    
    @scala.inline
    implicit class DescriptionMutableBuilder[Self <: Description] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Email extends StObject {
    
    var email: js.UndefOr[String] = js.native
    
    var email_verified: js.UndefOr[Boolean] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var phone_number: js.UndefOr[String] = js.native
    
    var phone_verified: js.UndefOr[Boolean] = js.native
    
    var request_language: js.UndefOr[String] = js.native
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
      def setEmail_verified(value: Boolean): Self = StObject.set(x, "email_verified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail_verifiedUndefined: Self = StObject.set(x, "email_verified", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhone_numberUndefined: Self = StObject.set(x, "phone_number", js.undefined)
      
      @scala.inline
      def setPhone_verified(value: Boolean): Self = StObject.set(x, "phone_verified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhone_verifiedUndefined: Self = StObject.set(x, "phone_verified", js.undefined)
      
      @scala.inline
      def setRequest_language(value: String): Self = StObject.set(x, "request_language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest_languageUndefined: Self = StObject.set(x, "request_language", js.undefined)
    }
  }
  
  @js.native
  trait Methods extends StObject {
    
    var methods: js.Array[_] = js.native
  }
  object Methods {
    
    @scala.inline
    def apply(methods: js.Array[_]): Methods = {
      val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any])
      __obj.asInstanceOf[Methods]
    }
    
    @scala.inline
    implicit class MethodsMutableBuilder[Self <: Methods] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethods(value: js.Array[_]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodsVarargs(value: js.Any*): Self = StObject.set(x, "methods", js.Array(value :_*))
    }
  }
}
