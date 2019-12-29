package typings.amqplib

import typings.amqplib.amqplibStrings.timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ extends js.Object {
  @JSName("!")
  var Exclamationmark: timestamp
  var value: Double
}

object Anon_ {
  @scala.inline
  def apply(Exclamationmark: timestamp, value: Double): Anon_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("!")(Exclamationmark.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_]
  }
}

