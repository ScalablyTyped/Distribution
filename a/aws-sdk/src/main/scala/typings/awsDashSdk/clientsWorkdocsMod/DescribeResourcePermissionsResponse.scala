package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeResourcePermissionsResponse extends js.Object {
  /**
    * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
    */
  var Marker: js.UndefOr[PageMarkerType] = js.native
  /**
    * The principals.
    */
  var Principals: js.UndefOr[PrincipalList] = js.native
}

object DescribeResourcePermissionsResponse {
  @scala.inline
  def apply(Marker: PageMarkerType = null, Principals: PrincipalList = null): DescribeResourcePermissionsResponse = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (Principals != null) __obj.updateDynamic("Principals")(Principals.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeResourcePermissionsResponse]
  }
}

