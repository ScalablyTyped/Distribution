package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPoolConfig extends js.Object {
  /**
    * A regular expression for validating the incoming Amazon Cognito user pool app client ID.
    */
  var appIdClientRegex: js.UndefOr[String] = js.native
  /**
    * The AWS Region in which the user pool was created.
    */
  var awsRegion: String = js.native
  /**
    * The action that you want your GraphQL API to take when a request that uses Amazon Cognito user pool authentication doesn't match the Amazon Cognito user pool configuration.
    */
  var defaultAction: DefaultAction = js.native
  /**
    * The user pool ID.
    */
  var userPoolId: String = js.native
}

object UserPoolConfig {
  @scala.inline
  def apply(
    awsRegion: String,
    defaultAction: DefaultAction,
    userPoolId: String,
    appIdClientRegex: String = null
  ): UserPoolConfig = {
    val __obj = js.Dynamic.literal(awsRegion = awsRegion.asInstanceOf[js.Any], defaultAction = defaultAction.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any])
    if (appIdClientRegex != null) __obj.updateDynamic("appIdClientRegex")(appIdClientRegex.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolConfig]
  }
}

