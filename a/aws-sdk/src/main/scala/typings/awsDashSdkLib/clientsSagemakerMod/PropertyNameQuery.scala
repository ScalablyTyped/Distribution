package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyNameQuery extends js.Object {
  /**
    * Text that is part of a property's name. The property names of hyperparameter, metric, and tag key names that begin with the specified text in the PropertyNameHint.
    */
  var PropertyNameHint: awsDashSdkLib.clientsSagemakerMod.PropertyNameHint
}

object PropertyNameQuery {
  @scala.inline
  def apply(PropertyNameHint: PropertyNameHint): PropertyNameQuery = {
    val __obj = js.Dynamic.literal(PropertyNameHint = PropertyNameHint)
  
    __obj.asInstanceOf[PropertyNameQuery]
  }
}

