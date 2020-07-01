package typings.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHostedConfigurationVersionRequest extends js.Object {
  /**
    * The application ID.
    */
  var ApplicationId: Id = js.native
  /**
    * The configuration profile ID.
    */
  var ConfigurationProfileId: Id = js.native
  /**
    * The content of the configuration or the configuration data.
    */
  var Content: _Blob = js.native
  /**
    * A standard MIME type describing the format of the configuration content. For more information, see Content-Type.
    */
  var ContentType: StringWithLengthBetween1And255 = js.native
  /**
    * A description of the configuration.
    */
  var Description: js.UndefOr[typings.awsSdk.appconfigMod.Description] = js.native
  /**
    * An optional locking token used to prevent race conditions from overwriting configuration updates when creating a new version. To ensure your data is not overwritten when creating multiple hosted configuration versions in rapid succession, specify the version of the latest hosted configuration version.
    */
  var LatestVersionNumber: js.UndefOr[Integer] = js.native
}

object CreateHostedConfigurationVersionRequest {
  @scala.inline
  def apply(
    ApplicationId: Id,
    ConfigurationProfileId: Id,
    Content: _Blob,
    ContentType: StringWithLengthBetween1And255,
    Description: Description = null,
    LatestVersionNumber: js.UndefOr[Integer] = js.undefined
  ): CreateHostedConfigurationVersionRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], ConfigurationProfileId = ConfigurationProfileId.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], ContentType = ContentType.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(LatestVersionNumber)) __obj.updateDynamic("LatestVersionNumber")(LatestVersionNumber.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHostedConfigurationVersionRequest]
  }
}

