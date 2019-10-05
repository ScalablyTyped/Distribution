package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EyeOpen extends js.Object {
  /**
    * Level of confidence in the determination.
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
  /**
    * Boolean value that indicates whether the eyes on the face are open.
    */
  var Value: js.UndefOr[Boolean] = js.undefined
}

object EyeOpen {
  @scala.inline
  def apply(Confidence: Int | Double = null, Value: js.UndefOr[scala.Boolean] = js.undefined): EyeOpen = {
    val __obj = js.Dynamic.literal()
    if (Confidence != null) __obj.updateDynamic("Confidence")(Confidence.asInstanceOf[js.Any])
    if (!js.isUndefined(Value)) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[EyeOpen]
  }
}

