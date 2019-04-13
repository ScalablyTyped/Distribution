package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateLicenseConfiguration extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the license configuration.
    */
  var LicenseConfigurationArn: js.UndefOr[String] = js.undefined
}

object LaunchTemplateLicenseConfiguration {
  @scala.inline
  def apply(LicenseConfigurationArn: String = null): LaunchTemplateLicenseConfiguration = {
    val __obj = js.Dynamic.literal()
    if (LicenseConfigurationArn != null) __obj.updateDynamic("LicenseConfigurationArn")(LicenseConfigurationArn)
    __obj.asInstanceOf[LaunchTemplateLicenseConfiguration]
  }
}

