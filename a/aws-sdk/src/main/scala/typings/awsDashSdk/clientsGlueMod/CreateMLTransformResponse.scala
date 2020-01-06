package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMLTransformResponse extends js.Object {
  /**
    * A unique identifier that is generated for the transform.
    */
  var TransformId: js.UndefOr[HashString] = js.native
}

object CreateMLTransformResponse {
  @scala.inline
  def apply(TransformId: HashString = null): CreateMLTransformResponse = {
    val __obj = js.Dynamic.literal()
    if (TransformId != null) __obj.updateDynamic("TransformId")(TransformId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMLTransformResponse]
  }
}

