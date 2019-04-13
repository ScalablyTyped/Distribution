package typings
package awsDashSdkLib.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPoolConfig extends js.Object {
  /**
    * A regular expression for validating the incoming Amazon Cognito user pool app client ID.
    */
  var appIdClientRegex: js.UndefOr[String] = js.undefined
  /**
    * The AWS Region in which the user pool was created.
    */
  var awsRegion: String
  /**
    * The action that you want your GraphQL API to take when a request that uses Amazon Cognito user pool authentication doesn't match the Amazon Cognito user pool configuration.
    */
  var defaultAction: DefaultAction
  /**
    * The user pool ID.
    */
  var userPoolId: String
}

object UserPoolConfig {
  @scala.inline
  def apply(
    awsRegion: String,
    defaultAction: DefaultAction,
    userPoolId: String,
    appIdClientRegex: String = null
  ): UserPoolConfig = {
    val __obj = js.Dynamic.literal(awsRegion = awsRegion, defaultAction = defaultAction.asInstanceOf[js.Any], userPoolId = userPoolId)
    if (appIdClientRegex != null) __obj.updateDynamic("appIdClientRegex")(appIdClientRegex)
    __obj.asInstanceOf[UserPoolConfig]
  }
}

