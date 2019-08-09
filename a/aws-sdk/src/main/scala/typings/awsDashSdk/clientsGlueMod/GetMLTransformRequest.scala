package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMLTransformRequest extends js.Object {
  /**
    * The unique identifier of the transform, generated at the time that the transform was created.
    */
  var TransformId: HashString
}

object GetMLTransformRequest {
  @scala.inline
  def apply(TransformId: HashString): GetMLTransformRequest = {
    val __obj = js.Dynamic.literal(TransformId = TransformId)
  
    __obj.asInstanceOf[GetMLTransformRequest]
  }
}

