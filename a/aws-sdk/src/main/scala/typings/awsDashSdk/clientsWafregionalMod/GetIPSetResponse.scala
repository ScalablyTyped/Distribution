package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIPSetResponse extends js.Object {
  /**
    * Information about the IPSet that you specified in the GetIPSet request. For more information, see the following topics:    IPSet: Contains IPSetDescriptors, IPSetId, and Name     IPSetDescriptors: Contains an array of IPSetDescriptor objects. Each IPSetDescriptor object contains Type and Value   
    */
  var IPSet: js.UndefOr[typings.awsDashSdk.clientsWafregionalMod.IPSet] = js.native
}

object GetIPSetResponse {
  @scala.inline
  def apply(IPSet: IPSet = null): GetIPSetResponse = {
    val __obj = js.Dynamic.literal()
    if (IPSet != null) __obj.updateDynamic("IPSet")(IPSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIPSetResponse]
  }
}

