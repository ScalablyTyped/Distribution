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
    frameMax: Int | Double = null,
    heartbeat: Int | Double = null,
    hostname: String = null,
    locale: String = null,
    password: String = null,
    port: Int | Double = null,
    protocol: String = null,
    username: String = null,
    vhost: String = null
  ): Connect = {
    val __obj = js.Dynamic.literal()
    if (frameMax != null) __obj.updateDynamic("frameMax")(frameMax.asInstanceOf[js.Any])
    if (heartbeat != null) __obj.updateDynamic("heartbeat")(heartbeat.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (password != null) __obj.updateDynamic("password")(password)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (username != null) __obj.updateDynamic("username")(username)
    if (vhost != null) __obj.updateDynamic("vhost")(vhost)
    __obj.asInstanceOf[Connect]
  }
}

