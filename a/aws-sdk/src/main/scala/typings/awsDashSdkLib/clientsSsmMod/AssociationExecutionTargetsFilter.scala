package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociationExecutionTargetsFilter extends js.Object {
  /**
    * The key value used in the request.
    */
  var Key: AssociationExecutionTargetsFilterKey
  /**
    * The value specified for the key.
    */
  var Value: AssociationExecutionTargetsFilterValue
}

object AssociationExecutionTargetsFilter {
  @scala.inline
  def apply(Key: AssociationExecutionTargetsFilterKey, Value: AssociationExecutionTargetsFilterValue): AssociationExecutionTargetsFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value)
  
    __obj.asInstanceOf[AssociationExecutionTargetsFilter]
  }
}

