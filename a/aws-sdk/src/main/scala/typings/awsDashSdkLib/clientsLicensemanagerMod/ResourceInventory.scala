package typings
package awsDashSdkLib.clientsLicensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceInventory extends js.Object {
  /**
    * The platform of the resource.
    */
  var Platform: js.UndefOr[String] = js.undefined
  /**
    * Platform version of the resource in the inventory.
    */
  var PlatformVersion: js.UndefOr[String] = js.undefined
  /**
    * The ARN of the resource.
    */
  var ResourceArn: js.UndefOr[String] = js.undefined
  /**
    * Unique ID of the resource.
    */
  var ResourceId: js.UndefOr[String] = js.undefined
  /**
    * Unique ID of the account that owns the resource.
    */
  var ResourceOwningAccountId: js.UndefOr[String] = js.undefined
  /**
    * The type of resource.
    */
  var ResourceType: js.UndefOr[ResourceType] = js.undefined
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
    if (Platform != null) __obj.updateDynamic("Platform")(Platform)
    if (PlatformVersion != null) __obj.updateDynamic("PlatformVersion")(PlatformVersion)
    if (ResourceArn != null) __obj.updateDynamic("ResourceArn")(ResourceArn)
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId)
    if (ResourceOwningAccountId != null) __obj.updateDynamic("ResourceOwningAccountId")(ResourceOwningAccountId)
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceInventory]
  }
}

