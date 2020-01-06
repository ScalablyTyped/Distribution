package typings.awsDashSdk.clientsLicensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceInventory extends js.Object {
  /**
    * Platform of the resource.
    */
  var Platform: js.UndefOr[String] = js.native
  /**
    * Platform version of the resource in the inventory.
    */
  var PlatformVersion: js.UndefOr[String] = js.native
  /**
    * Amazon Resource Name (ARN) of the resource.
    */
  var ResourceArn: js.UndefOr[String] = js.native
  /**
    * ID of the resource.
    */
  var ResourceId: js.UndefOr[String] = js.native
  /**
    * ID of the account that owns the resource.
    */
  var ResourceOwningAccountId: js.UndefOr[String] = js.native
  /**
    * Type of resource.
    */
  var ResourceType: js.UndefOr[typings.awsDashSdk.clientsLicensemanagerMod.ResourceType] = js.native
}

object ResourceInventory {
  @scala.inline
  def apply(
    Platform: String = null,
    PlatformVersion: String = null,
    ResourceArn: String = null,
    ResourceId: String = null,
    ResourceOwningAccountId: String = null,
    ResourceType: ResourceType = null
  ): ResourceInventory = {
    val __obj = js.Dynamic.literal()
    if (Platform != null) __obj.updateDynamic("Platform")(Platform.asInstanceOf[js.Any])
    if (PlatformVersion != null) __obj.updateDynamic("PlatformVersion")(PlatformVersion.asInstanceOf[js.Any])
    if (ResourceArn != null) __obj.updateDynamic("ResourceArn")(ResourceArn.asInstanceOf[js.Any])
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId.asInstanceOf[js.Any])
    if (ResourceOwningAccountId != null) __obj.updateDynamic("ResourceOwningAccountId")(ResourceOwningAccountId.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceInventory]
  }
}

