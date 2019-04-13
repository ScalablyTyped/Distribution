package typings
package awsDashSdkLib.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SamplingTargetDocument extends js.Object {
  /**
    * The percentage of matching requests to instrument, after the reservoir is exhausted.
    */
  var FixedRate: js.UndefOr[Double] = js.undefined
  /**
    * The number of seconds for the service to wait before getting sampling targets again.
    */
  var Interval: js.UndefOr[NullableInteger] = js.undefined
  /**
    * The number of requests per second that X-Ray allocated this service.
    */
  var ReservoirQuota: js.UndefOr[NullableInteger] = js.undefined
  /**
    * When the reservoir quota expires.
    */
  var ReservoirQuotaTTL: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name of the sampling rule.
    */
  var RuleName: js.UndefOr[String] = js.undefined
}

object SamplingTargetDocument {
  @scala.inline
  def apply(
    FixedRate: js.UndefOr[Double] = js.undefined,
    Interval: js.UndefOr[NullableInteger] = js.undefined,
    ReservoirQuota: js.UndefOr[NullableInteger] = js.undefined,
    ReservoirQuotaTTL: Timestamp = null,
    RuleName: String = null
  ): SamplingTargetDocument = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(FixedRate)) __obj.updateDynamic("FixedRate")(FixedRate)
    if (!js.isUndefined(Interval)) __obj.updateDynamic("Interval")(Interval)
    if (!js.isUndefined(ReservoirQuota)) __obj.updateDynamic("ReservoirQuota")(ReservoirQuota)
    if (ReservoirQuotaTTL != null) __obj.updateDynamic("ReservoirQuotaTTL")(ReservoirQuotaTTL)
    if (RuleName != null) __obj.updateDynamic("RuleName")(RuleName)
    __obj.asInstanceOf[SamplingTargetDocument]
  }
}

