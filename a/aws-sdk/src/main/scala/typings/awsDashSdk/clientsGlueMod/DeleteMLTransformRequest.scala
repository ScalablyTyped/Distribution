package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteMLTransformRequest extends js.Object {
  /**
    * The unique identifier of the transform to delete.
    */
  var TransformId: HashString
}

object DeleteMLTransformRequest {
  @scala.inline
  def apply(TransformId: HashString): DeleteMLTransformRequest = {
    val __obj = js.Dynamic.literal(TransformId = TransformId)
  
    __obj.asInstanceOf[DeleteMLTransformRequest]
  }
}

