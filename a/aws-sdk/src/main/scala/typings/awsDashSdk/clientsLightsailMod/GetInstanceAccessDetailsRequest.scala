package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstanceAccessDetailsRequest extends js.Object {
  /**
    * The name of the instance to access.
    */
  var instanceName: ResourceName
  /**
    * The protocol to use to connect to your instance. Defaults to ssh.
    */
  var protocol: js.UndefOr[InstanceAccessProtocol] = js.undefined
}

object GetInstanceAccessDetailsRequest {
  @scala.inline
  def apply(instanceName: ResourceName, protocol: InstanceAccessProtocol = null): GetInstanceAccessDetailsRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceAccessDetailsRequest]
  }
}

