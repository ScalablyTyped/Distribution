package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationDescription extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var ApplicationArn: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.ApplicationArn] = js.undefined
  /**
    * The name of the application.
    */
  var ApplicationName: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.ApplicationName] = js.undefined
  /**
    * The names of the configuration templates associated with this application.
    */
  var ConfigurationTemplates: js.UndefOr[ConfigurationTemplateNamesList] = js.undefined
  /**
    * The date when the application was created.
    */
  var DateCreated: js.UndefOr[CreationDate] = js.undefined
  /**
    * The date when the application was last modified.
    */
  var DateUpdated: js.UndefOr[UpdateDate] = js.undefined
  /**
    * User-defined description of the application.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.Description] = js.undefined
  /**
    * The lifecycle settings for the application.
    */
  var ResourceLifecycleConfig: js.UndefOr[ApplicationResourceLifecycleConfig] = js.undefined
  /**
    * The names of the versions for this application.
    */
  var Versions: js.UndefOr[VersionLabelsList] = js.undefined
}

object ApplicationDescription {
  @scala.inline
  def apply(
    ApplicationArn: ApplicationArn = null,
    ApplicationName: ApplicationName = null,
    ConfigurationTemplates: ConfigurationTemplateNamesList = null,
    DateCreated: CreationDate = null,
    DateUpdated: UpdateDate = null,
    Description: Description = null,
    ResourceLifecycleConfig: ApplicationResourceLifecycleConfig = null,
    Versions: VersionLabelsList = null
  ): ApplicationDescription = {
    val __obj = js.Dynamic.literal()
    if (ApplicationArn != null) __obj.updateDynamic("ApplicationArn")(ApplicationArn)
    if (ApplicationName != null) __obj.updateDynamic("ApplicationName")(ApplicationName)
    if (ConfigurationTemplates != null) __obj.updateDynamic("ConfigurationTemplates")(ConfigurationTemplates)
    if (DateCreated != null) __obj.updateDynamic("DateCreated")(DateCreated)
    if (DateUpdated != null) __obj.updateDynamic("DateUpdated")(DateUpdated)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (ResourceLifecycleConfig != null) __obj.updateDynamic("ResourceLifecycleConfig")(ResourceLifecycleConfig)
    if (Versions != null) __obj.updateDynamic("Versions")(Versions)
    __obj.asInstanceOf[ApplicationDescription]
  }
}

