package typings
package awsDashSdkLib.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateExpirationForHITRequest extends js.Object {
  /**
    *  The date and time at which you want the HIT to expire 
    */
  var ExpireAt: Timestamp
  /**
    *  The HIT to update. 
    */
  var HITId: EntityId
}

object UpdateExpirationForHITRequest {
  @scala.inline
  def apply(ExpireAt: Timestamp, HITId: EntityId): UpdateExpirationForHITRequest = {
    val __obj = js.Dynamic.literal(ExpireAt = ExpireAt, HITId = HITId)
  
    __obj.asInstanceOf[UpdateExpirationForHITRequest]
  }
}

