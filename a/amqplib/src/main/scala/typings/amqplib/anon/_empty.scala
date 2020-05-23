package typings.amqplib.anon

import typings.amqplib.amqplibStrings.timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _empty extends js.Object {
  @JSName("!")
  var Exclamationmark: timestamp
  var value: Double
}

object _empty {
  @scala.inline
  def apply(Exclamationmark: timestamp, value: Double): _empty = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("!")(Exclamationmark.asInstanceOf[js.Any])
    __obj.asInstanceOf[_empty]
  }
}

