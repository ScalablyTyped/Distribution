package typings.amazonCognitoAuthJs

import typings.amazonCognitoAuthJs.anon.ContentType
import typings.std.Map
import typings.std.ReadonlyMap
import typings.std.ReadonlySet
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("amazon-cognito-auth-js", "CognitoAccessToken")
  @js.native
  open class CognitoAccessToken protected () extends StObject {
    /**
      * Constructs a new CognitoAccessToken object
      * @param AccessToken The JWT access token.
      */
    def this(AccessToken: String) = this()
    
    /**
      * @returns the token's payload.
      */
    def decodePayload(): js.Object = js.native
    
    /**
      * @returns the token's expiration (exp member).
      */
    def getExpiration(): Double = js.native
    
    /**
      * @returns the record's token.
      */
    def getJwtToken(): String = js.native
    
    /**
      * @returns the username from payload.
      */
    def getUsername(): String = js.native
    
    /**
      * Sets new value for access token.
      * @param accessToken The JWT access token.
      */
    def setJwtToken(accessToken: String): Unit = js.native
  }
  
  @JSImport("amazon-cognito-auth-js", "CognitoAuth")
  @js.native
  open class CognitoAuth protected () extends StObject {
    /**
      * Constructs a new CognitoAuth object
      * @param options Creation options
      */
    def this(options: CognitoAuthOptions) = this()
    
    /**
      * This is used to save the session tokens and scopes to local storage.
      */
    def cacheTokensScopes(): Unit = js.native
    
    /**
      * This is used to clear the session tokens and scopes from local storage
      */
    def clearCachedTokensScopes(): Unit = js.native
    
    /**
      * Compare two sets if they are identical.
      * @param set1 one set
      * @param set2 the other set
      * @returns boolean value is true if two sets are identical
      */
    def compareSets(set1: ReadonlySet[Any], set2: ReadonlySet[Any]): Boolean = js.native
    
    /**
      * Create the XHR object
      * @param method which method to call
      * @param url the url string
      * @returns xhr
      */
    def createCORSRequest(method: String, url: String): XMLHttpRequest | XDomainRequest = js.native
    
    /**
      * helper function to generate a random string
      * @param length the length of string
      * @param chars a original string
      * @returns a random value.
      */
    def generateRandomString(length: Double, chars: String): String = js.native
    
    /**
      * @returns the app web domain
      */
    def getAppWebDomain(): String = js.native
    
    /**
      * Get cached tokens and scopes and return a new session using all the cached data.
      * @returns the auth session
      */
    def getCachedSession(): CognitoAuthSession = js.native
    
    /**
      * @returns the client id
      */
    def getClientId(): String = js.native
    
    /**
      * Get the query parameter map and proceed according to code response type.
      * @param Query parameter map
      */
    def getCodeQueryParameter(map: ReadonlyMap[String, String]): Unit = js.native
    
    /**
      * @returns the constants
      */
    def getCognitoConstants(): CognitoConstants = js.native
    
    /**
      * method for getting the current user of the application from the local storage
      *
      * @returns the user retrieved from storage
      */
    def getCurrentUser(): String = js.native
    
    /**
      * Create the FQDN(fully qualified domain name) for authorization endpoint.
      * @returns url
      */
    def getFQDNSignIn(): String = js.native
    
    /**
      * Create the FQDN(fully qualified domain name) for signout endpoint.
      * @returns url
      */
    def getFQDNSignOut(): String = js.native
    
    /**
      * Get the hostname from url.
      * @param url the url string
      * @returns hostname string
      */
    def getHostName(url: String): String = js.native
    
    /**
      * This is used to get last signed in user from local storage
      * @returns the last user name
      */
    def getLastUser(): String = js.native
    
    /**
      * Get http query parameters and return them as a map.
      * @param url the url string
      * @param splitMark query parameters split mark (prefix)
      * @returns map
      */
    def getQueryParameters(url: String, splitMark: String): Map[String, String] = js.native
    
    /**
      * This is used to get a session, either from the session object or from the local storage, or by using a refresh token
      * @param RedirectUriSignIn Required: The redirect Uri, which will be launched after authentication.
      * @param TokenScopesArray Required: The token scopes, it is an array of strings specifying all scopes for the tokens.
      */
    def getSession(): Unit = js.native
    
    /**
      * @returns the current session for this user
      */
    def getSignInUserSession(): CognitoAuthSession = js.native
    
    /**
      * @returns scopes string
      */
    def getSpaceSeperatedScopeString(): String = js.native
    
    /**
      * @returns the user's state
      */
    def getState(): String = js.native
    
    /**
      * Get the query parameter map and proceed according to token response type.
      * @param Query parameter map
      */
    def getTokenQueryParameter(map: ReadonlyMap[String, String]): Unit = js.native
    
    /**
      * This method returns the encoded data string used for cognito advanced security feature.
      * This would be generated only when developer has included the JS used for collecting the
      * data on their client. Please refer to documentation to know more about using AdvancedSecurity
      * features
      */
    def getUserContextData(): String = js.native
    
    /**
      * @returns the user's username
      */
    def getUsername(): String = js.native
    
    /**
      * Helper method to let the user know if they have either a valid cached session
      * or a valid authenticated session from the app integration callback.
      * @returns userSignedIn
      */
    def isUserSignedIn(): Boolean = js.native
    
    /**
      * Launch Cognito Auth UI page.
      * @param URL the url to launch
      */
    def launchUri(URL: String): Unit = js.native
    
    /**
      * Make the http POST request.
      * @param header header JSON object
      * @param body body JSON object
      * @param url string
      * @param onSuccess callback
      * @param onFailure callback
      */
    def makePOSTRequest(
      header: js.Object,
      body: js.Object,
      url: String,
      onSuccess: js.Function1[/* responseText */ String, Unit],
      onFailure: js.Function1[/* responseText */ String, Unit]
    ): Unit = js.native
    
    /**
      * The http POST request onFailure callback.
      * @param err the error object
      */
    def onFailure(err: Any): Unit = js.native
    
    /**
      * The http POST request onSuccess callback when exchanging code for tokens.
      * @param jsonData tokens
      */
    def onSuccessExchangeForToken(jsonData: String): Unit = js.native
    
    /**
      * The http POST request onSuccess callback when refreshing tokens.
      * @param jsonData tokens
      */
    def onSuccessRefreshToken(jsonData: String): Unit = js.native
    
    /**
      * Parse the http request response and proceed according to different response types.
      * @param httpRequestResponse the http request response
      */
    def parseCognitoWebResponse(httpRequestResponse: String): Unit = js.native
    
    /**
      * This is used to build a user session from tokens retrieved in the authentication result
      * @param refreshToken Successful auth response from server.
      */
    def refreshSession(refreshToken: String): Unit = js.native
    
    /**
      * @param State the user's state
      */
    def setState(State: String): Unit = js.native
    
    /**
      * method for setting the current user's name
      * @param Username the user's name
      */
    def setUser(Username: String): Unit = js.native
    
    /**
      * @param Username the user's username
      */
    def setUsername(Username: String): Unit = js.native
    
    /**
      * Sign out the user.
      */
    def signOut(): Unit = js.native
    
    /**
      * sets response type to 'code'
      */
    def useCodeGrantFlow(): Unit = js.native
    
    /**
      * sets response type to 'token'
      */
    def useImplicitFlow(): Unit = js.native
    
    /**
      * Called on success or error.
      */
    var userhandler: CognitoAuthUserHandler = js.native
  }
  
  @JSImport("amazon-cognito-auth-js", "CognitoAuthSession")
  @js.native
  open class CognitoAuthSession protected () extends StObject {
    /**
      * Constructs a new CognitoUserSession object
      * @param sessionData The session's tokens, scopes, and state.
      */
    def this(sessionData: CognitoSessionData) = this()
    
    /**
      * @returns the session's access token
      */
    def getAccessToken(): CognitoAccessToken = js.native
    
    /**
      *  @returns the session's Id token
      */
    def getIdToken(): CognitoIdToken = js.native
    
    /**
      * @returns the session's refresh token
      */
    def getRefreshToken(): CognitoRefreshToken = js.native
    
    /**
      * @returns the session's state
      */
    def getState(): String = js.native
    
    /**
      * @returns the session's token scopes
      */
    def getTokenScopes(): CognitoTokenScopes = js.native
    
    /**
      * Checks to see if the session is still valid based on session expiry information found
      * in Access and Id Tokens and the current time
      * @returns if the session is still valid
      */
    def isValid(): Boolean = js.native
    
    /**
      * Set a new Access token
      * @param AccessToken The session's access token.
      */
    def setAccessToken(AccessToken: CognitoAccessToken): Unit = js.native
    
    /**
      * Set a new Id token
      * @param IdToken The session's Id token.
      */
    def setIdToken(IdToken: CognitoIdToken): Unit = js.native
    
    /**
      * Set a new Refresh token
      * @param RefreshToken The session's refresh token.
      */
    def setRefreshToken(RefreshToken: CognitoRefreshToken): Unit = js.native
    
    /**
      * Set new state
      * @param state The session's state.
      */
    def setState(State: String): Unit = js.native
    
    /**
      * Set new token scopes
      * @param tokenScopes The session's token scopes.
      */
    def setTokenScopes(tokenScopes: CognitoTokenScopes): Unit = js.native
  }
  
  @JSImport("amazon-cognito-auth-js", "CognitoIdToken")
  @js.native
  open class CognitoIdToken protected () extends StObject {
    /**
      * Constructs a new CognitoIdToken object
      * @param IdToken The JWT Id token
      */
    def this(IdToken: String) = this()
    
    /**
      * @returns the token's payload.
      */
    def decodePayload(): js.Object = js.native
    
    /**
      * @returns the token's expiration (exp member).
      */
    def getExpiration(): Double = js.native
    
    /**
      * @returns the record's token.
      */
    def getJwtToken(): String = js.native
    
    /**
      * Sets new value for id token.
      * @param idToken The JWT Id token
      */
    def setJwtToken(idToken: String): Unit = js.native
  }
  
  @JSImport("amazon-cognito-auth-js", "CognitoRefreshToken")
  @js.native
  open class CognitoRefreshToken protected () extends StObject {
    /**
      * Constructs a new CognitoRefreshToken object
      * @param RefreshToken The JWT refresh token.
      */
    def this(RefreshToken: String) = this()
    
    /**
      * @returns the record's token.
      */
    def getToken(): String = js.native
    
    /**
      * Sets new value for refresh token.
      * @param refreshToken The JWT refresh token.
      */
    def setToken(refreshToken: String): Unit = js.native
  }
  
  @JSImport("amazon-cognito-auth-js", "CognitoTokenScopes")
  @js.native
  open class CognitoTokenScopes protected () extends StObject {
    /**
      * Constructs a new CognitoTokenScopes object
      * @param TokenScopesArray The token scopes
      */
    def this(TokenScopesArray: js.Array[String]) = this()
    
    /**
      * @returns the token scopes.
      */
    def getScopes(): js.Array[String] = js.native
    
    /**
      * Sets new value for token scopes.
      * @param tokenScopes The token scopes
      */
    def setTokenScopes(tokenScopes: js.Array[String]): Unit = js.native
  }
  
  @JSImport("amazon-cognito-auth-js", "CookieStorage")
  @js.native
  open class CookieStorage protected ()
    extends StObject
       with CognitoAuthStorage {
    /**
      * Constructs a new CookieStorage object
      * @param data Creation options.
      */
    def this(data: CookieStorageOptions) = this()
    
    /**
      * This is used to clear the storage
      * @returns nothing
      */
    def clear(): js.Object = js.native
    
    /**
      * Returns the current value associated with the given key, or null or
      * undefined if the given key does not exist in the list associated with
      * the object.
      */
    /* CompleteClass */
    override def getItem(key: String): js.UndefOr[String | Null] = js.native
    
    /**
      * Removes the key/value pair with the given key from the list associated
      * with the object, if a key/value pair with the given key exists.
      */
    /* CompleteClass */
    override def removeItem(key: String): Unit = js.native
    
    /**
      * Sets the value of the pair identified by key to value, creating a new
      * key/value pair if none existed for key previously.
      */
    /* CompleteClass */
    override def setItem(key: String, value: String): Unit = js.native
    /**
      * This is used to set a specific item in storage
      * @param key the key for the item
      * @param value the value
      * @returns value that was set
      */
    def setItem(key: String, value: Any): String = js.native
  }
  
  @JSImport("amazon-cognito-auth-js", "DateHelper")
  @js.native
  open class DateHelper () extends StObject {
    
    /**
      * @returns The current time in "ddd MMM D HH:mm:ss UTC YYYY" format.
      */
    def getNowString(): String = js.native
  }
  
  @JSImport("amazon-cognito-auth-js", "StorageHelper")
  @js.native
  /**
    * This is used to get a storage object
    * @returns the storage
    */
  open class StorageHelper () extends StObject {
    
    /**
      * This is used to return the storage
      * @returns the storage
      */
    def getStorage(): CognitoAuthStorage = js.native
  }
  
  trait CognitoAuthOptions extends StObject {
    
    /**
      * Optional: boolean flag indicating if the data collection is enabled to support cognito advanced security features. By default, this flag is set to true.
      */
    var AdvancedSecurityDataCollectionFlag: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Required: The application/user-pools Cognito web hostname,this is set at the Cognito console.
      */
    var AppWebDomain: String
    
    /**
      * Required: User pool application client id.
      */
    var ClientId: String
    
    /**
      * Optional: Pre-selected identity provider (this allows to automatically trigger social provider authentication flow).
      */
    var IdentityProvider: js.UndefOr[String] = js.undefined
    
    /**
      * Optional: A function called to launch an Uri.
      * By default it uses window.location in browsers, and the Linking class in react native.
      */
    var LaunchUri: js.UndefOr[js.Function1[/* url */ String, Unit]] = js.undefined
    
    /**
      * Required: Required: The redirect Uri, which will be launched after authentication as signed in.
      */
    var RedirectUriSignIn: String
    
    /**
      * Required: The redirect Uri, which will be launched when signed out.
      */
    var RedirectUriSignOut: String
    
    /**
      * Optional: Storage provider used to store session data.
      * By default, it uses localStorage if available or an in-memory structure.
      * @example new CookieStorage()
      */
    var Storage: js.UndefOr[CognitoAuthStorage] = js.undefined
    
    /**
      * Optional: The token scopes
      */
    var TokenScopesArray: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Optional: UserPoolId for the configured cognito userPool.
      */
    var UserPoolId: js.UndefOr[String] = js.undefined
  }
  object CognitoAuthOptions {
    
    inline def apply(AppWebDomain: String, ClientId: String, RedirectUriSignIn: String, RedirectUriSignOut: String): CognitoAuthOptions = {
      val __obj = js.Dynamic.literal(AppWebDomain = AppWebDomain.asInstanceOf[js.Any], ClientId = ClientId.asInstanceOf[js.Any], RedirectUriSignIn = RedirectUriSignIn.asInstanceOf[js.Any], RedirectUriSignOut = RedirectUriSignOut.asInstanceOf[js.Any])
      __obj.asInstanceOf[CognitoAuthOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CognitoAuthOptions] (val x: Self) extends AnyVal {
      
      inline def setAdvancedSecurityDataCollectionFlag(value: Boolean): Self = StObject.set(x, "AdvancedSecurityDataCollectionFlag", value.asInstanceOf[js.Any])
      
      inline def setAdvancedSecurityDataCollectionFlagUndefined: Self = StObject.set(x, "AdvancedSecurityDataCollectionFlag", js.undefined)
      
      inline def setAppWebDomain(value: String): Self = StObject.set(x, "AppWebDomain", value.asInstanceOf[js.Any])
      
      inline def setClientId(value: String): Self = StObject.set(x, "ClientId", value.asInstanceOf[js.Any])
      
      inline def setIdentityProvider(value: String): Self = StObject.set(x, "IdentityProvider", value.asInstanceOf[js.Any])
      
      inline def setIdentityProviderUndefined: Self = StObject.set(x, "IdentityProvider", js.undefined)
      
      inline def setLaunchUri(value: /* url */ String => Unit): Self = StObject.set(x, "LaunchUri", js.Any.fromFunction1(value))
      
      inline def setLaunchUriUndefined: Self = StObject.set(x, "LaunchUri", js.undefined)
      
      inline def setRedirectUriSignIn(value: String): Self = StObject.set(x, "RedirectUriSignIn", value.asInstanceOf[js.Any])
      
      inline def setRedirectUriSignOut(value: String): Self = StObject.set(x, "RedirectUriSignOut", value.asInstanceOf[js.Any])
      
      inline def setStorage(value: CognitoAuthStorage): Self = StObject.set(x, "Storage", value.asInstanceOf[js.Any])
      
      inline def setStorageUndefined: Self = StObject.set(x, "Storage", js.undefined)
      
      inline def setTokenScopesArray(value: js.Array[String]): Self = StObject.set(x, "TokenScopesArray", value.asInstanceOf[js.Any])
      
      inline def setTokenScopesArrayUndefined: Self = StObject.set(x, "TokenScopesArray", js.undefined)
      
      inline def setTokenScopesArrayVarargs(value: String*): Self = StObject.set(x, "TokenScopesArray", js.Array(value*))
      
      inline def setUserPoolId(value: String): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
      
      inline def setUserPoolIdUndefined: Self = StObject.set(x, "UserPoolId", js.undefined)
    }
  }
  
  trait CognitoAuthStorage extends StObject {
    
    /**
      * Returns the current value associated with the given key, or null or
      * undefined if the given key does not exist in the list associated with
      * the object.
      */
    def getItem(key: String): js.UndefOr[String | Null]
    
    /**
      * Removes the key/value pair with the given key from the list associated
      * with the object, if a key/value pair with the given key exists.
      */
    def removeItem(key: String): Unit
    
    /**
      * Sets the value of the pair identified by key to value, creating a new
      * key/value pair if none existed for key previously.
      */
    def setItem(key: String, value: String): Unit
  }
  object CognitoAuthStorage {
    
    inline def apply(
      getItem: String => js.UndefOr[String | Null],
      removeItem: String => Unit,
      setItem: (String, String) => Unit
    ): CognitoAuthStorage = {
      val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
      __obj.asInstanceOf[CognitoAuthStorage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CognitoAuthStorage] (val x: Self) extends AnyVal {
      
      inline def setGetItem(value: String => js.UndefOr[String | Null]): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
      
      inline def setRemoveItem(value: String => Unit): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
      
      inline def setSetItem(value: (String, String) => Unit): Self = StObject.set(x, "setItem", js.Any.fromFunction2(value))
    }
  }
  
  trait CognitoAuthUserHandler extends StObject {
    
    def onFailure(err: Any): Unit
    
    def onSuccess(authSession: CognitoAuthSession): Unit
  }
  object CognitoAuthUserHandler {
    
    inline def apply(onFailure: Any => Unit, onSuccess: CognitoAuthSession => Unit): CognitoAuthUserHandler = {
      val __obj = js.Dynamic.literal(onFailure = js.Any.fromFunction1(onFailure), onSuccess = js.Any.fromFunction1(onSuccess))
      __obj.asInstanceOf[CognitoAuthUserHandler]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CognitoAuthUserHandler] (val x: Self) extends AnyVal {
      
      inline def setOnFailure(value: Any => Unit): Self = StObject.set(x, "onFailure", js.Any.fromFunction1(value))
      
      inline def setOnSuccess(value: CognitoAuthSession => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1(value))
    }
  }
  
  trait CognitoConstants extends StObject {
    
    var ACCESSTOKEN: String
    
    var AMPERSAND: String
    
    var AUTHORIZATIONCODE: String
    
    var CLIENT_ID: String
    
    var CODE: String
    
    var COLONDOUBLESLASH: String
    
    var CONTENTTYPE: String
    
    var CONTENTTYPEVALUE: String
    
    var DOMAIN_PATH_SIGNIN: String
    
    var DOMAIN_PATH_SIGNOUT: String
    
    var DOMAIN_PATH_TOKEN: String
    
    var DOMAIN_QUERY_PARAM_IDENTITY_PROVIDER: String
    
    var DOMAIN_QUERY_PARAM_REDIRECT_URI: String
    
    var DOMAIN_QUERY_PARAM_RESPONSE_TYPE: String
    
    var DOMAIN_QUERY_PARAM_SIGNOUT_URI: String
    
    var DOMAIN_QUERY_PARAM_USERCONTEXTDATA: String
    
    var DOMAIN_SCHEME: String
    
    var EQUALSIGN: String
    
    var ERROR: String
    
    var ERROR_DESCRIPTION: String
    
    var HEADER: ContentType
    
    var HOSTNAMEREGEX: js.RegExp
    
    var IDTOKEN: String
    
    var PARAMETERERROR: String
    
    var POST: String
    
    var POUNDSIGN: String
    
    var QUERYPARAMETERREGEX1: js.RegExp
    
    var QUERYPARAMETERREGEX2: js.RegExp
    
    var QUESTIONMARK: String
    
    var REFRESHTOKEN: String
    
    var SCOPE: String
    
    var SCOPETYPEERROR: String
    
    var SELF: String
    
    var SLASH: String
    
    var SPACE: String
    
    var STATE: String
    
    var STATELENGTH: Double
    
    var STATEORIGINSTRING: String
    
    var STRINGTYPE: String
    
    var TOKEN: String
    
    var UNDEFINED: String
    
    var WITHCREDENTIALS: String
  }
  object CognitoConstants {
    
    inline def apply(
      ACCESSTOKEN: String,
      AMPERSAND: String,
      AUTHORIZATIONCODE: String,
      CLIENT_ID: String,
      CODE: String,
      COLONDOUBLESLASH: String,
      CONTENTTYPE: String,
      CONTENTTYPEVALUE: String,
      DOMAIN_PATH_SIGNIN: String,
      DOMAIN_PATH_SIGNOUT: String,
      DOMAIN_PATH_TOKEN: String,
      DOMAIN_QUERY_PARAM_IDENTITY_PROVIDER: String,
      DOMAIN_QUERY_PARAM_REDIRECT_URI: String,
      DOMAIN_QUERY_PARAM_RESPONSE_TYPE: String,
      DOMAIN_QUERY_PARAM_SIGNOUT_URI: String,
      DOMAIN_QUERY_PARAM_USERCONTEXTDATA: String,
      DOMAIN_SCHEME: String,
      EQUALSIGN: String,
      ERROR: String,
      ERROR_DESCRIPTION: String,
      HEADER: ContentType,
      HOSTNAMEREGEX: js.RegExp,
      IDTOKEN: String,
      PARAMETERERROR: String,
      POST: String,
      POUNDSIGN: String,
      QUERYPARAMETERREGEX1: js.RegExp,
      QUERYPARAMETERREGEX2: js.RegExp,
      QUESTIONMARK: String,
      REFRESHTOKEN: String,
      SCOPE: String,
      SCOPETYPEERROR: String,
      SELF: String,
      SLASH: String,
      SPACE: String,
      STATE: String,
      STATELENGTH: Double,
      STATEORIGINSTRING: String,
      STRINGTYPE: String,
      TOKEN: String,
      UNDEFINED: String,
      WITHCREDENTIALS: String
    ): CognitoConstants = {
      val __obj = js.Dynamic.literal(ACCESSTOKEN = ACCESSTOKEN.asInstanceOf[js.Any], AMPERSAND = AMPERSAND.asInstanceOf[js.Any], AUTHORIZATIONCODE = AUTHORIZATIONCODE.asInstanceOf[js.Any], CLIENT_ID = CLIENT_ID.asInstanceOf[js.Any], CODE = CODE.asInstanceOf[js.Any], COLONDOUBLESLASH = COLONDOUBLESLASH.asInstanceOf[js.Any], CONTENTTYPE = CONTENTTYPE.asInstanceOf[js.Any], CONTENTTYPEVALUE = CONTENTTYPEVALUE.asInstanceOf[js.Any], DOMAIN_PATH_SIGNIN = DOMAIN_PATH_SIGNIN.asInstanceOf[js.Any], DOMAIN_PATH_SIGNOUT = DOMAIN_PATH_SIGNOUT.asInstanceOf[js.Any], DOMAIN_PATH_TOKEN = DOMAIN_PATH_TOKEN.asInstanceOf[js.Any], DOMAIN_QUERY_PARAM_IDENTITY_PROVIDER = DOMAIN_QUERY_PARAM_IDENTITY_PROVIDER.asInstanceOf[js.Any], DOMAIN_QUERY_PARAM_REDIRECT_URI = DOMAIN_QUERY_PARAM_REDIRECT_URI.asInstanceOf[js.Any], DOMAIN_QUERY_PARAM_RESPONSE_TYPE = DOMAIN_QUERY_PARAM_RESPONSE_TYPE.asInstanceOf[js.Any], DOMAIN_QUERY_PARAM_SIGNOUT_URI = DOMAIN_QUERY_PARAM_SIGNOUT_URI.asInstanceOf[js.Any], DOMAIN_QUERY_PARAM_USERCONTEXTDATA = DOMAIN_QUERY_PARAM_USERCONTEXTDATA.asInstanceOf[js.Any], DOMAIN_SCHEME = DOMAIN_SCHEME.asInstanceOf[js.Any], EQUALSIGN = EQUALSIGN.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], ERROR_DESCRIPTION = ERROR_DESCRIPTION.asInstanceOf[js.Any], HEADER = HEADER.asInstanceOf[js.Any], HOSTNAMEREGEX = HOSTNAMEREGEX.asInstanceOf[js.Any], IDTOKEN = IDTOKEN.asInstanceOf[js.Any], PARAMETERERROR = PARAMETERERROR.asInstanceOf[js.Any], POST = POST.asInstanceOf[js.Any], POUNDSIGN = POUNDSIGN.asInstanceOf[js.Any], QUERYPARAMETERREGEX1 = QUERYPARAMETERREGEX1.asInstanceOf[js.Any], QUERYPARAMETERREGEX2 = QUERYPARAMETERREGEX2.asInstanceOf[js.Any], QUESTIONMARK = QUESTIONMARK.asInstanceOf[js.Any], REFRESHTOKEN = REFRESHTOKEN.asInstanceOf[js.Any], SCOPE = SCOPE.asInstanceOf[js.Any], SCOPETYPEERROR = SCOPETYPEERROR.asInstanceOf[js.Any], SELF = SELF.asInstanceOf[js.Any], SLASH = SLASH.asInstanceOf[js.Any], SPACE = SPACE.asInstanceOf[js.Any], STATE = STATE.asInstanceOf[js.Any], STATELENGTH = STATELENGTH.asInstanceOf[js.Any], STATEORIGINSTRING = STATEORIGINSTRING.asInstanceOf[js.Any], STRINGTYPE = STRINGTYPE.asInstanceOf[js.Any], TOKEN = TOKEN.asInstanceOf[js.Any], UNDEFINED = UNDEFINED.asInstanceOf[js.Any], WITHCREDENTIALS = WITHCREDENTIALS.asInstanceOf[js.Any])
      __obj.asInstanceOf[CognitoConstants]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CognitoConstants] (val x: Self) extends AnyVal {
      
      inline def setACCESSTOKEN(value: String): Self = StObject.set(x, "ACCESSTOKEN", value.asInstanceOf[js.Any])
      
      inline def setAMPERSAND(value: String): Self = StObject.set(x, "AMPERSAND", value.asInstanceOf[js.Any])
      
      inline def setAUTHORIZATIONCODE(value: String): Self = StObject.set(x, "AUTHORIZATIONCODE", value.asInstanceOf[js.Any])
      
      inline def setCLIENT_ID(value: String): Self = StObject.set(x, "CLIENT_ID", value.asInstanceOf[js.Any])
      
      inline def setCODE(value: String): Self = StObject.set(x, "CODE", value.asInstanceOf[js.Any])
      
      inline def setCOLONDOUBLESLASH(value: String): Self = StObject.set(x, "COLONDOUBLESLASH", value.asInstanceOf[js.Any])
      
      inline def setCONTENTTYPE(value: String): Self = StObject.set(x, "CONTENTTYPE", value.asInstanceOf[js.Any])
      
      inline def setCONTENTTYPEVALUE(value: String): Self = StObject.set(x, "CONTENTTYPEVALUE", value.asInstanceOf[js.Any])
      
      inline def setDOMAIN_PATH_SIGNIN(value: String): Self = StObject.set(x, "DOMAIN_PATH_SIGNIN", value.asInstanceOf[js.Any])
      
      inline def setDOMAIN_PATH_SIGNOUT(value: String): Self = StObject.set(x, "DOMAIN_PATH_SIGNOUT", value.asInstanceOf[js.Any])
      
      inline def setDOMAIN_PATH_TOKEN(value: String): Self = StObject.set(x, "DOMAIN_PATH_TOKEN", value.asInstanceOf[js.Any])
      
      inline def setDOMAIN_QUERY_PARAM_IDENTITY_PROVIDER(value: String): Self = StObject.set(x, "DOMAIN_QUERY_PARAM_IDENTITY_PROVIDER", value.asInstanceOf[js.Any])
      
      inline def setDOMAIN_QUERY_PARAM_REDIRECT_URI(value: String): Self = StObject.set(x, "DOMAIN_QUERY_PARAM_REDIRECT_URI", value.asInstanceOf[js.Any])
      
      inline def setDOMAIN_QUERY_PARAM_RESPONSE_TYPE(value: String): Self = StObject.set(x, "DOMAIN_QUERY_PARAM_RESPONSE_TYPE", value.asInstanceOf[js.Any])
      
      inline def setDOMAIN_QUERY_PARAM_SIGNOUT_URI(value: String): Self = StObject.set(x, "DOMAIN_QUERY_PARAM_SIGNOUT_URI", value.asInstanceOf[js.Any])
      
      inline def setDOMAIN_QUERY_PARAM_USERCONTEXTDATA(value: String): Self = StObject.set(x, "DOMAIN_QUERY_PARAM_USERCONTEXTDATA", value.asInstanceOf[js.Any])
      
      inline def setDOMAIN_SCHEME(value: String): Self = StObject.set(x, "DOMAIN_SCHEME", value.asInstanceOf[js.Any])
      
      inline def setEQUALSIGN(value: String): Self = StObject.set(x, "EQUALSIGN", value.asInstanceOf[js.Any])
      
      inline def setERROR(value: String): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
      
      inline def setERROR_DESCRIPTION(value: String): Self = StObject.set(x, "ERROR_DESCRIPTION", value.asInstanceOf[js.Any])
      
      inline def setHEADER(value: ContentType): Self = StObject.set(x, "HEADER", value.asInstanceOf[js.Any])
      
      inline def setHOSTNAMEREGEX(value: js.RegExp): Self = StObject.set(x, "HOSTNAMEREGEX", value.asInstanceOf[js.Any])
      
      inline def setIDTOKEN(value: String): Self = StObject.set(x, "IDTOKEN", value.asInstanceOf[js.Any])
      
      inline def setPARAMETERERROR(value: String): Self = StObject.set(x, "PARAMETERERROR", value.asInstanceOf[js.Any])
      
      inline def setPOST(value: String): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
      
      inline def setPOUNDSIGN(value: String): Self = StObject.set(x, "POUNDSIGN", value.asInstanceOf[js.Any])
      
      inline def setQUERYPARAMETERREGEX1(value: js.RegExp): Self = StObject.set(x, "QUERYPARAMETERREGEX1", value.asInstanceOf[js.Any])
      
      inline def setQUERYPARAMETERREGEX2(value: js.RegExp): Self = StObject.set(x, "QUERYPARAMETERREGEX2", value.asInstanceOf[js.Any])
      
      inline def setQUESTIONMARK(value: String): Self = StObject.set(x, "QUESTIONMARK", value.asInstanceOf[js.Any])
      
      inline def setREFRESHTOKEN(value: String): Self = StObject.set(x, "REFRESHTOKEN", value.asInstanceOf[js.Any])
      
      inline def setSCOPE(value: String): Self = StObject.set(x, "SCOPE", value.asInstanceOf[js.Any])
      
      inline def setSCOPETYPEERROR(value: String): Self = StObject.set(x, "SCOPETYPEERROR", value.asInstanceOf[js.Any])
      
      inline def setSELF(value: String): Self = StObject.set(x, "SELF", value.asInstanceOf[js.Any])
      
      inline def setSLASH(value: String): Self = StObject.set(x, "SLASH", value.asInstanceOf[js.Any])
      
      inline def setSPACE(value: String): Self = StObject.set(x, "SPACE", value.asInstanceOf[js.Any])
      
      inline def setSTATE(value: String): Self = StObject.set(x, "STATE", value.asInstanceOf[js.Any])
      
      inline def setSTATELENGTH(value: Double): Self = StObject.set(x, "STATELENGTH", value.asInstanceOf[js.Any])
      
      inline def setSTATEORIGINSTRING(value: String): Self = StObject.set(x, "STATEORIGINSTRING", value.asInstanceOf[js.Any])
      
      inline def setSTRINGTYPE(value: String): Self = StObject.set(x, "STRINGTYPE", value.asInstanceOf[js.Any])
      
      inline def setTOKEN(value: String): Self = StObject.set(x, "TOKEN", value.asInstanceOf[js.Any])
      
      inline def setUNDEFINED(value: String): Self = StObject.set(x, "UNDEFINED", value.asInstanceOf[js.Any])
      
      inline def setWITHCREDENTIALS(value: String): Self = StObject.set(x, "WITHCREDENTIALS", value.asInstanceOf[js.Any])
    }
  }
  
  trait CognitoSessionData extends StObject {
    
    /**
      * The session's access token.
      */
    var AccessToken: js.UndefOr[CognitoAccessToken] = js.undefined
    
    /**
      * The session's Id token.
      */
    var IdToken: js.UndefOr[CognitoIdToken] = js.undefined
    
    /**
      * The session's refresh token.
      */
    var RefreshToken: js.UndefOr[CognitoRefreshToken] = js.undefined
    
    /**
      * The session's state.
      */
    var State: js.UndefOr[String] = js.undefined
    
    /**
      * The session's token scopes.
      */
    var TokenScopes: js.UndefOr[CognitoTokenScopes] = js.undefined
  }
  object CognitoSessionData {
    
    inline def apply(): CognitoSessionData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CognitoSessionData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CognitoSessionData] (val x: Self) extends AnyVal {
      
      inline def setAccessToken(value: CognitoAccessToken): Self = StObject.set(x, "AccessToken", value.asInstanceOf[js.Any])
      
      inline def setAccessTokenUndefined: Self = StObject.set(x, "AccessToken", js.undefined)
      
      inline def setIdToken(value: CognitoIdToken): Self = StObject.set(x, "IdToken", value.asInstanceOf[js.Any])
      
      inline def setIdTokenUndefined: Self = StObject.set(x, "IdToken", js.undefined)
      
      inline def setRefreshToken(value: CognitoRefreshToken): Self = StObject.set(x, "RefreshToken", value.asInstanceOf[js.Any])
      
      inline def setRefreshTokenUndefined: Self = StObject.set(x, "RefreshToken", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
      
      inline def setTokenScopes(value: CognitoTokenScopes): Self = StObject.set(x, "TokenScopes", value.asInstanceOf[js.Any])
      
      inline def setTokenScopesUndefined: Self = StObject.set(x, "TokenScopes", js.undefined)
    }
  }
  
  trait CookieStorageOptions extends StObject {
    
    /**
      * Cookies domain
      */
    var domain: String
    
    /**
      * Cookie expiration (in days, default: 365)
      */
    var expires: js.UndefOr[Double] = js.undefined
    
    /**
      * Cookies path (default: '/')
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * Cookie secure flag (default: true)
      */
    var secure: js.UndefOr[Boolean] = js.undefined
  }
  object CookieStorageOptions {
    
    inline def apply(domain: String): CookieStorageOptions = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
      __obj.asInstanceOf[CookieStorageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CookieStorageOptions] (val x: Self) extends AnyVal {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    }
  }
  
  trait XDomainRequest extends StObject {
    
    def abort(): Unit
    
    def onerror(): Unit
    
    def onload(): Unit
    
    def onprogress(): Unit
    
    def ontimeout(): Unit
    
    def open(method: String, url: String): Unit
    
    val responseText: String
    
    def send(data: String): Unit
    
    var timeout: Double
  }
  object XDomainRequest {
    
    inline def apply(
      abort: () => Unit,
      onerror: () => Unit,
      onload: () => Unit,
      onprogress: () => Unit,
      ontimeout: () => Unit,
      open: (String, String) => Unit,
      responseText: String,
      send: String => Unit,
      timeout: Double
    ): XDomainRequest = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), onerror = js.Any.fromFunction0(onerror), onload = js.Any.fromFunction0(onload), onprogress = js.Any.fromFunction0(onprogress), ontimeout = js.Any.fromFunction0(ontimeout), open = js.Any.fromFunction2(open), responseText = responseText.asInstanceOf[js.Any], send = js.Any.fromFunction1(send), timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[XDomainRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XDomainRequest] (val x: Self) extends AnyVal {
      
      inline def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
      
      inline def setOnerror(value: () => Unit): Self = StObject.set(x, "onerror", js.Any.fromFunction0(value))
      
      inline def setOnload(value: () => Unit): Self = StObject.set(x, "onload", js.Any.fromFunction0(value))
      
      inline def setOnprogress(value: () => Unit): Self = StObject.set(x, "onprogress", js.Any.fromFunction0(value))
      
      inline def setOntimeout(value: () => Unit): Self = StObject.set(x, "ontimeout", js.Any.fromFunction0(value))
      
      inline def setOpen(value: (String, String) => Unit): Self = StObject.set(x, "open", js.Any.fromFunction2(value))
      
      inline def setResponseText(value: String): Self = StObject.set(x, "responseText", value.asInstanceOf[js.Any])
      
      inline def setSend(value: String => Unit): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
}
