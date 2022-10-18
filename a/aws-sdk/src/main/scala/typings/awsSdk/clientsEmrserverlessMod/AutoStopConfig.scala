package typings.awsSdk.clientsEmrserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoStopConfig extends StObject {
  
  /**
    * Enables the application to automatically stop after a certain amount of time being idle. Defaults to true.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The amount of idle time in minutes after which your application will automatically stop. Defaults to 15 minutes.
    */
  var idleTimeoutMinutes: js.UndefOr[AutoStopConfigIdleTimeoutMinutesInteger] = js.undefined
}
object AutoStopConfig {
  
  inline def apply(): AutoStopConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoStopConfig]
  }
  
  extension [Self <: AutoStopConfig](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setIdleTimeoutMinutes(value: AutoStopConfigIdleTimeoutMinutesInteger): Self = StObject.set(x, "idleTimeoutMinutes", value.asInstanceOf[js.Any])
    
    inline def setIdleTimeoutMinutesUndefined: Self = StObject.set(x, "idleTimeoutMinutes", js.undefined)
  }
}
