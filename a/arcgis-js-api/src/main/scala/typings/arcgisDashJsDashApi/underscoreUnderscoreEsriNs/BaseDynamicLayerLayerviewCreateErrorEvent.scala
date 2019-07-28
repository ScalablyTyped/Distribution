package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseDynamicLayerLayerviewCreateErrorEvent extends js.Object {
  var error: Error
  var view: View
}

object BaseDynamicLayerLayerviewCreateErrorEvent {
  @scala.inline
  def apply(error: Error, view: View): BaseDynamicLayerLayerviewCreateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error, view = view)
  
    __obj.asInstanceOf[BaseDynamicLayerLayerviewCreateErrorEvent]
  }
}

