package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WMSLayerLayerviewCreateErrorEvent extends js.Object {
  var error: Error
  var view: View
}

object WMSLayerLayerviewCreateErrorEvent {
  @scala.inline
  def apply(error: Error, view: View): WMSLayerLayerviewCreateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error, view = view)
  
    __obj.asInstanceOf[WMSLayerLayerviewCreateErrorEvent]
  }
}

