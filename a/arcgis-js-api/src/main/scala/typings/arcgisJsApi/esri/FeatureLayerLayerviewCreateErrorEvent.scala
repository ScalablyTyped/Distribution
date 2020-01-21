package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureLayerLayerviewCreateErrorEvent extends js.Object {
  var error: Error
  var view: View
}

object FeatureLayerLayerviewCreateErrorEvent {
  @scala.inline
  def apply(error: Error, view: View): FeatureLayerLayerviewCreateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FeatureLayerLayerviewCreateErrorEvent]
  }
}

