package typings
package amqplibLib.propertiesMod.OptionsNs

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
  var frameMax: js.UndefOr[scala.Double] = js.undefined
  /**
    * The period of the connection heartbeat in seconds.
    *
    * Default value: 0
    */
  var heartbeat: js.UndefOr[scala.Double] = js.undefined
  /**
    * Hostname used for connecting to the server.
    *
    * Default value: 'localhost'
    */
  var hostname: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The desired locale for error messages. RabbitMQ only ever uses en_US
    *
    * Default value: 'en_US'
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Password used for authenticating against the server.
    *
    * Default value: 'guest'
    */
  var password: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Port used for connecting to the server.
    *
    * Default value: 5672
    */
  var port: js.UndefOr[scala.Double] = js.undefined
  /**
    * The to be used protocol
    *
    * Default value: 'amqp'
    */
  var protocol: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Username used for authenticating against the server.
    *
    * Default value: 'guest'
    */
  var username: js.UndefOr[java.lang.String] = js.undefined
  /**
    * What VHost shall be used.
    *
    * Default value: '/'
    */
  var vhost: js.UndefOr[java.lang.String] = js.undefined
}

object Connect {
  @scala.inline
  def apply(
    frameMax: scala.Int | scala.Double = null,
    heartbeat: scala.Int | scala.Double = null,
    hostname: java.lang.String = null,
    locale: java.lang.String = null,
    password: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    protocol: java.lang.String = null,
    username: java.lang.String = null,
    vhost: java.lang.String = null
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

