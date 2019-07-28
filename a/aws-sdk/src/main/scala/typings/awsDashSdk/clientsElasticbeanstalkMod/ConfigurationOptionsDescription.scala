package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationOptionsDescription extends js.Object {
  /**
    *  A list of ConfigurationOptionDescription. 
    */
  var Options: js.UndefOr[ConfigurationOptionDescriptionsList] = js.undefined
  /**
    * The ARN of the platform.
    */
  var PlatformArn: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.PlatformArn] = js.undefined
  /**
    * The name of the solution stack these configuration options belong to.
    */
  var SolutionStackName: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.SolutionStackName] = js.undefined
}

object ConfigurationOptionsDescription {
  @scala.inline
  def apply(
    Options: ConfigurationOptionDescriptionsList = null,
    PlatformArn: PlatformArn = null,
    SolutionStackName: SolutionStackName = null
  ): ConfigurationOptionsDescription = {
    val __obj = js.Dynamic.literal()
    if (Options != null) __obj.updateDynamic("Options")(Options)
    if (PlatformArn != null) __obj.updateDynamic("PlatformArn")(PlatformArn)
    if (SolutionStackName != null) __obj.updateDynamic("SolutionStackName")(SolutionStackName)
    __obj.asInstanceOf[ConfigurationOptionsDescription]
  }
}

