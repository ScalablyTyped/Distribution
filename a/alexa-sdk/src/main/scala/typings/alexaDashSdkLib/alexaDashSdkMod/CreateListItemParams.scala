package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateListItemParams extends js.Object {
  var status: ListItemObjectStatus
  var value: java.lang.String
}

object CreateListItemParams {
  @scala.inline
  def apply(status: ListItemObjectStatus, value: java.lang.String): CreateListItemParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CreateListItemParams]
  }
}

