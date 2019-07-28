package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIPSetRequest extends js.Object {
  /**
    * The IPSetId of the IPSet that you want to get. IPSetId is returned by CreateIPSet and by ListIPSets.
    */
  var IPSetId: ResourceId
}

object GetIPSetRequest {
  @scala.inline
  def apply(IPSetId: ResourceId): GetIPSetRequest = {
    val __obj = js.Dynamic.literal(IPSetId = IPSetId)
  
    __obj.asInstanceOf[GetIPSetRequest]
  }
}

