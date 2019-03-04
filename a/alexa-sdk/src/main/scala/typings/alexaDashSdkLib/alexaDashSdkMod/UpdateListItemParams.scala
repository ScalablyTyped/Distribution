package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateListItemParams extends js.Object {
  var status: ListItemObjectStatus
  var value: java.lang.String
  var version: scala.Double
}

object UpdateListItemParams {
  @scala.inline
  def apply(status: ListItemObjectStatus, value: java.lang.String, version: scala.Double): UpdateListItemParams = {
    val __obj = js.Dynamic.literal(status = status, value = value, version = version)
  
    __obj.asInstanceOf[UpdateListItemParams]
  }
}

