package typings
package amqplibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ extends js.Object {
  var `!`: amqplibLib.amqplibLibStrings.timestamp
  var value: scala.Double
}

object Anon_ {
  @scala.inline
  def apply(`!`: amqplibLib.amqplibLibStrings.timestamp, value: scala.Double): Anon_ = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("!")(`!`)
    __obj.asInstanceOf[Anon_]
  }
}

