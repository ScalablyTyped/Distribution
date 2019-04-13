package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeVpcEndpointConnectionNotificationsResult extends js.Object {
  /**
    * One or more notifications.
    */
  var ConnectionNotificationSet: js.UndefOr[ConnectionNotificationSet] = js.undefined
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeVpcEndpointConnectionNotificationsResult {
  @scala.inline
  def apply(ConnectionNotificationSet: ConnectionNotificationSet = null, NextToken: String = null): DescribeVpcEndpointConnectionNotificationsResult = {
    val __obj = js.Dynamic.literal()
    if (ConnectionNotificationSet != null) __obj.updateDynamic("ConnectionNotificationSet")(ConnectionNotificationSet)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeVpcEndpointConnectionNotificationsResult]
  }
}

