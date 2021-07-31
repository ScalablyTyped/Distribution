package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationSettings extends StObject {
  
  /**
    * Enables or disables persistent application settings for users during their streaming sessions. 
    */
  var Enabled: Boolean
  
  /**
    * The path prefix for the S3 bucket where users’ persistent application settings are stored. You can allow the same persistent application settings to be used across multiple stacks by specifying the same settings group for each stack. 
    */
  var SettingsGroup: js.UndefOr[typings.awsSdk.appstreamMod.SettingsGroup] = js.undefined
}
object ApplicationSettings {
  
  @scala.inline
  def apply(Enabled: Boolean): ApplicationSettings = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationSettings]
  }
  
  @scala.inline
  implicit class ApplicationSettingsMutableBuilder[Self <: ApplicationSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsGroup(value: SettingsGroup): Self = StObject.set(x, "SettingsGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsGroupUndefined: Self = StObject.set(x, "SettingsGroup", js.undefined)
  }
}
