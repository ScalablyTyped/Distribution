package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneLayerLayerviewCreateErrorEvent extends js.Object {
  var error: Error
  var view: View
}

object SceneLayerLayerviewCreateErrorEvent {
  @scala.inline
  def apply(error: Error, view: View): SceneLayerLayerviewCreateErrorEvent = {
    val __obj = js.Dynamic.literal(error = error, view = view)
  
    __obj.asInstanceOf[SceneLayerLayerviewCreateErrorEvent]
  }
}

