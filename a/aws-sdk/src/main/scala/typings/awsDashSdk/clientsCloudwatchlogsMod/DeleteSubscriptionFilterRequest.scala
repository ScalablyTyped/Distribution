package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSubscriptionFilterRequest extends js.Object {
  /**
    * The name of the subscription filter.
    */
  var filterName: FilterName
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName
}

object DeleteSubscriptionFilterRequest {
  @scala.inline
  def apply(filterName: FilterName, logGroupName: LogGroupName): DeleteSubscriptionFilterRequest = {
    val __obj = js.Dynamic.literal(filterName = filterName, logGroupName = logGroupName)
  
    __obj.asInstanceOf[DeleteSubscriptionFilterRequest]
  }
}

