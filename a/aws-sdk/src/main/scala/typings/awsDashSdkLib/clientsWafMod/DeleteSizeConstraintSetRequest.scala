package typings
package awsDashSdkLib.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSizeConstraintSetRequest extends js.Object {
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: awsDashSdkLib.clientsWafMod.ChangeToken
  /**
    * The SizeConstraintSetId of the SizeConstraintSet that you want to delete. SizeConstraintSetId is returned by CreateSizeConstraintSet and by ListSizeConstraintSets.
    */
  var SizeConstraintSetId: ResourceId
}

object DeleteSizeConstraintSetRequest {
  @scala.inline
  def apply(ChangeToken: ChangeToken, SizeConstraintSetId: ResourceId): DeleteSizeConstraintSetRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken, SizeConstraintSetId = SizeConstraintSetId)
  
    __obj.asInstanceOf[DeleteSizeConstraintSetRequest]
  }
}

