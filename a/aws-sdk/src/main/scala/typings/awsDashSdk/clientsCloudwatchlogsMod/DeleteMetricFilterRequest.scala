package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMetricFilterRequest extends js.Object {
  /**
    * The name of the metric filter.
    */
  var filterName: FilterName = js.native
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName = js.native
}

object DeleteMetricFilterRequest {
  @scala.inline
  def apply(filterName: FilterName, logGroupName: LogGroupName): DeleteMetricFilterRequest = {
    val __obj = js.Dynamic.literal(filterName = filterName.asInstanceOf[js.Any], logGroupName = logGroupName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteMetricFilterRequest]
  }
}

