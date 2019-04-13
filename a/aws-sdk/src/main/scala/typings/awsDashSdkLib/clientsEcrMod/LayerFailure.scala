package typings
package awsDashSdkLib.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerFailure extends js.Object {
  /**
    * The failure code associated with the failure.
    */
  var failureCode: js.UndefOr[LayerFailureCode] = js.undefined
  /**
    * The reason for the failure.
    */
  var failureReason: js.UndefOr[LayerFailureReason] = js.undefined
  /**
    * The layer digest associated with the failure.
    */
  var layerDigest: js.UndefOr[BatchedOperationLayerDigest] = js.undefined
}

object LayerFailure {
  @scala.inline
  def apply(
    failureCode: LayerFailureCode = null,
    failureReason: LayerFailureReason = null,
    layerDigest: BatchedOperationLayerDigest = null
  ): LayerFailure = {
    val __obj = js.Dynamic.literal()
    if (failureCode != null) __obj.updateDynamic("failureCode")(failureCode.asInstanceOf[js.Any])
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason)
    if (layerDigest != null) __obj.updateDynamic("layerDigest")(layerDigest)
    __obj.asInstanceOf[LayerFailure]
  }
}

