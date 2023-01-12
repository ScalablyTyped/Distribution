package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigureLogsForPlaybackConfigurationResponse extends StObject {
  
  /**
    * The percentage of session logs that MediaTailor sends to your Cloudwatch Logs account.
    */
  var PercentEnabled: _Integer
  
  /**
    * The name of the playback configuration.
    */
  var PlaybackConfigurationName: js.UndefOr[_String] = js.undefined
}
object ConfigureLogsForPlaybackConfigurationResponse {
  
  inline def apply(PercentEnabled: _Integer): ConfigureLogsForPlaybackConfigurationResponse = {
    val __obj = js.Dynamic.literal(PercentEnabled = PercentEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigureLogsForPlaybackConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigureLogsForPlaybackConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setPercentEnabled(value: _Integer): Self = StObject.set(x, "PercentEnabled", value.asInstanceOf[js.Any])
    
    inline def setPlaybackConfigurationName(value: _String): Self = StObject.set(x, "PlaybackConfigurationName", value.asInstanceOf[js.Any])
    
    inline def setPlaybackConfigurationNameUndefined: Self = StObject.set(x, "PlaybackConfigurationName", js.undefined)
  }
}
