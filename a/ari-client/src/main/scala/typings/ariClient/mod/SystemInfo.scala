package typings.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SystemInfo extends js.Object {
  /**
    * Entity_id.
    */
  var entity_id: String = js.native
  /**
    * Asterisk version.
    */
  var version: String = js.native
}

object SystemInfo {
  @scala.inline
  def apply(entity_id: String, version: String): SystemInfo = {
    val __obj = js.Dynamic.literal(entity_id = entity_id.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfo]
  }
  @scala.inline
  implicit class SystemInfoOps[Self <: SystemInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEntity_id(value: String): Self = this.set("entity_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

