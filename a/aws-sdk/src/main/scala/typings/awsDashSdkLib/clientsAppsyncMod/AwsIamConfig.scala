package typings
package awsDashSdkLib.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AwsIamConfig extends js.Object {
  /**
    * The signing region for AWS IAM authorization.
    */
  var signingRegion: js.UndefOr[String] = js.undefined
  /**
    * The signing service name for AWS IAM authorization.
    */
  var signingServiceName: js.UndefOr[String] = js.undefined
}

object AwsIamConfig {
  @scala.inline
  def apply(signingRegion: String = null, signingServiceName: String = null): AwsIamConfig = {
    val __obj = js.Dynamic.literal()
    if (signingRegion != null) __obj.updateDynamic("signingRegion")(signingRegion)
    if (signingServiceName != null) __obj.updateDynamic("signingServiceName")(signingServiceName)
    __obj.asInstanceOf[AwsIamConfig]
  }
}

