package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCustomActionTypeInput extends js.Object {
  /**
    * The category of the custom action, such as a build action or a test action.  Although Source and Approval are listed as valid values, they are not currently functional. These values are reserved for future use. 
    */
  var category: ActionCategory = js.native
  /**
    * The configuration properties for the custom action.  You can refer to a name in the configuration properties of the custom action within the URL templates by following the format of {Config:name}, as long as the configuration property is both required and not secret. For more information, see Create a Custom Action for a Pipeline. 
    */
  var configurationProperties: js.UndefOr[ActionConfigurationPropertyList] = js.native
  /**
    * The details of the input artifact for the action, such as its commit ID.
    */
  var inputArtifactDetails: ArtifactDetails = js.native
  /**
    * The details of the output artifact of the action, such as its commit ID.
    */
  var outputArtifactDetails: ArtifactDetails = js.native
  /**
    * The provider of the service used in the custom action, such as AWS CodeDeploy.
    */
  var provider: ActionProvider = js.native
  /**
    * URLs that provide users information about this custom action.
    */
  var settings: js.UndefOr[ActionTypeSettings] = js.native
  /**
    * The tags for the custom action.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * The version identifier of the custom action.
    */
  var version: Version = js.native
}

object CreateCustomActionTypeInput {
  @scala.inline
  def apply(
    category: ActionCategory,
    inputArtifactDetails: ArtifactDetails,
    outputArtifactDetails: ArtifactDetails,
    provider: ActionProvider,
    version: Version,
    configurationProperties: ActionConfigurationPropertyList = null,
    settings: ActionTypeSettings = null,
    tags: TagList = null
  ): CreateCustomActionTypeInput = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], inputArtifactDetails = inputArtifactDetails.asInstanceOf[js.Any], outputArtifactDetails = outputArtifactDetails.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (configurationProperties != null) __obj.updateDynamic("configurationProperties")(configurationProperties.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomActionTypeInput]
  }
}

