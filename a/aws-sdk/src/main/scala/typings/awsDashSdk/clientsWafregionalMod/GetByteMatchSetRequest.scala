package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetByteMatchSetRequest extends js.Object {
  /**
    * The ByteMatchSetId of the ByteMatchSet that you want to get. ByteMatchSetId is returned by CreateByteMatchSet and by ListByteMatchSets.
    */
  var ByteMatchSetId: ResourceId = js.native
}

object GetByteMatchSetRequest {
  @scala.inline
  def apply(ByteMatchSetId: ResourceId): GetByteMatchSetRequest = {
    val __obj = js.Dynamic.literal(ByteMatchSetId = ByteMatchSetId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetByteMatchSetRequest]
  }
}

