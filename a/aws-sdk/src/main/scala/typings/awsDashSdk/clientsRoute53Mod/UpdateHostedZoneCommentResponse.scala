package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateHostedZoneCommentResponse extends js.Object {
  /**
    * A complex type that contains the response to the UpdateHostedZoneComment request.
    */
  var HostedZone: typings.awsDashSdk.clientsRoute53Mod.HostedZone
}

object UpdateHostedZoneCommentResponse {
  @scala.inline
  def apply(HostedZone: HostedZone): UpdateHostedZoneCommentResponse = {
    val __obj = js.Dynamic.literal(HostedZone = HostedZone)
  
    __obj.asInstanceOf[UpdateHostedZoneCommentResponse]
  }
}

