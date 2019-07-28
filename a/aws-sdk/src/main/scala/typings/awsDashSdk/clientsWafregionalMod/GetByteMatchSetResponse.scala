package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetByteMatchSetResponse extends js.Object {
  /**
    * Information about the ByteMatchSet that you specified in the GetByteMatchSet request. For more information, see the following topics:    ByteMatchSet: Contains ByteMatchSetId, ByteMatchTuples, and Name     ByteMatchTuples: Contains an array of ByteMatchTuple objects. Each ByteMatchTuple object contains FieldToMatch, PositionalConstraint, TargetString, and TextTransformation     FieldToMatch: Contains Data and Type   
    */
  var ByteMatchSet: js.UndefOr[typings.awsDashSdk.clientsWafregionalMod.ByteMatchSet] = js.undefined
}

object GetByteMatchSetResponse {
  @scala.inline
  def apply(ByteMatchSet: ByteMatchSet = null): GetByteMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    if (ByteMatchSet != null) __obj.updateDynamic("ByteMatchSet")(ByteMatchSet)
    __obj.asInstanceOf[GetByteMatchSetResponse]
  }
}

