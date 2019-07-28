package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeProvisionedProductPlanOutput extends js.Object {
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.undefined
  /**
    * Information about the plan.
    */
  var ProvisionedProductPlanDetails: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ProvisionedProductPlanDetails] = js.undefined
  /**
    * Information about the resource changes that will occur when the plan is executed.
    */
  var ResourceChanges: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ResourceChanges] = js.undefined
}

object DescribeProvisionedProductPlanOutput {
  @scala.inline
  def apply(
    NextPageToken: PageToken = null,
    ProvisionedProductPlanDetails: ProvisionedProductPlanDetails = null,
    ResourceChanges: ResourceChanges = null
  ): DescribeProvisionedProductPlanOutput = {
    val __obj = js.Dynamic.literal()
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken)
    if (ProvisionedProductPlanDetails != null) __obj.updateDynamic("ProvisionedProductPlanDetails")(ProvisionedProductPlanDetails)
    if (ResourceChanges != null) __obj.updateDynamic("ResourceChanges")(ResourceChanges)
    __obj.asInstanceOf[DescribeProvisionedProductPlanOutput]
  }
}

