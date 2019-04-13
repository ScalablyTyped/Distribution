package typings
package awsDashSdkLib.clientsRamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceShareAssociation extends js.Object {
  /**
    * The associated entity. For resource associations, this is the ARN of the resource. For principal associations, this is the ID of an AWS account or the ARN of an OU or organization from AWS Organizations.
    */
  var associatedEntity: js.UndefOr[String] = js.undefined
  /**
    * The association type.
    */
  var associationType: js.UndefOr[ResourceShareAssociationType] = js.undefined
  /**
    * The time when the association was created.
    */
  var creationTime: js.UndefOr[DateTime] = js.undefined
  /**
    * Indicates whether the principal belongs to the same organization as the AWS account that owns the resource share.
    */
  var external: js.UndefOr[Boolean] = js.undefined
  /**
    * The time when the association was last updated.
    */
  var lastUpdatedTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the resource share.
    */
  var resourceShareArn: js.UndefOr[String] = js.undefined
  /**
    * The status of the association.
    */
  var status: js.UndefOr[ResourceShareAssociationStatus] = js.undefined
  /**
    * A message about the status of the association.
    */
  var statusMessage: js.UndefOr[String] = js.undefined
}

object ResourceShareAssociation {
  @scala.inline
  def apply(
    associatedEntity: String = null,
    associationType: ResourceShareAssociationType = null,
    creationTime: DateTime = null,
    external: js.UndefOr[Boolean] = js.undefined,
    lastUpdatedTime: DateTime = null,
    resourceShareArn: String = null,
    status: ResourceShareAssociationStatus = null,
    statusMessage: String = null
  ): ResourceShareAssociation = {
    val __obj = js.Dynamic.literal()
    if (associatedEntity != null) __obj.updateDynamic("associatedEntity")(associatedEntity)
    if (associationType != null) __obj.updateDynamic("associationType")(associationType.asInstanceOf[js.Any])
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (!js.isUndefined(external)) __obj.updateDynamic("external")(external)
    if (lastUpdatedTime != null) __obj.updateDynamic("lastUpdatedTime")(lastUpdatedTime)
    if (resourceShareArn != null) __obj.updateDynamic("resourceShareArn")(resourceShareArn)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage)
    __obj.asInstanceOf[ResourceShareAssociation]
  }
}

