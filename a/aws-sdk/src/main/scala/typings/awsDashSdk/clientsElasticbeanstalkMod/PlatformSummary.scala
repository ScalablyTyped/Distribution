package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformSummary extends js.Object {
  /**
    * The operating system used by the platform.
    */
  var OperatingSystemName: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.OperatingSystemName] = js.undefined
  /**
    * The version of the operating system used by the platform.
    */
  var OperatingSystemVersion: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.OperatingSystemVersion] = js.undefined
  /**
    * The ARN of the platform.
    */
  var PlatformArn: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.PlatformArn] = js.undefined
  /**
    * The category of platform.
    */
  var PlatformCategory: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.PlatformCategory] = js.undefined
  /**
    * The AWS account ID of the person who created the platform.
    */
  var PlatformOwner: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.PlatformOwner] = js.undefined
  /**
    * The status of the platform. You can create an environment from the platform once it is ready.
    */
  var PlatformStatus: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.PlatformStatus] = js.undefined
  /**
    * The additions associated with the platform.
    */
  var SupportedAddonList: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.SupportedAddonList] = js.undefined
  /**
    * The tiers in which the platform runs.
    */
  var SupportedTierList: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.SupportedTierList] = js.undefined
}

object PlatformSummary {
  @scala.inline
  def apply(
    OperatingSystemName: OperatingSystemName = null,
    OperatingSystemVersion: OperatingSystemVersion = null,
    PlatformArn: PlatformArn = null,
    PlatformCategory: PlatformCategory = null,
    PlatformOwner: PlatformOwner = null,
    PlatformStatus: PlatformStatus = null,
    SupportedAddonList: SupportedAddonList = null,
    SupportedTierList: SupportedTierList = null
  ): PlatformSummary = {
    val __obj = js.Dynamic.literal()
    if (OperatingSystemName != null) __obj.updateDynamic("OperatingSystemName")(OperatingSystemName)
    if (OperatingSystemVersion != null) __obj.updateDynamic("OperatingSystemVersion")(OperatingSystemVersion)
    if (PlatformArn != null) __obj.updateDynamic("PlatformArn")(PlatformArn)
    if (PlatformCategory != null) __obj.updateDynamic("PlatformCategory")(PlatformCategory)
    if (PlatformOwner != null) __obj.updateDynamic("PlatformOwner")(PlatformOwner)
    if (PlatformStatus != null) __obj.updateDynamic("PlatformStatus")(PlatformStatus.asInstanceOf[js.Any])
    if (SupportedAddonList != null) __obj.updateDynamic("SupportedAddonList")(SupportedAddonList)
    if (SupportedTierList != null) __obj.updateDynamic("SupportedTierList")(SupportedTierList)
    __obj.asInstanceOf[PlatformSummary]
  }
}

