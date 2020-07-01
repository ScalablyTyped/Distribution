package typings.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SystemInfo extends js.Object {
  /**
    * Entity_id.
    */
  var entity_id: String
  /**
    * Asterisk version.
    */
  var version: String
}

object SystemInfo {
  @scala.inline
  def apply(entity_id: String, version: String): SystemInfo = {
    val __obj = js.Dynamic.literal(entity_id = entity_id.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfo]
  }
}

