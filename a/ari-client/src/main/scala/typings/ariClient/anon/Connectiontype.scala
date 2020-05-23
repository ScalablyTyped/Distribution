package typings.ariClient.anon

import typings.ariClient.mod.Containers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connectiontype extends js.Object {
  var app: String
  var channelId: js.UndefOr[String] = js.undefined
  var connection_type: js.UndefOr[String] = js.undefined
  var direction: js.UndefOr[String] = js.undefined
  var encapsulation: js.UndefOr[String] = js.undefined
  var external_host: String
  var format: String
  var transport: js.UndefOr[String] = js.undefined
  var variables: js.UndefOr[Containers] = js.undefined
}

object Connectiontype {
  @scala.inline
  def apply(
    app: String,
    external_host: String,
    format: String,
    channelId: String = null,
    connection_type: String = null,
    direction: String = null,
    encapsulation: String = null,
    transport: String = null,
    variables: Containers = null
  ): Connectiontype = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], external_host = external_host.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (connection_type != null) __obj.updateDynamic("connection_type")(connection_type.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (encapsulation != null) __obj.updateDynamic("encapsulation")(encapsulation.asInstanceOf[js.Any])
    if (transport != null) __obj.updateDynamic("transport")(transport.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connectiontype]
  }
}

