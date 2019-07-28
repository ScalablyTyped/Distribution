package typings.awsDashSdk.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSizeConstraintSetResponse extends js.Object {
  /**
    * The ChangeToken that you used to submit the UpdateSizeConstraintSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typings.awsDashSdk.clientsWafMod.ChangeToken] = js.undefined
}

object UpdateSizeConstraintSetResponse {
  @scala.inline
  def apply(ChangeToken: ChangeToken = null): UpdateSizeConstraintSetResponse = {
    val __obj = js.Dynamic.literal()
    if (ChangeToken != null) __obj.updateDynamic("ChangeToken")(ChangeToken)
    __obj.asInstanceOf[UpdateSizeConstraintSetResponse]
  }
}

