package typings.alexaSdk.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemObject extends js.Object {
  /**
    * created time (ISO 8601 time format with time zone)
    */
  var createdTime: Date = js.native
  /**
    *  URL to retrieve the item (String)
    */
  var href: js.UndefOr[String] = js.native
  /**
    * item id (String, limit 60 characters)
    */
  var id: String = js.native
  /**
    * item status
    */
  var status: js.UndefOr[ListItemObjectStatus] = js.native
  /**
    * updated time (ISO 8601 time format with time zone)
    */
  var updatedTime: Date = js.native
  /**
    * item value (String, limit is 256 characters)
    */
  var value: String = js.native
  /**
    * item version (Positive integer)
    */
  var version: Double = js.native
}

object ListItemObject {
  @scala.inline
  def apply(createdTime: Date, id: String, updatedTime: Date, value: String, version: Double): ListItemObject = {
    val __obj = js.Dynamic.literal(createdTime = createdTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updatedTime = updatedTime.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemObject]
  }
  @scala.inline
  implicit class ListItemObjectOps[Self <: ListItemObject] (val x: Self) extends AnyVal {
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
    def setCreatedTime(value: Date): Self = this.set("createdTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdatedTime(value: Date): Self = this.set("updatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    @scala.inline
    def setStatus(value: ListItemObjectStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

