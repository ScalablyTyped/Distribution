package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordMarkerDecisionAttributes extends js.Object {
  /**
    *  The details of the marker.
    */
  var details: js.UndefOr[Data] = js.native
  /**
    *  The name of the marker.
    */
  var markerName: MarkerName = js.native
}

object RecordMarkerDecisionAttributes {
  @scala.inline
  def apply(markerName: MarkerName, details: Data = null): RecordMarkerDecisionAttributes = {
    val __obj = js.Dynamic.literal(markerName = markerName.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordMarkerDecisionAttributes]
  }
}

