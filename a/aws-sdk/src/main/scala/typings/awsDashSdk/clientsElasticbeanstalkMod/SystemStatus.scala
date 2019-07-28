package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SystemStatus extends js.Object {
  /**
    * CPU utilization metrics for the instance.
    */
  var CPUUtilization: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.CPUUtilization] = js.undefined
  /**
    * Load average in the last 1-minute, 5-minute, and 15-minute periods. For more information, see Operating System Metrics.
    */
  var LoadAverage: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.LoadAverage] = js.undefined
}

object SystemStatus {
  @scala.inline
  def apply(CPUUtilization: CPUUtilization = null, LoadAverage: LoadAverage = null): SystemStatus = {
    val __obj = js.Dynamic.literal()
    if (CPUUtilization != null) __obj.updateDynamic("CPUUtilization")(CPUUtilization)
    if (LoadAverage != null) __obj.updateDynamic("LoadAverage")(LoadAverage)
    __obj.asInstanceOf[SystemStatus]
  }
}

