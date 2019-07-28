package typings.awsDashSdk.clientsResourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceFilter extends js.Object {
  /**
    * The name of the filter. Filter names are case-sensitive.
    */
  var Name: ResourceFilterName
  /**
    * One or more filter values. Allowed filter values vary by resource filter name, and are case-sensitive.
    */
  var Values: ResourceFilterValues
}

object ResourceFilter {
  @scala.inline
  def apply(Name: ResourceFilterName, Values: ResourceFilterValues): ResourceFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values)
  
    __obj.asInstanceOf[ResourceFilter]
  }
}

