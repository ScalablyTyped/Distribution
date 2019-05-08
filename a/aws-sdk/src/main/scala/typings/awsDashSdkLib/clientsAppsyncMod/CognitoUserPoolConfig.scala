package typings
package awsDashSdkLib.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CognitoUserPoolConfig extends js.Object {
  /**
    * A regular expression for validating the incoming Amazon Cognito user pool app client ID.
    */
  var appIdClientRegex: js.UndefOr[String] = js.undefined
  /**
    * The AWS Region in which the user pool was created.
    */
  var awsRegion: String
  /**
    * The user pool ID.
    */
  var userPoolId: String
}

object CognitoUserPoolConfig {
  @scala.inline
  def apply(awsRegion: String, userPoolId: String, appIdClientRegex: String = null): CognitoUserPoolConfig = {
    val __obj = js.Dynamic.literal(awsRegion = awsRegion, userPoolId = userPoolId)
    if (appIdClientRegex != null) __obj.updateDynamic("appIdClientRegex")(appIdClientRegex)
    __obj.asInstanceOf[CognitoUserPoolConfig]
  }
}

