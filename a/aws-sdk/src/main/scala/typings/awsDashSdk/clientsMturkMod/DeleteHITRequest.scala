package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteHITRequest extends js.Object {
  /**
    * The ID of the HIT to be deleted.
    */
  var HITId: EntityId = js.native
}

object DeleteHITRequest {
  @scala.inline
  def apply(HITId: EntityId): DeleteHITRequest = {
    val __obj = js.Dynamic.literal(HITId = HITId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteHITRequest]
  }
}

