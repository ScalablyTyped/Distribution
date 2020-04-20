package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureTableSelectionChangeEvent extends js.Object {
  var added: js.Array[FeatureTableSelectionChangeEventAdded]
  var removed: js.Array[FeatureTableSelectionChangeEventRemoved]
}

object FeatureTableSelectionChangeEvent {
  @scala.inline
  def apply(
    added: js.Array[FeatureTableSelectionChangeEventAdded],
    removed: js.Array[FeatureTableSelectionChangeEventRemoved]
  ): FeatureTableSelectionChangeEvent = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureTableSelectionChangeEvent]
  }
}

