package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigureLogsForChannelRequest extends StObject {
  
  /**
    * The name of the channel.
    */
  var ChannelName: _String
  
  /**
    * The types of logs to collect.
    */
  var LogTypes: typings.awsSdk.clientsMediatailorMod.LogTypes
}
object ConfigureLogsForChannelRequest {
  
  inline def apply(ChannelName: _String, LogTypes: LogTypes): ConfigureLogsForChannelRequest = {
    val __obj = js.Dynamic.literal(ChannelName = ChannelName.asInstanceOf[js.Any], LogTypes = LogTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigureLogsForChannelRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigureLogsForChannelRequest] (val x: Self) extends AnyVal {
    
    inline def setChannelName(value: _String): Self = StObject.set(x, "ChannelName", value.asInstanceOf[js.Any])
    
    inline def setLogTypes(value: LogTypes): Self = StObject.set(x, "LogTypes", value.asInstanceOf[js.Any])
    
    inline def setLogTypesVarargs(value: LogType*): Self = StObject.set(x, "LogTypes", js.Array(value*))
  }
}
