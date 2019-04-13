package typings
package awsDashSdkLib.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeConfigurationsResponse extends js.Object {
  /**
    * A key in the response map. The value is an array of data.
    */
  var configurations: js.UndefOr[DescribeConfigurationsAttributes] = js.undefined
}

object DescribeConfigurationsResponse {
  @scala.inline
  def apply(configurations: DescribeConfigurationsAttributes = null): DescribeConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    if (configurations != null) __obj.updateDynamic("configurations")(configurations)
    __obj.asInstanceOf[DescribeConfigurationsResponse]
  }
}

