package typings.awsDashSdk.clientsMigrationhubconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHomeRegionControlsRequest extends js.Object {
  /**
    * The ControlID is a unique identifier string of your HomeRegionControl object.
    */
  var ControlId: js.UndefOr[typings.awsDashSdk.clientsMigrationhubconfigMod.ControlId] = js.native
  /**
    * The name of the home region you'd like to view.
    */
  var HomeRegion: js.UndefOr[typings.awsDashSdk.clientsMigrationhubconfigMod.HomeRegion] = js.native
  /**
    * The maximum number of filtering results to display per page. 
    */
  var MaxResults: js.UndefOr[DescribeHomeRegionControlsMaxResults] = js.native
  /**
    * If a NextToken was returned by a previous call, more results are available. To retrieve the next page of results, make the call again using the returned token in NextToken.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * The target parameter specifies the identifier to which the home region is applied, which is always of type ACCOUNT. It applies the home region to the current ACCOUNT.
    */
  var Target: js.UndefOr[typings.awsDashSdk.clientsMigrationhubconfigMod.Target] = js.native
}

object DescribeHomeRegionControlsRequest {
  @scala.inline
  def apply(
    ControlId: ControlId = null,
    HomeRegion: HomeRegion = null,
    MaxResults: Int | Double = null,
    NextToken: Token = null,
    Target: Target = null
  ): DescribeHomeRegionControlsRequest = {
    val __obj = js.Dynamic.literal()
    if (ControlId != null) __obj.updateDynamic("ControlId")(ControlId.asInstanceOf[js.Any])
    if (HomeRegion != null) __obj.updateDynamic("HomeRegion")(HomeRegion.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Target != null) __obj.updateDynamic("Target")(Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHomeRegionControlsRequest]
  }
}

