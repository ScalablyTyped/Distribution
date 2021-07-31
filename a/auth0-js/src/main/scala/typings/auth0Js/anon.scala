package typings.auth0Js

import typings.auth0Js.auth0JsStrings.code
import typings.auth0Js.auth0JsStrings.email
import typings.auth0Js.auth0JsStrings.form_post
import typings.auth0Js.auth0JsStrings.fragment
import typings.auth0Js.auth0JsStrings.query
import typings.auth0Js.auth0JsStrings.sms
import typings.auth0Js.auth0JsStrings.token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Audience extends StObject {
    
    /** identifier of the resource server who will consume the access token issued after Auth */
    var audience: js.UndefOr[String] = js.undefined
    
    /** your Auth0 client identifier obtained when creating the client in the Auth0 Dashboard */
    var clientId: js.UndefOr[String] = js.undefined
    
    /**
      * identity provider whose login page will be displayed in the popup.
      * If omitted the hosted login page is used.
      * {@link https://auth0.com/docs/identityproviders}
      */
    var connection: js.UndefOr[String] = js.undefined
    
    /** your Auth0 domain */
    var domain: String
    
    /**
      * value used to mitigate replay attacks when using Implicit Grant.
      * {@link https://auth0.com/docs/api-auth/tutorials/nonce}
      */
    var nonce: js.UndefOr[String] = js.undefined
    
    /** determines if Auth0 should render the relay page or not and the caller is responsible of handling the response. */
    var owp: js.UndefOr[Boolean] = js.undefined
    
    /** url that the Auth0 will redirect after Auth with the Authorization Response */
    var redirectUri: String
    
    /**
      * how the Auth response is encoded and redirected back to the client.
      * {@link https://openid.net/specs/oauth-v2-multiple-response-types-1_0.html#ResponseModes}
      */
    var responseMode: js.UndefOr[query | fragment | form_post] = js.undefined
    
    /**
      * type of the response used by OAuth 2.0 flow.
      * It can be any space separated list of the values `code`, `token`, `id_token`.
      * {@link https://openid.net/specs/oauth-v2-multiple-response-types-1_0}
      */
    var responseType: String
    
    /** scopes to be requested during Auth. e.g. `openid email` */
    var scope: js.UndefOr[String] = js.undefined
    
    /**
      * value used to mitigate XSRF attacks.
      * {@link https://auth0.com/docs/protocols/oauth2/oauth-state}
      */
    var state: js.UndefOr[String] = js.undefined
  }
  object Audience {
    
    @scala.inline
    def apply(domain: String, redirectUri: String, responseType: String): Audience = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], redirectUri = redirectUri.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any])
      __obj.asInstanceOf[Audience]
    }
    
    @scala.inline
    implicit class AudienceMutableBuilder[Self <: Audience] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      @scala.inline
      def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      @scala.inline
      def setOwp(value: Boolean): Self = StObject.set(x, "owp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwpUndefined: Self = StObject.set(x, "owp", js.undefined)
      
      @scala.inline
      def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseMode(value: query | fragment | form_post): Self = StObject.set(x, "responseMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseModeUndefined: Self = StObject.set(x, "responseMode", js.undefined)
      
      @scala.inline
      def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  trait Connection extends StObject {
    
    /** name of the connection where the user will be created */
    var connection: String
    
    /** user email address */
    var email: String
    
    /** user password */
    var password: String
  }
  object Connection {
    
    @scala.inline
    def apply(connection: String, email: String, password: String): Connection = {
      val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
      __obj.asInstanceOf[Connection]
    }
    
    @scala.inline
    implicit class ConnectionMutableBuilder[Self <: Connection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    }
  }
  
  trait CountryCode extends StObject {
    
    var countryCode: String
  }
  object CountryCode {
    
    @scala.inline
    def apply(countryCode: String): CountryCode = {
      val __obj = js.Dynamic.literal(countryCode = countryCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[CountryCode]
    }
    
    @scala.inline
    implicit class CountryCodeMutableBuilder[Self <: CountryCode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait Email extends StObject {
    
    /** the connection name */
    var connection: String
    
    /** only if type = email */
    var email: js.UndefOr[String] = js.undefined
    
    /**  only if type = sms */
    var phoneNumber: js.UndefOr[String] = js.undefined
    
    var `type`: sms | email
    
    /** the TOTP code */
    var verificationCode: String
  }
  object Email {
    
    @scala.inline
    def apply(connection: String, `type`: sms | email, verificationCode: String): Email = {
      val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], verificationCode = verificationCode.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Email]
    }
    
    @scala.inline
    implicit class EmailMutableBuilder[Self <: Email] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
      
      @scala.inline
      def setType(value: sms | email): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerificationCode(value: String): Self = StObject.set(x, "verificationCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait Hash extends StObject {
    
    /**
      * makes parseHash perform or skip `id_token` verification.
      * We **strongly** recommend validating the `id_token` yourself if you disable the verification.
      */
    var _idTokenVerification: js.UndefOr[String] = js.undefined
    
    /**
      * the url hash.
      * @default window.location.hash
      */
    var hash: String
    
    /** value originally sent in `nonce` parameter to {@link authorize} to prevent replay attacks */
    var nonce: js.UndefOr[String] = js.undefined
    
    /** value originally sent in `state` parameter to {@link authorize} to mitigate XSRF */
    var state: js.UndefOr[String] = js.undefined
  }
  object Hash {
    
    @scala.inline
    def apply(hash: String): Hash = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hash]
    }
    
    @scala.inline
    implicit class HashMutableBuilder[Self <: Hash] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def set_idTokenVerification(value: String): Self = StObject.set(x, "_idTokenVerification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_idTokenVerificationUndefined: Self = StObject.set(x, "_idTokenVerification", js.undefined)
    }
  }
  
  trait Jwksuri extends StObject {
    
    var __jwks_uri: js.UndefOr[String] = js.undefined
    
    var __tenant: js.UndefOr[String] = js.undefined
    
    var __token_issuer: js.UndefOr[String] = js.undefined
  }
  object Jwksuri {
    
    @scala.inline
    def apply(): Jwksuri = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Jwksuri]
    }
    
    @scala.inline
    implicit class JwksuriMutableBuilder[Self <: Jwksuri] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set__jwks_uri(value: String): Self = StObject.set(x, "__jwks_uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set__jwks_uriUndefined: Self = StObject.set(x, "__jwks_uri", js.undefined)
      
      @scala.inline
      def set__tenant(value: String): Self = StObject.set(x, "__tenant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set__tenantUndefined: Self = StObject.set(x, "__tenant", js.undefined)
      
      @scala.inline
      def set__token_issuer(value: String): Self = StObject.set(x, "__token_issuer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set__token_issuerUndefined: Self = StObject.set(x, "__token_issuer", js.undefined)
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var strategy: js.UndefOr[String] = js.undefined
  }
  object Name {
    
    @scala.inline
    def apply(name: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrategy(value: String): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    }
  }
  
  trait RedirectUri extends StObject {
    
    /** url that the Auth0 will redirect after Auth with the Authorization Response */
    var redirectUri: js.UndefOr[String] = js.undefined
    
    /** how the AuthN response is encoded and redirected back to the client. */
    var responseMode: js.UndefOr[query | fragment] = js.undefined
    
    /** type of the response used. It can be any of the values `code` and `token` */
    var responseType: js.UndefOr[String] = js.undefined
    
    /** scopes to be requested during AuthN. e.g. `openid email` */
    var scope: String
  }
  object RedirectUri {
    
    @scala.inline
    def apply(scope: String): RedirectUri = {
      val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[RedirectUri]
    }
    
    @scala.inline
    implicit class RedirectUriMutableBuilder[Self <: RedirectUri] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
      
      @scala.inline
      def setResponseMode(value: query | fragment): Self = StObject.set(x, "responseMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseModeUndefined: Self = StObject.set(x, "responseMode", js.undefined)
      
      @scala.inline
      def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResponseMode extends StObject {
    
    /** url that the Auth0 will redirect after Auth with the Authorization Response */
    var redirectUri: js.UndefOr[String] = js.undefined
    
    /** how the AuthN response is encoded and redirected back to the client. */
    var responseMode: js.UndefOr[query | fragment] = js.undefined
    
    /** type of the response used. */
    var responseType: js.UndefOr[code | token] = js.undefined
    
    /** scopes to be requested during AuthN. e.g. `openid email` */
    var scope: js.UndefOr[String] = js.undefined
  }
  object ResponseMode {
    
    @scala.inline
    def apply(): ResponseMode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponseMode]
    }
    
    @scala.inline
    implicit class ResponseModeMutableBuilder[Self <: ResponseMode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
      
      @scala.inline
      def setResponseMode(value: query | fragment): Self = StObject.set(x, "responseMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseModeUndefined: Self = StObject.set(x, "responseMode", js.undefined)
      
      @scala.inline
      def setResponseType(value: code | token): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
}
