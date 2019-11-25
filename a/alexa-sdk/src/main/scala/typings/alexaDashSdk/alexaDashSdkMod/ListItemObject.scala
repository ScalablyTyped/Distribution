package typings.alexaDashSdk.alexaDashSdkMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemObject extends js.Object {
  /**
    * created time (ISO 8601 time format with time zone)
    */
  var createdTime: Date
  /**
    *  URL to retrieve the item (String)
    */
  var href: js.UndefOr[String] = js.undefined
  /**
    * item id (String, limit 60 characters)
    */
  var id: String
  /**
    * item status
    */
  var status: js.UndefOr[ListItemObjectStatus] = js.undefined
  /**
    * updated time (ISO 8601 time format with time zone)
    */
  var updatedTime: Date
  /**
    * item value (String, limit is 256 characters)
    */
  var value: String
  /**
    * item version (Positive integer)
    */
  var version: Double
}

object ListItemObject {
  @scala.inline
  def apply(
    createdTime: Date,
    id: String,
    updatedTime: Date,
    value: String,
    version: Double,
    href: String = null,
    status: ListItemObjectStatus = null
  ): ListItemObject = {
    val __obj = js.Dynamic.literal(createdTime = createdTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updatedTime = updatedTime.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemObject]
  }
}

