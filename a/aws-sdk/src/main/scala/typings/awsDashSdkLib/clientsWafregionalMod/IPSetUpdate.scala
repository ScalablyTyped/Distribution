package typings
package awsDashSdkLib.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPSetUpdate extends js.Object {
  /**
    * Specifies whether to insert or delete an IP address with UpdateIPSet.
    */
  var Action: ChangeAction
  /**
    * The IP address type (IPV4 or IPV6) and the IP address range (in CIDR notation) that web requests originate from.
    */
  var IPSetDescriptor: awsDashSdkLib.clientsWafregionalMod.IPSetDescriptor
}

object IPSetUpdate {
  @scala.inline
  def apply(Action: ChangeAction, IPSetDescriptor: IPSetDescriptor): IPSetUpdate = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], IPSetDescriptor = IPSetDescriptor)
  
    __obj.asInstanceOf[IPSetUpdate]
  }
}

