package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Emotion extends js.Object {
  /**
    * Level of confidence in the determination.
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
  /**
    * Type of emotion detected.
    */
  var Type: js.UndefOr[EmotionName] = js.undefined
}

object Emotion {
  @scala.inline
  def apply(Confidence: js.UndefOr[Percent] = js.undefined, Type: EmotionName = null): Emotion = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Confidence)) __obj.updateDynamic("Confidence")(Confidence)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Emotion]
  }
}

