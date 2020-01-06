package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDBProxyTargetsResponse extends js.Object {
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * An arbitrary number of DBProxyTarget objects, containing details of the corresponding targets.
    */
  var Targets: js.UndefOr[TargetList] = js.native
}

object DescribeDBProxyTargetsResponse {
  @scala.inline
  def apply(Marker: String = null, Targets: TargetList = null): DescribeDBProxyTargetsResponse = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (Targets != null) __obj.updateDynamic("Targets")(Targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDBProxyTargetsResponse]
  }
}

