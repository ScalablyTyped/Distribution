package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportInstanceStatusRequest extends js.Object {
  /**
    * Descriptive text about the health state of your instance.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The time at which the reported instance health state ended.
    */
  var EndTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The instances.
    */
  var Instances: InstanceIdStringList
  /**
    * The reason codes that describe the health state of your instance.    instance-stuck-in-state: My instance is stuck in a state.    unresponsive: My instance is unresponsive.    not-accepting-credentials: My instance is not accepting my credentials.    password-not-available: A password is not available for my instance.    performance-network: My instance is experiencing performance problems that I believe are network related.    performance-instance-store: My instance is experiencing performance problems that I believe are related to the instance stores.    performance-ebs-volume: My instance is experiencing performance problems that I believe are related to an EBS volume.    performance-other: My instance is experiencing performance problems.    other: [explain using the description parameter]  
    */
  var ReasonCodes: ReasonCodesList
  /**
    * The time at which the reported instance health state began.
    */
  var StartTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The status of all instances listed.
    */
  var Status: ReportStatusType
}

object ReportInstanceStatusRequest {
  @scala.inline
  def apply(
    Instances: InstanceIdStringList,
    ReasonCodes: ReasonCodesList,
    Status: ReportStatusType,
    Description: String = null,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    EndTime: DateTime = null,
    StartTime: DateTime = null
  ): ReportInstanceStatusRequest = {
    val __obj = js.Dynamic.literal(Instances = Instances, ReasonCodes = ReasonCodes, Status = Status.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime)
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    __obj.asInstanceOf[ReportInstanceStatusRequest]
  }
}

