package typings.awsDashSdk.clientsLicensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LicenseConfigurationAssociation extends js.Object {
  /**
    * Time when the license configuration was associated with the resource.
    */
  var AssociationTime: js.UndefOr[DateTime] = js.undefined
  /**
    * ARN of the resource associated with the license configuration.
    */
  var ResourceArn: js.UndefOr[String] = js.undefined
  /**
    * ID of the AWS account that owns the resource consuming licenses.
    */
  var ResourceOwnerId: js.UndefOr[String] = js.undefined
  /**
    * Type of server resource.
    */
  var ResourceType: js.UndefOr[typings.awsDashSdk.clientsLicensemanagerMod.ResourceType] = js.undefined
}

object LicenseConfigurationAssociation {
  @scala.inline
  def apply(
    AssociationTime: DateTime = null,
    ResourceArn: String = null,
    ResourceOwnerId: String = null,
    ResourceType: ResourceType = null
  ): LicenseConfigurationAssociation = {
    val __obj = js.Dynamic.literal()
    if (AssociationTime != null) __obj.updateDynamic("AssociationTime")(AssociationTime)
    if (ResourceArn != null) __obj.updateDynamic("ResourceArn")(ResourceArn)
    if (ResourceOwnerId != null) __obj.updateDynamic("ResourceOwnerId")(ResourceOwnerId)
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicenseConfigurationAssociation]
  }
}

