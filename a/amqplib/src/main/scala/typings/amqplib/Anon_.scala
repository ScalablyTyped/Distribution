package typings.amqplib

import typings.amqplib.amqplibStrings.timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ extends js.Object {
  var `!`: timestamp
  var value: Double
}

object Anon_ {
  @scala.inline
  def apply(`!`: timestamp, value: Double): Anon_ = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("!")(`!`)
    __obj.asInstanceOf[Anon_]
  }
}

