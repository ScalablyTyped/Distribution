package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MySqlParameters extends js.Object {
  /**
    * Database.
    */
  var Database: typings.awsDashSdk.clientsQuicksightMod.Database = js.native
  /**
    * Host.
    */
  var Host: typings.awsDashSdk.clientsQuicksightMod.Host = js.native
  /**
    * Port.
    */
  var Port: typings.awsDashSdk.clientsQuicksightMod.Port = js.native
}

object MySqlParameters {
  @scala.inline
  def apply(Database: Database, Host: Host, Port: Port): MySqlParameters = {
    val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any], Host = Host.asInstanceOf[js.Any], Port = Port.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MySqlParameters]
  }
}

