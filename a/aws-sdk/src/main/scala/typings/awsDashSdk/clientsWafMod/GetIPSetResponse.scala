package typings.awsDashSdk.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIPSetResponse extends js.Object {
  /**
    * Information about the IPSet that you specified in the GetIPSet request. For more information, see the following topics:    IPSet: Contains IPSetDescriptors, IPSetId, and Name     IPSetDescriptors: Contains an array of IPSetDescriptor objects. Each IPSetDescriptor object contains Type and Value   
    */
  var IPSet: js.UndefOr[typings.awsDashSdk.clientsWafMod.IPSet] = js.undefined
}

object GetIPSetResponse {
  @scala.inline
  def apply(IPSet: IPSet = null): GetIPSetResponse = {
    val __obj = js.Dynamic.literal()
    if (IPSet != null) __obj.updateDynamic("IPSet")(IPSet)
    __obj.asInstanceOf[GetIPSetResponse]
  }
}

