package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceExportDetails extends js.Object {
  /**
    * The ID of the resource being exported.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * The target virtualization environment.
    */
  var TargetEnvironment: js.UndefOr[ExportEnvironment] = js.native
}

object InstanceExportDetails {
  @scala.inline
  def apply(InstanceId: String = null, TargetEnvironment: ExportEnvironment = null): InstanceExportDetails = {
    val __obj = js.Dynamic.literal()
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    if (TargetEnvironment != null) __obj.updateDynamic("TargetEnvironment")(TargetEnvironment.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceExportDetails]
  }
}

