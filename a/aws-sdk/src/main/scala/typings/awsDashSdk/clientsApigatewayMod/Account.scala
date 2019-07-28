package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Account extends js.Object {
  /**
    * The version of the API keys used for the account.
    */
  var apiKeyVersion: js.UndefOr[String] = js.undefined
  /**
    * The ARN of an Amazon CloudWatch role for the current Account. 
    */
  var cloudwatchRoleArn: js.UndefOr[String] = js.undefined
  /**
    * A list of features supported for the account. When usage plans are enabled, the features list will include an entry of "UsagePlans".
    */
  var features: js.UndefOr[ListOfString] = js.undefined
  /**
    * Specifies the API request limits configured for the current Account.
    */
  var throttleSettings: js.UndefOr[ThrottleSettings] = js.undefined
}

object Account {
  @scala.inline
  def apply(
    apiKeyVersion: String = null,
    cloudwatchRoleArn: String = null,
    features: ListOfString = null,
    throttleSettings: ThrottleSettings = null
  ): Account = {
    val __obj = js.Dynamic.literal()
    if (apiKeyVersion != null) __obj.updateDynamic("apiKeyVersion")(apiKeyVersion)
    if (cloudwatchRoleArn != null) __obj.updateDynamic("cloudwatchRoleArn")(cloudwatchRoleArn)
    if (features != null) __obj.updateDynamic("features")(features)
    if (throttleSettings != null) __obj.updateDynamic("throttleSettings")(throttleSettings)
    __obj.asInstanceOf[Account]
  }
}

