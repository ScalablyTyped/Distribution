package typings.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostedConfigurationVersion extends js.Object {
  
  /**
    * The application ID.
    */
  var ApplicationId: js.UndefOr[Id] = js.native
  
  /**
    * The configuration profile ID.
    */
  var ConfigurationProfileId: js.UndefOr[Id] = js.native
  
  /**
    * The content of the configuration or the configuration data.
    */
  var Content: js.UndefOr[_Blob] = js.native
  
  /**
    * A standard MIME type describing the format of the configuration content. For more information, see Content-Type.
    */
  var ContentType: js.UndefOr[StringWithLengthBetween1And255] = js.native
  
  /**
    * A description of the configuration.
    */
  var Description: js.UndefOr[typings.awsSdk.appconfigMod.Description] = js.native
  
  /**
    * The configuration version.
    */
  var VersionNumber: js.UndefOr[Integer] = js.native
}
object HostedConfigurationVersion {
  
  @scala.inline
  def apply(): HostedConfigurationVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostedConfigurationVersion]
  }
  
  @scala.inline
  implicit class HostedConfigurationVersionOps[Self <: HostedConfigurationVersion] (val x: Self) extends AnyVal {
    
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
    def deleteApplicationId: Self = this.set("ApplicationId", js.undefined)
    
    @scala.inline
    def setConfigurationProfileId(value: Id): Self = this.set("ConfigurationProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigurationProfileId: Self = this.set("ConfigurationProfileId", js.undefined)
    
    @scala.inline
    def setContent(value: _Blob): Self = this.set("Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("Content", js.undefined)
    
    @scala.inline
    def setContentType(value: StringWithLengthBetween1And255): Self = this.set("ContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("ContentType", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setVersionNumber(value: Integer): Self = this.set("VersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionNumber: Self = this.set("VersionNumber", js.undefined)
  }
}
