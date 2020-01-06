package typings.awsDashSdk.clientsServicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceQuotaIncreaseRequestInTemplate extends js.Object {
  /**
    * The AWS Region where the increase request occurs.
    */
  var AwsRegion: js.UndefOr[typings.awsDashSdk.clientsServicequotasMod.AwsRegion] = js.native
  /**
    * Identifies the new, increased value of the service quota in the increase request. 
    */
  var DesiredValue: js.UndefOr[QuotaValue] = js.native
  /**
    * Specifies if the quota is a global quota.
    */
  var GlobalQuota: js.UndefOr[typings.awsDashSdk.clientsServicequotasMod.GlobalQuota] = js.native
  /**
    * The code identifier for the service quota specified in the increase request.
    */
  var QuotaCode: js.UndefOr[typings.awsDashSdk.clientsServicequotasMod.QuotaCode] = js.native
  /**
    * The name of the service quota in the increase request.
    */
  var QuotaName: js.UndefOr[typings.awsDashSdk.clientsServicequotasMod.QuotaName] = js.native
  /**
    * The code identifier for the AWS service specified in the increase request.
    */
  var ServiceCode: js.UndefOr[typings.awsDashSdk.clientsServicequotasMod.ServiceCode] = js.native
  /**
    * The name of the AWS service specified in the increase request. 
    */
  var ServiceName: js.UndefOr[typings.awsDashSdk.clientsServicequotasMod.ServiceName] = js.native
  /**
    * The unit of measure for the increase request.
    */
  var Unit: js.UndefOr[QuotaUnit] = js.native
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
    if (AwsRegion != null) __obj.updateDynamic("AwsRegion")(AwsRegion.asInstanceOf[js.Any])
    if (DesiredValue != null) __obj.updateDynamic("DesiredValue")(DesiredValue.asInstanceOf[js.Any])
    if (!js.isUndefined(GlobalQuota)) __obj.updateDynamic("GlobalQuota")(GlobalQuota.asInstanceOf[js.Any])
    if (QuotaCode != null) __obj.updateDynamic("QuotaCode")(QuotaCode.asInstanceOf[js.Any])
    if (QuotaName != null) __obj.updateDynamic("QuotaName")(QuotaName.asInstanceOf[js.Any])
    if (ServiceCode != null) __obj.updateDynamic("ServiceCode")(ServiceCode.asInstanceOf[js.Any])
    if (ServiceName != null) __obj.updateDynamic("ServiceName")(ServiceName.asInstanceOf[js.Any])
    if (Unit != null) __obj.updateDynamic("Unit")(Unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceQuotaIncreaseRequestInTemplate]
  }
}

