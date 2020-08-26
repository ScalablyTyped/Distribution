package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizationConfig extends js.Object {
  /**
    * The authorization type required by the HTTP endpoint.    AWS_IAM: The authorization type is Sigv4.  
    */
  var authorizationType: AuthorizationType = js.native
  /**
    * The AWS IAM settings.
    */
  var awsIamConfig: js.UndefOr[AwsIamConfig] = js.native
}

object AuthorizationConfig {
  @scala.inline
  def apply(authorizationType: AuthorizationType): AuthorizationConfig = {
    val __obj = js.Dynamic.literal(authorizationType = authorizationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationConfig]
  }
  @scala.inline
  implicit class AuthorizationConfigOps[Self <: AuthorizationConfig] (val x: Self) extends AnyVal {
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
    def setAuthorizationType(value: AuthorizationType): Self = this.set("authorizationType", value.asInstanceOf[js.Any])
    @scala.inline
    def setAwsIamConfig(value: AwsIamConfig): Self = this.set("awsIamConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsIamConfig: Self = this.set("awsIamConfig", js.undefined)
  }
  
}

