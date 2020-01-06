package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPSetUpdate extends js.Object {
  /**
    * Specifies whether to insert or delete an IP address with UpdateIPSet.
    */
  var Action: ChangeAction = js.native
  /**
    * The IP address type (IPV4 or IPV6) and the IP address range (in CIDR notation) that web requests originate from.
    */
  var IPSetDescriptor: typings.awsDashSdk.clientsWafregionalMod.IPSetDescriptor = js.native
}

object IPSetUpdate {
  @scala.inline
  def apply(Action: ChangeAction, IPSetDescriptor: IPSetDescriptor): IPSetUpdate = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], IPSetDescriptor = IPSetDescriptor.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPSetUpdate]
  }
}

