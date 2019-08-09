package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateMLTransformResponse extends js.Object {
  /**
    * The unique identifier for the transform that was updated.
    */
  var TransformId: js.UndefOr[HashString] = js.undefined
}

object UpdateMLTransformResponse {
  @scala.inline
  def apply(TransformId: HashString = null): UpdateMLTransformResponse = {
    val __obj = js.Dynamic.literal()
    if (TransformId != null) __obj.updateDynamic("TransformId")(TransformId)
    __obj.asInstanceOf[UpdateMLTransformResponse]
  }
}

