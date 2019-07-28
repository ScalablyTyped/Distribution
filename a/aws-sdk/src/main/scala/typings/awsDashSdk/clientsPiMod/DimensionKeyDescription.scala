package typings.awsDashSdk.clientsPiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionKeyDescription extends js.Object {
  /**
    * A map of name-value pairs for the dimensions in the group.
    */
  var Dimensions: js.UndefOr[DimensionMap] = js.undefined
  /**
    * If PartitionBy was specified, PartitionKeys contains the dimensions that were.
    */
  var Partitions: js.UndefOr[MetricValuesList] = js.undefined
  /**
    * The aggregated metric value for the dimension(s), over the requested time range.
    */
  var Total: js.UndefOr[Double] = js.undefined
}

object DimensionKeyDescription {
  @scala.inline
  def apply(
    Dimensions: DimensionMap = null,
    Partitions: MetricValuesList = null,
    Total: js.UndefOr[Double] = js.undefined
  ): DimensionKeyDescription = {
    val __obj = js.Dynamic.literal()
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions)
    if (Partitions != null) __obj.updateDynamic("Partitions")(Partitions)
    if (!js.isUndefined(Total)) __obj.updateDynamic("Total")(Total)
    __obj.asInstanceOf[DimensionKeyDescription]
  }
}

