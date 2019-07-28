package typings.amqplib.callbackUnderscoreApiMod

import typings.amqplib.Anon_Mechanism
import typings.amqplib.Anon_MechanismPassword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amqplib/callback_api", "credentials")
@js.native
object credentials extends js.Object {
  def external(): Anon_Mechanism = js.native
  def plain(username: String, password: String): Anon_MechanismPassword = js.native
}

