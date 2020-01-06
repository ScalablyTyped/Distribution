package typings.awsDashSdk.clientsLicensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LicenseConfigurationUsage extends js.Object {
  /**
    * Time when the license configuration was initially associated with the resource.
    */
  var AssociationTime: js.UndefOr[DateTime] = js.native
  /**
    * Number of licenses consumed by the resource.
    */
  var ConsumedLicenses: js.UndefOr[BoxLong] = js.native
  /**
    * Amazon Resource Name (ARN) of the resource.
    */
  var ResourceArn: js.UndefOr[String] = js.native
  /**
    * ID of the account that owns the resource.
    */
  var ResourceOwnerId: js.UndefOr[String] = js.native
  /**
    * Status of the resource.
    */
  var ResourceStatus: js.UndefOr[String] = js.native
  /**
    * Type of resource.
    */
  var ResourceType: js.UndefOr[typings.awsDashSdk.clientsLicensemanagerMod.ResourceType] = js.native
}

object LicenseConfigurationUsage {
  @scala.inline
  def apply(
    AssociationTime: DateTime = null,
    ConsumedLicenses: Int | Double = null,
    ResourceArn: String = null,
    ResourceOwnerId: String = null,
    ResourceStatus: String = null,
    ResourceType: ResourceType = null
  ): LicenseConfigurationUsage = {
    val __obj = js.Dynamic.literal()
    if (AssociationTime != null) __obj.updateDynamic("AssociationTime")(AssociationTime.asInstanceOf[js.Any])
    if (ConsumedLicenses != null) __obj.updateDynamic("ConsumedLicenses")(ConsumedLicenses.asInstanceOf[js.Any])
    if (ResourceArn != null) __obj.updateDynamic("ResourceArn")(ResourceArn.asInstanceOf[js.Any])
    if (ResourceOwnerId != null) __obj.updateDynamic("ResourceOwnerId")(ResourceOwnerId.asInstanceOf[js.Any])
    if (ResourceStatus != null) __obj.updateDynamic("ResourceStatus")(ResourceStatus.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicenseConfigurationUsage]
  }
}

