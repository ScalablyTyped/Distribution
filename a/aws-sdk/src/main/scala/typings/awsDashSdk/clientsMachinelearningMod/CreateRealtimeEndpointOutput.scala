package typings.awsDashSdk.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRealtimeEndpointOutput extends js.Object {
  /**
    * A user-supplied ID that uniquely identifies the MLModel. This value should be identical to the value of the MLModelId in the request.
    */
  var MLModelId: js.UndefOr[EntityId] = js.undefined
  /**
    * The endpoint information of the MLModel 
    */
  var RealtimeEndpointInfo: js.UndefOr[typings.awsDashSdk.clientsMachinelearningMod.RealtimeEndpointInfo] = js.undefined
}

object CreateRealtimeEndpointOutput {
  @scala.inline
  def apply(MLModelId: EntityId = null, RealtimeEndpointInfo: RealtimeEndpointInfo = null): CreateRealtimeEndpointOutput = {
    val __obj = js.Dynamic.literal()
    if (MLModelId != null) __obj.updateDynamic("MLModelId")(MLModelId)
    if (RealtimeEndpointInfo != null) __obj.updateDynamic("RealtimeEndpointInfo")(RealtimeEndpointInfo)
    __obj.asInstanceOf[CreateRealtimeEndpointOutput]
  }
}

