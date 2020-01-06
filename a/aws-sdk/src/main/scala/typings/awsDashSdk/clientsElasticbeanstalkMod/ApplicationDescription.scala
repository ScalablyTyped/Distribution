package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationDescription extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var ApplicationArn: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.ApplicationArn] = js.native
  /**
    * The name of the application.
    */
  var ApplicationName: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.ApplicationName] = js.native
  /**
    * The names of the configuration templates associated with this application.
    */
  var ConfigurationTemplates: js.UndefOr[ConfigurationTemplateNamesList] = js.native
  /**
    * The date when the application was created.
    */
  var DateCreated: js.UndefOr[CreationDate] = js.native
  /**
    * The date when the application was last modified.
    */
  var DateUpdated: js.UndefOr[UpdateDate] = js.native
  /**
    * User-defined description of the application.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.Description] = js.native
  /**
    * The lifecycle settings for the application.
    */
  var ResourceLifecycleConfig: js.UndefOr[ApplicationResourceLifecycleConfig] = js.native
  /**
    * The names of the versions for this application.
    */
  var Versions: js.UndefOr[VersionLabelsList] = js.native
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
    if (ApplicationArn != null) __obj.updateDynamic("ApplicationArn")(ApplicationArn.asInstanceOf[js.Any])
    if (ApplicationName != null) __obj.updateDynamic("ApplicationName")(ApplicationName.asInstanceOf[js.Any])
    if (ConfigurationTemplates != null) __obj.updateDynamic("ConfigurationTemplates")(ConfigurationTemplates.asInstanceOf[js.Any])
    if (DateCreated != null) __obj.updateDynamic("DateCreated")(DateCreated.asInstanceOf[js.Any])
    if (DateUpdated != null) __obj.updateDynamic("DateUpdated")(DateUpdated.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (ResourceLifecycleConfig != null) __obj.updateDynamic("ResourceLifecycleConfig")(ResourceLifecycleConfig.asInstanceOf[js.Any])
    if (Versions != null) __obj.updateDynamic("Versions")(Versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationDescription]
  }
}

