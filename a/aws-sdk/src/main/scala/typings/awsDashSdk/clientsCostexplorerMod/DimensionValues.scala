package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionValues extends js.Object {
  /**
    * The names of the metadata types that you can use to filter and group your results. For example, AZ returns a list of Availability Zones.
    */
  var Key: js.UndefOr[Dimension] = js.undefined
  /**
    * The metadata values that you can use to filter and group your results. You can use GetDimensionValues to find specific values. Valid values for the SERVICE dimension are Amazon Elastic Compute Cloud - Compute, Amazon Elasticsearch Service, Amazon ElastiCache, Amazon Redshift, and Amazon Relational Database Service.
    */
  var Values: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.Values] = js.undefined
}

object DimensionValues {
  @scala.inline
  def apply(Key: Dimension = null, Values: Values = null): DimensionValues = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (Values != null) __obj.updateDynamic("Values")(Values)
    __obj.asInstanceOf[DimensionValues]
  }
}

