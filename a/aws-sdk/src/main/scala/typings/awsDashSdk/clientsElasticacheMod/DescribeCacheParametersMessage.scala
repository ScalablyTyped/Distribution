package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeCacheParametersMessage extends js.Object {
  /**
    * The name of a specific cache parameter group to return details for.
    */
  var CacheParameterGroupName: String
  /**
    * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a marker is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: minimum 20; maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The parameter types to return. Valid values: user | system | engine-default 
    */
  var Source: js.UndefOr[String] = js.undefined
}

object DescribeCacheParametersMessage {
  @scala.inline
  def apply(
    CacheParameterGroupName: String,
    Marker: String = null,
    MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
    Source: String = null
  ): DescribeCacheParametersMessage = {
    val __obj = js.Dynamic.literal(CacheParameterGroupName = CacheParameterGroupName)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (!js.isUndefined(MaxRecords)) __obj.updateDynamic("MaxRecords")(MaxRecords)
    if (Source != null) __obj.updateDynamic("Source")(Source)
    __obj.asInstanceOf[DescribeCacheParametersMessage]
  }
}

