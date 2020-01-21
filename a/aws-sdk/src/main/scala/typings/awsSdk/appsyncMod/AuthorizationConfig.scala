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
  def apply(authorizationType: AuthorizationType, awsIamConfig: AwsIamConfig = null): AuthorizationConfig = {
    val __obj = js.Dynamic.literal(authorizationType = authorizationType.asInstanceOf[js.Any])
    if (awsIamConfig != null) __obj.updateDynamic("awsIamConfig")(awsIamConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationConfig]
  }
}

