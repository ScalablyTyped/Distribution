package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Blueprint extends js.Object {
  /**
    * The ID for the virtual private server image (e.g., app_wordpress_4_4 or app_lamp_7_0).
    */
  var blueprintId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The description of the blueprint.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The group name of the blueprint (e.g., amazon-linux).
    */
  var group: js.UndefOr[NonEmptyString] = js.native
  /**
    * A Boolean value indicating whether the blueprint is active. Inactive blueprints are listed to support customers with existing instances but are not necessarily available for launch of new instances. Blueprints are marked inactive when they become outdated due to operating system updates or new application releases.
    */
  var isActive: js.UndefOr[Boolean] = js.native
  /**
    * The end-user license agreement URL for the image or blueprint.
    */
  var licenseUrl: js.UndefOr[String] = js.native
  /**
    * The minimum bundle power required to run this blueprint. For example, you need a bundle with a power value of 500 or more to create an instance that uses a blueprint with a minimum power value of 500. 0 indicates that the blueprint runs on all instance sizes. 
    */
  var minPower: js.UndefOr[integer] = js.native
  /**
    * The friendly name of the blueprint (e.g., Amazon Linux).
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * The operating system platform (either Linux/Unix-based or Windows Server-based) of the blueprint.
    */
  var platform: js.UndefOr[InstancePlatform] = js.native
  /**
    * The product URL to learn more about the image or blueprint.
    */
  var productUrl: js.UndefOr[String] = js.native
  /**
    * The type of the blueprint (e.g., os or app).
    */
  var `type`: js.UndefOr[BlueprintType] = js.native
  /**
    * The version number of the operating system, application, or stack (e.g., 2016.03.0).
    */
  var version: js.UndefOr[String] = js.native
  /**
    * The version code.
    */
  var versionCode: js.UndefOr[String] = js.native
}

object Blueprint {
  @scala.inline
  def apply(
    blueprintId: NonEmptyString = null,
    description: String = null,
    group: NonEmptyString = null,
    isActive: js.UndefOr[Boolean] = js.undefined,
    licenseUrl: String = null,
    minPower: Int | Double = null,
    name: ResourceName = null,
    platform: InstancePlatform = null,
    productUrl: String = null,
    `type`: BlueprintType = null,
    version: String = null,
    versionCode: String = null
  ): Blueprint = {
    val __obj = js.Dynamic.literal()
    if (blueprintId != null) __obj.updateDynamic("blueprintId")(blueprintId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive.asInstanceOf[js.Any])
    if (licenseUrl != null) __obj.updateDynamic("licenseUrl")(licenseUrl.asInstanceOf[js.Any])
    if (minPower != null) __obj.updateDynamic("minPower")(minPower.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (productUrl != null) __obj.updateDynamic("productUrl")(productUrl.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (versionCode != null) __obj.updateDynamic("versionCode")(versionCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blueprint]
  }
}

