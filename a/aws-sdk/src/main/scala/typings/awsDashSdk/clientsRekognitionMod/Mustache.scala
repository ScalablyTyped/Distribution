package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mustache extends js.Object {
  /**
    * Level of confidence in the determination.
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
  /**
    * Boolean value that indicates whether the face has mustache or not.
    */
  var Value: js.UndefOr[Boolean] = js.undefined
}

object Mustache {
  @scala.inline
  def apply(Confidence: Int | Double = null, Value: js.UndefOr[scala.Boolean] = js.undefined): Mustache = {
    val __obj = js.Dynamic.literal()
    if (Confidence != null) __obj.updateDynamic("Confidence")(Confidence.asInstanceOf[js.Any])
    if (!js.isUndefined(Value)) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[Mustache]
  }
}

