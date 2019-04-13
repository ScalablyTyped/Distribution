package typings
package awsDashSdkLib.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPSet extends js.Object {
  /**
    * The IP address type (IPV4 or IPV6) and the IP address range (in CIDR notation) that web requests originate from. If the WebACL is associated with a CloudFront distribution and the viewer did not use an HTTP proxy or a load balancer to send the request, this is the value of the c-ip field in the CloudFront access logs.
    */
  var IPSetDescriptors: awsDashSdkLib.clientsWafregionalMod.IPSetDescriptors
  /**
    * The IPSetId for an IPSet. You use IPSetId to get information about an IPSet (see GetIPSet), update an IPSet (see UpdateIPSet), insert an IPSet into a Rule or delete one from a Rule (see UpdateRule), and delete an IPSet from AWS WAF (see DeleteIPSet).  IPSetId is returned by CreateIPSet and by ListIPSets.
    */
  var IPSetId: ResourceId
  /**
    * A friendly name or description of the IPSet. You can't change the name of an IPSet after you create it.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
}

object IPSet {
  @scala.inline
  def apply(IPSetDescriptors: IPSetDescriptors, IPSetId: ResourceId, Name: ResourceName = null): IPSet = {
    val __obj = js.Dynamic.literal(IPSetDescriptors = IPSetDescriptors, IPSetId = IPSetId)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[IPSet]
  }
}

