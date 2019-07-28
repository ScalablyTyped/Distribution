package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListLaunchPathsOutput extends js.Object {
  /**
    * Information about the launch path.
    */
  var LaunchPathSummaries: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.LaunchPathSummaries] = js.undefined
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.undefined
}

object ListLaunchPathsOutput {
  @scala.inline
  def apply(LaunchPathSummaries: LaunchPathSummaries = null, NextPageToken: PageToken = null): ListLaunchPathsOutput = {
    val __obj = js.Dynamic.literal()
    if (LaunchPathSummaries != null) __obj.updateDynamic("LaunchPathSummaries")(LaunchPathSummaries)
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken)
    __obj.asInstanceOf[ListLaunchPathsOutput]
  }
}

