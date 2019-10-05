package typings.awsDashSdk.clientsServicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceQuotaIncreaseRequestInTemplate extends js.Object {
  /**
    * The AWS Region where the increase request occurs.
    */
  var AwsRegion: js.UndefOr[typings.awsDashSdk.clientsServicequotasMod.AwsRegion] = js.undefined
  /**
    * Identifies the new, increased value of the service quota in the increase request. 
    */
  var DesiredValue: js.UndefOr[QuotaValue] = js.undefined
  /**
    * Specifies if the quota is a global quota.
    */
  var GlobalQuota: js.UndefOr[typings.awsDashSdk.clientsServicequotasMod.GlobalQuota] = js.undefined
  /**
    * The code identifier for the service quota specified in the increase request.
    */
  var QuotaCode: js.UndefOr[typings.awsDashSdk.clientsServicequotasMod.QuotaCode] = js.undefined
  /**
    * The name of the service quota in the increase request.
    */
  var QuotaName: js.UndefOr[typings.awsDashSdk.clientsServicequotasMod.QuotaName] = js.undefined
  /**
    * The code identifier for the AWS service specified in the increase request.
    */
  var ServiceCode: js.UndefOr[typings.awsDashSdk.clientsServicequotasMod.ServiceCode] = js.undefined
  /**
    * The name of the AWS service specified in the increase request. 
    */
  var ServiceName: js.UndefOr[typings.awsDashSdk.clientsServicequotasMod.ServiceName] = js.undefined
  /**
    * The unit of measure for the increase request.
    */
  var Unit: js.UndefOr[QuotaUnit] = js.undefined
}

object ServiceQuotaIncreaseRequestInTemplate {
  @scala.inline
  def apply(
    AwsRegion: AwsRegion = null,
    DesiredValue: Int | Double = null,
    GlobalQuota: js.UndefOr[Boolean] = js.undefined,
    QuotaCode: QuotaCode = null,
    QuotaName: QuotaName = null,
    ServiceCode: ServiceCode = null,
    ServiceName: ServiceName = null,
    Unit: QuotaUnit = null
  ): ServiceQuotaIncreaseRequestInTemplate = {
    val __obj = js.Dynamic.literal()
    if (AwsRegion != null) __obj.updateDynamic("AwsRegion")(AwsRegion)
    if (DesiredValue != null) __obj.updateDynamic("DesiredValue")(DesiredValue.asInstanceOf[js.Any])
    if (!js.isUndefined(GlobalQuota)) __obj.updateDynamic("GlobalQuota")(GlobalQuota)
    if (QuotaCode != null) __obj.updateDynamic("QuotaCode")(QuotaCode)
    if (QuotaName != null) __obj.updateDynamic("QuotaName")(QuotaName)
    if (ServiceCode != null) __obj.updateDynamic("ServiceCode")(ServiceCode)
    if (ServiceName != null) __obj.updateDynamic("ServiceName")(ServiceName)
    if (Unit != null) __obj.updateDynamic("Unit")(Unit)
    __obj.asInstanceOf[ServiceQuotaIncreaseRequestInTemplate]
  }
}

