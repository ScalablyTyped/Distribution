package typings.awsDashSdk.clientsResourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupFilter extends js.Object {
  /**
    * The name of the filter. Filter names are case-sensitive.
    */
  var Name: GroupFilterName = js.native
  /**
    * One or more filter values. Allowed filter values vary by group filter name, and are case-sensitive.
    */
  var Values: GroupFilterValues = js.native
}

object GroupFilter {
  @scala.inline
  def apply(Name: GroupFilterName, Values: GroupFilterValues): GroupFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GroupFilter]
  }
}

