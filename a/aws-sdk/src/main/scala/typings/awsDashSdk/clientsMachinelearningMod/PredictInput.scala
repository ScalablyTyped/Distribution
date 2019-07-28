package typings.awsDashSdk.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PredictInput extends js.Object {
  /**
    * A unique identifier of the MLModel.
    */
  var MLModelId: EntityId
  var PredictEndpoint: VipURL
  var Record: typings.awsDashSdk.clientsMachinelearningMod.Record
}

object PredictInput {
  @scala.inline
  def apply(MLModelId: EntityId, PredictEndpoint: VipURL, Record: Record): PredictInput = {
    val __obj = js.Dynamic.literal(MLModelId = MLModelId, PredictEndpoint = PredictEndpoint, Record = Record)
  
    __obj.asInstanceOf[PredictInput]
  }
}

