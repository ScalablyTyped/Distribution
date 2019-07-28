package typings.awsDashSdk.clientsServicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceQuota extends js.Object {
  /**
    * Specifies if the quota value can be increased.
    */
  var Adjustable: js.UndefOr[QuotaAdjustable] = js.undefined
  /**
    * Specifies the ErrorCode and ErrorMessage when success isn't achieved.
    */
  var ErrorReason: js.UndefOr[typings.awsDashSdk.clientsServicequotasMod.ErrorReason] = js.undefined
  /**
    * Specifies if the quota is global.
    */
  var GlobalQuota: js.UndefOr[typings.awsDashSdk.clientsServicequotasMod.GlobalQuota] = js.undefined
  /**
    * Identifies the unit and value of how time is measured.
    */
  var Period: js.UndefOr[QuotaPeriod] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the service quota.
    */
  var QuotaArn: js.UndefOr[typings.awsDashSdk.clientsServicequotasMod.QuotaArn] = js.undefined
  /**
    * The code identifier for the service quota specified.
    */
  var QuotaCode: js.UndefOr[typings.awsDashSdk.clientsServicequotasMod.QuotaCode] = js.undefined
  /**
    * The name identifier of the service quota.
    */
  var QuotaName: js.UndefOr[typings.awsDashSdk.clientsServicequotasMod.QuotaName] = js.undefined
  /**
    * Specifies the service that you want to use.
    */
  var ServiceCode: js.UndefOr[typings.awsDashSdk.clientsServicequotasMod.ServiceCode] = js.undefined
  /**
    * The name of the AWS service specified in the increase request. 
    */
  var ServiceName: js.UndefOr[typings.awsDashSdk.clientsServicequotasMod.ServiceName] = js.undefined
  /**
    * The unit of measurement for the value of the service quota.
    */
  var Unit: js.UndefOr[QuotaUnit] = js.undefined
  /**
    * Specifies the details about the measurement. 
    */
  var UsageMetric: js.UndefOr[MetricInfo] = js.undefined
  /**
    * The value of service quota.
    */
  var Value: js.UndefOr[QuotaValue] = js.undefined
}

object ServiceQuota {
  @scala.inline
  def apply(
    Adjustable: js.UndefOr[QuotaAdjustable] = js.undefined,
    ErrorReason: ErrorReason = null,
    GlobalQuota: js.UndefOr[GlobalQuota] = js.undefined,
    Period: QuotaPeriod = null,
    QuotaArn: QuotaArn = null,
    QuotaCode: QuotaCode = null,
    QuotaName: QuotaName = null,
    ServiceCode: ServiceCode = null,
    ServiceName: ServiceName = null,
    Unit: QuotaUnit = null,
    UsageMetric: MetricInfo = null,
    Value: js.UndefOr[QuotaValue] = js.undefined
  ): ServiceQuota = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Adjustable)) __obj.updateDynamic("Adjustable")(Adjustable)
    if (ErrorReason != null) __obj.updateDynamic("ErrorReason")(ErrorReason)
    if (!js.isUndefined(GlobalQuota)) __obj.updateDynamic("GlobalQuota")(GlobalQuota)
    if (Period != null) __obj.updateDynamic("Period")(Period)
    if (QuotaArn != null) __obj.updateDynamic("QuotaArn")(QuotaArn)
    if (QuotaCode != null) __obj.updateDynamic("QuotaCode")(QuotaCode)
    if (QuotaName != null) __obj.updateDynamic("QuotaName")(QuotaName)
    if (ServiceCode != null) __obj.updateDynamic("ServiceCode")(ServiceCode)
    if (ServiceName != null) __obj.updateDynamic("ServiceName")(ServiceName)
    if (Unit != null) __obj.updateDynamic("Unit")(Unit)
    if (UsageMetric != null) __obj.updateDynamic("UsageMetric")(UsageMetric)
    if (!js.isUndefined(Value)) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[ServiceQuota]
  }
}

