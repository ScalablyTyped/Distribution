package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Endpoint extends js.Object {
  var agentLogin: String
  var endpointARN: String
  var endpointId: String
  var name: String
  var phoneNumber: String
  var queue: String
  var `type`: EndpointType
}

object Endpoint {
  @scala.inline
  def apply(
    agentLogin: String,
    endpointARN: String,
    endpointId: String,
    name: String,
    phoneNumber: String,
    queue: String,
    `type`: EndpointType
  ): Endpoint = {
    val __obj = js.Dynamic.literal(agentLogin = agentLogin.asInstanceOf[js.Any], endpointARN = endpointARN.asInstanceOf[js.Any], endpointId = endpointId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endpoint]
  }
}

