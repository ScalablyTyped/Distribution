package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateListItemParams extends js.Object {
  var status: ListItemObjectStatus
  var value: String
  var version: Double
}

object UpdateListItemParams {
  @scala.inline
  def apply(status: ListItemObjectStatus, value: String, version: Double): UpdateListItemParams = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateListItemParams]
  }
}

