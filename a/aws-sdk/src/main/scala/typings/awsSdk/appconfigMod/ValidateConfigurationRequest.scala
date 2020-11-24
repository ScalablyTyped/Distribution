package typings.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidateConfigurationRequest extends js.Object {
  
  /**
    * The application ID.
    */
  var ApplicationId: Id = js.native
  
  /**
    * The configuration profile ID.
    */
  var ConfigurationProfileId: Id = js.native
  
  /**
    * The version of the configuration to validate.
    */
  var ConfigurationVersion: Version = js.native
}
object ValidateConfigurationRequest {
  
  @scala.inline
  def apply(ApplicationId: Id, ConfigurationProfileId: Id, ConfigurationVersion: Version): ValidateConfigurationRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], ConfigurationProfileId = ConfigurationProfileId.asInstanceOf[js.Any], ConfigurationVersion = ConfigurationVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateConfigurationRequest]
  }
  
  @scala.inline
  implicit class ValidateConfigurationRequestOps[Self <: ValidateConfigurationRequest] (val x: Self) extends AnyVal {
    
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
    def setConfigurationVersion(value: Version): Self = this.set("ConfigurationVersion", value.asInstanceOf[js.Any])
  }
}
