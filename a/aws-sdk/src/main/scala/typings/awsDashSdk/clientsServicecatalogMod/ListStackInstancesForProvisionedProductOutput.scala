package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListStackInstancesForProvisionedProductOutput extends js.Object {
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.undefined
  /**
    * List of stack instances.
    */
  var StackInstances: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.StackInstances] = js.undefined
}

object ListStackInstancesForProvisionedProductOutput {
  @scala.inline
  def apply(NextPageToken: PageToken = null, StackInstances: StackInstances = null): ListStackInstancesForProvisionedProductOutput = {
    val __obj = js.Dynamic.literal()
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken)
    if (StackInstances != null) __obj.updateDynamic("StackInstances")(StackInstances)
    __obj.asInstanceOf[ListStackInstancesForProvisionedProductOutput]
  }
}

