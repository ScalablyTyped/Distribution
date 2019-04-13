package typings
package awsDashSdkLib.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteConfigurationTemplateMessage extends js.Object {
  /**
    * The name of the application to delete the configuration template from.
    */
  var ApplicationName: awsDashSdkLib.clientsElasticbeanstalkMod.ApplicationName
  /**
    * The name of the configuration template to delete.
    */
  var TemplateName: ConfigurationTemplateName
}

object DeleteConfigurationTemplateMessage {
  @scala.inline
  def apply(ApplicationName: ApplicationName, TemplateName: ConfigurationTemplateName): DeleteConfigurationTemplateMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName, TemplateName = TemplateName)
  
    __obj.asInstanceOf[DeleteConfigurationTemplateMessage]
  }
}

