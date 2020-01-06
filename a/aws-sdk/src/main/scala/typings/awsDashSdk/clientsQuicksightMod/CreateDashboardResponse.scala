package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDashboardResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dashboard.
    */
  var Arn: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.Arn] = js.native
  /**
    * The status of the dashboard creation request.
    */
  var CreationStatus: js.UndefOr[ResourceStatus] = js.native
  /**
    * The ID for the dashboard.
    */
  var DashboardId: js.UndefOr[RestrictiveResourceId] = js.native
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
  /**
    * The ARN of the dashboard, including the version number of the first version that is created.
    */
  var VersionArn: js.UndefOr[Arn] = js.native
}

object CreateDashboardResponse {
  @scala.inline
  def apply(
    Arn: Arn = null,
    CreationStatus: ResourceStatus = null,
    DashboardId: RestrictiveResourceId = null,
    RequestId: String = null,
    Status: Int | scala.Double = null,
    VersionArn: Arn = null
  ): CreateDashboardResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (CreationStatus != null) __obj.updateDynamic("CreationStatus")(CreationStatus.asInstanceOf[js.Any])
    if (DashboardId != null) __obj.updateDynamic("DashboardId")(DashboardId.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (VersionArn != null) __obj.updateDynamic("VersionArn")(VersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDashboardResponse]
  }
}

