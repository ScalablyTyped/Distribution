package typings
package awsDashSdkLib.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Latency extends js.Object {
  /**
    * The average latency for the slowest 90 percent of requests over the last 10 seconds.
    */
  var P10: js.UndefOr[NullableDouble] = js.undefined
  /**
    * The average latency for the slowest 50 percent of requests over the last 10 seconds.
    */
  var P50: js.UndefOr[NullableDouble] = js.undefined
  /**
    * The average latency for the slowest 25 percent of requests over the last 10 seconds.
    */
  var P75: js.UndefOr[NullableDouble] = js.undefined
  /**
    * The average latency for the slowest 15 percent of requests over the last 10 seconds.
    */
  var P85: js.UndefOr[NullableDouble] = js.undefined
  /**
    * The average latency for the slowest 10 percent of requests over the last 10 seconds.
    */
  var P90: js.UndefOr[NullableDouble] = js.undefined
  /**
    * The average latency for the slowest 5 percent of requests over the last 10 seconds.
    */
  var P95: js.UndefOr[NullableDouble] = js.undefined
  /**
    * The average latency for the slowest 1 percent of requests over the last 10 seconds.
    */
  var P99: js.UndefOr[NullableDouble] = js.undefined
  /**
    * The average latency for the slowest 0.1 percent of requests over the last 10 seconds.
    */
  var P999: js.UndefOr[NullableDouble] = js.undefined
}

object Latency {
  @scala.inline
  def apply(
    P10: js.UndefOr[NullableDouble] = js.undefined,
    P50: js.UndefOr[NullableDouble] = js.undefined,
    P75: js.UndefOr[NullableDouble] = js.undefined,
    P85: js.UndefOr[NullableDouble] = js.undefined,
    P90: js.UndefOr[NullableDouble] = js.undefined,
    P95: js.UndefOr[NullableDouble] = js.undefined,
    P99: js.UndefOr[NullableDouble] = js.undefined,
    P999: js.UndefOr[NullableDouble] = js.undefined
  ): Latency = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(P10)) __obj.updateDynamic("P10")(P10)
    if (!js.isUndefined(P50)) __obj.updateDynamic("P50")(P50)
    if (!js.isUndefined(P75)) __obj.updateDynamic("P75")(P75)
    if (!js.isUndefined(P85)) __obj.updateDynamic("P85")(P85)
    if (!js.isUndefined(P90)) __obj.updateDynamic("P90")(P90)
    if (!js.isUndefined(P95)) __obj.updateDynamic("P95")(P95)
    if (!js.isUndefined(P99)) __obj.updateDynamic("P99")(P99)
    if (!js.isUndefined(P999)) __obj.updateDynamic("P999")(P999)
    __obj.asInstanceOf[Latency]
  }
}

