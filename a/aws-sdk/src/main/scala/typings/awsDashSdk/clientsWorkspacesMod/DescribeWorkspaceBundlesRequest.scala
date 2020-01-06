package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeWorkspaceBundlesRequest extends js.Object {
  /**
    * The identifiers of the bundles. You cannot combine this parameter with any other filter.
    */
  var BundleIds: js.UndefOr[BundleIdList] = js.native
  /**
    * The token for the next set of results. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The owner of the bundles. You cannot combine this parameter with any other filter. Specify AMAZON to describe the bundles provided by AWS or null to describe the bundles that belong to your account.
    */
  var Owner: js.UndefOr[BundleOwner] = js.native
}

object DescribeWorkspaceBundlesRequest {
  @scala.inline
  def apply(BundleIds: BundleIdList = null, NextToken: PaginationToken = null, Owner: BundleOwner = null): DescribeWorkspaceBundlesRequest = {
    val __obj = js.Dynamic.literal()
    if (BundleIds != null) __obj.updateDynamic("BundleIds")(BundleIds.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Owner != null) __obj.updateDynamic("Owner")(Owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWorkspaceBundlesRequest]
  }
}

