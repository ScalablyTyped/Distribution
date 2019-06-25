package typings
package awsDashSdkLib.clientsServicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceQuotaIncreaseRequestInTemplate extends js.Object {
  /**
    * The AWS Region where the increase request occurs.
    */
  var AwsRegion: js.UndefOr[AwsRegion] = js.undefined
  /**
    * Identifies the new, increased value of the service quota in the increase request. 
    */
  var DesiredValue: js.UndefOr[QuotaValue] = js.undefined
  /**
    * Specifies if the quota is a global quota.
    */
  var GlobalQuota: js.UndefOr[GlobalQuota] = js.undefined
  /**
    * The code identifier for the service quota specified in the increase request.
    */
  var QuotaCode: js.UndefOr[QuotaCode] = js.undefined
  /**
    * The name of the service quota in the increase request.
    */
  var QuotaName: js.UndefOr[QuotaName] = js.undefined
  /**
    * The code identifier for the AWS service specified in the increase request.
    */
  var ServiceCode: js.UndefOr[ServiceCode] = js.undefined
  /**
    * The name of the AWS service specified in the increase request. 
    */
  var ServiceName: js.UndefOr[ServiceName] = js.undefined
  /**
    * The unit of measure for the increase request.
    */
  var Unit: js.UndefOr[QuotaUnit] = js.undefined
}

object ServiceQuotaIncreaseRequestInTemplate {
  @scala.inline
  def apply(
    AwsRegion: AwsRegion = null,
    DesiredValue: js.UndefOr[QuotaValue] = js.undefined,
    GlobalQuota: js.UndefOr[GlobalQuota] = js.undefined,
    QuotaCode: QuotaCode = null,
    QuotaName: QuotaName = null,
    ServiceCode: ServiceCode = null,
    ServiceName: ServiceName = null,
    Unit: QuotaUnit = null
  ): ServiceQuotaIncreaseRequestInTemplate = {
    val __obj = js.Dynamic.literal()
    if (AwsRegion != null) __obj.updateDynamic("AwsRegion")(AwsRegion)
    if (!js.isUndefined(DesiredValue)) __obj.updateDynamic("DesiredValue")(DesiredValue)
    if (!js.isUndefined(GlobalQuota)) __obj.updateDynamic("GlobalQuota")(GlobalQuota)
    if (QuotaCode != null) __obj.updateDynamic("QuotaCode")(QuotaCode)
    if (QuotaName != null) __obj.updateDynamic("QuotaName")(QuotaName)
    if (ServiceCode != null) __obj.updateDynamic("ServiceCode")(ServiceCode)
    if (ServiceName != null) __obj.updateDynamic("ServiceName")(ServiceName)
    if (Unit != null) __obj.updateDynamic("Unit")(Unit)
    __obj.asInstanceOf[ServiceQuotaIncreaseRequestInTemplate]
  }
}

