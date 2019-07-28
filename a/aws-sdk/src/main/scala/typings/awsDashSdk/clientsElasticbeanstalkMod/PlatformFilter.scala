package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformFilter extends js.Object {
  /**
    * The operator to apply to the Type with each of the Values.  Valid Values: = (equal to) | != (not equal to) | &lt; (less than) | &lt;= (less than or equal to) | &gt; (greater than) | &gt;= (greater than or equal to) | contains | begins_with | ends_with 
    */
  var Operator: js.UndefOr[PlatformFilterOperator] = js.undefined
  /**
    * The custom platform attribute to which the filter values are applied. Valid Values: PlatformName | PlatformVersion | PlatformStatus | PlatformOwner 
    */
  var Type: js.UndefOr[PlatformFilterType] = js.undefined
  /**
    * The list of values applied to the custom platform attribute.
    */
  var Values: js.UndefOr[PlatformFilterValueList] = js.undefined
}

object PlatformFilter {
  @scala.inline
  def apply(
    Operator: PlatformFilterOperator = null,
    Type: PlatformFilterType = null,
    Values: PlatformFilterValueList = null
  ): PlatformFilter = {
    val __obj = js.Dynamic.literal()
    if (Operator != null) __obj.updateDynamic("Operator")(Operator)
    if (Type != null) __obj.updateDynamic("Type")(Type)
    if (Values != null) __obj.updateDynamic("Values")(Values)
    __obj.asInstanceOf[PlatformFilter]
  }
}

