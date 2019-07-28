package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HealthCheckObservation extends js.Object {
  /**
    * The IP address of the Amazon Route 53 health checker that provided the failure reason in StatusReport.
    */
  var IPAddress: js.UndefOr[typings.awsDashSdk.clientsRoute53Mod.IPAddress] = js.undefined
  /**
    * The region of the Amazon Route 53 health checker that provided the status in StatusReport.
    */
  var Region: js.UndefOr[HealthCheckRegion] = js.undefined
  /**
    * A complex type that contains the last failure reason as reported by one Amazon Route 53 health checker and the time of the failed health check.
    */
  var StatusReport: js.UndefOr[typings.awsDashSdk.clientsRoute53Mod.StatusReport] = js.undefined
}

object HealthCheckObservation {
  @scala.inline
  def apply(IPAddress: IPAddress = null, Region: HealthCheckRegion = null, StatusReport: StatusReport = null): HealthCheckObservation = {
    val __obj = js.Dynamic.literal()
    if (IPAddress != null) __obj.updateDynamic("IPAddress")(IPAddress)
    if (Region != null) __obj.updateDynamic("Region")(Region.asInstanceOf[js.Any])
    if (StatusReport != null) __obj.updateDynamic("StatusReport")(StatusReport)
    __obj.asInstanceOf[HealthCheckObservation]
  }
}

