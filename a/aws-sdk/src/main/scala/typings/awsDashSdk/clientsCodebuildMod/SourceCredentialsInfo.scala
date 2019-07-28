package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceCredentialsInfo extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the token. 
    */
  var arn: js.UndefOr[NonEmptyString] = js.undefined
  /**
    *  The type of authentication used by the credentials. Valid options are OAUTH, BASIC_AUTH, or PERSONAL_ACCESS_TOKEN. 
    */
  var authType: js.UndefOr[AuthType] = js.undefined
  /**
    *  The type of source provider. The valid options are GITHUB, GITHUB_ENTERPRISE, or BITBUCKET. 
    */
  var serverType: js.UndefOr[ServerType] = js.undefined
}

object SourceCredentialsInfo {
  @scala.inline
  def apply(arn: NonEmptyString = null, authType: AuthType = null, serverType: ServerType = null): SourceCredentialsInfo = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (authType != null) __obj.updateDynamic("authType")(authType.asInstanceOf[js.Any])
    if (serverType != null) __obj.updateDynamic("serverType")(serverType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceCredentialsInfo]
  }
}

