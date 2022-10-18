package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourceLogLevelResponse extends StObject {
  
  var LogLevel: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.LogLevel] = js.undefined
}
object GetResourceLogLevelResponse {
  
  inline def apply(): GetResourceLogLevelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourceLogLevelResponse]
  }
  
  extension [Self <: GetResourceLogLevelResponse](x: Self) {
    
    inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "LogLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "LogLevel", js.undefined)
  }
}
