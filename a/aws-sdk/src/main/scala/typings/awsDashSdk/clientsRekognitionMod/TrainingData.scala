package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrainingData extends js.Object {
  /**
    * A Sagemaker GroundTruth manifest file that contains the training images (assets).
    */
  var Assets: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.Assets] = js.native
}

object TrainingData {
  @scala.inline
  def apply(Assets: Assets = null): TrainingData = {
    val __obj = js.Dynamic.literal()
    if (Assets != null) __obj.updateDynamic("Assets")(Assets.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrainingData]
  }
}

