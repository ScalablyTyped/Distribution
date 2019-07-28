package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePlatformVersionRequest extends js.Object {
  /**
    * The name of the builder environment.
    */
  var EnvironmentName: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.EnvironmentName] = js.undefined
  /**
    * The configuration option settings to apply to the builder environment.
    */
  var OptionSettings: js.UndefOr[ConfigurationOptionSettingsList] = js.undefined
  /**
    * The location of the platform definition archive in Amazon S3.
    */
  var PlatformDefinitionBundle: S3Location
  /**
    * The name of your custom platform.
    */
  var PlatformName: typings.awsDashSdk.clientsElasticbeanstalkMod.PlatformName
  /**
    * The number, such as 1.0.2, for the new platform version.
    */
  var PlatformVersion: typings.awsDashSdk.clientsElasticbeanstalkMod.PlatformVersion
  /**
    * Specifies the tags applied to the new platform version. Elastic Beanstalk applies these tags only to the platform version. Environments that you create using the platform version don't inherit the tags.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.Tags] = js.undefined
}

object CreatePlatformVersionRequest {
  @scala.inline
  def apply(
    PlatformDefinitionBundle: S3Location,
    PlatformName: PlatformName,
    PlatformVersion: PlatformVersion,
    EnvironmentName: EnvironmentName = null,
    OptionSettings: ConfigurationOptionSettingsList = null,
    Tags: Tags = null
  ): CreatePlatformVersionRequest = {
    val __obj = js.Dynamic.literal(PlatformDefinitionBundle = PlatformDefinitionBundle, PlatformName = PlatformName, PlatformVersion = PlatformVersion)
    if (EnvironmentName != null) __obj.updateDynamic("EnvironmentName")(EnvironmentName)
    if (OptionSettings != null) __obj.updateDynamic("OptionSettings")(OptionSettings)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreatePlatformVersionRequest]
  }
}

