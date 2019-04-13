package typings
package awsDashSdkLib.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordMarkerDecisionAttributes extends js.Object {
  /**
    *  The details of the marker.
    */
  var details: js.UndefOr[Data] = js.undefined
  /**
    *  The name of the marker.
    */
  var markerName: MarkerName
}

object RecordMarkerDecisionAttributes {
  @scala.inline
  def apply(markerName: MarkerName, details: Data = null): RecordMarkerDecisionAttributes = {
    val __obj = js.Dynamic.literal(markerName = markerName)
    if (details != null) __obj.updateDynamic("details")(details)
    __obj.asInstanceOf[RecordMarkerDecisionAttributes]
  }
}

