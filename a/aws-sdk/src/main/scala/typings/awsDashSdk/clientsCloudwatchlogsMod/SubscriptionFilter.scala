package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionFilter extends js.Object {
  /**
    * The creation time of the subscription filter, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var creationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the destination.
    */
  var destinationArn: js.UndefOr[DestinationArn] = js.undefined
  var distribution: js.UndefOr[Distribution] = js.undefined
  /**
    * The name of the subscription filter.
    */
  var filterName: js.UndefOr[FilterName] = js.undefined
  var filterPattern: js.UndefOr[FilterPattern] = js.undefined
  /**
    * The name of the log group.
    */
  var logGroupName: js.UndefOr[LogGroupName] = js.undefined
  /**
    * 
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
}

object SubscriptionFilter {
  @scala.inline
  def apply(
    creationTime: js.UndefOr[Timestamp] = js.undefined,
    destinationArn: DestinationArn = null,
    distribution: Distribution = null,
    filterName: FilterName = null,
    filterPattern: FilterPattern = null,
    logGroupName: LogGroupName = null,
    roleArn: RoleArn = null
  ): SubscriptionFilter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(creationTime)) __obj.updateDynamic("creationTime")(creationTime)
    if (destinationArn != null) __obj.updateDynamic("destinationArn")(destinationArn)
    if (distribution != null) __obj.updateDynamic("distribution")(distribution.asInstanceOf[js.Any])
    if (filterName != null) __obj.updateDynamic("filterName")(filterName)
    if (filterPattern != null) __obj.updateDynamic("filterPattern")(filterPattern)
    if (logGroupName != null) __obj.updateDynamic("logGroupName")(logGroupName)
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn)
    __obj.asInstanceOf[SubscriptionFilter]
  }
}

