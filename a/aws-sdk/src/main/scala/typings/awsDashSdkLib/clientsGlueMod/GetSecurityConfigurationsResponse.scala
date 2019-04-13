package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSecurityConfigurationsResponse extends js.Object {
  /**
    * A continuation token, if there are more security configurations to return.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
  /**
    * A list of security configurations.
    */
  var SecurityConfigurations: js.UndefOr[SecurityConfigurationList] = js.undefined
}

object GetSecurityConfigurationsResponse {
  @scala.inline
  def apply(NextToken: GenericString = null, SecurityConfigurations: SecurityConfigurationList = null): GetSecurityConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SecurityConfigurations != null) __obj.updateDynamic("SecurityConfigurations")(SecurityConfigurations)
    __obj.asInstanceOf[GetSecurityConfigurationsResponse]
  }
}

