package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostInstance extends js.Object {
  /**
    * the IDs of instances that are running on the Dedicated Host.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  /**
    * The instance type size (for example, m3.medium) of the running instance.
    */
  var InstanceType: js.UndefOr[String] = js.undefined
}

object HostInstance {
  @scala.inline
  def apply(InstanceId: String = null, InstanceType: String = null): HostInstance = {
    val __obj = js.Dynamic.literal()
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType)
    __obj.asInstanceOf[HostInstance]
  }
}

