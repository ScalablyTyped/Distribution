package typings.awsDashSdk.clientsCloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTrailsRequest extends js.Object {
  /**
    * Specifies whether to include shadow trails in the response. A shadow trail is the replication in a region of a trail that was created in a different region, or in the case of an organization trail, the replication of an organization trail in member accounts. If you do not include shadow trails, organization trails in a member account and region replication trails will not be returned. The default is true.
    */
  var includeShadowTrails: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies a list of trail names, trail ARNs, or both, of the trails to describe. The format of a trail ARN is:  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail  If an empty list is specified, information for the trail in the current region is returned.   If an empty list is specified and IncludeShadowTrails is false, then information for all trails in the current region is returned.   If an empty list is specified and IncludeShadowTrails is null or true, then information for all trails in the current region and any associated shadow trails in other regions is returned.    If one or more trail names are specified, information is returned only if the names match the names of trails belonging only to the current region. To return information about a trail in another region, you must specify its trail ARN. 
    */
  var trailNameList: js.UndefOr[TrailNameList] = js.undefined
}

object DescribeTrailsRequest {
  @scala.inline
  def apply(includeShadowTrails: js.UndefOr[Boolean] = js.undefined, trailNameList: TrailNameList = null): DescribeTrailsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeShadowTrails)) __obj.updateDynamic("includeShadowTrails")(includeShadowTrails)
    if (trailNameList != null) __obj.updateDynamic("trailNameList")(trailNameList)
    __obj.asInstanceOf[DescribeTrailsRequest]
  }
}

