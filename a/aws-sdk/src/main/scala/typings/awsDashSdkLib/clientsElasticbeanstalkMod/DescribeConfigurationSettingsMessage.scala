package typings
package awsDashSdkLib.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeConfigurationSettingsMessage extends js.Object {
  /**
    * The application for the environment or configuration template.
    */
  var ApplicationName: awsDashSdkLib.clientsElasticbeanstalkMod.ApplicationName
  /**
    * The name of the environment to describe.  Condition: You must specify either this or a TemplateName, but not both. If you specify both, AWS Elastic Beanstalk returns an InvalidParameterCombination error. If you do not specify either, AWS Elastic Beanstalk returns MissingRequiredParameter error. 
    */
  var EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
  /**
    * The name of the configuration template to describe.  Conditional: You must specify either this parameter or an EnvironmentName, but not both. If you specify both, AWS Elastic Beanstalk returns an InvalidParameterCombination error. If you do not specify either, AWS Elastic Beanstalk returns a MissingRequiredParameter error. 
    */
  var TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined
}

object DescribeConfigurationSettingsMessage {
  @scala.inline
  def apply(
    ApplicationName: ApplicationName,
    EnvironmentName: EnvironmentName = null,
    TemplateName: ConfigurationTemplateName = null
  ): DescribeConfigurationSettingsMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName)
    if (EnvironmentName != null) __obj.updateDynamic("EnvironmentName")(EnvironmentName)
    if (TemplateName != null) __obj.updateDynamic("TemplateName")(TemplateName)
    __obj.asInstanceOf[DescribeConfigurationSettingsMessage]
  }
}

