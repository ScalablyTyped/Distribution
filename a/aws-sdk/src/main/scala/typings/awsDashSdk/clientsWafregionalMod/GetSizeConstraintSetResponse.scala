package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSizeConstraintSetResponse extends js.Object {
  /**
    * Information about the SizeConstraintSet that you specified in the GetSizeConstraintSet request. For more information, see the following topics:    SizeConstraintSet: Contains SizeConstraintSetId, SizeConstraints, and Name     SizeConstraints: Contains an array of SizeConstraint objects. Each SizeConstraint object contains FieldToMatch, TextTransformation, ComparisonOperator, and Size     FieldToMatch: Contains Data and Type   
    */
  var SizeConstraintSet: js.UndefOr[typings.awsDashSdk.clientsWafregionalMod.SizeConstraintSet] = js.undefined
}

object GetSizeConstraintSetResponse {
  @scala.inline
  def apply(SizeConstraintSet: SizeConstraintSet = null): GetSizeConstraintSetResponse = {
    val __obj = js.Dynamic.literal()
    if (SizeConstraintSet != null) __obj.updateDynamic("SizeConstraintSet")(SizeConstraintSet)
    __obj.asInstanceOf[GetSizeConstraintSetResponse]
  }
}

