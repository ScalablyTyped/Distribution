package typings
package awsDashSdkLib.clientsServicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestedServiceQuotaChange extends js.Object {
  /**
    * The case Id for the service quota increase request.
    */
  var CaseId: js.UndefOr[CustomerServiceEngagementId] = js.undefined
  /**
    * The date and time when the service quota increase request was received and the case Id was created. 
    */
  var Created: js.UndefOr[DateTime] = js.undefined
  /**
    * New increased value for the service quota.
    */
  var DesiredValue: js.UndefOr[QuotaValue] = js.undefined
  /**
    * Identifies if the quota is global.
    */
  var GlobalQuota: js.UndefOr[GlobalQuota] = js.undefined
  /**
    * The unique identifier of a requested service quota change.
    */
  var Id: js.UndefOr[RequestId] = js.undefined
  /**
    * The date and time of the most recent change in the service quota increase request.
    */
  var LastUpdated: js.UndefOr[DateTime] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the service quota.
    */
  var QuotaArn: js.UndefOr[QuotaArn] = js.undefined
  /**
    * Specifies the service quota that you want to use.
    */
  var QuotaCode: js.UndefOr[QuotaCode] = js.undefined
  /**
    * Name of the service quota.
    */
  var QuotaName: js.UndefOr[QuotaName] = js.undefined
  /**
    * The IAM identity who submitted the service quota increase request.
    */
  var Requester: js.UndefOr[Requester] = js.undefined
  /**
    * Specifies the service that you want to use.
    */
  var ServiceCode: js.UndefOr[ServiceCode] = js.undefined
  /**
    * The name of the AWS service specified in the increase request. 
    */
  var ServiceName: js.UndefOr[ServiceName] = js.undefined
  /**
    * State of the service quota increase request.
    */
  var Status: js.UndefOr[RequestStatus] = js.undefined
  /**
    * Specifies the unit used for the quota.
    */
  var Unit: js.UndefOr[QuotaUnit] = js.undefined
}

object RequestedServiceQuotaChange {
  @scala.inline
  def apply(
    CaseId: CustomerServiceEngagementId = null,
    Created: DateTime = null,
    DesiredValue: js.UndefOr[QuotaValue] = js.undefined,
    GlobalQuota: js.UndefOr[GlobalQuota] = js.undefined,
    Id: RequestId = null,
    LastUpdated: DateTime = null,
    QuotaArn: QuotaArn = null,
    QuotaCode: QuotaCode = null,
    QuotaName: QuotaName = null,
    Requester: Requester = null,
    ServiceCode: ServiceCode = null,
    ServiceName: ServiceName = null,
    Status: RequestStatus = null,
    Unit: QuotaUnit = null
  ): RequestedServiceQuotaChange = {
    val __obj = js.Dynamic.literal()
    if (CaseId != null) __obj.updateDynamic("CaseId")(CaseId)
    if (Created != null) __obj.updateDynamic("Created")(Created)
    if (!js.isUndefined(DesiredValue)) __obj.updateDynamic("DesiredValue")(DesiredValue)
    if (!js.isUndefined(GlobalQuota)) __obj.updateDynamic("GlobalQuota")(GlobalQuota)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (LastUpdated != null) __obj.updateDynamic("LastUpdated")(LastUpdated)
    if (QuotaArn != null) __obj.updateDynamic("QuotaArn")(QuotaArn)
    if (QuotaCode != null) __obj.updateDynamic("QuotaCode")(QuotaCode)
    if (QuotaName != null) __obj.updateDynamic("QuotaName")(QuotaName)
    if (Requester != null) __obj.updateDynamic("Requester")(Requester)
    if (ServiceCode != null) __obj.updateDynamic("ServiceCode")(ServiceCode)
    if (ServiceName != null) __obj.updateDynamic("ServiceName")(ServiceName)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Unit != null) __obj.updateDynamic("Unit")(Unit)
    __obj.asInstanceOf[RequestedServiceQuotaChange]
  }
}

