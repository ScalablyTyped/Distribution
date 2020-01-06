package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDBProxyTargetGroupsResponse extends js.Object {
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * An arbitrary number of DBProxyTargetGroup objects, containing details of the corresponding target groups.
    */
  var TargetGroups: js.UndefOr[TargetGroupList] = js.native
}

object DescribeDBProxyTargetGroupsResponse {
  @scala.inline
  def apply(Marker: String = null, TargetGroups: TargetGroupList = null): DescribeDBProxyTargetGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (TargetGroups != null) __obj.updateDynamic("TargetGroups")(TargetGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDBProxyTargetGroupsResponse]
  }
}

