package typings
package awsDashSdkLib.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateByteMatchSetResponse extends js.Object {
  /**
    * A ByteMatchSet that contains no ByteMatchTuple objects.
    */
  var ByteMatchSet: js.UndefOr[ByteMatchSet] = js.undefined
  /**
    * The ChangeToken that you used to submit the CreateByteMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
}

object CreateByteMatchSetResponse {
  @scala.inline
  def apply(ByteMatchSet: ByteMatchSet = null, ChangeToken: ChangeToken = null): CreateByteMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    if (ByteMatchSet != null) __obj.updateDynamic("ByteMatchSet")(ByteMatchSet)
    if (ChangeToken != null) __obj.updateDynamic("ChangeToken")(ChangeToken)
    __obj.asInstanceOf[CreateByteMatchSetResponse]
  }
}

