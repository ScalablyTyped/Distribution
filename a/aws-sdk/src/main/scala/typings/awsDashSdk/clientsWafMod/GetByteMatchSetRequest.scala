package typings.awsDashSdk.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetByteMatchSetRequest extends js.Object {
  /**
    * The ByteMatchSetId of the ByteMatchSet that you want to get. ByteMatchSetId is returned by CreateByteMatchSet and by ListByteMatchSets.
    */
  var ByteMatchSetId: ResourceId
}

object GetByteMatchSetRequest {
  @scala.inline
  def apply(ByteMatchSetId: ResourceId): GetByteMatchSetRequest = {
    val __obj = js.Dynamic.literal(ByteMatchSetId = ByteMatchSetId)
  
    __obj.asInstanceOf[GetByteMatchSetRequest]
  }
}

