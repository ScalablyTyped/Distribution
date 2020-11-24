package typings.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    ContentType: StringWithLengthBetween1And255
  ): CreateHostedConfigurationVersionRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], ConfigurationProfileId = ConfigurationProfileId.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], ContentType = ContentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHostedConfigurationVersionRequest]
  }
  
  @scala.inline
  implicit class CreateHostedConfigurationVersionRequestOps[Self <: CreateHostedConfigurationVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplicationId(value: Id): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationProfileId(value: Id): Self = this.set("ConfigurationProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: _Blob): Self = this.set("Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentType(value: StringWithLengthBetween1And255): Self = this.set("ContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setLatestVersionNumber(value: Integer): Self = this.set("LatestVersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestVersionNumber: Self = this.set("LatestVersionNumber", js.undefined)
  }
}
