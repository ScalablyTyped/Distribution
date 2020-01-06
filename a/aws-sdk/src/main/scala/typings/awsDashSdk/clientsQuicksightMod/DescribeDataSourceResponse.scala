package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDataSourceResponse extends js.Object {
  /**
    * The information on the data source.
    */
  var DataSource: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.DataSource] = js.native
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}

object DescribeDataSourceResponse {
  @scala.inline
  def apply(DataSource: DataSource = null, RequestId: String = null, Status: Int | scala.Double = null): DescribeDataSourceResponse = {
    val __obj = js.Dynamic.literal()
    if (DataSource != null) __obj.updateDynamic("DataSource")(DataSource.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDataSourceResponse]
  }
}

