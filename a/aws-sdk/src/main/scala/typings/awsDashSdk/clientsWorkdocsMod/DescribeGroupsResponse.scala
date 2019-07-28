package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeGroupsResponse extends js.Object {
  /**
    * The list of groups.
    */
  var Groups: js.UndefOr[GroupMetadataList] = js.undefined
  /**
    * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
    */
  var Marker: js.UndefOr[MarkerType] = js.undefined
}

object DescribeGroupsResponse {
  @scala.inline
  def apply(Groups: GroupMetadataList = null, Marker: MarkerType = null): DescribeGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (Groups != null) __obj.updateDynamic("Groups")(Groups)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[DescribeGroupsResponse]
  }
}

