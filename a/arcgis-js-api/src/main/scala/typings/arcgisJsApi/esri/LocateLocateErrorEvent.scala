package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocateLocateErrorEvent extends js.Object {
  var error: Error
}

object LocateLocateErrorEvent {
  @scala.inline
  def apply(error: Error): LocateLocateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LocateLocateErrorEvent]
  }
}

