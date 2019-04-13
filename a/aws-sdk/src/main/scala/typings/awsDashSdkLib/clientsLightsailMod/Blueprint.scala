package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Blueprint extends js.Object {
  /**
    * The ID for the virtual private server image (e.g., app_wordpress_4_4 or app_lamp_7_0).
    */
  var blueprintId: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The description of the blueprint.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The group name of the blueprint (e.g., amazon-linux).
    */
  var group: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * A Boolean value indicating whether the blueprint is active. Inactive blueprints are listed to support customers with existing instances but are not necessarily available for launch of new instances. Blueprints are marked inactive when they become outdated due to operating system updates or new application releases.
    */
  var isActive: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The end-user license agreement URL for the image or blueprint.
    */
  var licenseUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The minimum bundle power required to run this blueprint. For example, you need a bundle with a power value of 500 or more to create an instance that uses a blueprint with a minimum power value of 500. 0 indicates that the blueprint runs on all instance sizes. 
    */
  var minPower: js.UndefOr[integer] = js.undefined
  /**
    * The friendly name of the blueprint (e.g., Amazon Linux).
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  /**
    * The operating system platform (either Linux/Unix-based or Windows Server-based) of the blueprint.
    */
  var platform: js.UndefOr[InstancePlatform] = js.undefined
  /**
    * The product URL to learn more about the image or blueprint.
    */
  var productUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of the blueprint (e.g., os or app).
    */
  var `type`: js.UndefOr[BlueprintType] = js.undefined
  /**
    * The version number of the operating system, application, or stack (e.g., 2016.03.0).
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The version code.
    */
  var versionCode: js.UndefOr[java.lang.String] = js.undefined
}

object Blueprint {
  @scala.inline
  def apply(
    blueprintId: NonEmptyString = null,
    description: java.lang.String = null,
    group: NonEmptyString = null,
    isActive: js.UndefOr[scala.Boolean] = js.undefined,
    licenseUrl: java.lang.String = null,
    minPower: js.UndefOr[integer] = js.undefined,
    name: ResourceName = null,
    platform: InstancePlatform = null,
    productUrl: java.lang.String = null,
    `type`: BlueprintType = null,
    version: java.lang.String = null,
    versionCode: java.lang.String = null
  ): Blueprint = {
    val __obj = js.Dynamic.literal()
    if (blueprintId != null) __obj.updateDynamic("blueprintId")(blueprintId)
    if (description != null) __obj.updateDynamic("description")(description)
    if (group != null) __obj.updateDynamic("group")(group)
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive)
    if (licenseUrl != null) __obj.updateDynamic("licenseUrl")(licenseUrl)
    if (!js.isUndefined(minPower)) __obj.updateDynamic("minPower")(minPower)
    if (name != null) __obj.updateDynamic("name")(name)
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (productUrl != null) __obj.updateDynamic("productUrl")(productUrl)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version)
    if (versionCode != null) __obj.updateDynamic("versionCode")(versionCode)
    __obj.asInstanceOf[Blueprint]
  }
}

