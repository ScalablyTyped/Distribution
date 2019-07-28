package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetHITRequest extends js.Object {
  /**
    * The ID of the HIT to be retrieved.
    */
  var HITId: EntityId
}

object GetHITRequest {
  @scala.inline
  def apply(HITId: EntityId): GetHITRequest = {
    val __obj = js.Dynamic.literal(HITId = HITId)
  
    __obj.asInstanceOf[GetHITRequest]
  }
}

