package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeCacheSecurityGroupsMessage extends js.Object {
  /**
    * The name of the cache security group to return details for.
    */
  var CacheSecurityGroupName: js.UndefOr[String] = js.undefined
  /**
    * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a marker is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: minimum 20; maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
}

object DescribeCacheSecurityGroupsMessage {
  @scala.inline
  def apply(
    CacheSecurityGroupName: String = null,
    Marker: String = null,
    MaxRecords: Int | scala.Double = null
  ): DescribeCacheSecurityGroupsMessage = {
    val __obj = js.Dynamic.literal()
    if (CacheSecurityGroupName != null) __obj.updateDynamic("CacheSecurityGroupName")(CacheSecurityGroupName)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (MaxRecords != null) __obj.updateDynamic("MaxRecords")(MaxRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCacheSecurityGroupsMessage]
  }
}

