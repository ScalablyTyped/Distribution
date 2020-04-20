package typings.amqplib

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMechanism extends js.Object {
  var mechanism: String
  def response(): Buffer
}

object AnonMechanism {
  @scala.inline
  def apply(mechanism: String, response: () => Buffer): AnonMechanism = {
    val __obj = js.Dynamic.literal(mechanism = mechanism.asInstanceOf[js.Any], response = js.Any.fromFunction0(response))
    __obj.asInstanceOf[AnonMechanism]
  }
}

