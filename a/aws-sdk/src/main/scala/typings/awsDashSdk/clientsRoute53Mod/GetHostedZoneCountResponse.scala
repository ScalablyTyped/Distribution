package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetHostedZoneCountResponse extends js.Object {
  /**
    * The total number of public and private hosted zones that are associated with the current AWS account.
    */
  var HostedZoneCount: typings.awsDashSdk.clientsRoute53Mod.HostedZoneCount = js.native
}

object GetHostedZoneCountResponse {
  @scala.inline
  def apply(HostedZoneCount: HostedZoneCount): GetHostedZoneCountResponse = {
    val __obj = js.Dynamic.literal(HostedZoneCount = HostedZoneCount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetHostedZoneCountResponse]
  }
}

