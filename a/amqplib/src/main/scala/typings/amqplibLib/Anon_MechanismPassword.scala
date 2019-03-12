package typings
package amqplibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MechanismPassword extends js.Object {
  var mechanism: java.lang.String
  var password: java.lang.String
  var username: java.lang.String
  def response(): nodeLib.Buffer
}

object Anon_MechanismPassword {
  @scala.inline
  def apply(
    mechanism: java.lang.String,
    password: java.lang.String,
    response: () => nodeLib.Buffer,
    username: java.lang.String
  ): Anon_MechanismPassword = {
    val __obj = js.Dynamic.literal(mechanism = mechanism, password = password, response = js.Any.fromFunction0(response), username = username)
  
    __obj.asInstanceOf[Anon_MechanismPassword]
  }
}

