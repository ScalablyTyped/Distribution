package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportSourceCredentialsInput extends js.Object {
  /**
    *  The type of authentication used to connect to a GitHub, GitHub Enterprise, or Bitbucket repository. An OAUTH connection is not supported by the API and must be created using the AWS CodeBuild console. 
    */
  var authType: AuthType
  /**
    *  The source provider used for this project. 
    */
  var serverType: ServerType
  /**
    *  Set to false to prevent overwriting the repository source credentials. Set to true to overwrite the repository source credentials. The default value is true. 
    */
  var shouldOverwrite: js.UndefOr[WrapperBoolean] = js.undefined
  /**
    *  For GitHub or GitHub Enterprise, this is the personal access token. For Bitbucket, this is the app password. 
    */
  var token: SensitiveNonEmptyString
  /**
    *  The Bitbucket username when the authType is BASIC_AUTH. This parameter is not valid for other types of source providers or connections. 
    */
  var username: js.UndefOr[NonEmptyString] = js.undefined
}

object ImportSourceCredentialsInput {
  @scala.inline
  def apply(
    authType: AuthType,
    serverType: ServerType,
    token: SensitiveNonEmptyString,
    shouldOverwrite: js.UndefOr[scala.Boolean] = js.undefined,
    username: NonEmptyString = null
  ): ImportSourceCredentialsInput = {
    val __obj = js.Dynamic.literal(authType = authType.asInstanceOf[js.Any], serverType = serverType.asInstanceOf[js.Any], token = token)
    if (!js.isUndefined(shouldOverwrite)) __obj.updateDynamic("shouldOverwrite")(shouldOverwrite)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[ImportSourceCredentialsInput]
  }
}

