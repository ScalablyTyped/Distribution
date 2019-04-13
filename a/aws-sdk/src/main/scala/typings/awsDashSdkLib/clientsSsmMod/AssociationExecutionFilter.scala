package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociationExecutionFilter extends js.Object {
  /**
    * The key value used in the request.
    */
  var Key: AssociationExecutionFilterKey
  /**
    * The filter type specified in the request.
    */
  var Type: AssociationFilterOperatorType
  /**
    * The value specified for the key.
    */
  var Value: AssociationExecutionFilterValue
}

object AssociationExecutionFilter {
  @scala.inline
  def apply(
    Key: AssociationExecutionFilterKey,
    Type: AssociationFilterOperatorType,
    Value: AssociationExecutionFilterValue
  ): AssociationExecutionFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value)
  
    __obj.asInstanceOf[AssociationExecutionFilter]
  }
}

