package typings
package awsDashSdkLib.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteHITRequest extends js.Object {
  /**
    * The ID of the HIT to be deleted.
    */
  var HITId: EntityId
}

object DeleteHITRequest {
  @scala.inline
  def apply(HITId: EntityId): DeleteHITRequest = {
    val __obj = js.Dynamic.literal(HITId = HITId)
  
    __obj.asInstanceOf[DeleteHITRequest]
  }
}

