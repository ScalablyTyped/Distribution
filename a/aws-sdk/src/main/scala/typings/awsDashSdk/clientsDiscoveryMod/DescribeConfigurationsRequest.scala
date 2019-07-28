package typings.awsDashSdk.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeConfigurationsRequest extends js.Object {
  /**
    * One or more configuration IDs.
    */
  var configurationIds: ConfigurationIdList
}

object DescribeConfigurationsRequest {
  @scala.inline
  def apply(configurationIds: ConfigurationIdList): DescribeConfigurationsRequest = {
    val __obj = js.Dynamic.literal(configurationIds = configurationIds)
  
    __obj.asInstanceOf[DescribeConfigurationsRequest]
  }
}

