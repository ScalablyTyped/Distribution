package typings.awsDashSdk.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRealtimeEndpointInput extends js.Object {
  /**
    * The ID assigned to the MLModel during creation.
    */
  var MLModelId: EntityId
}

object CreateRealtimeEndpointInput {
  @scala.inline
  def apply(MLModelId: EntityId): CreateRealtimeEndpointInput = {
    val __obj = js.Dynamic.literal(MLModelId = MLModelId)
  
    __obj.asInstanceOf[CreateRealtimeEndpointInput]
  }
}

