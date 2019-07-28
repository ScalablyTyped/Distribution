package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigureHealthCheckOutput extends js.Object {
  /**
    * The updated health check.
    */
  var HealthCheck: js.UndefOr[typings.awsDashSdk.clientsElbMod.HealthCheck] = js.undefined
}

object ConfigureHealthCheckOutput {
  @scala.inline
  def apply(HealthCheck: HealthCheck = null): ConfigureHealthCheckOutput = {
    val __obj = js.Dynamic.literal()
    if (HealthCheck != null) __obj.updateDynamic("HealthCheck")(HealthCheck)
    __obj.asInstanceOf[ConfigureHealthCheckOutput]
  }
}

