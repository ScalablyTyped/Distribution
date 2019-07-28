package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceConfiguration extends js.Object {
  /**
    * The name of the application associated with the configuration.
    */
  var ApplicationName: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.ApplicationName] = js.undefined
  /**
    * The name of the configuration template.
    */
  var TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined
}

object SourceConfiguration {
  @scala.inline
  def apply(ApplicationName: ApplicationName = null, TemplateName: ConfigurationTemplateName = null): SourceConfiguration = {
    val __obj = js.Dynamic.literal()
    if (ApplicationName != null) __obj.updateDynamic("ApplicationName")(ApplicationName)
    if (TemplateName != null) __obj.updateDynamic("TemplateName")(TemplateName)
    __obj.asInstanceOf[SourceConfiguration]
  }
}

