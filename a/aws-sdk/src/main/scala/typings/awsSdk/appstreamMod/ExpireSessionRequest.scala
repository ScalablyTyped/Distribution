package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpireSessionRequest extends js.Object {
  /**
    * The identifier of the streaming session.
    */
  var SessionId: String = js.native
}

object ExpireSessionRequest {
  @scala.inline
  def apply(SessionId: String): ExpireSessionRequest = {
    val __obj = js.Dynamic.literal(SessionId = SessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpireSessionRequest]
  }
}

