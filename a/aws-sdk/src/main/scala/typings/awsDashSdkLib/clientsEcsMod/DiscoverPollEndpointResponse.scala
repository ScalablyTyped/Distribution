package typings
package awsDashSdkLib.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiscoverPollEndpointResponse extends js.Object {
  /**
    * The endpoint for the Amazon ECS agent to poll.
    */
  var endpoint: js.UndefOr[String] = js.undefined
  /**
    * The telemetry endpoint for the Amazon ECS agent.
    */
  var telemetryEndpoint: js.UndefOr[String] = js.undefined
}

object DiscoverPollEndpointResponse {
  @scala.inline
  def apply(endpoint: String = null, telemetryEndpoint: String = null): DiscoverPollEndpointResponse = {
    val __obj = js.Dynamic.literal()
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint)
    if (telemetryEndpoint != null) __obj.updateDynamic("telemetryEndpoint")(telemetryEndpoint)
    __obj.asInstanceOf[DiscoverPollEndpointResponse]
  }
}

