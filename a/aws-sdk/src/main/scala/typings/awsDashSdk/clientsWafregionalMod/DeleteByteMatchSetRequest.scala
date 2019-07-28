package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteByteMatchSetRequest extends js.Object {
  /**
    * The ByteMatchSetId of the ByteMatchSet that you want to delete. ByteMatchSetId is returned by CreateByteMatchSet and by ListByteMatchSets.
    */
  var ByteMatchSetId: ResourceId
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsDashSdk.clientsWafregionalMod.ChangeToken
}

object DeleteByteMatchSetRequest {
  @scala.inline
  def apply(ByteMatchSetId: ResourceId, ChangeToken: ChangeToken): DeleteByteMatchSetRequest = {
    val __obj = js.Dynamic.literal(ByteMatchSetId = ByteMatchSetId, ChangeToken = ChangeToken)
  
    __obj.asInstanceOf[DeleteByteMatchSetRequest]
  }
}

