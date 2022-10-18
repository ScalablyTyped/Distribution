package typings.awsGreengrassCoreSdk.streamManagerDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IoTAnalyticsConfigMap
  extends StObject
     with StreamConfigBaseMap {
  
  var iotChannel: js.UndefOr[String | Null] = js.undefined
  
  var iotMsgIdPrefix: js.UndefOr[String | Null] = js.undefined
}
object IoTAnalyticsConfigMap {
  
  inline def apply(): IoTAnalyticsConfigMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IoTAnalyticsConfigMap]
  }
  
  extension [Self <: IoTAnalyticsConfigMap](x: Self) {
    
    inline def setIotChannel(value: String): Self = StObject.set(x, "iotChannel", value.asInstanceOf[js.Any])
    
    inline def setIotChannelNull: Self = StObject.set(x, "iotChannel", null)
    
    inline def setIotChannelUndefined: Self = StObject.set(x, "iotChannel", js.undefined)
    
    inline def setIotMsgIdPrefix(value: String): Self = StObject.set(x, "iotMsgIdPrefix", value.asInstanceOf[js.Any])
    
    inline def setIotMsgIdPrefixNull: Self = StObject.set(x, "iotMsgIdPrefix", null)
    
    inline def setIotMsgIdPrefixUndefined: Self = StObject.set(x, "iotMsgIdPrefix", js.undefined)
  }
}
