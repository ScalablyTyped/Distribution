package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeConfigurationOptionsMessage extends js.Object {
  /**
    * The name of the application associated with the configuration template or environment. Only needed if you want to describe the configuration options associated with either the configuration template or environment.
    */
  var ApplicationName: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.ApplicationName] = js.undefined
  /**
    * The name of the environment whose configuration options you want to describe.
    */
  var EnvironmentName: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.EnvironmentName] = js.undefined
  /**
    * If specified, restricts the descriptions to only the specified options.
    */
  var Options: js.UndefOr[OptionsSpecifierList] = js.undefined
  /**
    * The ARN of the custom platform.
    */
  var PlatformArn: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.PlatformArn] = js.undefined
  /**
    * The name of the solution stack whose configuration options you want to describe.
    */
  var SolutionStackName: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.SolutionStackName] = js.undefined
  /**
    * The name of the configuration template whose configuration options you want to describe.
    */
  var TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined
}

object DescribeConfigurationOptionsMessage {
  @scala.inline
  def apply(
    ApplicationName: ApplicationName = null,
    EnvironmentName: EnvironmentName = null,
    Options: OptionsSpecifierList = null,
    PlatformArn: PlatformArn = null,
    SolutionStackName: SolutionStackName = null,
    TemplateName: ConfigurationTemplateName = null
  ): DescribeConfigurationOptionsMessage = {
    val __obj = js.Dynamic.literal()
    if (ApplicationName != null) __obj.updateDynamic("ApplicationName")(ApplicationName)
    if (EnvironmentName != null) __obj.updateDynamic("EnvironmentName")(EnvironmentName)
    if (Options != null) __obj.updateDynamic("Options")(Options)
    if (PlatformArn != null) __obj.updateDynamic("PlatformArn")(PlatformArn)
    if (SolutionStackName != null) __obj.updateDynamic("SolutionStackName")(SolutionStackName)
    if (TemplateName != null) __obj.updateDynamic("TemplateName")(TemplateName)
    __obj.asInstanceOf[DescribeConfigurationOptionsMessage]
  }
}

