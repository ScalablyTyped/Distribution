package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociationFilter extends js.Object {
  /**
    * The name of the filter.
    */
  var key: AssociationFilterKey = js.native
  /**
    * The filter value.
    */
  var value: AssociationFilterValue = js.native
}

object AssociationFilter {
  @scala.inline
  def apply(key: AssociationFilterKey, value: AssociationFilterValue): AssociationFilter = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AssociationFilter]
  }
}

