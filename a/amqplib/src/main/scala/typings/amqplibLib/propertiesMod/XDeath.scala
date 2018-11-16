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
  var time: amqplibLib.Anon_Value
}

