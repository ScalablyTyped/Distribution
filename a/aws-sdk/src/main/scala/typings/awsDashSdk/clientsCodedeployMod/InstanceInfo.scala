package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceInfo extends js.Object {
  /**
    * If the on-premises instance was deregistered, the time at which the on-premises instance was deregistered.
    */
  var deregisterTime: js.UndefOr[Timestamp] = js.native
  /**
    * The ARN of the IAM session associated with the on-premises instance.
    */
  var iamSessionArn: js.UndefOr[IamSessionArn] = js.native
  /**
    * The IAM user ARN associated with the on-premises instance.
    */
  var iamUserArn: js.UndefOr[IamUserArn] = js.native
  /**
    * The ARN of the on-premises instance.
    */
  var instanceArn: js.UndefOr[InstanceArn] = js.native
  /**
    * The name of the on-premises instance.
    */
  var instanceName: js.UndefOr[InstanceName] = js.native
  /**
    * The time at which the on-premises instance was registered.
    */
  var registerTime: js.UndefOr[Timestamp] = js.native
  /**
    * The tags currently associated with the on-premises instance.
    */
  var tags: js.UndefOr[TagList] = js.native
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
    if (deregisterTime != null) __obj.updateDynamic("deregisterTime")(deregisterTime.asInstanceOf[js.Any])
    if (iamSessionArn != null) __obj.updateDynamic("iamSessionArn")(iamSessionArn.asInstanceOf[js.Any])
    if (iamUserArn != null) __obj.updateDynamic("iamUserArn")(iamUserArn.asInstanceOf[js.Any])
    if (instanceArn != null) __obj.updateDynamic("instanceArn")(instanceArn.asInstanceOf[js.Any])
    if (instanceName != null) __obj.updateDynamic("instanceName")(instanceName.asInstanceOf[js.Any])
    if (registerTime != null) __obj.updateDynamic("registerTime")(registerTime.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceInfo]
  }
}

