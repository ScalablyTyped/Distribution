package typings.awsDashSdk.clientsMigrationhubconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHomeRegionControlsResult extends js.Object {
  /**
    * An array that contains your HomeRegionControl objects.
    */
  var HomeRegionControls: js.UndefOr[typings.awsDashSdk.clientsMigrationhubconfigMod.HomeRegionControls] = js.native
  /**
    * If a NextToken was returned by a previous call, more results are available. To retrieve the next page of results, make the call again using the returned token in NextToken.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object DescribeHomeRegionControlsResult {
  @scala.inline
  def apply(HomeRegionControls: HomeRegionControls = null, NextToken: Token = null): DescribeHomeRegionControlsResult = {
    val __obj = js.Dynamic.literal()
    if (HomeRegionControls != null) __obj.updateDynamic("HomeRegionControls")(HomeRegionControls.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHomeRegionControlsResult]
  }
}

