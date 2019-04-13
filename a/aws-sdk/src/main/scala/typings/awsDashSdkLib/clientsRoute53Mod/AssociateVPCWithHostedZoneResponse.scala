package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateVPCWithHostedZoneResponse extends js.Object {
  /**
    * A complex type that describes the changes made to your hosted zone.
    */
  var ChangeInfo: awsDashSdkLib.clientsRoute53Mod.ChangeInfo
}

object AssociateVPCWithHostedZoneResponse {
  @scala.inline
  def apply(ChangeInfo: ChangeInfo): AssociateVPCWithHostedZoneResponse = {
    val __obj = js.Dynamic.literal(ChangeInfo = ChangeInfo)
  
    __obj.asInstanceOf[AssociateVPCWithHostedZoneResponse]
  }
}

