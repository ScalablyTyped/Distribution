package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceInfo extends js.Object {
  /**
    * If the on-premises instance was deregistered, the time at which the on-premises instance was deregistered.
    */
  var deregisterTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The ARN of the IAM session associated with the on-premises instance.
    */
  var iamSessionArn: js.UndefOr[IamSessionArn] = js.undefined
  /**
    * The IAM user ARN associated with the on-premises instance.
    */
  var iamUserArn: js.UndefOr[IamUserArn] = js.undefined
  /**
    * The ARN of the on-premises instance.
    */
  var instanceArn: js.UndefOr[InstanceArn] = js.undefined
  /**
    * The name of the on-premises instance.
    */
  var instanceName: js.UndefOr[InstanceName] = js.undefined
  /**
    * The time at which the on-premises instance was registered.
    */
  var registerTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The tags currently associated with the on-premises instance.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}

object InstanceInfo {
  @scala.inline
  def apply(
    deregisterTime: Timestamp = null,
    iamSessionArn: IamSessionArn = null,
    iamUserArn: IamUserArn = null,
    instanceArn: InstanceArn = null,
    instanceName: InstanceName = null,
    registerTime: Timestamp = null,
    tags: TagList = null
  ): InstanceInfo = {
    val __obj = js.Dynamic.literal()
    if (deregisterTime != null) __obj.updateDynamic("deregisterTime")(deregisterTime)
    if (iamSessionArn != null) __obj.updateDynamic("iamSessionArn")(iamSessionArn)
    if (iamUserArn != null) __obj.updateDynamic("iamUserArn")(iamUserArn)
    if (instanceArn != null) __obj.updateDynamic("instanceArn")(instanceArn)
    if (instanceName != null) __obj.updateDynamic("instanceName")(instanceName)
    if (registerTime != null) __obj.updateDynamic("registerTime")(registerTime)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[InstanceInfo]
  }
}

