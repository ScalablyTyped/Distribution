package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceInformationFilter extends js.Object {
  /**
    * The name of the filter. 
    */
  var key: InstanceInformationFilterKey
  /**
    * The filter values.
    */
  var valueSet: InstanceInformationFilterValueSet
}

object InstanceInformationFilter {
  @scala.inline
  def apply(key: InstanceInformationFilterKey, valueSet: InstanceInformationFilterValueSet): InstanceInformationFilter = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], valueSet = valueSet)
  
    __obj.asInstanceOf[InstanceInformationFilter]
  }
}

