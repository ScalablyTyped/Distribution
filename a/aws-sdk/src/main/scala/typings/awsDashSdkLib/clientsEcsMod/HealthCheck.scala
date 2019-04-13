package typings
package awsDashSdkLib.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HealthCheck extends js.Object {
  /**
    * A string array representing the command that the container runs to determine if it is healthy. The string array must start with CMD to execute the command arguments directly, or CMD-SHELL to run the command with the container's default shell. For example:  [ "CMD-SHELL", "curl -f http://localhost/ || exit 1" ]  An exit code of 0 indicates success, and non-zero exit code indicates failure. For more information, see HealthCheck in the Create a container section of the Docker Remote API.
    */
  var command: StringList
  /**
    * The time period in seconds between each health check execution. You may specify between 5 and 300 seconds. The default value is 30 seconds.
    */
  var interval: js.UndefOr[BoxedInteger] = js.undefined
  /**
    * The number of times to retry a failed health check before the container is considered unhealthy. You may specify between 1 and 10 retries. The default value is 3.
    */
  var retries: js.UndefOr[BoxedInteger] = js.undefined
  /**
    * The optional grace period within which to provide containers time to bootstrap before failed health checks count towards the maximum number of retries. You may specify between 0 and 300 seconds. The startPeriod is disabled by default.  If a health check succeeds within the startPeriod, then the container is considered healthy and any subsequent failures count toward the maximum number of retries. 
    */
  var startPeriod: js.UndefOr[BoxedInteger] = js.undefined
  /**
    * The time period in seconds to wait for a health check to succeed before it is considered a failure. You may specify between 2 and 60 seconds. The default value is 5.
    */
  var timeout: js.UndefOr[BoxedInteger] = js.undefined
}

object HealthCheck {
  @scala.inline
  def apply(
    command: StringList,
    interval: js.UndefOr[BoxedInteger] = js.undefined,
    retries: js.UndefOr[BoxedInteger] = js.undefined,
    startPeriod: js.UndefOr[BoxedInteger] = js.undefined,
    timeout: js.UndefOr[BoxedInteger] = js.undefined
  ): HealthCheck = {
    val __obj = js.Dynamic.literal(command = command)
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval)
    if (!js.isUndefined(retries)) __obj.updateDynamic("retries")(retries)
    if (!js.isUndefined(startPeriod)) __obj.updateDynamic("startPeriod")(startPeriod)
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[HealthCheck]
  }
}

