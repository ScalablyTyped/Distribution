package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteActivationRequest extends js.Object {
  /**
    * The ID of the activation that you want to delete.
    */
  var ActivationId: typings.awsDashSdk.clientsSsmMod.ActivationId
}

object DeleteActivationRequest {
  @scala.inline
  def apply(ActivationId: ActivationId): DeleteActivationRequest = {
    val __obj = js.Dynamic.literal(ActivationId = ActivationId)
  
    __obj.asInstanceOf[DeleteActivationRequest]
  }
}

