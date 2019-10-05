package typings.awsDashSdk.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMLModelInput extends js.Object {
  /**
    * The ID assigned to the MLModel at creation.
    */
  var MLModelId: EntityId
  /**
    * Specifies whether the GetMLModel operation should return Recipe. If true, Recipe is returned. If false, Recipe is not returned.
    */
  var Verbose: js.UndefOr[typings.awsDashSdk.clientsMachinelearningMod.Verbose] = js.undefined
}

object GetMLModelInput {
  @scala.inline
  def apply(MLModelId: EntityId, Verbose: js.UndefOr[Boolean] = js.undefined): GetMLModelInput = {
    val __obj = js.Dynamic.literal(MLModelId = MLModelId)
    if (!js.isUndefined(Verbose)) __obj.updateDynamic("Verbose")(Verbose)
    __obj.asInstanceOf[GetMLModelInput]
  }
}

