package typings.awsDashSdk.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSizeConstraintSetRequest extends js.Object {
  /**
    * The SizeConstraintSetId of the SizeConstraintSet that you want to get. SizeConstraintSetId is returned by CreateSizeConstraintSet and by ListSizeConstraintSets.
    */
  var SizeConstraintSetId: ResourceId = js.native
}

object GetSizeConstraintSetRequest {
  @scala.inline
  def apply(SizeConstraintSetId: ResourceId): GetSizeConstraintSetRequest = {
    val __obj = js.Dynamic.literal(SizeConstraintSetId = SizeConstraintSetId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetSizeConstraintSetRequest]
  }
}

