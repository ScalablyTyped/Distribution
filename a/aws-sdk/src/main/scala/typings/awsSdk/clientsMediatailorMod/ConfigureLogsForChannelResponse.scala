package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigureLogsForChannelResponse extends StObject {
  
  /**
    * The name of the channel.
    */
  var ChannelName: js.UndefOr[_String] = js.undefined
  
  /**
    * The types of logs collected.
    */
  var LogTypes: js.UndefOr[typings.awsSdk.clientsMediatailorMod.LogTypes] = js.undefined
}
object ConfigureLogsForChannelResponse {
  
  inline def apply(): ConfigureLogsForChannelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigureLogsForChannelResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigureLogsForChannelResponse] (val x: Self) extends AnyVal {
    
    inline def setChannelName(value: _String): Self = StObject.set(x, "ChannelName", value.asInstanceOf[js.Any])
    
    inline def setChannelNameUndefined: Self = StObject.set(x, "ChannelName", js.undefined)
    
    inline def setLogTypes(value: LogTypes): Self = StObject.set(x, "LogTypes", value.asInstanceOf[js.Any])
    
    inline def setLogTypesUndefined: Self = StObject.set(x, "LogTypes", js.undefined)
    
    inline def setLogTypesVarargs(value: LogType*): Self = StObject.set(x, "LogTypes", js.Array(value*))
  }
}
