package typings.awsDashSdk.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectorDebugOption extends js.Object {
  /**
    * The name of the detector model.
    */
  var detectorModelName: DetectorModelName
  /**
    * The value of the input attribute key used to create the detector (the instance of the detector model).
    */
  var keyValue: js.UndefOr[KeyValue] = js.undefined
}

object DetectorDebugOption {
  @scala.inline
  def apply(detectorModelName: DetectorModelName, keyValue: KeyValue = null): DetectorDebugOption = {
    val __obj = js.Dynamic.literal(detectorModelName = detectorModelName)
    if (keyValue != null) __obj.updateDynamic("keyValue")(keyValue)
    __obj.asInstanceOf[DetectorDebugOption]
  }
}

