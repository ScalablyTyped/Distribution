package typings.amqpDashConnectionDashManager

import typings.amqplib.amqplibMod.Connection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Connection extends js.Object {
  var connection: Connection
  var url: String
}

object Anon_Connection {
  @scala.inline
  def apply(connection: Connection, url: String): Anon_Connection = {
    val __obj = js.Dynamic.literal(connection = connection, url = url)
  
    __obj.asInstanceOf[Anon_Connection]
  }
}

