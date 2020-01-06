package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateByteMatchSetResponse extends js.Object {
  /**
    * A ByteMatchSet that contains no ByteMatchTuple objects.
    */
  var ByteMatchSet: js.UndefOr[typings.awsDashSdk.clientsWafregionalMod.ByteMatchSet] = js.native
  /**
    * The ChangeToken that you used to submit the CreateByteMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typings.awsDashSdk.clientsWafregionalMod.ChangeToken] = js.native
}

object CreateByteMatchSetResponse {
  @scala.inline
  def apply(ByteMatchSet: ByteMatchSet = null, ChangeToken: ChangeToken = null): CreateByteMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    if (ByteMatchSet != null) __obj.updateDynamic("ByteMatchSet")(ByteMatchSet.asInstanceOf[js.Any])
    if (ChangeToken != null) __obj.updateDynamic("ChangeToken")(ChangeToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateByteMatchSetResponse]
  }
}

