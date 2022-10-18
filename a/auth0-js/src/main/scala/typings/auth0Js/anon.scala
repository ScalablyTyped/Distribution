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
    
    inline def apply(domain: String, redirectUri: String, responseType: String): Audience = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], redirectUri = redirectUri.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any])
      __obj.asInstanceOf[Audience]
    }
    
    extension [Self <: Audience](x: Self) {
      
      inline def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      inline def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setOwp(value: Boolean): Self = StObject.set(x, "owp", value.asInstanceOf[js.Any])
      
      inline def setOwpUndefined: Self = StObject.set(x, "owp", js.undefined)
      
      inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
      
      inline def setResponseMode(value: query | fragment | form_post): Self = StObject.set(x, "responseMode", value.asInstanceOf[js.Any])
      
      inline def setResponseModeUndefined: Self = StObject.set(x, "responseMode", js.undefined)
      
      inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  trait Connection extends StObject {
    
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
  object Connection {
    
    inline def apply(connection: String, `type`: sms | email, verificationCode: String): Connection = {
      val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], verificationCode = verificationCode.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Connection]
    }
    
    extension [Self <: Connection](x: Self) {
      
      inline def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
      
      inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
      
      inline def setType(value: sms | email): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVerificationCode(value: String): Self = StObject.set(x, "verificationCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait CountryCode extends StObject {
    
    var countryCode: String
  }
  object CountryCode {
    
    inline def apply(countryCode: String): CountryCode = {
      val __obj = js.Dynamic.literal(countryCode = countryCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[CountryCode]
    }
    
    extension [Self <: CountryCode](x: Self) {
      
      inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait Email extends StObject {
    
    /** name of the connection where the user will be created */
    var connection: String
    
    /** user email address */
    var email: String
    
    /** user password */
    var password: String
    
    /** allow userMetadata to be passed to signUp */
    var userMetadata: js.UndefOr[Any] = js.undefined
  }
  object Email {
    
    inline def apply(connection: String, email: String, password: String): Email = {
      val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
      __obj.asInstanceOf[Email]
    }
    
    extension [Self <: Email](x: Self) {
      
      inline def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setUserMetadata(value: Any): Self = StObject.set(x, "userMetadata", value.asInstanceOf[js.Any])
      
      inline def setUserMetadataUndefined: Self = StObject.set(x, "userMetadata", js.undefined)
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
    
    inline def apply(hash: String): Hash = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hash]
    }
    
    extension [Self <: Hash](x: Self) {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def set_idTokenVerification(value: String): Self = StObject.set(x, "_idTokenVerification", value.asInstanceOf[js.Any])
      
      inline def set_idTokenVerificationUndefined: Self = StObject.set(x, "_idTokenVerification", js.undefined)
    }
  }
  
  trait Jwksuri extends StObject {
    
    var __jwks_uri: js.UndefOr[String] = js.undefined
    
    var __tenant: js.UndefOr[String] = js.undefined
    
    var __token_issuer: js.UndefOr[String] = js.undefined
  }
  object Jwksuri {
    
    inline def apply(): Jwksuri = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Jwksuri]
    }
    
    extension [Self <: Jwksuri](x: Self) {
      
      inline def set__jwks_uri(value: String): Self = StObject.set(x, "__jwks_uri", value.asInstanceOf[js.Any])
      
      inline def set__jwks_uriUndefined: Self = StObject.set(x, "__jwks_uri", js.undefined)
      
      inline def set__tenant(value: String): Self = StObject.set(x, "__tenant", value.asInstanceOf[js.Any])
      
      inline def set__tenantUndefined: Self = StObject.set(x, "__tenant", js.undefined)
      
      inline def set__token_issuer(value: String): Self = StObject.set(x, "__token_issuer", value.asInstanceOf[js.Any])
      
      inline def set__token_issuerUndefined: Self = StObject.set(x, "__token_issuer", js.undefined)
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var strategy: js.UndefOr[String] = js.undefined
  }
  object Name {
    
    inline def apply(name: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStrategy(value: String): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    }
  }
  
  trait RedirectUri extends StObject {
    
    /** url that the Auth0 will redirect after Auth with the Authorization Response */
    var redirectUri: js.UndefOr[String] = js.undefined
    
    /** how the AuthN response is encoded and redirected back to the client. */
    var responseMode: js.UndefOr[query | fragment] = js.undefined
    
    /** type of the response used. */
    var responseType: js.UndefOr[code | token] = js.undefined
    
    /** scopes to be requested during AuthN. e.g. `openid email` */
    var scope: js.UndefOr[String] = js.undefined
  }
  object RedirectUri {
    
    inline def apply(): RedirectUri = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RedirectUri]
    }
    
    extension [Self <: RedirectUri](x: Self) {
      
      inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
      
      inline def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
      
      inline def setResponseMode(value: query | fragment): Self = StObject.set(x, "responseMode", value.asInstanceOf[js.Any])
      
      inline def setResponseModeUndefined: Self = StObject.set(x, "responseMode", js.undefined)
      
      inline def setResponseType(value: code | token): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  trait ResponseMode extends StObject {
    
    /** url that the Auth0 will redirect after Auth with the Authorization Response */
    var redirectUri: js.UndefOr[String] = js.undefined
    
    /** how the AuthN response is encoded and redirected back to the client. */
    var responseMode: js.UndefOr[query | fragment] = js.undefined
    
    /** type of the response used. It can be any of the values `code` and `token` */
    var responseType: js.UndefOr[String] = js.undefined
    
    /** scopes to be requested during AuthN. e.g. `openid email` */
    var scope: String
  }
  object ResponseMode {
    
    inline def apply(scope: String): ResponseMode = {
      val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponseMode]
    }
    
    extension [Self <: ResponseMode](x: Self) {
      
      inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
      
      inline def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
      
      inline def setResponseMode(value: query | fragment): Self = StObject.set(x, "responseMode", value.asInstanceOf[js.Any])
      
      inline def setResponseModeUndefined: Self = StObject.set(x, "responseMode", js.undefined)
      
      inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  email :string,   password :string,   connection :string,   userMetadata :unknown | undefined} & auth0-js.auth0-js.CrossOriginLoginOptions */
  trait emailstringpasswordstring extends StObject {
    
    var audience: js.UndefOr[String] = js.undefined
    
    var clientID: js.UndefOr[String] = js.undefined
    
    /** name of the connection where the user will be created */
    var connection: String
    
    var domain: js.UndefOr[String] = js.undefined
    
    /** user email address */
    var email: String & js.UndefOr[String]
    
    var nonce: js.UndefOr[String] = js.undefined
    
    var onRedirecting: js.UndefOr[js.Function1[/* done */ js.Function0[Unit], js.UndefOr[Unit]]] = js.undefined
    
    /** user password */
    var password: String
    
    var realm: js.UndefOr[String] = js.undefined
    
    var redirectUri: js.UndefOr[String] = js.undefined
    
    var responseMode: js.UndefOr[String] = js.undefined
    
    var responseType: js.UndefOr[String] = js.undefined
    
    var scope: js.UndefOr[String] = js.undefined
    
    var state: js.UndefOr[String] = js.undefined
    
    /** allow userMetadata to be passed to signUp */
    var userMetadata: js.UndefOr[Any] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
  }
  object emailstringpasswordstring {
    
    inline def apply(connection: String, email: String & js.UndefOr[String], password: String): emailstringpasswordstring = {
      val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
      __obj.asInstanceOf[emailstringpasswordstring]
    }
    
    extension [Self <: emailstringpasswordstring](x: Self) {
      
      inline def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      inline def setClientID(value: String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
      
      inline def setClientIDUndefined: Self = StObject.set(x, "clientID", js.undefined)
      
      inline def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setEmail(value: String & js.UndefOr[String]): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setOnRedirecting(value: /* done */ js.Function0[Unit] => js.UndefOr[Unit]): Self = StObject.set(x, "onRedirecting", js.Any.fromFunction1(value))
      
      inline def setOnRedirectingUndefined: Self = StObject.set(x, "onRedirecting", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
      
      inline def setRealmUndefined: Self = StObject.set(x, "realm", js.undefined)
      
      inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
      
      inline def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
      
      inline def setResponseMode(value: String): Self = StObject.set(x, "responseMode", value.asInstanceOf[js.Any])
      
      inline def setResponseModeUndefined: Self = StObject.set(x, "responseMode", js.undefined)
      
      inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setUserMetadata(value: Any): Self = StObject.set(x, "userMetadata", value.asInstanceOf[js.Any])
      
      inline def setUserMetadataUndefined: Self = StObject.set(x, "userMetadata", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
}
