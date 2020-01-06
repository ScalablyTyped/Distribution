package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MqttContext extends js.Object {
  /**
    * The value of the clientId key in an MQTT authorization request.
    */
  var clientId: js.UndefOr[MqttClientId] = js.native
  /**
    * The value of the password key in an MQTT authorization request.
    */
  var password: js.UndefOr[MqttPassword] = js.native
  /**
    * The value of the username key in an MQTT authorization request.
    */
  var username: js.UndefOr[MqttUsername] = js.native
}

object MqttContext {
  @scala.inline
  def apply(clientId: MqttClientId = null, password: MqttPassword = null, username: MqttUsername = null): MqttContext = {
    val __obj = js.Dynamic.literal()
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[MqttContext]
  }
}

