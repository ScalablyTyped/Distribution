package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocateViewModelLocateErrorEvent extends js.Object {
  var error: Error
}

object LocateViewModelLocateErrorEvent {
  @scala.inline
  def apply(error: Error): LocateViewModelLocateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LocateViewModelLocateErrorEvent]
  }
}

