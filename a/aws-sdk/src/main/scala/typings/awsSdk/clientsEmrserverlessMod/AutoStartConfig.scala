package typings.awsSdk.clientsEmrserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoStartConfig extends StObject {
  
  /**
    * Enables the application to automatically start on job submission. Defaults to true.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object AutoStartConfig {
  
  inline def apply(): AutoStartConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoStartConfig]
  }
  
  extension [Self <: AutoStartConfig](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
