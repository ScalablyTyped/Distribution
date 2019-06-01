package typings
package amazonDashConnectDashStreamsLib.connectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("connect.Endpoint")
@js.native
class Endpoint () extends js.Object {
  var agentLogin: java.lang.String = js.native
  var endpointARN: java.lang.String = js.native
  var endpointId: java.lang.String = js.native
  var name: java.lang.String = js.native
  var phoneNumber: java.lang.String = js.native
  var queue: java.lang.String = js.native
  var `type`: EndpointType = js.native
}

/* static members */
@JSGlobal("connect.Endpoint")
@js.native
object Endpoint extends js.Object {
  def byPhoneNumber(phoneNumber: java.lang.String): amazonDashConnectDashStreamsLib.connectNs.Endpoint = js.native
}

