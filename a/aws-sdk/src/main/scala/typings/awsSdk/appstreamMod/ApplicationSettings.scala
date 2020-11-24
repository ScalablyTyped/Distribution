package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationSettings extends js.Object {
  
  /**
    * Enables or disables persistent application settings for users during their streaming sessions. 
    */
  var Enabled: Boolean = js.native
  
  /**
    * The path prefix for the S3 bucket where users’ persistent application settings are stored. You can allow the same persistent application settings to be used across multiple stacks by specifying the same settings group for each stack. 
    */
  var SettingsGroup: js.UndefOr[typings.awsSdk.appstreamMod.SettingsGroup] = js.native
}
object ApplicationSettings {
  
  @scala.inline
  def apply(Enabled: Boolean): ApplicationSettings = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationSettings]
  }
  
  @scala.inline
  implicit class ApplicationSettingsOps[Self <: ApplicationSettings] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsGroup(value: SettingsGroup): Self = this.set("SettingsGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettingsGroup: Self = this.set("SettingsGroup", js.undefined)
  }
}
