package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HealthCheck extends js.Object {
  /**
    * A unique string that you specified when you created the health check.
    */
  var CallerReference: HealthCheckNonce
  /**
    * A complex type that contains information about the CloudWatch alarm that Amazon Route 53 is monitoring for this health check.
    */
  var CloudWatchAlarmConfiguration: js.UndefOr[typings.awsDashSdk.clientsRoute53Mod.CloudWatchAlarmConfiguration] = js.undefined
  /**
    * A complex type that contains detailed information about one health check.
    */
  var HealthCheckConfig: typings.awsDashSdk.clientsRoute53Mod.HealthCheckConfig
  /**
    * The version of the health check. You can optionally pass this value in a call to UpdateHealthCheck to prevent overwriting another change to the health check.
    */
  var HealthCheckVersion: typings.awsDashSdk.clientsRoute53Mod.HealthCheckVersion
  /**
    * The identifier that Amazon Route 53assigned to the health check when you created it. When you add or update a resource record set, you use this value to specify which health check to use. The value can be up to 64 characters long. 
    */
  var Id: HealthCheckId
  /**
    * If the health check was created by another service, the service that created the health check. When a health check is created by another service, you can't edit or delete it using Amazon Route 53. 
    */
  var LinkedService: js.UndefOr[typings.awsDashSdk.clientsRoute53Mod.LinkedService] = js.undefined
}

object HealthCheck {
  @scala.inline
  def apply(
    CallerReference: HealthCheckNonce,
    HealthCheckConfig: HealthCheckConfig,
    HealthCheckVersion: HealthCheckVersion,
    Id: HealthCheckId,
    CloudWatchAlarmConfiguration: CloudWatchAlarmConfiguration = null,
    LinkedService: LinkedService = null
  ): HealthCheck = {
    val __obj = js.Dynamic.literal(CallerReference = CallerReference, HealthCheckConfig = HealthCheckConfig, HealthCheckVersion = HealthCheckVersion, Id = Id)
    if (CloudWatchAlarmConfiguration != null) __obj.updateDynamic("CloudWatchAlarmConfiguration")(CloudWatchAlarmConfiguration)
    if (LinkedService != null) __obj.updateDynamic("LinkedService")(LinkedService)
    __obj.asInstanceOf[HealthCheck]
  }
}

