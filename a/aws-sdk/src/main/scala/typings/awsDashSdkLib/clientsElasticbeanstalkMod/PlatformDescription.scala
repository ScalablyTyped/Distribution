package typings
package awsDashSdkLib.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformDescription extends js.Object {
  /**
    * The custom AMIs supported by the platform.
    */
  var CustomAmiList: js.UndefOr[CustomAmiList] = js.undefined
  /**
    * The date when the platform was created.
    */
  var DateCreated: js.UndefOr[CreationDate] = js.undefined
  /**
    * The date when the platform was last updated.
    */
  var DateUpdated: js.UndefOr[UpdateDate] = js.undefined
  /**
    * The description of the platform.
    */
  var Description: js.UndefOr[Description] = js.undefined
  /**
    * The frameworks supported by the platform.
    */
  var Frameworks: js.UndefOr[PlatformFrameworks] = js.undefined
  /**
    * Information about the maintainer of the platform.
    */
  var Maintainer: js.UndefOr[Maintainer] = js.undefined
  /**
    * The operating system used by the platform.
    */
  var OperatingSystemName: js.UndefOr[OperatingSystemName] = js.undefined
  /**
    * The version of the operating system used by the platform.
    */
  var OperatingSystemVersion: js.UndefOr[OperatingSystemVersion] = js.undefined
  /**
    * The ARN of the platform.
    */
  var PlatformArn: js.UndefOr[PlatformArn] = js.undefined
  /**
    * The category of the platform.
    */
  var PlatformCategory: js.UndefOr[PlatformCategory] = js.undefined
  /**
    * The name of the platform.
    */
  var PlatformName: js.UndefOr[PlatformName] = js.undefined
  /**
    * The AWS account ID of the person who created the platform.
    */
  var PlatformOwner: js.UndefOr[PlatformOwner] = js.undefined
  /**
    * The status of the platform.
    */
  var PlatformStatus: js.UndefOr[PlatformStatus] = js.undefined
  /**
    * The version of the platform.
    */
  var PlatformVersion: js.UndefOr[PlatformVersion] = js.undefined
  /**
    * The programming languages supported by the platform.
    */
  var ProgrammingLanguages: js.UndefOr[PlatformProgrammingLanguages] = js.undefined
  /**
    * The name of the solution stack used by the platform.
    */
  var SolutionStackName: js.UndefOr[SolutionStackName] = js.undefined
  /**
    * The additions supported by the platform.
    */
  var SupportedAddonList: js.UndefOr[SupportedAddonList] = js.undefined
  /**
    * The tiers supported by the platform.
    */
  var SupportedTierList: js.UndefOr[SupportedTierList] = js.undefined
}

object PlatformDescription {
  @scala.inline
  def apply(
    CustomAmiList: CustomAmiList = null,
    DateCreated: CreationDate = null,
    DateUpdated: UpdateDate = null,
    Description: Description = null,
    Frameworks: PlatformFrameworks = null,
    Maintainer: Maintainer = null,
    OperatingSystemName: OperatingSystemName = null,
    OperatingSystemVersion: OperatingSystemVersion = null,
    PlatformArn: PlatformArn = null,
    PlatformCategory: PlatformCategory = null,
    PlatformName: PlatformName = null,
    PlatformOwner: PlatformOwner = null,
    PlatformStatus: PlatformStatus = null,
    PlatformVersion: PlatformVersion = null,
    ProgrammingLanguages: PlatformProgrammingLanguages = null,
    SolutionStackName: SolutionStackName = null,
    SupportedAddonList: SupportedAddonList = null,
    SupportedTierList: SupportedTierList = null
  ): PlatformDescription = {
    val __obj = js.Dynamic.literal()
    if (CustomAmiList != null) __obj.updateDynamic("CustomAmiList")(CustomAmiList)
    if (DateCreated != null) __obj.updateDynamic("DateCreated")(DateCreated)
    if (DateUpdated != null) __obj.updateDynamic("DateUpdated")(DateUpdated)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Frameworks != null) __obj.updateDynamic("Frameworks")(Frameworks)
    if (Maintainer != null) __obj.updateDynamic("Maintainer")(Maintainer)
    if (OperatingSystemName != null) __obj.updateDynamic("OperatingSystemName")(OperatingSystemName)
    if (OperatingSystemVersion != null) __obj.updateDynamic("OperatingSystemVersion")(OperatingSystemVersion)
    if (PlatformArn != null) __obj.updateDynamic("PlatformArn")(PlatformArn)
    if (PlatformCategory != null) __obj.updateDynamic("PlatformCategory")(PlatformCategory)
    if (PlatformName != null) __obj.updateDynamic("PlatformName")(PlatformName)
    if (PlatformOwner != null) __obj.updateDynamic("PlatformOwner")(PlatformOwner)
    if (PlatformStatus != null) __obj.updateDynamic("PlatformStatus")(PlatformStatus.asInstanceOf[js.Any])
    if (PlatformVersion != null) __obj.updateDynamic("PlatformVersion")(PlatformVersion)
    if (ProgrammingLanguages != null) __obj.updateDynamic("ProgrammingLanguages")(ProgrammingLanguages)
    if (SolutionStackName != null) __obj.updateDynamic("SolutionStackName")(SolutionStackName)
    if (SupportedAddonList != null) __obj.updateDynamic("SupportedAddonList")(SupportedAddonList)
    if (SupportedTierList != null) __obj.updateDynamic("SupportedTierList")(SupportedTierList)
    __obj.asInstanceOf[PlatformDescription]
  }
}

