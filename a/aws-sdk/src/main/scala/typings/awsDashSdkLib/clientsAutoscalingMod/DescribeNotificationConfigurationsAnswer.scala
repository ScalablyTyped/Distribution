package typings
package awsDashSdkLib.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeNotificationConfigurationsAnswer extends js.Object {
  /**
    * A string that indicates that the response contains more items than can be returned in a single response. To receive additional items, specify this string for the NextToken value when requesting the next set of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[XmlString] = js.undefined
  /**
    * The notification configurations.
    */
  var NotificationConfigurations: awsDashSdkLib.clientsAutoscalingMod.NotificationConfigurations
}

object DescribeNotificationConfigurationsAnswer {
  @scala.inline
  def apply(NotificationConfigurations: NotificationConfigurations, NextToken: XmlString = null): DescribeNotificationConfigurationsAnswer = {
    val __obj = js.Dynamic.literal(NotificationConfigurations = NotificationConfigurations)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeNotificationConfigurationsAnswer]
  }
}

