package typings.awsDashSdk.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectorDebugOption extends js.Object {
  /**
    * The name of the detector model.
    */
  var detectorModelName: DetectorModelName = js.native
  /**
    * The value of the input attribute key used to create the detector (the instance of the detector model).
    */
  var keyValue: js.UndefOr[KeyValue] = js.native
}

object DetectorDebugOption {
  @scala.inline
  def apply(detectorModelName: DetectorModelName, keyValue: KeyValue = null): DetectorDebugOption = {
    val __obj = js.Dynamic.literal(detectorModelName = detectorModelName.asInstanceOf[js.Any])
    if (keyValue != null) __obj.updateDynamic("keyValue")(keyValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectorDebugOption]
  }
}

