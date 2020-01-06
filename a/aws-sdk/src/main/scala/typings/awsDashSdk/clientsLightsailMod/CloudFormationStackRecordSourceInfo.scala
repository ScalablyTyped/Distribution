package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudFormationStackRecordSourceInfo extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the export snapshot record.
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The name of the record.
    */
  var name: js.UndefOr[NonEmptyString] = js.native
  /**
    * The Lightsail resource type (e.g., ExportSnapshotRecord).
    */
  var resourceType: js.UndefOr[CloudFormationStackRecordSourceType] = js.native
}

object CloudFormationStackRecordSourceInfo {
  @scala.inline
  def apply(
    arn: NonEmptyString = null,
    name: NonEmptyString = null,
    resourceType: CloudFormationStackRecordSourceType = null
  ): CloudFormationStackRecordSourceInfo = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFormationStackRecordSourceInfo]
  }
}

