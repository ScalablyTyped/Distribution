package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSecurityConfigurationResponse extends js.Object {
  /**
    * The requested security configuration
    */
  var SecurityConfiguration: js.UndefOr[SecurityConfiguration] = js.undefined
}

object GetSecurityConfigurationResponse {
  @scala.inline
  def apply(SecurityConfiguration: SecurityConfiguration = null): GetSecurityConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (SecurityConfiguration != null) __obj.updateDynamic("SecurityConfiguration")(SecurityConfiguration)
    __obj.asInstanceOf[GetSecurityConfigurationResponse]
  }
}

