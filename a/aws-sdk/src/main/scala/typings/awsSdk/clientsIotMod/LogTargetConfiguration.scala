package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogTargetConfiguration extends StObject {
  
  /**
    * The logging level.
    */
  var logLevel: js.UndefOr[LogLevel] = js.undefined
  
  /**
    * A log target
    */
  var logTarget: js.UndefOr[LogTarget] = js.undefined
}
object LogTargetConfiguration {
  
  inline def apply(): LogTargetConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogTargetConfiguration]
  }
  
  extension [Self <: LogTargetConfiguration](x: Self) {
    
    inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    inline def setLogTarget(value: LogTarget): Self = StObject.set(x, "logTarget", value.asInstanceOf[js.Any])
    
    inline def setLogTargetUndefined: Self = StObject.set(x, "logTarget", js.undefined)
  }
}
