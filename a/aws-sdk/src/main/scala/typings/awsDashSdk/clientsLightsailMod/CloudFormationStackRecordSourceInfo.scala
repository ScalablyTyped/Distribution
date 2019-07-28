package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFormationStackRecordSourceInfo extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the export snapshot record.
    */
  var arn: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The name of the record.
    */
  var name: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The Lightsail resource type (e.g., ExportSnapshotRecord).
    */
  var resourceType: js.UndefOr[CloudFormationStackRecordSourceType] = js.undefined
}

object CloudFormationStackRecordSourceInfo {
  @scala.inline
  def apply(
    arn: NonEmptyString = null,
    name: NonEmptyString = null,
    resourceType: CloudFormationStackRecordSourceType = null
  ): CloudFormationStackRecordSourceInfo = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (name != null) __obj.updateDynamic("name")(name)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFormationStackRecordSourceInfo]
  }
}

