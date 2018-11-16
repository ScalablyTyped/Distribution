package typings
package amazonDashCognitoDashAuthDashJsLib.amazonDashCognitoDashAuthDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amazon-cognito-auth-js", "CognitoAuth")
@js.native
class CognitoAuth protected () extends js.Object {
  /**
       * Constructs a new CognitoAuth object
       * @param options Creation options
       */
  def this(options: CognitoAuthOptions) = this()
  /**
       * Called on success or error.
       */
  var userhandler: CognitoAuthUserHandler = js.native
  /**
       * This is used to save the session tokens and scopes to local storage.
       */
  def cacheTokensScopes(): scala.Unit = js.native
  /**
       * This is used to clear the session tokens and scopes from local storage
       */
  def clearCachedTokensScopes(): scala.Unit = js.native
  /**
       * Compare two sets if they are identical.
       * @param set1 one set
       * @param set2 the other set
       * @returns boolean value is true if two sets are identical
       */
  def compareSets(set1: stdLib.ReadonlySet[_], set2: stdLib.ReadonlySet[_]): scala.Boolean = js.native
  /**
       * Create the XHR object
       * @param method which method to call
       * @param url the url string
       * @returns xhr
       */
  def createCORSRequest(method: java.lang.String, url: java.lang.String): stdLib.XMLHttpRequest | XDomainRequest = js.native
  /**
       * helper function to generate a random string
       * @param length the length of string
       * @param chars a original string
       * @returns a random value.
       */
  def generateRandomString(length: scala.Double, chars: java.lang.String): java.lang.String = js.native
  /**
       * @returns the app web domain
       */
  def getAppWebDomain(): java.lang.String = js.native
  /**
       * Get cached tokens and scopes and return a new session using all the cached data.
       * @returns the auth session
       */
  def getCachedSession(): CognitoAuthSession = js.native
  /**
       * @returns the client id
       */
  def getClientId(): java.lang.String = js.native
  /**
       * Get the query parameter map and proceed according to code response type.
       * @param Query parameter map
       */
  def getCodeQueryParameter(map: stdLib.ReadonlyMap[java.lang.String, java.lang.String]): scala.Unit = js.native
  /**
       * @returns the constants
       */
  def getCognitoConstants(): CognitoConstants = js.native
  /**
       * method for getting the current user of the application from the local storage
       *
       * @returns the user retrieved from storage
       */
  def getCurrentUser(): java.lang.String = js.native
  /**
       * Create the FQDN(fully qualified domain name) for authorization endpoint.
       * @returns url
       */
  def getFQDNSignIn(): java.lang.String = js.native
  /**
       * Create the FQDN(fully qualified domain name) for signout endpoint.
       * @returns url
       */
  def getFQDNSignOut(): java.lang.String = js.native
  /**
       * Get the hostname from url.
       * @param url the url string
       * @returns hostname string
       */
  def getHostName(url: java.lang.String): java.lang.String = js.native
  /**
       * This is used to get last signed in user from local storage
       * @returns the last user name
       */
  def getLastUser(): java.lang.String = js.native
  /**
       * Get http query parameters and return them as a map.
       * @param url the url string
       * @param splitMark query parameters split mark (prefix)
       * @returns map
       */
  def getQueryParameters(url: java.lang.String, splitMark: java.lang.String): stdLib.Map[java.lang.String, java.lang.String] = js.native
  /**
       * This is used to get a session, either from the session object or from the local storage, or by using a refresh token
       * @param RedirectUriSignIn Required: The redirect Uri, which will be launched after authentication.
       * @param TokenScopesArray Required: The token scopes, it is an array of strings specifying all scopes for the tokens.
       */
  def getSession(): scala.Unit = js.native
  /**
       * @returns the current session for this user
       */
  def getSignInUserSession(): CognitoAuthSession = js.native
  /**
       * @returns scopes string
       */
  def getSpaceSeperatedScopeString(): java.lang.String = js.native
  /**
       * @returns the user's state
       */
  def getState(): java.lang.String = js.native
  /**
       * Get the query parameter map and proceed according to token response type.
       * @param Query parameter map
       */
  def getTokenQueryParameter(map: stdLib.ReadonlyMap[java.lang.String, java.lang.String]): scala.Unit = js.native
  /**
       * This method returns the encoded data string used for cognito advanced security feature.
       * This would be generated only when developer has included the JS used for collecting the
       * data on their client. Please refer to documentation to know more about using AdvancedSecurity
       * features
       */
  def getUserContextData(): java.lang.String = js.native
  /**
       * @returns the user's username
       */
  def getUsername(): java.lang.String = js.native
  /**
       * Helper method to let the user know if he has either a valid cached session
       * or a valid authenticated session from the app integration callback.
       * @returns userSignedIn
       */
  def isUserSignedIn(): scala.Boolean = js.native
  /**
       * Launch Cognito Auth UI page.
       * @param URL the url to launch
       */
  def launchUri(URL: java.lang.String): scala.Unit = js.native
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
    url: java.lang.String,
    onSuccess: js.Function1[/* responseText */ java.lang.String, scala.Unit],
    onFailure: js.Function1[/* responseText */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
       * The http POST request onFailure callback.
       * @param err the error object
       */
  def onFailure(err: js.Any): scala.Unit = js.native
  /**
       * The http POST request onSuccess callback when exchanging code for tokens.
       * @param jsonData tokens
       */
  def onSuccessExchangeForToken(jsonData: java.lang.String): scala.Unit = js.native
  /**
       * The http POST request onSuccess callback when refreshing tokens.
       * @param jsonData tokens
       */
  def onSuccessRefreshToken(jsonData: java.lang.String): scala.Unit = js.native
  /**
       * Parse the http request response and proceed according to different response types.
       * @param httpRequestResponse the http request response
       */
  def parseCognitoWebResponse(httpRequestResponse: java.lang.String): scala.Unit = js.native
  /**
       * This is used to build a user session from tokens retrieved in the authentication result
       * @param refreshToken Successful auth response from server.
       */
  def refreshSession(refreshToken: java.lang.String): scala.Unit = js.native
  /**
       * @param State the user's state
       */
  def setState(State: java.lang.String): scala.Unit = js.native
  /**
       * method for setting the current user's name
       * @param Username the user's name
       */
  def setUser(Username: java.lang.String): scala.Unit = js.native
  /**
       * @param Username the user's username
       */
  def setUsername(Username: java.lang.String): scala.Unit = js.native
  /**
       * Sign out the user.
       */
  def signOut(): scala.Unit = js.native
  /**
       * sets response type to 'code'
       */
  def useCodeGrantFlow(): scala.Unit = js.native
  /**
       * sets response type to 'token'
       */
  def useImplicitFlow(): scala.Unit = js.native
}

