package typings.amqplib.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Password extends js.Object {
  var mechanism: String
  var password: String
  var username: String
  def response(): Buffer
}

object Password {
  @scala.inline
  def apply(mechanism: String, password: String, response: () => Buffer, username: String): Password = {
    val __obj = js.Dynamic.literal(mechanism = mechanism.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], response = js.Any.fromFunction0(response), username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Password]
  }
}

