package typings.amqplib

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MechanismPassword extends js.Object {
  var mechanism: String
  var password: String
  var username: String
  def response(): Buffer
}

object Anon_MechanismPassword {
  @scala.inline
  def apply(mechanism: String, password: String, response: () => Buffer, username: String): Anon_MechanismPassword = {
    val __obj = js.Dynamic.literal(mechanism = mechanism, password = password, response = js.Any.fromFunction0(response), username = username)
  
    __obj.asInstanceOf[Anon_MechanismPassword]
  }
}

