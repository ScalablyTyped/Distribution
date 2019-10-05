package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeServiceUpdatesMessage extends js.Object {
  /**
    * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of records to include in the response
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The unique ID of the service update
    */
  var ServiceUpdateName: js.UndefOr[String] = js.undefined
  /**
    * The status of the service update
    */
  var ServiceUpdateStatus: js.UndefOr[ServiceUpdateStatusList] = js.undefined
}

object DescribeServiceUpdatesMessage {
  @scala.inline
  def apply(
    Marker: String = null,
    MaxRecords: Int | scala.Double = null,
    ServiceUpdateName: String = null,
    ServiceUpdateStatus: ServiceUpdateStatusList = null
  ): DescribeServiceUpdatesMessage = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (MaxRecords != null) __obj.updateDynamic("MaxRecords")(MaxRecords.asInstanceOf[js.Any])
    if (ServiceUpdateName != null) __obj.updateDynamic("ServiceUpdateName")(ServiceUpdateName)
    if (ServiceUpdateStatus != null) __obj.updateDynamic("ServiceUpdateStatus")(ServiceUpdateStatus)
    __obj.asInstanceOf[DescribeServiceUpdatesMessage]
  }
}

