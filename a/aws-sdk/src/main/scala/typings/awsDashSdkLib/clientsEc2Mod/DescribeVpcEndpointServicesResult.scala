package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeVpcEndpointServicesResult extends js.Object {
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * Information about the service.
    */
  var ServiceDetails: js.UndefOr[ServiceDetailSet] = js.undefined
  /**
    * A list of supported services.
    */
  var ServiceNames: js.UndefOr[ValueStringList] = js.undefined
}

object DescribeVpcEndpointServicesResult {
  @scala.inline
  def apply(
    NextToken: String = null,
    ServiceDetails: ServiceDetailSet = null,
    ServiceNames: ValueStringList = null
  ): DescribeVpcEndpointServicesResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ServiceDetails != null) __obj.updateDynamic("ServiceDetails")(ServiceDetails)
    if (ServiceNames != null) __obj.updateDynamic("ServiceNames")(ServiceNames)
    __obj.asInstanceOf[DescribeVpcEndpointServicesResult]
  }
}

