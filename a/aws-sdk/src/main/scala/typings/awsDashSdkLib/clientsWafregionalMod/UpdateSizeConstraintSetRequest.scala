package typings
package awsDashSdkLib.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSizeConstraintSetRequest extends js.Object {
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: awsDashSdkLib.clientsWafregionalMod.ChangeToken
  /**
    * The SizeConstraintSetId of the SizeConstraintSet that you want to update. SizeConstraintSetId is returned by CreateSizeConstraintSet and by ListSizeConstraintSets.
    */
  var SizeConstraintSetId: ResourceId
  /**
    * An array of SizeConstraintSetUpdate objects that you want to insert into or delete from a SizeConstraintSet. For more information, see the applicable data types:    SizeConstraintSetUpdate: Contains Action and SizeConstraint     SizeConstraint: Contains FieldToMatch, TextTransformation, ComparisonOperator, and Size     FieldToMatch: Contains Data and Type   
    */
  var Updates: SizeConstraintSetUpdates
}

object UpdateSizeConstraintSetRequest {
  @scala.inline
  def apply(ChangeToken: ChangeToken, SizeConstraintSetId: ResourceId, Updates: SizeConstraintSetUpdates): UpdateSizeConstraintSetRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken, SizeConstraintSetId = SizeConstraintSetId, Updates = Updates)
  
    __obj.asInstanceOf[UpdateSizeConstraintSetRequest]
  }
}

