package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyNameQuery extends js.Object {
  /**
    * Text that is part of a property's name. The property names of hyperparameter, metric, and tag key names that begin with the specified text in the PropertyNameHint.
    */
  var PropertyNameHint: typings.awsDashSdk.clientsSagemakerMod.PropertyNameHint = js.native
}

object PropertyNameQuery {
  @scala.inline
  def apply(PropertyNameHint: PropertyNameHint): PropertyNameQuery = {
    val __obj = js.Dynamic.literal(PropertyNameHint = PropertyNameHint.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PropertyNameQuery]
  }
}

