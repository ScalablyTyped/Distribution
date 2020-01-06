package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProvisionedProductOutput extends js.Object {
  /**
    * Any CloudWatch dashboards that were created when provisioning the product.
    */
  var CloudWatchDashboards: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.CloudWatchDashboards] = js.native
  /**
    * Information about the provisioned product.
    */
  var ProvisionedProductDetail: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ProvisionedProductDetail] = js.native
}

object DescribeProvisionedProductOutput {
  @scala.inline
  def apply(
    CloudWatchDashboards: CloudWatchDashboards = null,
    ProvisionedProductDetail: ProvisionedProductDetail = null
  ): DescribeProvisionedProductOutput = {
    val __obj = js.Dynamic.literal()
    if (CloudWatchDashboards != null) __obj.updateDynamic("CloudWatchDashboards")(CloudWatchDashboards.asInstanceOf[js.Any])
    if (ProvisionedProductDetail != null) __obj.updateDynamic("ProvisionedProductDetail")(ProvisionedProductDetail.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProvisionedProductOutput]
  }
}

