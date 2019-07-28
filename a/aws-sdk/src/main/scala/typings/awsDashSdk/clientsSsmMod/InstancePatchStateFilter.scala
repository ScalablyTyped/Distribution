package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstancePatchStateFilter extends js.Object {
  /**
    * The key for the filter. Supported values are FailedCount, InstalledCount, InstalledOtherCount, MissingCount and NotApplicableCount.
    */
  var Key: InstancePatchStateFilterKey
  /**
    * The type of comparison that should be performed for the value: Equal, NotEqual, LessThan or GreaterThan.
    */
  var Type: InstancePatchStateOperatorType
  /**
    * The value for the filter, must be an integer greater than or equal to 0.
    */
  var Values: InstancePatchStateFilterValues
}

object InstancePatchStateFilter {
  @scala.inline
  def apply(
    Key: InstancePatchStateFilterKey,
    Type: InstancePatchStateOperatorType,
    Values: InstancePatchStateFilterValues
  ): InstancePatchStateFilter = {
    val __obj = js.Dynamic.literal(Key = Key, Type = Type.asInstanceOf[js.Any], Values = Values)
  
    __obj.asInstanceOf[InstancePatchStateFilter]
  }
}

