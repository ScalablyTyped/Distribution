package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsIamConfig extends js.Object {
  /**
    * The signing region for AWS IAM authorization.
    */
  var signingRegion: js.UndefOr[String] = js.native
  /**
    * The signing service name for AWS IAM authorization.
    */
  var signingServiceName: js.UndefOr[String] = js.native
}

object AwsIamConfig {
  @scala.inline
  def apply(signingRegion: String = null, signingServiceName: String = null): AwsIamConfig = {
    val __obj = js.Dynamic.literal()
    if (signingRegion != null) __obj.updateDynamic("signingRegion")(signingRegion.asInstanceOf[js.Any])
    if (signingServiceName != null) __obj.updateDynamic("signingServiceName")(signingServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsIamConfig]
  }
}

