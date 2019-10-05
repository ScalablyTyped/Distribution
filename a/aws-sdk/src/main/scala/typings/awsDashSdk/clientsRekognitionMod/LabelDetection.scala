package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelDetection extends js.Object {
  /**
    * Details about the detected label.
    */
  var Label: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.Label] = js.undefined
  /**
    * Time, in milliseconds from the start of the video, that the label was detected.
    */
  var Timestamp: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.Timestamp] = js.undefined
}

object LabelDetection {
  @scala.inline
  def apply(Label: Label = null, Timestamp: Int | Double = null): LabelDetection = {
    val __obj = js.Dynamic.literal()
    if (Label != null) __obj.updateDynamic("Label")(Label)
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelDetection]
  }
}

