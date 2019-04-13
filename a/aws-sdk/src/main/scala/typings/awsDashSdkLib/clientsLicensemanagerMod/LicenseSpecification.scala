package typings
package awsDashSdkLib.clientsLicensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LicenseSpecification extends js.Object {
  /**
    * ARN of the LicenseConfiguration object.
    */
  var LicenseConfigurationArn: String
}

object LicenseSpecification {
  @scala.inline
  def apply(LicenseConfigurationArn: String): LicenseSpecification = {
    val __obj = js.Dynamic.literal(LicenseConfigurationArn = LicenseConfigurationArn)
  
    __obj.asInstanceOf[LicenseSpecification]
  }
}

