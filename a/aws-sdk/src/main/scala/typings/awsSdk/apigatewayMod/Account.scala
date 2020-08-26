package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Account extends js.Object {
  /**
    * The version of the API keys used for the account.
    */
  var apiKeyVersion: js.UndefOr[String] = js.native
  /**
    * The ARN of an Amazon CloudWatch role for the current Account. 
    */
  var cloudwatchRoleArn: js.UndefOr[String] = js.native
  /**
    * A list of features supported for the account. When usage plans are enabled, the features list will include an entry of "UsagePlans".
    */
  var features: js.UndefOr[ListOfString] = js.native
  /**
    * Specifies the API request limits configured for the current Account.
    */
  var throttleSettings: js.UndefOr[ThrottleSettings] = js.native
}

object Account {
  @scala.inline
  def apply(): Account = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Account]
  }
  @scala.inline
  implicit class AccountOps[Self <: Account] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApiKeyVersion(value: String): Self = this.set("apiKeyVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiKeyVersion: Self = this.set("apiKeyVersion", js.undefined)
    @scala.inline
    def setCloudwatchRoleArn(value: String): Self = this.set("cloudwatchRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudwatchRoleArn: Self = this.set("cloudwatchRoleArn", js.undefined)
    @scala.inline
    def setFeaturesVarargs(value: String*): Self = this.set("features", js.Array(value :_*))
    @scala.inline
    def setFeatures(value: ListOfString): Self = this.set("features", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    @scala.inline
    def setThrottleSettings(value: ThrottleSettings): Self = this.set("throttleSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrottleSettings: Self = this.set("throttleSettings", js.undefined)
  }
  
}

