package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateVPCFromHostedZoneResponse extends js.Object {
  /**
    * A complex type that describes the changes made to the specified private hosted zone.
    */
  var ChangeInfo: typings.awsDashSdk.clientsRoute53Mod.ChangeInfo
}

object DisassociateVPCFromHostedZoneResponse {
  @scala.inline
  def apply(ChangeInfo: ChangeInfo): DisassociateVPCFromHostedZoneResponse = {
    val __obj = js.Dynamic.literal(ChangeInfo = ChangeInfo)
  
    __obj.asInstanceOf[DisassociateVPCFromHostedZoneResponse]
  }
}

