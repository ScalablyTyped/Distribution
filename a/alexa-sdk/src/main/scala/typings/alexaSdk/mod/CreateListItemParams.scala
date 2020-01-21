package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateListItemParams extends js.Object {
  var status: ListItemObjectStatus
  var value: String
}

object CreateListItemParams {
  @scala.inline
  def apply(status: ListItemObjectStatus, value: String): CreateListItemParams = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateListItemParams]
  }
}

