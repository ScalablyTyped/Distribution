package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeProvisionedProductOutput extends js.Object {
  /**
    * Any CloudWatch dashboards that were created when provisioning the product.
    */
  var CloudWatchDashboards: js.UndefOr[CloudWatchDashboards] = js.undefined
  /**
    * Information about the provisioned product.
    */
  var ProvisionedProductDetail: js.UndefOr[ProvisionedProductDetail] = js.undefined
}

object DescribeProvisionedProductOutput {
  @scala.inline
  def apply(
    CloudWatchDashboards: CloudWatchDashboards = null,
    ProvisionedProductDetail: ProvisionedProductDetail = null
  ): DescribeProvisionedProductOutput = {
    val __obj = js.Dynamic.literal()
    if (CloudWatchDashboards != null) __obj.updateDynamic("CloudWatchDashboards")(CloudWatchDashboards)
    if (ProvisionedProductDetail != null) __obj.updateDynamic("ProvisionedProductDetail")(ProvisionedProductDetail)
    __obj.asInstanceOf[DescribeProvisionedProductOutput]
  }
}

