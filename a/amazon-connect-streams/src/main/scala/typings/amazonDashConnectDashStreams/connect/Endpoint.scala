package typings.amazonDashConnectDashStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("connect.Endpoint")
@js.native
class Endpoint () extends js.Object {
  var agentLogin: String = js.native
  var endpointARN: String = js.native
  var endpointId: String = js.native
  var name: String = js.native
  var phoneNumber: String = js.native
  var queue: String = js.native
  var `type`: EndpointType = js.native
}

/* static members */
@JSGlobal("connect.Endpoint")
@js.native
object Endpoint extends js.Object {
  def byPhoneNumber(phoneNumber: String): Endpoint = js.native
}

