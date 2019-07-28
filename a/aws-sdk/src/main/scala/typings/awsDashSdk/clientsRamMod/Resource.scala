package typings.awsDashSdk.clientsRamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resource extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var arn: js.UndefOr[String] = js.undefined
  /**
    * The time when the resource was associated with the resource share.
    */
  var creationTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The time when the association was last updated.
    */
  var lastUpdatedTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the resource share.
    */
  var resourceShareArn: js.UndefOr[String] = js.undefined
  /**
    * The status of the resource.
    */
  var status: js.UndefOr[ResourceStatus] = js.undefined
  /**
    * A message about the status of the resource.
    */
  var statusMessage: js.UndefOr[String] = js.undefined
  /**
    * The resource type.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object Resource {
  @scala.inline
  def apply(
    arn: String = null,
    creationTime: DateTime = null,
    lastUpdatedTime: DateTime = null,
    resourceShareArn: String = null,
    status: ResourceStatus = null,
    statusMessage: String = null,
    `type`: String = null
  ): Resource = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (lastUpdatedTime != null) __obj.updateDynamic("lastUpdatedTime")(lastUpdatedTime)
    if (resourceShareArn != null) __obj.updateDynamic("resourceShareArn")(resourceShareArn)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Resource]
  }
}

