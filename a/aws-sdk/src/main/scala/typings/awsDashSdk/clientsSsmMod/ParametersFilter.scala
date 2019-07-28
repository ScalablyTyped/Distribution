package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParametersFilter extends js.Object {
  /**
    * The name of the filter.
    */
  var Key: ParametersFilterKey
  /**
    * The filter values.
    */
  var Values: ParametersFilterValueList
}

object ParametersFilter {
  @scala.inline
  def apply(Key: ParametersFilterKey, Values: ParametersFilterValueList): ParametersFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Values = Values)
  
    __obj.asInstanceOf[ParametersFilter]
  }
}

