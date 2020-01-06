package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostInstance extends js.Object {
  /**
    * The ID of instance that is running on the Dedicated Host.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * The instance type (for example, m3.medium) of the running instance.
    */
  var InstanceType: js.UndefOr[String] = js.native
  /**
    * The ID of the AWS account that owns the instance.
    */
  var OwnerId: js.UndefOr[String] = js.native
}

object HostInstance {
  @scala.inline
  def apply(InstanceId: String = null, InstanceType: String = null, OwnerId: String = null): HostInstance = {
    val __obj = js.Dynamic.literal()
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostInstance]
  }
}

