package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpsAggregator extends js.Object {
  /**
    * Either a Range or Count aggregator for limiting an OpsItem summary.
    */
  var AggregatorType: js.UndefOr[OpsAggregatorType] = js.native
  /**
    * A nested aggregator for viewing counts of OpsItems.
    */
  var Aggregators: js.UndefOr[OpsAggregatorList] = js.native
  /**
    * The name of an OpsItem attribute on which to limit the count of OpsItems.
    */
  var AttributeName: js.UndefOr[OpsDataAttributeName] = js.native
  /**
    * The aggregator filters.
    */
  var Filters: js.UndefOr[OpsFilterList] = js.native
  /**
    * The data type name to use for viewing counts of OpsItems.
    */
  var TypeName: js.UndefOr[OpsDataTypeName] = js.native
  /**
    * The aggregator value.
    */
  var Values: js.UndefOr[OpsAggregatorValueMap] = js.native
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
    if (AggregatorType != null) __obj.updateDynamic("AggregatorType")(AggregatorType.asInstanceOf[js.Any])
    if (Aggregators != null) __obj.updateDynamic("Aggregators")(Aggregators.asInstanceOf[js.Any])
    if (AttributeName != null) __obj.updateDynamic("AttributeName")(AttributeName.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (TypeName != null) __obj.updateDynamic("TypeName")(TypeName.asInstanceOf[js.Any])
    if (Values != null) __obj.updateDynamic("Values")(Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpsAggregator]
  }
}

