package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeWorkspaceBundlesResult extends js.Object {
  /**
    * Information about the bundles.
    */
  var Bundles: js.UndefOr[BundleList] = js.undefined
  /**
    * The token to use to retrieve the next set of results, or null if there are no more results available. This token is valid for one day and must be used within that time frame.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}

object DescribeWorkspaceBundlesResult {
  @scala.inline
  def apply(Bundles: BundleList = null, NextToken: PaginationToken = null): DescribeWorkspaceBundlesResult = {
    val __obj = js.Dynamic.literal()
    if (Bundles != null) __obj.updateDynamic("Bundles")(Bundles)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeWorkspaceBundlesResult]
  }
}

