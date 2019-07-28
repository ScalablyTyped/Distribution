package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ByteMatchSet extends js.Object {
  /**
    * The ByteMatchSetId for a ByteMatchSet. You use ByteMatchSetId to get information about a ByteMatchSet (see GetByteMatchSet), update a ByteMatchSet (see UpdateByteMatchSet), insert a ByteMatchSet into a Rule or delete one from a Rule (see UpdateRule), and delete a ByteMatchSet from AWS WAF (see DeleteByteMatchSet).  ByteMatchSetId is returned by CreateByteMatchSet and by ListByteMatchSets.
    */
  var ByteMatchSetId: ResourceId
  /**
    * Specifies the bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search, and other settings.
    */
  var ByteMatchTuples: typings.awsDashSdk.clientsWafregionalMod.ByteMatchTuples
  /**
    * A friendly name or description of the ByteMatchSet. You can't change Name after you create a ByteMatchSet.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
}

object ByteMatchSet {
  @scala.inline
  def apply(ByteMatchSetId: ResourceId, ByteMatchTuples: ByteMatchTuples, Name: ResourceName = null): ByteMatchSet = {
    val __obj = js.Dynamic.literal(ByteMatchSetId = ByteMatchSetId, ByteMatchTuples = ByteMatchTuples)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[ByteMatchSet]
  }
}

