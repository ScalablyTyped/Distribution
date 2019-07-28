package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteMetricFilterRequest extends js.Object {
  /**
    * The name of the metric filter.
    */
  var filterName: FilterName
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName
}

object DeleteMetricFilterRequest {
  @scala.inline
  def apply(filterName: FilterName, logGroupName: LogGroupName): DeleteMetricFilterRequest = {
    val __obj = js.Dynamic.literal(filterName = filterName, logGroupName = logGroupName)
  
    __obj.asInstanceOf[DeleteMetricFilterRequest]
  }
}

