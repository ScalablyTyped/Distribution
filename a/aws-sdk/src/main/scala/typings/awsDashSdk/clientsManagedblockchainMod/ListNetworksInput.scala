package typings.awsDashSdk.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListNetworksInput extends js.Object {
  /**
    * An optional framework specifier. If provided, only networks of this framework type are listed.
    */
  var Framework: js.UndefOr[typings.awsDashSdk.clientsManagedblockchainMod.Framework] = js.undefined
  /**
    * The maximum number of networks to list.
    */
  var MaxResults: js.UndefOr[NetworkListMaxResults] = js.undefined
  /**
    * The name of the network.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * An optional status specifier. If provided, only networks currently in this status are listed.
    */
  var Status: js.UndefOr[NetworkStatus] = js.undefined
}

object ListNetworksInput {
  @scala.inline
  def apply(
    Framework: Framework = null,
    MaxResults: js.UndefOr[NetworkListMaxResults] = js.undefined,
    Name: String = null,
    NextToken: PaginationToken = null,
    Status: NetworkStatus = null
  ): ListNetworksInput = {
    val __obj = js.Dynamic.literal()
    if (Framework != null) __obj.updateDynamic("Framework")(Framework.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListNetworksInput]
  }
}

