package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstancePatchStateFilter extends js.Object {
  /**
    * The key for the filter. Supported values are FailedCount, InstalledCount, InstalledOtherCount, MissingCount and NotApplicableCount.
    */
  var Key: InstancePatchStateFilterKey = js.native
  /**
    * The type of comparison that should be performed for the value: Equal, NotEqual, LessThan or GreaterThan.
    */
  var Type: InstancePatchStateOperatorType = js.native
  /**
    * The value for the filter, must be an integer greater than or equal to 0.
    */
  var Values: InstancePatchStateFilterValues = js.native
}

object InstancePatchStateFilter {
  @scala.inline
  def apply(
    Key: InstancePatchStateFilterKey,
    Type: InstancePatchStateOperatorType,
    Values: InstancePatchStateFilterValues
  ): InstancePatchStateFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InstancePatchStateFilter]
  }
}

