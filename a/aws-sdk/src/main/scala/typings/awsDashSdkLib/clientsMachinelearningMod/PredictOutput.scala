package typings
package awsDashSdkLib.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PredictOutput extends js.Object {
  var Prediction: js.UndefOr[Prediction] = js.undefined
}

object PredictOutput {
  @scala.inline
  def apply(Prediction: Prediction = null): PredictOutput = {
    val __obj = js.Dynamic.literal()
    if (Prediction != null) __obj.updateDynamic("Prediction")(Prediction)
    __obj.asInstanceOf[PredictOutput]
  }
}

