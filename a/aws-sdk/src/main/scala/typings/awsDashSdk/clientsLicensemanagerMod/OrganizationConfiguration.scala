package typings.awsDashSdk.clientsLicensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrganizationConfiguration extends js.Object {
  /**
    * Flag to activate AWS Organization integration.
    */
  var EnableIntegration: Boolean
}

object OrganizationConfiguration {
  @scala.inline
  def apply(EnableIntegration: Boolean): OrganizationConfiguration = {
    val __obj = js.Dynamic.literal(EnableIntegration = EnableIntegration)
  
    __obj.asInstanceOf[OrganizationConfiguration]
  }
}

