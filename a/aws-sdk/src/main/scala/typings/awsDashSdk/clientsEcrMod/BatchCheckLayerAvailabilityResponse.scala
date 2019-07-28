package typings.awsDashSdk.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchCheckLayerAvailabilityResponse extends js.Object {
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[LayerFailureList] = js.undefined
  /**
    * A list of image layer objects corresponding to the image layer references in the request.
    */
  var layers: js.UndefOr[LayerList] = js.undefined
}

object BatchCheckLayerAvailabilityResponse {
  @scala.inline
  def apply(failures: LayerFailureList = null, layers: LayerList = null): BatchCheckLayerAvailabilityResponse = {
    val __obj = js.Dynamic.literal()
    if (failures != null) __obj.updateDynamic("failures")(failures)
    if (layers != null) __obj.updateDynamic("layers")(layers)
    __obj.asInstanceOf[BatchCheckLayerAvailabilityResponse]
  }
}

