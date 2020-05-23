package typings.amqplib.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mechanism extends js.Object {
  var mechanism: String
  def response(): Buffer
}

object Mechanism {
  @scala.inline
  def apply(mechanism: String, response: () => Buffer): Mechanism = {
    val __obj = js.Dynamic.literal(mechanism = mechanism.asInstanceOf[js.Any], response = js.Any.fromFunction0(response))
    __obj.asInstanceOf[Mechanism]
  }
}

