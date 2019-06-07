package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpsAggregator extends js.Object {
  /**
    * Either a Range or Count aggregator for limiting an OpsItem summary.
    */
  var AggregatorType: js.UndefOr[OpsAggregatorType] = js.undefined
  /**
    * A nested aggregator for viewing counts of OpsItems.
    */
  var Aggregators: js.UndefOr[OpsAggregatorList] = js.undefined
  /**
    * The name of an OpsItem attribute on which to limit the count of OpsItems.
    */
  var AttributeName: js.UndefOr[OpsDataAttributeName] = js.undefined
  /**
    * The aggregator filters.
    */
  var Filters: js.UndefOr[OpsFilterList] = js.undefined
  /**
    * The data type name to use for viewing counts of OpsItems.
    */
  var TypeName: js.UndefOr[OpsDataTypeName] = js.undefined
  /**
    * The aggregator value.
    */
  var Values: js.UndefOr[OpsAggregatorValueMap] = js.undefined
}

object OpsAggregator {
  @scala.inline
  def apply(
    AggregatorType: OpsAggregatorType = null,
    Aggregators: OpsAggregatorList = null,
    AttributeName: OpsDataAttributeName = null,
    Filters: OpsFilterList = null,
    TypeName: OpsDataTypeName = null,
    Values: OpsAggregatorValueMap = null
  ): OpsAggregator = {
    val __obj = js.Dynamic.literal()
    if (AggregatorType != null) __obj.updateDynamic("AggregatorType")(AggregatorType)
    if (Aggregators != null) __obj.updateDynamic("Aggregators")(Aggregators)
    if (AttributeName != null) __obj.updateDynamic("AttributeName")(AttributeName)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (TypeName != null) __obj.updateDynamic("TypeName")(TypeName)
    if (Values != null) __obj.updateDynamic("Values")(Values)
    __obj.asInstanceOf[OpsAggregator]
  }
}

