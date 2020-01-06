package typings.awsDashSdk.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSizeConstraintSetResponse extends js.Object {
  /**
    * The ChangeToken that you used to submit the CreateSizeConstraintSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typings.awsDashSdk.clientsWafMod.ChangeToken] = js.native
  /**
    * A SizeConstraintSet that contains no SizeConstraint objects.
    */
  var SizeConstraintSet: js.UndefOr[typings.awsDashSdk.clientsWafMod.SizeConstraintSet] = js.native
}

object CreateSizeConstraintSetResponse {
  @scala.inline
  def apply(ChangeToken: ChangeToken = null, SizeConstraintSet: SizeConstraintSet = null): CreateSizeConstraintSetResponse = {
    val __obj = js.Dynamic.literal()
    if (ChangeToken != null) __obj.updateDynamic("ChangeToken")(ChangeToken.asInstanceOf[js.Any])
    if (SizeConstraintSet != null) __obj.updateDynamic("SizeConstraintSet")(SizeConstraintSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSizeConstraintSetResponse]
  }
}

