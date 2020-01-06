package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SamplingTargetDocument extends js.Object {
  /**
    * The percentage of matching requests to instrument, after the reservoir is exhausted.
    */
  var FixedRate: js.UndefOr[Double] = js.native
  /**
    * The number of seconds for the service to wait before getting sampling targets again.
    */
  var Interval: js.UndefOr[NullableInteger] = js.native
  /**
    * The number of requests per second that X-Ray allocated this service.
    */
  var ReservoirQuota: js.UndefOr[NullableInteger] = js.native
  /**
    * When the reservoir quota expires.
    */
  var ReservoirQuotaTTL: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the sampling rule.
    */
  var RuleName: js.UndefOr[String] = js.native
}

object SamplingTargetDocument {
  @scala.inline
  def apply(
    FixedRate: Int | scala.Double = null,
    Interval: Int | scala.Double = null,
    ReservoirQuota: Int | scala.Double = null,
    ReservoirQuotaTTL: Timestamp = null,
    RuleName: String = null
  ): SamplingTargetDocument = {
    val __obj = js.Dynamic.literal()
    if (FixedRate != null) __obj.updateDynamic("FixedRate")(FixedRate.asInstanceOf[js.Any])
    if (Interval != null) __obj.updateDynamic("Interval")(Interval.asInstanceOf[js.Any])
    if (ReservoirQuota != null) __obj.updateDynamic("ReservoirQuota")(ReservoirQuota.asInstanceOf[js.Any])
    if (ReservoirQuotaTTL != null) __obj.updateDynamic("ReservoirQuotaTTL")(ReservoirQuotaTTL.asInstanceOf[js.Any])
    if (RuleName != null) __obj.updateDynamic("RuleName")(RuleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamplingTargetDocument]
  }
}

