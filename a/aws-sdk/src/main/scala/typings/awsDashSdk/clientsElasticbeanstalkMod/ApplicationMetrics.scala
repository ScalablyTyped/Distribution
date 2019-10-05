package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationMetrics extends js.Object {
  /**
    * The amount of time that the metrics cover (usually 10 seconds). For example, you might have 5 requests (request_count) within the most recent time slice of 10 seconds (duration).
    */
  var Duration: js.UndefOr[NullableInteger] = js.undefined
  /**
    * Represents the average latency for the slowest X percent of requests over the last 10 seconds. Latencies are in seconds with one millisecond resolution.
    */
  var Latency: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.Latency] = js.undefined
  /**
    * Average number of requests handled by the web server per second over the last 10 seconds.
    */
  var RequestCount: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.RequestCount] = js.undefined
  /**
    * Represents the percentage of requests over the last 10 seconds that resulted in each type of status code response.
    */
  var StatusCodes: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.StatusCodes] = js.undefined
}

object ApplicationMetrics {
  @scala.inline
  def apply(
    Duration: Int | Double = null,
    Latency: Latency = null,
    RequestCount: Int | Double = null,
    StatusCodes: StatusCodes = null
  ): ApplicationMetrics = {
    val __obj = js.Dynamic.literal()
    if (Duration != null) __obj.updateDynamic("Duration")(Duration.asInstanceOf[js.Any])
    if (Latency != null) __obj.updateDynamic("Latency")(Latency)
    if (RequestCount != null) __obj.updateDynamic("RequestCount")(RequestCount.asInstanceOf[js.Any])
    if (StatusCodes != null) __obj.updateDynamic("StatusCodes")(StatusCodes)
    __obj.asInstanceOf[ApplicationMetrics]
  }
}

