package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDataSourcePermissionsResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the data source.
    */
  var DataSourceArn: js.UndefOr[Arn] = js.native
  /**
    * The ID of the data source. This ID is unique per AWS Region for each AWS account.
    */
  var DataSourceId: js.UndefOr[ResourceId] = js.native
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}

object UpdateDataSourcePermissionsResponse {
  @scala.inline
  def apply(
    DataSourceArn: Arn = null,
    DataSourceId: ResourceId = null,
    RequestId: String = null,
    Status: Int | scala.Double = null
  ): UpdateDataSourcePermissionsResponse = {
    val __obj = js.Dynamic.literal()
    if (DataSourceArn != null) __obj.updateDynamic("DataSourceArn")(DataSourceArn.asInstanceOf[js.Any])
    if (DataSourceId != null) __obj.updateDynamic("DataSourceId")(DataSourceId.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDataSourcePermissionsResponse]
  }
}

