package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationOptionsDescription extends js.Object {
  /**
    *  A list of ConfigurationOptionDescription. 
    */
  var Options: js.UndefOr[ConfigurationOptionDescriptionsList] = js.native
  /**
    * The ARN of the platform.
    */
  var PlatformArn: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.PlatformArn] = js.native
  /**
    * The name of the solution stack these configuration options belong to.
    */
  var SolutionStackName: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.SolutionStackName] = js.native
}

object ConfigurationOptionsDescription {
  @scala.inline
  def apply(
    Options: ConfigurationOptionDescriptionsList = null,
    PlatformArn: PlatformArn = null,
    SolutionStackName: SolutionStackName = null
  ): ConfigurationOptionsDescription = {
    val __obj = js.Dynamic.literal()
    if (Options != null) __obj.updateDynamic("Options")(Options.asInstanceOf[js.Any])
    if (PlatformArn != null) __obj.updateDynamic("PlatformArn")(PlatformArn.asInstanceOf[js.Any])
    if (SolutionStackName != null) __obj.updateDynamic("SolutionStackName")(SolutionStackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationOptionsDescription]
  }
}

