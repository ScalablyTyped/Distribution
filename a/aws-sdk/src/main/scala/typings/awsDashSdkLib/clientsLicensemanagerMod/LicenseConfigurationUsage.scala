package typings
package awsDashSdkLib.clientsLicensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LicenseConfigurationUsage extends js.Object {
  /**
    * Time when the license configuration was initially associated with a resource.
    */
  var AssociationTime: js.UndefOr[DateTime] = js.undefined
  /**
    * Number of licenses consumed out of the total provisioned in the license configuration.
    */
  var ConsumedLicenses: js.UndefOr[BoxLong] = js.undefined
  /**
    * ARN of the resource associated with a license configuration.
    */
  var ResourceArn: js.UndefOr[String] = js.undefined
  /**
    * ID of the account that owns a resource that is associated with the license configuration.
    */
  var ResourceOwnerId: js.UndefOr[String] = js.undefined
  /**
    * Status of a resource associated with the license configuration.
    */
  var ResourceStatus: js.UndefOr[String] = js.undefined
  /**
    * Type of resource associated with athe license configuration.
    */
  var ResourceType: js.UndefOr[ResourceType] = js.undefined
}

object LicenseConfigurationUsage {
  @scala.inline
  def apply(
    AssociationTime: DateTime = null,
    ConsumedLicenses: js.UndefOr[BoxLong] = js.undefined,
    ResourceArn: String = null,
    ResourceOwnerId: String = null,
    ResourceStatus: String = null,
    ResourceType: ResourceType = null
  ): LicenseConfigurationUsage = {
    val __obj = js.Dynamic.literal()
    if (AssociationTime != null) __obj.updateDynamic("AssociationTime")(AssociationTime)
    if (!js.isUndefined(ConsumedLicenses)) __obj.updateDynamic("ConsumedLicenses")(ConsumedLicenses)
    if (ResourceArn != null) __obj.updateDynamic("ResourceArn")(ResourceArn)
    if (ResourceOwnerId != null) __obj.updateDynamic("ResourceOwnerId")(ResourceOwnerId)
    if (ResourceStatus != null) __obj.updateDynamic("ResourceStatus")(ResourceStatus)
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicenseConfigurationUsage]
  }
}

