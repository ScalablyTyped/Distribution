package typings.awsDashSdk.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRealtimeEndpointInput extends js.Object {
  /**
    * The ID assigned to the MLModel during creation.
    */
  var MLModelId: EntityId = js.native
}

object DeleteRealtimeEndpointInput {
  @scala.inline
  def apply(MLModelId: EntityId): DeleteRealtimeEndpointInput = {
    val __obj = js.Dynamic.literal(MLModelId = MLModelId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteRealtimeEndpointInput]
  }
}

