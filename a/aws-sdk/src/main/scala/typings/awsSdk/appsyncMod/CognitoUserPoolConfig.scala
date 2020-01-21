package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CognitoUserPoolConfig extends js.Object {
  /**
    * A regular expression for validating the incoming Amazon Cognito user pool app client ID.
    */
  var appIdClientRegex: js.UndefOr[String] = js.native
  /**
    * The AWS Region in which the user pool was created.
    */
  var awsRegion: String = js.native
  /**
    * The user pool ID.
    */
  var userPoolId: String = js.native
}

object CognitoUserPoolConfig {
  @scala.inline
  def apply(awsRegion: String, userPoolId: String, appIdClientRegex: String = null): CognitoUserPoolConfig = {
    val __obj = js.Dynamic.literal(awsRegion = awsRegion.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any])
    if (appIdClientRegex != null) __obj.updateDynamic("appIdClientRegex")(appIdClientRegex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CognitoUserPoolConfig]
  }
}

