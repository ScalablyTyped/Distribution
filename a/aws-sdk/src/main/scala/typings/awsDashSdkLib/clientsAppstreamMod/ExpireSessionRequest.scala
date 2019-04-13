package typings
package awsDashSdkLib.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpireSessionRequest extends js.Object {
  /**
    * The identifier of the streaming session.
    */
  var SessionId: String
}

object ExpireSessionRequest {
  @scala.inline
  def apply(SessionId: String): ExpireSessionRequest = {
    val __obj = js.Dynamic.literal(SessionId = SessionId)
  
    __obj.asInstanceOf[ExpireSessionRequest]
  }
}

