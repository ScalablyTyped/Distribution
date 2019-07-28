package typings.alexaDashSdk.alexaDashSdkMod

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
    val __obj = js.Dynamic.literal(status = status, value = value, version = version)
  
    __obj.asInstanceOf[UpdateListItemParams]
  }
}

