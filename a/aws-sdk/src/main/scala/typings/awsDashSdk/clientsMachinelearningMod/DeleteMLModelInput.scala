package typings.awsDashSdk.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteMLModelInput extends js.Object {
  /**
    * A user-supplied ID that uniquely identifies the MLModel.
    */
  var MLModelId: EntityId
}

object DeleteMLModelInput {
  @scala.inline
  def apply(MLModelId: EntityId): DeleteMLModelInput = {
    val __obj = js.Dynamic.literal(MLModelId = MLModelId)
  
    __obj.asInstanceOf[DeleteMLModelInput]
  }
}

