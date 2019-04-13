package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProvisionedProductPlansOutput extends js.Object {
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.undefined
  /**
    * Information about the plans.
    */
  var ProvisionedProductPlans: js.UndefOr[ProvisionedProductPlans] = js.undefined
}

object ListProvisionedProductPlansOutput {
  @scala.inline
  def apply(NextPageToken: PageToken = null, ProvisionedProductPlans: ProvisionedProductPlans = null): ListProvisionedProductPlansOutput = {
    val __obj = js.Dynamic.literal()
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken)
    if (ProvisionedProductPlans != null) __obj.updateDynamic("ProvisionedProductPlans")(ProvisionedProductPlans)
    __obj.asInstanceOf[ListProvisionedProductPlansOutput]
  }
}

