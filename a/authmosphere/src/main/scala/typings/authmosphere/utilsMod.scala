package typings.authmosphere

import typings.authmosphere.anon.Accesstoken
import typings.authmosphere.loggerMod.Logger
import typings.authmosphere.oauthconfigMod.CredentialsClientConfig
import typings.authmosphere.oauthconfigMod.CredentialsUserClientConfig
import typings.authmosphere.oauthconfigMod.CredentialsUserConfig
import typings.authmosphere.oauthconfigMod.OAuthConfig
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("authmosphere/lib/src/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  val rejectRequest: typings.authmosphere.utilsMod.rejectRequest = js.native
  /**
    * Extracts and returns an access_token from an authorization header
    *
    * @param authHeader
    * @returns {any}
    */
  def extractAccessToken(authHeader: String): js.UndefOr[String] = js.native
  def extractClientCredentials(options: CredentialsClientConfig | CredentialsUserClientConfig): CredentialsClientConfig = js.native
  def extractUserCredentials(options: CredentialsUserClientConfig): CredentialsUserConfig = js.native
  def extractUserCredentials(options: CredentialsUserConfig): CredentialsUserConfig = js.native
  /**
    * Returns a basic authentication header value with the given credentials
    *
    * @param clientId
    * @param clientSecret
    * @returns {string}
    */
  def getBasicAuthHeaderValue(clientId: String, clientSecret: String): String = js.native
  /**
    * Returns a promise containing the file content as json object.
    *
    * @param filePath
    * @param fileName
    * @returns {Promise<any>}
    */
  def getFileDataAsObject(filePath: String, fileName: String): js.Promise[_] = js.native
  /**
    * Returns the value of a specified header field from a request
    *
    * @param req
    * @param field The name of the field to return
    * @returns {string} The value of the header field
    */
  def getHeaderValue(req: Request_[ParamsDictionary, _, _, Query], fieldName: String): js.UndefOr[String] = js.native
  def isAuthorizationCodeGrantConfig(config: OAuthConfig): /* is authmosphere.authmosphere/lib/src/types/OAuthConfig.AuthorizationCodeGrantConfig */ Boolean = js.native
  def isCredentialsClientConfig(options: js.Any): /* is authmosphere.authmosphere/lib/src/types/OAuthConfig.CredentialsClientConfig */ Boolean = js.native
  def isCredentialsDirConfig(options: js.Any): /* is authmosphere.authmosphere/lib/src/types/OAuthConfig.CredentialsDirConfig */ Boolean = js.native
  def isPasswordGrantNoCredentialsDir(options: js.Any): /* is authmosphere.authmosphere/lib/src/types/OAuthConfig.CredentialsUserClientConfig */ Boolean = js.native
  def isRefreshGrantConfig(config: OAuthConfig): /* is authmosphere.authmosphere/lib/src/types/OAuthConfig.RefreshGrantConfig */ Boolean = js.native
  /**
    * Attach scopes on the request object.
    * The `requireScopesMiddleware` relies on this information attribute.
    *
    * ⚠️  This function mutates req.
    *
    * @param req
    * @returns {function(any): undefined}
    */
  def setTokeninfo(req: Request_[ParamsDictionary, _, _, Query]): js.Function1[/* data */ Accesstoken, Unit] = js.native
  /**
    * Validates options object and throws TypeError if mandatory options is not specified.
    *
    * @param options
    */
  def validateOAuthConfig(options: OAuthConfig): Unit = js.native
  /**
    * Reject a request with the given status code.
    *
    * @param res
    * @param status
    */
  type rejectRequest = js.Function3[/* res */ Response_[js.Any], /* logger */ Logger, /* status */ Double, Unit]
}

