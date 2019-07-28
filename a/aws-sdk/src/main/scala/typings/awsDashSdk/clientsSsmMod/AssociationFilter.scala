package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociationFilter extends js.Object {
  /**
    * The name of the filter.
    */
  var key: AssociationFilterKey
  /**
    * The filter value.
    */
  var value: AssociationFilterValue
}

object AssociationFilter {
  @scala.inline
  def apply(key: AssociationFilterKey, value: AssociationFilterValue): AssociationFilter = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value)
  
    __obj.asInstanceOf[AssociationFilter]
  }
}

