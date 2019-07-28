package typings.awsDashSdk.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectorModelSummary extends js.Object {
  /**
    * The time the detector model was created.
    */
  var creationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * A brief description of the detector model.
    */
  var detectorModelDescription: js.UndefOr[DetectorModelDescription] = js.undefined
  /**
    * The name of the detector model.
    */
  var detectorModelName: js.UndefOr[DetectorModelName] = js.undefined
}

object DetectorModelSummary {
  @scala.inline
  def apply(
    creationTime: Timestamp = null,
    detectorModelDescription: DetectorModelDescription = null,
    detectorModelName: DetectorModelName = null
  ): DetectorModelSummary = {
    val __obj = js.Dynamic.literal()
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (detectorModelDescription != null) __obj.updateDynamic("detectorModelDescription")(detectorModelDescription)
    if (detectorModelName != null) __obj.updateDynamic("detectorModelName")(detectorModelName)
    __obj.asInstanceOf[DetectorModelSummary]
  }
}

