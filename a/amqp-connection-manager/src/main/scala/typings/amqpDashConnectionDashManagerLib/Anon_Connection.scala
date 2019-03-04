package typings
package amqpDashConnectionDashManagerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Connection extends js.Object {
  var connection: amqplibLib.amqplibMod.Connection
  var url: java.lang.String
}

object Anon_Connection {
  @scala.inline
  def apply(connection: amqplibLib.amqplibMod.Connection, url: java.lang.String): Anon_Connection = {
    val __obj = js.Dynamic.literal(connection = connection, url = url)
  
    __obj.asInstanceOf[Anon_Connection]
  }
}

