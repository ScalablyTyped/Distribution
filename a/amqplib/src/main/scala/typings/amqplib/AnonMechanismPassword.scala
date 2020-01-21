package typings.amqplib

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMechanismPassword extends js.Object {
  var mechanism: String
  var password: String
  var username: String
  def response(): Buffer
}

object AnonMechanismPassword {
  @scala.inline
  def apply(mechanism: String, password: String, response: () => Buffer, username: String): AnonMechanismPassword = {
    val __obj = js.Dynamic.literal(mechanism = mechanism.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], response = js.Any.fromFunction0(response), username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMechanismPassword]
  }
}

