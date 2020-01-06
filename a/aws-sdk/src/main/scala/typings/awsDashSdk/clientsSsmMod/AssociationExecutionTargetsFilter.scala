package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociationExecutionTargetsFilter extends js.Object {
  /**
    * The key value used in the request.
    */
  var Key: AssociationExecutionTargetsFilterKey = js.native
  /**
    * The value specified for the key.
    */
  var Value: AssociationExecutionTargetsFilterValue = js.native
}

object AssociationExecutionTargetsFilter {
  @scala.inline
  def apply(Key: AssociationExecutionTargetsFilterKey, Value: AssociationExecutionTargetsFilterValue): AssociationExecutionTargetsFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AssociationExecutionTargetsFilter]
  }
}

