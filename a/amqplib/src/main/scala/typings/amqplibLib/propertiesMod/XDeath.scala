package typings
package amqplibLib.propertiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XDeath extends js.Object {
  var count: scala.Double
  var exchange: java.lang.String
  var `original-expiration`: js.UndefOr[js.Any] = js.undefined
  var queue: java.lang.String
  var reason: amqplibLib.amqplibLibStrings.rejected | amqplibLib.amqplibLibStrings.expired | amqplibLib.amqplibLibStrings.maxlen
  var `routing-keys`: js.Array[java.lang.String]
  var time: amqplibLib.Anon_
}

object XDeath {
  @scala.inline
  def apply(
    count: scala.Double,
    exchange: java.lang.String,
    queue: java.lang.String,
    reason: amqplibLib.amqplibLibStrings.rejected | amqplibLib.amqplibLibStrings.expired | amqplibLib.amqplibLibStrings.maxlen,
    `routing-keys`: js.Array[java.lang.String],
    time: amqplibLib.Anon_,
    `original-expiration`: js.Any = null
  ): XDeath = {
    val __obj = js.Dynamic.literal(count = count, exchange = exchange, queue = queue, reason = reason.asInstanceOf[js.Any], time = time)
    __obj.updateDynamic("routing-keys")(`routing-keys`)
    if (`original-expiration` != null) __obj.updateDynamic("original-expiration")(`original-expiration`)
    __obj.asInstanceOf[XDeath]
  }
}

