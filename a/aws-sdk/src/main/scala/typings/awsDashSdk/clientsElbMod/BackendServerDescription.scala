package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackendServerDescription extends js.Object {
  /**
    * The port on which the EC2 instance is listening.
    */
  var InstancePort: js.UndefOr[typings.awsDashSdk.clientsElbMod.InstancePort] = js.undefined
  /**
    * The names of the policies enabled for the EC2 instance.
    */
  var PolicyNames: js.UndefOr[typings.awsDashSdk.clientsElbMod.PolicyNames] = js.undefined
}

object BackendServerDescription {
  @scala.inline
  def apply(InstancePort: Int | Double = null, PolicyNames: PolicyNames = null): BackendServerDescription = {
    val __obj = js.Dynamic.literal()
    if (InstancePort != null) __obj.updateDynamic("InstancePort")(InstancePort.asInstanceOf[js.Any])
    if (PolicyNames != null) __obj.updateDynamic("PolicyNames")(PolicyNames)
    __obj.asInstanceOf[BackendServerDescription]
  }
}

