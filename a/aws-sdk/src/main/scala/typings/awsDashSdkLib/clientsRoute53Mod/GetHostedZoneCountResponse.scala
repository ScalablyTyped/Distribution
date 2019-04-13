package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetHostedZoneCountResponse extends js.Object {
  /**
    * The total number of public and private hosted zones that are associated with the current AWS account.
    */
  var HostedZoneCount: awsDashSdkLib.clientsRoute53Mod.HostedZoneCount
}

object GetHostedZoneCountResponse {
  @scala.inline
  def apply(HostedZoneCount: HostedZoneCount): GetHostedZoneCountResponse = {
    val __obj = js.Dynamic.literal(HostedZoneCount = HostedZoneCount)
  
    __obj.asInstanceOf[GetHostedZoneCountResponse]
  }
}

