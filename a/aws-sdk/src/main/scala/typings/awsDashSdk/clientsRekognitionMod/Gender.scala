package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gender extends js.Object {
  /**
    * Level of confidence in the determination.
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
  /**
    * Gender of the face.
    */
  var Value: js.UndefOr[GenderType] = js.undefined
}

object Gender {
  @scala.inline
  def apply(Confidence: Int | Double = null, Value: GenderType = null): Gender = {
    val __obj = js.Dynamic.literal()
    if (Confidence != null) __obj.updateDynamic("Confidence")(Confidence.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gender]
  }
}

