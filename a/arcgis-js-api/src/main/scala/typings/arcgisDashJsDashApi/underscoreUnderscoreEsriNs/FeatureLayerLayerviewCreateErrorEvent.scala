package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

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
    val __obj = js.Dynamic.literal(error = error, view = view)
  
    __obj.asInstanceOf[FeatureLayerLayerviewCreateErrorEvent]
  }
}

