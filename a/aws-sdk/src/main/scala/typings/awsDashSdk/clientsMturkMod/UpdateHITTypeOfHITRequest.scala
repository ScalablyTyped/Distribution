package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateHITTypeOfHITRequest extends js.Object {
  /**
    * The HIT to update.
    */
  var HITId: EntityId
  /**
    * The ID of the new HIT type.
    */
  var HITTypeId: EntityId
}

object UpdateHITTypeOfHITRequest {
  @scala.inline
  def apply(HITId: EntityId, HITTypeId: EntityId): UpdateHITTypeOfHITRequest = {
    val __obj = js.Dynamic.literal(HITId = HITId, HITTypeId = HITTypeId)
  
    __obj.asInstanceOf[UpdateHITTypeOfHITRequest]
  }
}

