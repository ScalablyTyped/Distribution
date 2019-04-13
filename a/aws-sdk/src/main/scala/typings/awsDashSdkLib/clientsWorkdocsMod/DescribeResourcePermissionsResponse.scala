package typings
package awsDashSdkLib.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeResourcePermissionsResponse extends js.Object {
  /**
    * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
    */
  var Marker: js.UndefOr[PageMarkerType] = js.undefined
  /**
    * The principals.
    */
  var Principals: js.UndefOr[PrincipalList] = js.undefined
}

object DescribeResourcePermissionsResponse {
  @scala.inline
  def apply(Marker: PageMarkerType = null, Principals: PrincipalList = null): DescribeResourcePermissionsResponse = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (Principals != null) __obj.updateDynamic("Principals")(Principals)
    __obj.asInstanceOf[DescribeResourcePermissionsResponse]
  }
}

