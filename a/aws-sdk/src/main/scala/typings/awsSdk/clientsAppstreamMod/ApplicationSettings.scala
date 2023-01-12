package typings.awsSdk.clientsAppstreamMod

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
  var SettingsGroup: js.UndefOr[typings.awsSdk.clientsAppstreamMod.SettingsGroup] = js.undefined
}
object ApplicationSettings {
  
  inline def apply(Enabled: Boolean): ApplicationSettings = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationSettings] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setSettingsGroup(value: SettingsGroup): Self = StObject.set(x, "SettingsGroup", value.asInstanceOf[js.Any])
    
    inline def setSettingsGroupUndefined: Self = StObject.set(x, "SettingsGroup", js.undefined)
  }
}
