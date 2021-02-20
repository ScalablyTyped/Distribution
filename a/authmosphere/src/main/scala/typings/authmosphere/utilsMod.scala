package typings.authmosphere

import typings.authmosphere.loggerMod.Logger
import typings.authmosphere.oauthconfigMod.CredentialsClientConfig
import typings.authmosphere.oauthconfigMod.CredentialsUserClientConfig
import typings.authmosphere.oauthconfigMod.CredentialsUserConfig
import typings.authmosphere.oauthconfigMod.OAuthConfig
import typings.authmosphere.tokenMod.Token
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  /**
    * Extracts and returns an access_token from an authorization header
    *
    * @param authHeader
    * @returns {any}
    */
  @JSImport("authmosphere/lib/src/utils", "extractAccessToken")
  @js.native
  def extractAccessToken(authHeader: String): js.UndefOr[String] = js.native
  
  @JSImport("authmosphere/lib/src/utils", "extractClientCredentials")
  @js.native
  def extractClientCredentials(options: CredentialsClientConfig | CredentialsUserClientConfig): CredentialsClientConfig = js.native
  
  @JSImport("authmosphere/lib/src/utils", "extractUserCredentials")
  @js.native
  def extractUserCredentials(options: CredentialsUserClientConfig): CredentialsUserConfig = js.native
  @JSImport("authmosphere/lib/src/utils", "extractUserCredentials")
  @js.native
  def extractUserCredentials(options: CredentialsUserConfig): CredentialsUserConfig = js.native
  
  /**
    * Returns a basic authentication header value with the given credentials
    *
    * @param clientId
    * @param clientSecret
    * @returns {string}
    */
  @JSImport("authmosphere/lib/src/utils", "getBasicAuthHeaderValue")
  @js.native
  def getBasicAuthHeaderValue(clientId: String, clientSecret: String): String = js.native
  
  /**
    * Returns a promise containing the file content as json object.
    *
    * @param filePath
    * @param fileName
    * @returns {Promise<any>}
    */
  @JSImport("authmosphere/lib/src/utils", "getFileDataAsObject")
  @js.native
  def getFileDataAsObject(filePath: String, fileName: String): js.Promise[_] = js.native
  
  /**
    * Returns the value of a specified header field from a request
    *
    * @param req
    * @param field The name of the field to return
    * @returns {string} The value of the header field
    */
  @JSImport("authmosphere/lib/src/utils", "getHeaderValue")
  @js.native
  def getHeaderValue(req: Request_[ParamsDictionary, _, _, Query], fieldName: String): js.UndefOr[String] = js.native
  
  @JSImport("authmosphere/lib/src/utils", "isAuthorizationCodeGrantConfig")
  @js.native
  def isAuthorizationCodeGrantConfig(config: OAuthConfig): /* is authmosphere.authmosphere/lib/src/types/OAuthConfig.AuthorizationCodeGrantConfig */ Boolean = js.native
  
  @JSImport("authmosphere/lib/src/utils", "isCredentialsClientConfig")
  @js.native
  def isCredentialsClientConfig(options: Record[String, _]): /* is authmosphere.authmosphere/lib/src/types/OAuthConfig.CredentialsClientConfig */ Boolean = js.native
  
  @JSImport("authmosphere/lib/src/utils", "isCredentialsDirConfig")
  @js.native
  def isCredentialsDirConfig(options: Record[String, _]): /* is authmosphere.authmosphere/lib/src/types/OAuthConfig.CredentialsDirConfig */ Boolean = js.native
  
  @JSImport("authmosphere/lib/src/utils", "isCredentialsUserConfig")
  @js.native
  def isCredentialsUserConfig(options: Record[String, _]): /* is authmosphere.authmosphere/lib/src/types/OAuthConfig.CredentialsUserConfig */ Boolean = js.native
  
  @JSImport("authmosphere/lib/src/utils", "isPasswordGrantNoCredentialsDir")
  @js.native
  def isPasswordGrantNoCredentialsDir(options: Record[String, _]): /* is authmosphere.authmosphere/lib/src/types/OAuthConfig.CredentialsUserClientConfig */ Boolean = js.native
  
  @JSImport("authmosphere/lib/src/utils", "isRefreshGrantConfig")
  @js.native
  def isRefreshGrantConfig(config: OAuthConfig): /* is authmosphere.authmosphere/lib/src/types/OAuthConfig.RefreshGrantConfig */ Boolean = js.native
  
  @JSImport("authmosphere/lib/src/utils", "rejectRequest")
  @js.native
  val rejectRequest: typings.authmosphere.utilsMod.rejectRequest = js.native
  /**
    * Reject a request with the given status code.
    *
    * @param res
    * @param status
    */
  type rejectRequest = js.Function3[/* res */ Response_[js.Any], /* logger */ Logger, /* status */ Double, Unit]
  
  /**
    * Attach scopes on the request object.
    * The `requireScopesMiddleware` relies on this information attribute.
    *
    * ⚠️  This function mutates req.
    *
    * @param req
    * @returns {function(any): undefined}
    */
  @JSImport("authmosphere/lib/src/utils", "setTokeninfo")
  @js.native
  def setTokeninfo(req: Request_[ParamsDictionary, _, _, Query]): js.Function1[/* data */ Token[Record[String, _]], Unit] = js.native
  
  /**
    * Validates options object and throws TypeError if mandatory options is not specified.
    *
    * @param options
    */
  @JSImport("authmosphere/lib/src/utils", "validateOAuthConfig")
  @js.native
  def validateOAuthConfig(options: OAuthConfig): Unit = js.native
}
