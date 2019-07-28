package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeRouteTablesResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * Information about one or more route tables.
    */
  var RouteTables: js.UndefOr[RouteTableList] = js.undefined
}

object DescribeRouteTablesResult {
  @scala.inline
  def apply(NextToken: String = null, RouteTables: RouteTableList = null): DescribeRouteTablesResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (RouteTables != null) __obj.updateDynamic("RouteTables")(RouteTables)
    __obj.asInstanceOf[DescribeRouteTablesResult]
  }
}

