package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCapacityProvidersResponse extends js.Object {
  /**
    * The list of capacity providers.
    */
  var capacityProviders: js.UndefOr[CapacityProviders] = js.native
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[Failures] = js.native
  /**
    * The nextToken value to include in a future DescribeCapacityProviders request. When the results of a DescribeCapacityProviders request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object DescribeCapacityProvidersResponse {
  @scala.inline
  def apply(capacityProviders: CapacityProviders = null, failures: Failures = null, nextToken: String = null): DescribeCapacityProvidersResponse = {
    val __obj = js.Dynamic.literal()
    if (capacityProviders != null) __obj.updateDynamic("capacityProviders")(capacityProviders.asInstanceOf[js.Any])
    if (failures != null) __obj.updateDynamic("failures")(failures.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCapacityProvidersResponse]
  }
}

