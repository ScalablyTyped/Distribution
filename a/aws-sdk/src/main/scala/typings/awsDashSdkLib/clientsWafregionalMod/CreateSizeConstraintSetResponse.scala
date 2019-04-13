package typings
package awsDashSdkLib.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSizeConstraintSetResponse extends js.Object {
  /**
    * The ChangeToken that you used to submit the CreateSizeConstraintSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[ChangeToken] = js.undefined
  /**
    * A SizeConstraintSet that contains no SizeConstraint objects.
    */
  var SizeConstraintSet: js.UndefOr[SizeConstraintSet] = js.undefined
}

object CreateSizeConstraintSetResponse {
  @scala.inline
  def apply(ChangeToken: ChangeToken = null, SizeConstraintSet: SizeConstraintSet = null): CreateSizeConstraintSetResponse = {
    val __obj = js.Dynamic.literal()
    if (ChangeToken != null) __obj.updateDynamic("ChangeToken")(ChangeToken)
    if (SizeConstraintSet != null) __obj.updateDynamic("SizeConstraintSet")(SizeConstraintSet)
    __obj.asInstanceOf[CreateSizeConstraintSetResponse]
  }
}

