package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntegratedMeshLayerLayerviewCreateErrorEvent extends js.Object {
  var error: Error
  var view: View
}

object IntegratedMeshLayerLayerviewCreateErrorEvent {
  @scala.inline
  def apply(error: Error, view: View): IntegratedMeshLayerLayerviewCreateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IntegratedMeshLayerLayerviewCreateErrorEvent]
  }
}

