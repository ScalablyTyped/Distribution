package typings.amqplib.propertiesMod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connect extends js.Object {
  /**
    * The size in bytes of the maximum frame allowed over the connection. 0 means
    * no limit (but since frames have a size field which is an unsigned 32 bit integer, it’s perforce 2^32 - 1).
    *
    * Default value: 0x1000 (4kb) - That's the allowed minimum, it will fit many purposes
    */
  var frameMax: js.UndefOr[Double] = js.undefined
  /**
    * The period of the connection heartbeat in seconds.
    *
    * Default value: 0
    */
  var heartbeat: js.UndefOr[Double] = js.undefined
  /**
    * Hostname used for connecting to the server.
    *
    * Default value: 'localhost'
    */
  var hostname: js.UndefOr[String] = js.undefined
  /**
    * The desired locale for error messages. RabbitMQ only ever uses en_US
    *
    * Default value: 'en_US'
    */
  var locale: js.UndefOr[String] = js.undefined
  /**
    * Password used for authenticating against the server.
    *
    * Default value: 'guest'
    */
  var password: js.UndefOr[String] = js.undefined
  /**
    * Port used for connecting to the server.
    *
    * Default value: 5672
    */
  var port: js.UndefOr[Double] = js.undefined
  /**
    * The to be used protocol
    *
    * Default value: 'amqp'
    */
  var protocol: js.UndefOr[String] = js.undefined
  /**
    * Username used for authenticating against the server.
    *
    * Default value: 'guest'
    */
  var username: js.UndefOr[String] = js.undefined
  /**
    * What VHost shall be used.
    *
    * Default value: '/'
    */
  var vhost: js.UndefOr[String] = js.undefined
}

object Connect {
  @scala.inline
  def apply(
    frameMax: js.UndefOr[Double] = js.undefined,
    heartbeat: js.UndefOr[Double] = js.undefined,
    hostname: String = null,
    locale: String = null,
    password: String = null,
    port: js.UndefOr[Double] = js.undefined,
    protocol: String = null,
    username: String = null,
    vhost: String = null
  ): Connect = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(frameMax)) __obj.updateDynamic("frameMax")(frameMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(heartbeat)) __obj.updateDynamic("heartbeat")(heartbeat.get.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    if (vhost != null) __obj.updateDynamic("vhost")(vhost.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connect]
  }
}

